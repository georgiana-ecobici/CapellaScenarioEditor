/** 
 * Copyright (c) 2017 TypeFox and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.polarsys.capella.scenario.editor.capella.to.xtext.ui

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EReference
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener
import org.polarsys.capella.core.data.capellamodeller.presentation.CapellamodellerEditor

class CapellaXtextEditorOpener extends LanguageSpecificURIEditorOpener {
	
	override protected void selectAndReveal(
		IEditorPart openEditor, 
		URI uri, EReference crossReference, int indexInList, 
		boolean select) {
		if (uri.fragment !== null) {
			val ecoreEditor = openEditor.getAdapter(CapellamodellerEditor)
			if (ecoreEditor instanceof CapellamodellerEditor) {
				val eObject = ecoreEditor.editingDomain.resourceSet.getEObject(uri, true)
				//todo
				//ecoreEditor.selectionToViewer = eObject
				//ecoreEditor.setSelectionToViewer(#[eObject])
			}
		}
	}

	override protected String getEditorId() {
		return "org.polarsys.capella.core.data.capellamodeller.presentation.CapellamodellerEditorID"
		//"org.polarsys.capella.core.data.interaction.presentation.InteractionEditorID"
		//"io.typefox.xtextxmi.tree.presentation.TreeEditorID"
	}
}
