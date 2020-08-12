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
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.information.AbstractEventOperation;
import org.polarsys.capella.core.data.interaction.EventReceiptOperation;
import org.polarsys.capella.core.data.interaction.EventSentOperation;
import org.polarsys.capella.core.data.interaction.Execution;
import org.polarsys.capella.core.data.interaction.ExecutionEnd;
import org.polarsys.capella.core.data.interaction.ExecutionEvent;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.InteractionFactory;
import org.polarsys.capella.core.data.interaction.InteractionFragment;
import org.polarsys.capella.core.data.interaction.MessageEnd;
import org.polarsys.capella.core.data.interaction.MessageKind;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.SequenceMessage;
import org.polarsys.capella.core.data.interaction.properties.dialogs.sequenceMessage.model.SelectInvokedOperationModelForSharedDataAndEvent;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt.Type;
import org.polarsys.capella.core.model.helpers.ProjectExt;
import org.polarsys.capella.core.sirius.analysis.SequenceDiagramServices;
import org.polarsys.capella.scenario.editor.EmbeddedEditorInstance;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Actor;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.DslFactory;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Model;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ScenarioTypeAndParticipants;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.impl.DslFactoryImpl;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.impl.ModelImpl;
import org.polarsys.capella.scenario.editor.dslscenario.ui.provider.DslscenarioProvider;
import org.polarsys.capella.scenario.editor.embeddededitor.views.EmbeddedEditorView;
import org.polarsys.capella.scenario.editor.helper.EmbeddedEditorInstanceHelper;

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
      EList<EObject> messages = domainModel.getMessagesOrReferences();
      
      Project project;
      BlockArchitecture blockArchitecture;
      project = ProjectExt.getProject(scenario);
      blockArchitecture = BlockArchitectureExt.getBlockArchitecture(Type.SA, project);
      
      doEditingOnActors(scenario, blockArchitecture, actors);
      
      doEditingOnMessages(scenario, blockArchitecture, messages);
    }
  }

  private static void doEditingOnActors(Scenario scenario, BlockArchitecture blockArchitecture, EList<EObject> actors) {
    // Make sure your element is attached to a resource, otherwise this will return null
    TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(scenario);
    domain.getCommandStack().execute(new RecordingCommand(domain) {
      
      @Override
      protected void doExecute() {
        // Implement your write operations here,
        // for example: set a new name
        //element.eSet(element.eClass().getEStructuralFeature("name"), "aNewName");
        
        InstanceRole instanceRole;
        SystemComponent instance;
        EList<InstanceRole> instanceRoles = scenario.getOwnedInstanceRoles();
        
        for (Iterator<EObject> iterator = actors.iterator(); iterator.hasNext();) {
          EObject actor = iterator.next();
          
          String instanceName = ((Actor)actor).getName();
          if (instanceRoles.stream().filter(ir -> ir.getName().equals(instanceName)).collect(Collectors.toList()).size() == 0) {
            instanceRole = InteractionFactory.eINSTANCE.createInstanceRole();
            instanceRole.setName(((Actor)actor).getName());
            
            //search actor by name
            List<SystemComponent> components = ((SystemAnalysis) blockArchitecture).getOwnedSystemComponentPkg().getOwnedSystemComponents()
              .stream().filter(comp -> comp.getName().equals(((Actor) actor).getName())).collect(Collectors.toList());
            instance = components.get(0);
            
            Part part = (Part) instance.getRepresentingParts().get(0);
            instanceRole.setRepresentedInstance(part);
            
            instanceRoles.add(instanceRole);
          }
        }
      }
    });
  }

  private static void doEditingOnMessages(Scenario scenario, BlockArchitecture blockArchitecture,
      EList<EObject> messages) {
    // Make sure your element is attached to a resource, otherwise this will return null
    TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(scenario);
    domain.getCommandStack().execute(new RecordingCommand(domain) {
      
      @Override
      protected void doExecute() {
        // Implement your write operations here,
        // for example: set a new name
        //element.eSet(element.eClass().getEStructuralFeature("name"), "aNewName");
        
        SequenceMessage sequenceMessage;
        EList<SequenceMessage> sequenceMessages = scenario.getOwnedMessages();
        
        for (Iterator<EObject> iterator = messages.iterator(); iterator.hasNext();) {
          EObject seqMessageFromXtext = iterator.next();
          org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage seqMessage = 
              (org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage) seqMessageFromXtext;
          InstanceRole source = EmbeddedEditorInstanceHelper.getInstanceRole(seqMessage.getSource());
          InstanceRole target = EmbeddedEditorInstanceHelper.getInstanceRole(seqMessage.getTarget());
          if (source != null && target != null) {
            // create Capella SequenceMessage
            sequenceMessage = InteractionFactory.eINSTANCE.createSequenceMessage();
            sequenceMessage.setName(seqMessage.getName());
            sequenceMessage.setKind(MessageKind.ASYNCHRONOUS_CALL);

            //sending end
            MessageEnd sendingEnd = InteractionFactory.eINSTANCE.createMessageEnd();
            sendingEnd.getCoveredInstanceRoles().add(source);
            sequenceMessage.setSendingEnd(sendingEnd);
            scenario.getOwnedInteractionFragments().add(sendingEnd);
            
            //receiving end
            MessageEnd receivingEnd = InteractionFactory.eINSTANCE.createMessageEnd();
            receivingEnd.getCoveredInstanceRoles().add(target);
            sequenceMessage.setReceivingEnd(receivingEnd);
            scenario.getOwnedInteractionFragments().add(receivingEnd);

            //execution end
            ExecutionEnd executionEnd = InteractionFactory.eINSTANCE.createExecutionEnd();
            scenario.getOwnedInteractionFragments().add(executionEnd);
            executionEnd.getCoveredInstanceRoles().add(receivingEnd.getCoveredInstanceRoles().get(0));
            
            //execution
            Execution execution = InteractionFactory.eINSTANCE.createExecution();
            execution.setFinish(executionEnd);
            execution.setStart(receivingEnd);
            scenario.getOwnedTimeLapses().add(execution);
            
            //EventSentOperation
            EventSentOperation eventSentOperation = InteractionFactory.eINSTANCE.createEventSentOperation();
            scenario.getOwnedEvents().add(eventSentOperation);
            sendingEnd.setEvent(eventSentOperation);
            
            //TODO - ordering
            // Look for the InstanceRole mapped from the source of the given functional exchange
            //EObject eObject = getMapping().get(getFunctionalExchangeSource(fe));
            //if (eObject instanceof InstanceRole && !orderedInstRoles.contains(eObject)) {
            //  orderedInstRoles.add((InstanceRole) eObject);
            //}
            
            //EventReceiptOperation
            EventReceiptOperation eventRecvOperation = InteractionFactory.eINSTANCE.createEventReceiptOperation();
            scenario.getOwnedEvents().add(eventRecvOperation);
            receivingEnd.setEvent(eventRecvOperation);
            
            //execution event
            ExecutionEvent executionEvent = InteractionFactory.eINSTANCE.createExecutionEvent();
            executionEnd.setEvent(executionEvent);
            scenario.getOwnedEvents().add(executionEvent);
            
            //get operation by name from the list of available exchanges
            List<CapellaElement> exchanges = SelectInvokedOperationModelForSharedDataAndEvent.getAvailableExchangeItems(source, target, false);
            exchanges.stream().filter(ex -> ((AbstractNamedElement) ex).getName().equals(seqMessage.getName()));
            if (!exchanges.isEmpty()) {
              eventRecvOperation.setOperation((AbstractEventOperation) exchanges.get(0));
              eventSentOperation.setOperation((AbstractEventOperation) exchanges.get(0));
            }
            
            sequenceMessages.add(sequenceMessage);
          }
        }
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
      domainModel.getScenarioType().setName(scenario.getName());
      clearModel(domainModel);

      // Generate Participants
      generateActors(domainModel, scenario, factory);

      // Generate Sequence Messages
      generateSequenceMessages(domainModel, scenario, factory);

      content.add(domainModel);

      String serialized = ((XtextResource) domainModel.eResource()).getSerializer().serialize(domainModel);
      EmbeddedEditorInstance.geteEditor().getDocument().set(serialized);
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

  private static void generateSequenceMessages(Model domainModel, Scenario scenario, DslFactory factory) {
    EList<EObject> messagesOrReferences = domainModel.getMessagesOrReferences();

    List<InteractionFragment> fragments = SequenceDiagramServices.getOrderedInteractionFragments(scenario);
    Object[] ends = fragments.stream().filter(fragment -> fragment instanceof MessageEnd).toArray();

    for (int i = 0; i < ends.length; i = i + 2) {
      EObject seqMessage = copyMessageFromMsgEnd(ends[i], factory);
      messagesOrReferences.add(seqMessage);
    }
  }

  private static org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage copySequenceMessageFromMsgEnd(
      Object object, DslFactory factory) {
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
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage) seqMessage)
          .setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage) seqMessage)
          .setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage) seqMessage)
          .setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName());
      break;
    case SYNCHRONOUS_CALL:
      seqMessage = factory.createSequenceMessage();
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage) seqMessage)
          .setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage) seqMessage)
          .setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage) seqMessage)
          .setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName());
      break;
    case CREATE:
      seqMessage = factory.createCreateMessage();
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.CreateMessage) seqMessage)
          .setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.CreateMessage) seqMessage)
          .setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.CreateMessage) seqMessage)
          .setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName());
      break;
    case DELETE:
      seqMessage = factory.createDeleteMessage();
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.DeleteMessage) seqMessage)
          .setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.DeleteMessage) seqMessage)
          .setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.DeleteMessage) seqMessage)
          .setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName());
      break;
    case REPLY:
      seqMessage = factory.createReturnMessage();
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.ReturnMessage) seqMessage)
          .setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.ReturnMessage) seqMessage)
          .setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.ReturnMessage) seqMessage)
          .setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName());
      break;
    case TIMER:
      seqMessage = factory.createArmTimerMessage();
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.ArmTimerMessage) seqMessage)
          .setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.ArmTimerMessage) seqMessage)
          .setParticipant(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      break;
    default:
      seqMessage = factory.createSequenceMessage();
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage) seqMessage)
          .setName(sequenceMessage.getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage) seqMessage)
          .setSource(sequenceMessage.getSendingEnd().getCoveredInstanceRoles().get(0).getName());
      ((org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage) seqMessage)
          .setTarget(sequenceMessage.getReceivingEnd().getCoveredInstanceRoles().get(0).getName());
      break;
    }
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
    if (domainModel != null && domainModel.getScenarioType() != null
        && domainModel.getScenarioType().getParticipant() != null) {
      domainModel.getScenarioType().getParticipants().clear();
    }
    if (domainModel != null && domainModel.getMessagesOrReferences() != null) {
      domainModel.getMessagesOrReferences().clear();
    }
  }
}
