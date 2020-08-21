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
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.ctx.impl.SystemFunctionImpl;
import org.polarsys.capella.core.data.epbs.EPBSArchitecture;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.ScenarioKind;
import org.polarsys.capella.core.data.interaction.properties.dialogs.sequenceMessage.model.SelectInvokedOperationModel;
import org.polarsys.capella.core.data.interaction.properties.dialogs.sequenceMessage.model.communications.AbstractCommunication;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalFunction;
import org.polarsys.capella.core.data.la.impl.LogicalFunctionImpl;
import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.core.data.oa.Role;
import org.polarsys.capella.core.data.oa.RolePkg;
import org.polarsys.capella.core.data.oa.impl.OperationalActivityImpl;
import org.polarsys.capella.core.data.oa.impl.OperationalAnalysisImpl;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalFunction;
import org.polarsys.capella.core.data.pa.impl.PhysicalFunctionImpl;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.sirius.analysis.InteractionServices;
import org.polarsys.capella.core.sirius.analysis.SequenceDiagramServices;
import org.polarsys.capella.scenario.editor.EmbeddedEditorInstance;

public class EmbeddedEditorInstanceHelper {

  public static EList<InstanceRole> getAvailableInstanceRoles() {
    Scenario currentScenario = EmbeddedEditorInstance.getAssociatedScenarioDiagram();
    return currentScenario.getOwnedInstanceRoles();
  }

  public static List<String> getMessageSequenceName(String source, String target) {
    Scenario currentScenario = EmbeddedEditorInstance.getAssociatedScenarioDiagram();
    // DataFlowHelper.
    // List<MessageEnd> ownedMessages = ScenarioExt.getOwnedMessagesEnds(currentScenario);
    InstanceRole sourceIR = EmbeddedEditorInstanceHelper.getInstanceRole(source);
    InstanceRole targetIR = EmbeddedEditorInstanceHelper.getInstanceRole(target);
    SelectInvokedOperationModel model = new SelectInvokedOperationModel(sourceIR, targetIR, false);
    List<AbstractCommunication> ownedMessages = model.getPossibleElements();
    // EList<SequenceMessage> ownedMessages = currentScenario.getOwnedMessages();
    List<String> messagesName = new ArrayList<String>();
    // for (SequenceMessage message : ownedMessages) {
    // messagesName.add(message.getName());
    // }
    for (AbstractCommunication message : ownedMessages) {
      messagesName.add(message.exchangeItem.getName());
    }
    return messagesName;
  }

  public static List<String> getAvailablePartNames(String keyword) {
    List<String> partNames = new ArrayList<String>();
    Scenario currentScenario = EmbeddedEditorInstance.getAssociatedScenarioDiagram();
    InteractionServices is = new InteractionServices();
    List<Part> parts = new ArrayList<Part>();
    switch (keyword) {
    case "role":
      OperationalAnalysisImpl op = (OperationalAnalysisImpl) currentScenario.eContainer().eContainer().eContainer();
      RolePkg rolesPkg = op.basicGetOwnedRolePkg();
      EList<Role> roles = rolesPkg.getOwnedRoles();
      for (Role role : roles) {
        partNames.add(role.getName());
      }
      break;
    case "actor":
      parts = is.getISScopeInsertActors(currentScenario);
      break;
    case "activity":
      BlockArchitecture blockArch = BlockArchitectureExt.getRootBlockArchitecture(currentScenario);
      OperationalActivityImpl root = (OperationalActivityImpl) BlockArchitectureExt.getRootFunction(blockArch);
      partNames.add(root.getName());
      EList<OperationalActivity> activities = root.getChildrenOperationalActivities();
      for (OperationalActivity activity : activities) {
        partNames.add(activity.getName());
      }
      break;
    case "function":
      BlockArchitecture blockArchitecture = BlockArchitectureExt.getRootBlockArchitecture(currentScenario);
      AbstractFunction rootFunction = BlockArchitectureExt.getRootFunction(blockArchitecture);
      partNames.add(rootFunction.getName());
      if (rootFunction instanceof LogicalFunctionImpl) {
        EList<LogicalFunction> functions = ((LogicalFunctionImpl) rootFunction).getChildrenLogicalFunctions();
        for (LogicalFunction function : functions) {
          partNames.add(function.getName());
        }
      } else if (rootFunction instanceof SystemFunctionImpl) {
        EList<SystemFunction> functions = ((SystemFunctionImpl) rootFunction).getChildrenSystemFunctions();
        for (SystemFunction function : functions) {
          partNames.add(function.getName());
        }
      } else if (rootFunction instanceof PhysicalFunctionImpl) {
        EList<PhysicalFunction> functions = ((PhysicalFunctionImpl) rootFunction).getChildrenPhysicalFunctions();
        for (PhysicalFunction function : functions) {
          partNames.add(function.getName());
        }
      }
      break;
    default:
      parts = is.getESScopeInsertComponents(currentScenario);
      break;
    }
    for (Part part : parts) {
      partNames.add(part.getName());
    }
    return partNames;
  }

