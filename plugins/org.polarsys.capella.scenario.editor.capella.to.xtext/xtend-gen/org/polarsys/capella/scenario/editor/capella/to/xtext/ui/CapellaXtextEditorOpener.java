/**
 * Copyright (c) 2017 TypeFox and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.polarsys.capella.scenario.editor.capella.to.xtext.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.polarsys.capella.core.data.capellamodeller.presentation.CapellamodellerEditor;

@SuppressWarnings("all")
public class CapellaXtextEditorOpener extends LanguageSpecificURIEditorOpener {
  @Override
  protected void selectAndReveal(final IEditorPart openEditor, final URI uri, final EReference crossReference, final int indexInList, final boolean select) {
    String _fragment = uri.fragment();
    boolean _tripleNotEquals = (_fragment != null);
    if (_tripleNotEquals) {
      final CapellamodellerEditor ecoreEditor = openEditor.<CapellamodellerEditor>getAdapter(CapellamodellerEditor.class);
      if ((ecoreEditor instanceof CapellamodellerEditor)) {
        final EObject eObject = ecoreEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
      }
    }
  }
  
  @Override
  protected String getEditorId() {
    return "org.polarsys.capella.core.data.capellamodeller.presentation.CapellamodellerEditorID";
  }
}
