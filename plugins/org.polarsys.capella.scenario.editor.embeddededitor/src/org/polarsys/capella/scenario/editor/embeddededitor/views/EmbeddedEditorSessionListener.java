package org.polarsys.capella.scenario.editor.embeddededitor.views;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.model.handler.helpers.CapellaAdapterHelper;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Actor;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.impl.ActorImpl;
import org.polarsys.capella.scenario.editor.dslscenario.ui.provider.DslscenarioProvider;

/**
 * 
 */
public class EmbeddedEditorSessionListener implements SessionManagerListener {
	private ISelectionListener selectionListener;

	@Override
	public void notify(Session session, int notification) {
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		activePage.addSelectionListener(getSelectionListener());
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
					DRepresentationDescriptor desc = (DRepresentationDescriptor) newInput;
					if (desc.getTarget() instanceof Scenario) {
						Scenario sc = (Scenario) desc.getTarget();
						IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getActivePage();
						EmbeddedEditorView eeView = (EmbeddedEditorView) activePage.findView(EmbeddedEditorView.ID);
						if (null == eeView) {
							// Show it if not found.
							try {
								eeView = (EmbeddedEditorView) activePage.showView(EmbeddedEditorView.ID);
							} catch (PartInitException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						activePage.activate(eeView);

						if (eeView != null) {
							EList<InstanceRole> irs = sc.getOwnedInstanceRoles();
							for (InstanceRole ir : irs) {
								eeView.getModel().updateModel(ir.getName());

//								Actor a = new ActorImpl();
//								a.setName(ir.getName());
//								a.setId(ir.getId());
							}

							DslscenarioProvider provider = eeView.getProvider();
							XtextResource resource = provider.getResource();
							EmbeddedEditorModelAccess model = eeView.getModel();

							eeView.getModel().updateModel("scenario System " + sc.getKind() + " \"" + sc.getName()
									+ "\" {actor \"a1\" as a1}");
						}

					}
				} else if (newInput instanceof InstanceRole) {
					InstanceRole ir = (InstanceRole) newInput;
				}
			}
		};
	}

	private EmbeddedEditorView getActiveEmbeddedEditorView() {
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		// Get the Semantic Browser.
		EmbeddedEditorView eeView = (EmbeddedEditorView) activePage.findView(EmbeddedEditorView.ID);
		return eeView;
	}

	@Override
	public void notifyAddSession(Session newSession) {
		// Do Nothing
	}

	@Override
	public void notifyRemoveSession(Session removedSession) {
		System.out.println("c");
		// Do Nothing
	}

	@Override
	public void viewpointSelected(Viewpoint selectedSirius) {
		System.out.println("a");
	}

	@Override
	public void viewpointDeselected(Viewpoint deselectedSirius) {
		// TODO Auto-generated method stub

	}
}
