package org.polarsys.capella.scenario.editor.embeddededitor.actions;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IViewSite;
import org.polarsys.capella.scenario.editor.embeddededitor.views.EmbeddedEditorView;

public class XtextEditorActionFactory {
	
	public void createAction(EmbeddedEditorView semanticBrowserViewPart) {
        SaveEditor showDiagramsAction = new SaveEditor();
        getToolBarManager(semanticBrowserViewPart).add(showDiagramsAction);
      }
    
    private IToolBarManager getToolBarManager(EmbeddedEditorView semanticBrowserViewPart) {
        IViewSite viewSite = semanticBrowserViewPart.getViewSite();
        IActionBars actionBars = viewSite.getActionBars();
        return actionBars.getToolBarManager();
      }

}
