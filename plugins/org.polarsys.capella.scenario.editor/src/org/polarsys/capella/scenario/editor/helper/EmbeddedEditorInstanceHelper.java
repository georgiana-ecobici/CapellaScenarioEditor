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

import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.scenario.editor.EmbeddedEditorInstance;

public class EmbeddedEditorInstanceHelper {

  public static List<String> getAvailableInstanceRolesName() {
    List<String> instanceRoleNames = new ArrayList();
    Scenario currentScenario = EmbeddedEditorInstance.getAssociatedScenarioDiagram();

    for (InstanceRole role : currentScenario.getOwnedInstanceRoles()) {
      instanceRoleNames.add(role.getName());
    }

    return instanceRoleNames;
  }
}
