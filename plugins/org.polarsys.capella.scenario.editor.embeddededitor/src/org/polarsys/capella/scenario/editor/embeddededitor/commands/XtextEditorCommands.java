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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.polarsys.capella.core.data.interaction.InteractionFragment;
import org.polarsys.capella.core.data.interaction.MessageEnd;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.SequenceMessage;
import org.polarsys.capella.core.sirius.analysis.SequenceDiagramServices;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.DslFactory;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Model;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ScenarioTypeAndParticipants;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.impl.DslFactoryImpl;
import org.polarsys.capella.scenario.editor.dslscenario.ui.provider.DslscenarioProvider;
import org.polarsys.capella.scenario.editor.embeddededitor.views.EmbeddedEditorView;

public class XtextEditorCommands {

  public static void xtextToDiagram(Scenario scenario, EmbeddedEditorView embeddedEditorViewPart) {
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
      
	    DslFactoryImpl factory = new DslFactoryImpl();
	    Model domainModel = factory.createModel(); 
	    ScenarioTypeAndParticipants scenarioType = factory.createScenarioTypeAndParticipants();
	    scenarioType.setName(scenario.getName());
	    domainModel.setScenarioType(scenarioType);
		
      //TODO - Generate Participants
	    //....
	  
	    //Generate Sequence Messages
	    generateSequenceMessages(domainModel, scenario, factory);
	    
	    content.add(domainModel);
		
	    String serialized = ((XtextResource) domainModel.eResource()).getSerializer()
		    .serialize(domainModel);
	    embeddedEditorViewPart.eEditor.getDocument().set(serialized);
    }
  }
  
  private static void generateSequenceMessages(Model domainModel, Scenario scenario, DslFactory factory) {
    EList<EObject> messagesOrReferences = domainModel.getMessagesOrReferences();
    
    List<InteractionFragment> fragments = SequenceDiagramServices.getOrderedInteractionFragments(scenario);
    Object[] ends = fragments.stream().filter(fragment -> fragment instanceof MessageEnd).toArray();
    
    for (int i = 0; i < ends.length; i = i + 2) {
      org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage seqMessage = copySequenceMessageFromMsgEnd(ends[i], factory);
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
}
