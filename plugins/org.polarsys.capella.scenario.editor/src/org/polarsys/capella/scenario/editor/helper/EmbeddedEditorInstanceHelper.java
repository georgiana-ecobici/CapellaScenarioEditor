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
package org.polarsys.capella.scenario.editor.helper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.sirius.analysis.InteractionServices;
import org.polarsys.capella.scenario.editor.EmbeddedEditorInstance;

public class EmbeddedEditorInstanceHelper {

  public static EList<InstanceRole> getAvailableInstanceRoles() {
    Scenario currentScenario = EmbeddedEditorInstance.getAssociatedScenarioDiagram();
    return currentScenario.getOwnedInstanceRoles();
  }

  public static List<String> getAvailablePartNames() {
    List<String> partNames = new ArrayList();
    Scenario currentScenario = EmbeddedEditorInstance.getAssociatedScenarioDiagram();
    InteractionServices is = new InteractionServices();
    List<Part> actorParts = is.getISScopeInsertActors(currentScenario);

    for (Part part : actorParts) {
      partNames.add(part.getName());
    }

    return partNames;
  }
}
