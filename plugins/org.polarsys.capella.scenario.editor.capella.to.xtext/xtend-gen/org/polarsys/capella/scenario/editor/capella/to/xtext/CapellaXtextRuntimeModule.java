/**
 * Copyright (c) 2017 TypeFox and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.polarsys.capella.scenario.editor.capella.to.xtext;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

@SuppressWarnings("all")
public class CapellaXtextRuntimeModule extends AbstractGenericResourceRuntimeModule {
  @Override
  protected String getFileExtensions() {
    return "melodymodeller";
  }
  
  @Override
  protected String getLanguageName() {
    return "org.polarsys.capella.core.data.gen.CapellaModeller";
  }
  
  @Override
  public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
    return DefaultDeclarativeQualifiedNameProvider.class;
  }
}