  public static InstanceRole getInstanceRole(String source) {
    EList<InstanceRole> instanceRoles = getAvailableInstanceRoles();
    InstanceRole instanceRole = null;
    for (Iterator<InstanceRole> iterator = instanceRoles.iterator(); iterator.hasNext();) {
      InstanceRole role = iterator.next();
      if (role.getName().equals(source)) {
        instanceRole = role;
        break;
      }
    }
    return instanceRole;
  }

  /**
   * helper function that validates that a keyword typed in a text scenario is valid, based on scenario type and
   * architecture level
   * 
   * @param keyword
   * @return boolean
   *
   */
  public static boolean checkValidKeyword(String keyword) {
    Scenario currentScenario = EmbeddedEditorInstance.getAssociatedScenarioDiagram();
    BlockArchitecture blockArchitecture = BlockArchitectureExt.getRootBlockArchitecture(currentScenario);

    if (currentScenario.getKind() == ScenarioKind.INTERACTION) {
      if (SequenceDiagramServices.isValidEntityScenario(currentScenario)) {
        return keyword.equals("entity") || keyword.equals("actor") || keyword.equals("role");
      }
      if (SequenceDiagramServices.isValidActivityScenario(currentScenario)) {
        return keyword.equals("activity");
      }
    }
    if (currentScenario.getKind() == ScenarioKind.INTERFACE) {
      if (blockArchitecture instanceof SystemAnalysis) {
        return keyword.equals("actor");
      }
      if (blockArchitecture instanceof LogicalArchitecture) {
        return keyword.equals("actor") || keyword.equals("component");
      }
      if (blockArchitecture instanceof PhysicalArchitecture) {
        return keyword.equals("actor") || keyword.equals("component");
      }
      if (blockArchitecture instanceof EPBSArchitecture) {
        return keyword.equals("configuration_item");
      }
    }
    // FS Scenarios
    if (currentScenario.getKind() == ScenarioKind.FUNCTIONAL) {
      if (blockArchitecture instanceof SystemAnalysis || blockArchitecture instanceof LogicalArchitecture
          || blockArchitecture instanceof PhysicalArchitecture) {
        return keyword.equals("function");
      }
    }
    // ES scenarios
    if (currentScenario.getKind() == ScenarioKind.DATA_FLOW) {
      if (blockArchitecture instanceof SystemAnalysis) {
        return keyword.equals("actor");
      }
      if (blockArchitecture instanceof LogicalArchitecture) {
        return keyword.equals("actor") || keyword.equals("component");
      }
      if (blockArchitecture instanceof PhysicalArchitecture) {
        return keyword.equals("actor") || keyword.equals("component");
      }
    }
    return false;
  }
}
