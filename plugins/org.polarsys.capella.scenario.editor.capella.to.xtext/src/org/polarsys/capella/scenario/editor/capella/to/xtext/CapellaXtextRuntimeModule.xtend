/** 
 * Copyright (c) 2017 TypeFox and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.polarsys.capella.scenario.editor.capella.to.xtext

import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider

class CapellaXtextRuntimeModule extends AbstractGenericResourceRuntimeModule {
	
	override protected getFileExtensions() {
		'melodymodeller'
	}
	
	// 'org.polarsys.capella.core.data.gen.CapellaCore'
	// 'org.polarsys.capella.core.data.gen.Interaction'
	override protected getLanguageName() {
		'org.polarsys.capella.core.data.gen.CapellaModeller'
	}
	
	override bindIQualifiedNameProvider() {
		DefaultDeclarativeQualifiedNameProvider
	}
	
	// bind additional services here
}