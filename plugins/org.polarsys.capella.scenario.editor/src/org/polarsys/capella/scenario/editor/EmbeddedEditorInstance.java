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
package org.polarsys.capella.scenario.editor;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.polarsys.capella.core.data.interaction.Scenario;

public class EmbeddedEditorInstance {
  private static EmbeddedEditorModelAccess model;
  private static EmbeddedEditor eEditor;
  private static Scenario associatedScenarioDiagram;
  private static DDiagram associatedDiagram;

  private static EmbeddedEditorInstance eINSTANCE;

  private EmbeddedEditorInstance() {
  }

  public EmbeddedEditorInstance getInstance() {
    if (eINSTANCE == null) {
      eINSTANCE = new EmbeddedEditorInstance();
    }
    return eINSTANCE;
  }

  public static EmbeddedEditorModelAccess getModel() {
    return model;
  }

  public static void setModel(EmbeddedEditorModelAccess model) {
    EmbeddedEditorInstance.model = model;
  }

  public static EmbeddedEditor geteEditor() {
    return eEditor;
  }

  public static void seteEditor(EmbeddedEditor eEditor) {
    EmbeddedEditorInstance.eEditor = eEditor;
  }

  public static Scenario getAssociatedScenarioDiagram() {
    return associatedScenarioDiagram;
  }

  public static void setAssociatedScenarioDiagram(Scenario associatedScenarioDiagram) {
    EmbeddedEditorInstance.associatedScenarioDiagram = associatedScenarioDiagram;
  }

  public static DDiagram getAssociatedDiagram() {
    return associatedDiagram;
  }

  public static void setAssociatedDiagram(DDiagram associatedDiagram) {
    EmbeddedEditorInstance.associatedDiagram = associatedDiagram;
  }
}
