/**
 * -------------------------------------------------------------------------------
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
 * -------------------------------------------------------------------------------
 */
package org.polarsys.capella.scenario.editor.dslscenario;

import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.polarsys.capella.scenario.editor.dslscenario.AbstractDslRuntimeModule;
import org.polarsys.capella.scenario.editor.dslscenario.resource.DslDerivedStateComputer;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class DslRuntimeModule extends AbstractDslRuntimeModule {
  @Override
  public Class<? extends XtextResource> bindXtextResource() {
    return DerivedStateAwareResource.class;
  }
  
  public Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
    return DslDerivedStateComputer.class;
  }
  
  public Class<? extends IResourceDescription.Manager> bindIResourceDescriptionManager() {
    return DerivedStateAwareResourceDescriptionManager.class;
  }
}
