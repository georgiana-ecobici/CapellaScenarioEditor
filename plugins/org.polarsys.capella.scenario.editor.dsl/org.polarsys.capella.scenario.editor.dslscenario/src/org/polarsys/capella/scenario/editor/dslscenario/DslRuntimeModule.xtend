/*-------------------------------------------------------------------------------
* Copyright (c) 2020 THALES GLOBAL SERVICES.
*  
*  This program and the accompanying materials are made available under the
*   terms of the Eclipse Public License 2.0 which is available at
*   http://www.eclipse.org/legal/epl-2.0
*   
*   SPDX-License-Identifier: EPL-2.0
*   
*   Contributors:
*      Thales - initial API and implementation
*-------------------------------------------------------------------------------*/
/*
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dslscenario

import org.polarsys.capella.scenario.editor.dslscenario.resource.DslDerivedStateComputer
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.IDerivedStateComputer

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class DslRuntimeModule extends AbstractDslRuntimeModule {
	override bindXtextResource() {
		DerivedStateAwareResource
	}

	def Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		DslDerivedStateComputer
	}

	def Class<? extends IResourceDescription.Manager> bindIResourceDescriptionManager() {
		DerivedStateAwareResourceDescriptionManager
	}
}
