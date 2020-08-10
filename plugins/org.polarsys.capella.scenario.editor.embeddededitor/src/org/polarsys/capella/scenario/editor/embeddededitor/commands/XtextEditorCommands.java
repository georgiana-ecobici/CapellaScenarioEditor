/*******************************************************************************
 * Copyright (c) 2020 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.scenario.editor.embeddededitor.commands;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DragAndDropTarget;
import org.eclipse.sirius.diagram.business.api.helper.SiriusDiagramHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.cs.impl.CsFactoryImpl;
import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.InteractionFactory;
import org.polarsys.capella.core.data.interaction.InteractionFragment;
import org.polarsys.capella.core.data.interaction.MessageEnd;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.SequenceMessage;
import org.polarsys.capella.core.data.interaction.impl.InteractionFactoryImpl;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt.Type;
import org.polarsys.capella.core.model.helpers.ComponentExt;
import org.polarsys.capella.core.model.helpers.ProjectExt;
import org.polarsys.capella.core.sirius.analysis.CsServices;
import org.polarsys.capella.core.sirius.analysis.SequenceDiagramServices;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Actor;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.DslFactory;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Model;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ScenarioTypeAndParticipants;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.impl.DslFactoryImpl;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.impl.ModelImpl;
import org.polarsys.capella.scenario.editor.dslscenario.ui.provider.DslscenarioProvider;
import org.polarsys.capella.scenario.editor.embeddededitor.views.EmbeddedEditorView;

public class XtextEditorCommands {

  public static void xtextToDiagram(Scenario scenario, EmbeddedEditorView embeddedEditorViewPart) {
    if (embeddedEditorViewPart != null) {
      DslscenarioProvider p = embeddedEditorViewPart.getProvider();
      XtextResource resource = p.getResource();
      EList<EObject> content = resource.getContents();
      
      
      ModelImpl domainModel = (ModelImpl) content.get(0);
      //get actors
      EList<EObject> actors = domainModel.getScenarioType().getParticipants();
      
      //get messages
      //TODO ...
      InteractionFactory factory = new InteractionFactoryImpl();
      InstanceRole instanceRole;
      SystemComponent instance;
      Project project;
      BlockArchitecture blockArchitecture;
      
      for (Iterator iterator = actors.iterator(); iterator.hasNext();) {
        EObject actor = (EObject) iterator.next();
        instanceRole = factory.createInstanceRole();
        instanceRole.setName(((Actor)actor).getName());
        
        //create Actor = SystemComponent
        instance = ComponentExt.createSystemActor();
        instance.setName(((Actor)actor).getName());
        
        project = ProjectExt.getProject(scenario);
        blockArchitecture = BlockArchitectureExt.getBlockArchitecture(Type.SA, project);
        
        doEditing(scenario, instanceRole, blockArchitecture, instance);
      }
    }
  }
  
  public static void doEditing(Scenario scenario, InstanceRole instanceRole, BlockArchitecture blockArchitecture, SystemComponent instance) {
    // Make sure your element is attached to a resource, otherwise this will return null
    TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(scenario);
    domain.getCommandStack().execute(new RecordingCommand(domain) {
      
      @Override
      protected void doExecute() {
        // Implement your write operations here,
        // for example: set a new name
        //element.eSet(element.eClass().getEStructuralFeature("name"), "aNewName");
        
        ((SystemAnalysis) blockArchitecture).getOwnedSystemComponentPkg().getOwnedSystemComponents().add(instance);
        EList<InstanceRole> instanceRoles = scenario.getOwnedInstanceRoles();
        
        CsFactoryImpl csFactory = new CsFactoryImpl();
        Part part = csFactory.createPart();
        part.setAbstractType(instance);
        part.setName(instanceRole.getName());
        //part.eSet(InformationPackage.Literals.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES, instanceRole);

        instanceRole.setRepresentedInstance(part);
        
        instanceRoles.add(instanceRole);
        //SiriusDiagramHelper.addNodeInContainer((DragAndDropTarget) instanceRole.eContainer(), false, (AbstractDNode) part);
      }
    });
  }

  /**
   * updates the xtext editor with data from the Capella model
   * 
   * @param scenario
   * @param embeddedEditorViewPart
   * @return
   */
  public static void diagramToXtext(Scenario scenario, EmbeddedEditorView embeddedEditorViewPart) {
    if (embeddedEditorViewPart != null) {
      DslscenarioProvider p = embeddedEditorViewPart.getProvider();
      XtextResource resource = p.getResource();
      EList<EObject> content = resource.getContents();

      DslFactory factory = new DslFactoryImpl();
      Model domainModel = getModel(embeddedEditorViewPart, factory, scenario.getName());
      clearModel(domainModel);

      // Generate Participants
      generateActors(domainModel, scenario, factory);

      // Generate Sequence Messages
      generateSequenceMessages(domainModel, scenario, factory);

      content.add(domainModel);

      String serialized = ((XtextResource) domainModel.eResource()).getSerializer().serialize(domainModel);
      embeddedEditorViewPart.eEditor.getDocument().set(serialized);
    }
  }

  private static void generateActors(Model domainModel, Scenario scenario, DslFactory factory) {
    // get all instance roles (actors) from diagram
    EList<InstanceRole> instanceRoleList = scenario.getOwnedInstanceRoles();

    ScenarioTypeAndParticipants type = domainModel.getScenarioType();
    try {
      // get all participants/actors from editor
      EList<EObject> participants = type.getParticipants();

      // TODO - create a copy of participants for roll-back in case of any error
      // ...

      // remove all participants
      participants.clear();
      // recreate the list of participants
      for (InstanceRole a : instanceRoleList) {
        String id = "a" + a.getId().replace("-", "").substring(0, 5);
        Actor actor = factory.createActor();
        actor.setName(a.getName());
        actor.setId(id);
        participants.add(actor);
      }
    } catch (Error e) {

    }

  }

