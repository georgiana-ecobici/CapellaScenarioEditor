package org.polarsys.capella.scenario.editor.embeddededitor.views;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * 
 */
public class EmbeddedEditorSessionListener implements SessionManagerListener {

	@Override
	public void notify(Session session, int notification) {
		try {
			IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			// Get the Semantic Browser.
			EmbeddedEditorView eeView = (EmbeddedEditorView) activePage.findView(EmbeddedEditorView.ID);
			if (null == eeView) {
				// Show it if not found.
				eeView = (EmbeddedEditorView) activePage.showView(EmbeddedEditorView.ID);
			}
			activePage.activate(eeView);
		} catch (PartInitException exception) {
			// Catch exception silently,
		}
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
	}
}
