package org.polarsys.capella.scenario.editor.embeddededitor.views;

import javax.inject.Inject;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.polarsys.capella.scenario.editor.dslscenario.ui.internal.DslscenarioActivator;
import org.polarsys.capella.scenario.editor.dslscenario.ui.provider.DslscenarioProvider;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Model;

import com.google.inject.Injector;

public class EmbeddedEditorView extends ViewPart{

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.eclipse.xtext.example.domainmodel.embeddededitor.views.EmbeddedEditorView";

	@Inject
	IWorkbench workbench;

	private TableViewer viewer;
	private Action action1;
	DslscenarioProvider provider;
	private EmbeddedEditorModelAccess model;
	Composite top;

	@Override
	public void saveState(IMemento memento) {
		// do nothing
		DslscenarioActivator activator = DslscenarioActivator.getInstance();
		Injector injector = activator
				.getInjector(DslscenarioActivator.ORG_POLARSYS_CAPELLA_SCENARIO_EDITOR_DSLSCENARIO_DSL);

		EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);

		EmbeddedEditor editor = factory.newEditor(provider).withParent(top);
	}

	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		@Override
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		@Override
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		@Override
		public Image getImage(Object obj) {
			return workbench.getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	@Override
	public void createPartControl(Composite parent) {
		makeActions();
		contributeToActionBars();

		top = new Composite(parent, SWT.NONE);
		top.setLayout(new GridLayout());

		DslscenarioActivator activator = DslscenarioActivator.getInstance();
		Injector injector = activator
				.getInjector(DslscenarioActivator.ORG_POLARSYS_CAPELLA_SCENARIO_EDITOR_DSLSCENARIO_DSL);

		provider = injector.getInstance(DslscenarioProvider.class);
		EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);

		EmbeddedEditor editor = factory.newEditor(provider).withParent(top);
		model = editor.createPartialEditor("", "", "", false);
	}

	public EmbeddedEditorModelAccess getModel() {
		return model;
	}
	
	public DslscenarioProvider getProvider() {
		return provider;
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
	}

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(
				PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
	}

	private void showMessage(String message) {
		XtextResource resource = provider.getResource();
		if (resource.getContents().get(0) instanceof Model) {
			Model domainModel = (Model) resource.getContents().get(0);
		}
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}

}
