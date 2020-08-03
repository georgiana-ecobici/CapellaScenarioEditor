package org.polarsys.capella.scenario.editor;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.model.handler.helpers.CapellaAdapterHelper;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Actor;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.DslFactory;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Model;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ScenarioTypeAndParticipants;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.impl.DslFactoryImpl;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.util.DslAdapterFactory;
import org.polarsys.capella.scenario.editor.embeddededitor.views.EmbeddedEditorView;
import org.polarsys.capella.scenario.editor.dslscenario.ui.provider.DslscenarioProvider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;

/**
 * 
 */
public class EmbeddedEditorSessionListener implements SessionManagerListener {
	private ISelectionListener selectionListener;
	private static List<InstanceRole> instanceRoleList;
	static int i;

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
							DslscenarioProvider p = eeView.getProvider();
							XtextResource resource = p.getResource();
							EList<EObject> content = resource.getContents();
							if (content.size() > 0 && content.get(0) instanceof Model) {
								Model domainModel = (Model) resource.getContents().get(0);
								ScenarioTypeAndParticipants type = domainModel.getScenarioType();
								if (type != null) {
									type.setName("test");
									DslFactoryImpl factory = new DslFactoryImpl();
									
									Actor a2 = factory.createActor();
									i++;
									a2.setName("a2_" + i);
									a2.setId("a2_" + i);
									type.getParticipants().add(a2);
									
									String serialized = ((XtextResource) domainModel.eResource()).getSerializer()
											.serialize(domainModel);//, SaveOptions.newBuilder().format().getOptions());
									eeView.getModel().updateModel(serialized);
								}
							}
						}
						
						//eeView.getModel().updateModel("scenario System " + sc.getKind() + " \"" + sc.getName()
//						+ "\" {actor \"a1\" as a1}");

					}
				} else if (newInput instanceof InstanceRole) {
					InstanceRole ir = (InstanceRole) newInput;
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
