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
package org.polarsys.capella.scenario.editor.embeddededitor.listener;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.model.handler.helpers.CapellaAdapterHelper;
import org.polarsys.capella.scenario.editor.EmbeddedEditorInstance;
import org.polarsys.capella.scenario.editor.embeddededitor.commands.XtextEditorCommands;
import org.polarsys.capella.scenario.editor.embeddededitor.helper.XtextEditorHelper;
import org.polarsys.capella.scenario.editor.embeddededitor.views.EmbeddedEditorView;

public class EmbeddedEditorSessionListener implements SessionManagerListener {
  private ISelectionListener selectionListener;
  private static List<InstanceRole> instanceRoleList;
  static int i;
  static Object currentSelected;

  @Override
  public void notify(Session session, int notification) {
    if (PlatformUI.getWorkbench() != null && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
      IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
      if (activePage != null)
        activePage.addSelectionListener(getSelectionListener());
    }
  }

  public ISelectionListener getSelectionListener() {
    if (selectionListener == null) {
      selectionListener = createSelectionListener();
    }
    return selectionListener;
  }

  public Object handleSelection(IWorkbenchPart part, ISelection selection,
      boolean handleSemanticBrowserSelectionEvent) {
    Object result = null;
    if (selection != null && !selection.isEmpty() && (!(part instanceof EmbeddedEditorView))) {
      if (selection instanceof IStructuredSelection) {
        IStructuredSelection selection_l = (IStructuredSelection) selection;
        Object firstElement = selection_l.getFirstElement();
        result = CapellaAdapterHelper.resolveDescriptorOrBusinessObject(firstElement);
      }
    }
    return result;
  }

  protected ISelectionListener createSelectionListener() {
    return (part, selection) -> {
      if (part instanceof DDiagramEditor) {
        Object newInput = handleSelection(part, selection, false);
        if (newInput instanceof DRepresentationDescriptor) {
          if (currentSelected == null || !newInput.equals(currentSelected)) {
            currentSelected = newInput;
            DialectEditor dEditor = (DialectEditor) part;
            DDiagram diagram = (DDiagram) dEditor.getRepresentation();

            DRepresentationDescriptor desc = (DRepresentationDescriptor) currentSelected;
            if (desc.getTarget() instanceof Scenario) {
              Scenario sc = (Scenario) desc.getTarget();
              IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
              EmbeddedEditorView eeView = XtextEditorHelper.getActiveEmbeddedEditorView();
              if (eeView == null) {
                // Show it if not found.
                try {
                  eeView = (EmbeddedEditorView) activePage.showView(EmbeddedEditorView.ID);
                } catch (PartInitException e) {
                  e.printStackTrace();
                }
                activePage.activate(eeView);
              }
              EmbeddedEditorInstance.setAssociatedScenarioDiagram(sc);
              EmbeddedEditorInstance.setAssociatedDiagram(diagram);
              XtextEditorCommands.diagramToXtext(sc, eeView);
            }
          }
        }
      }
    };
  }

  public static List<String> getInstanceRoleNameList() {
    List<String> instRoleNameList = new ArrayList<String>();
    for (InstanceRole inst : instanceRoleList) {
      instRoleNameList.add(inst.getName());
    }
    if (instRoleNameList.isEmpty()) {
      return null;
    }
    return instRoleNameList;
  }

  private EmbeddedEditorView getActiveEmbeddedEditorView() {
    IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
    EmbeddedEditorView eeView = (EmbeddedEditorView) activePage.findView(EmbeddedEditorView.ID);
    return eeView;
  }

  @Override
  public void notifyAddSession(Session newSession) {
    // Do Nothing
  }

  @Override
  public void notifyRemoveSession(Session removedSession) {
    // Do Nothing
  }

  @Override
  public void viewpointSelected(Viewpoint selectedSirius) {
  }

  @Override
  public void viewpointDeselected(Viewpoint deselectedSirius) {
    // TODO Auto-generated method stub

  }
}