//  private static void generateSequenceMessages(Model domainModel, Scenario scenario, DslFactory factory) {
//    EList<EObject> messagesOrReferences = domainModel.getMessagesOrReferences();
//
//    List<InteractionFragment> fragments = SequenceDiagramServices.getOrderedInteractionFragments(scenario);
//    Object[] ends = fragments.stream().filter(fragment -> fragment instanceof MessageEnd).toArray();
//
//    messagesOrReferences.clear();
//    for (int i = 0; i < ends.length; i = i + 2) {
//      org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage seqMessage = copySequenceMessageFromMsgEnd(
//          ends[i], factory);
//      messagesOrReferences.add(seqMessage);
//    }
//  }
//
//  private static org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage copySequenceMessageFromMsgEnd(
//      Object object, DslFactory factory) {
//    org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage seqMessage = factory.createSequenceMessage();
//    MessageEnd end = (MessageEnd) object;
//    SequenceMessage sequenceMessage = end.getMessage();
//    seqMessage.setName(sequenceMessage.getName());
//    seqMessage.setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
//    seqMessage.setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName());
//    return seqMessage;
//  }

  private static void generateSequenceMessages(Model domainModel, Scenario scenario, DslFactory factory) {
    EList<EObject> messagesOrReferences = domainModel.getMessagesOrReferences();
    
    List<InteractionFragment> fragments = SequenceDiagramServices.getOrderedInteractionFragments(scenario);
    Object[] ends = fragments.stream().filter(fragment -> fragment instanceof MessageEnd).toArray();
    
    for (int i = 0; i < ends.length; i = i + 2) {
      //org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage seqMessage = copySequenceMessageFromMsgEnd(ends[i], factory);
      EObject seqMessage = copyMessageFromMsgEnd((EObject) ends[i], factory);
      messagesOrReferences.add(seqMessage);
    }
  }

  private static org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage copySequenceMessageFromMsgEnd(Object object, DslFactory factory) {
    org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage seqMessage = factory.createSequenceMessage();
    MessageEnd end = (MessageEnd) object;
    SequenceMessage sequenceMessage = end.getMessage();
    seqMessage.setName(sequenceMessage.getName());
    seqMessage.setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
    seqMessage.setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName()); 
    return seqMessage;
  }
  
  private static EObject copyMessageFromMsgEnd(Object object, DslFactory factory) {
    EObject seqMessage;// = factory.createSequenceMessage();
    MessageEnd end = (MessageEnd) object;
    SequenceMessage sequenceMessage = end.getMessage();

    switch (sequenceMessage.getKind()) {
    case ASYNCHRONOUS_CALL:
      seqMessage = factory.createSequenceMessage();
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage)seqMessage).setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage)seqMessage).setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage)seqMessage).setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName()); 
      break;
    case SYNCHRONOUS_CALL:
      seqMessage = factory.createSequenceMessage();
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage)seqMessage).setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage)seqMessage).setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage)seqMessage).setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName()); 
      break;
    case CREATE:
      seqMessage = factory.createCreateMessage();
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.CreateMessage)seqMessage).setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.CreateMessage)seqMessage).setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.CreateMessage)seqMessage).setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName()); 
      break;
    case DELETE:
      seqMessage = factory.createDeleteMessage();
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.DeleteMessage)seqMessage).setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.DeleteMessage)seqMessage).setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.DeleteMessage)seqMessage).setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName()); 
      break;
    case REPLY:
      seqMessage = factory.createReturnMessage();
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.ReturnMessage)seqMessage).setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.ReturnMessage)seqMessage).setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.ReturnMessage)seqMessage).setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName()); 
      break;
    case TIMER:
      seqMessage = factory.createArmTimerMessage();
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.ArmTimerMessage)seqMessage).setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.ArmTimerMessage)seqMessage).setParticipant(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      break;
    default:
      seqMessage = factory.createSequenceMessage();
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage)seqMessage).setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage)seqMessage).setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage)seqMessage).setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName()); 
      break;
    }
    
//    seqMessage.setName(sequenceMessage.getName());
//    seqMessage.setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
//    seqMessage.setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName()); 
    return seqMessage;
  }
  
  private static Model getModel(EmbeddedEditorView embeddedEditorViewPart, DslFactory factory, String scenarioName) {
    DslscenarioProvider p = embeddedEditorViewPart.getProvider();
    XtextResource resource = p.getResource();
    EList<EObject> content = resource.getContents();
    Model domainModel = null;
    if (!content.isEmpty() && content.get(0) instanceof Model) {
      domainModel = (Model) resource.getContents().get(0);
    } else {
      domainModel = factory.createModel();
      ScenarioTypeAndParticipants scenarioType = factory.createScenarioTypeAndParticipants();
      scenarioType.setName(scenarioName);
      domainModel.setScenarioType(scenarioType);
    }
    return domainModel;
  }
  
  private static void clearModel(Model domainModel) {
    if (domainModel != null && domainModel.getScenarioType() != null && domainModel.getScenarioType().getParticipant() != null) {
      domainModel.getScenarioType().getParticipants().clear();
    }
    if (domainModel != null && domainModel.getMessagesOrReferences() != null) {
      domainModel.getMessagesOrReferences().clear();
    }
  }
}
