package org.polarsys.capella.scenario.editor.embeddededitor.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;

public class SaveEditor extends Action {

    public SaveEditor() {
          super(null, IAction.AS_CHECK_BOX);
          setToolTipText("Save Editor");
    }
}

