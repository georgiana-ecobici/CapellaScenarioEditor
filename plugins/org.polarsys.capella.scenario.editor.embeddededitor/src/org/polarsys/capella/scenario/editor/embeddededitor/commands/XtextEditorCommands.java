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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Actor;
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
      String begin = "scenario System " + " IS " + " \"" + scenario.getName() + "\"{";

      if (content.isEmpty() || !(content.get(0) instanceof Model)) {
        embeddedEditorViewPart.eEditor.getDocument().set(begin + "}");
      }

      if (!content.isEmpty() && content.get(0) instanceof Model) {
        Model domainModel = (Model) resource.getContents().get(0);
        ScenarioTypeAndParticipants type = domainModel.getScenarioType();
        // todo fill with task that reads real data
        if (type != null) {
          type.setName(scenario.getName());
          DslFactoryImpl factory = new DslFactoryImpl();

          Actor a2 = factory.createActor();
          a2.setName("aNew");
          a2.setId("aNew");
          type.getParticipants().add(a2);

          String serialized = ((XtextResource) domainModel.eResource()).getSerializer().serialize(domainModel);// ,
                                                                                                               // SaveOptions.newBuilder().format().getOptions());

          // embeddedEditorViewPart.getModel().updateModel(serialized);
          embeddedEditorViewPart.eEditor.getDocument().set(serialized);
        }
      }
    }
  }
}
