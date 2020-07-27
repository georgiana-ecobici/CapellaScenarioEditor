/**
 * Copyright (c) 2017 TypeFox and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.polarsys.capella.scenario.editor.capella.to.xtext;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import java.util.Set;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.polarsys.capella.scenario.editor.capella.to.xtext.CapellaXtextRuntimeModule;

@SuppressWarnings("all")
public class CapellaXtextStandaloneSetup implements ISetup {
  @Inject
  private FileExtensionProvider fileExtensionProvider;
  
  @Inject
  private IResourceServiceProvider resourceServiceProvider;
  
  @Inject
  private IResourceServiceProvider.Registry registry;
  
  @Override
  public Injector createInjectorAndDoEMFRegistration() {
    CapellaXtextRuntimeModule _capellaXtextRuntimeModule = new CapellaXtextRuntimeModule();
    final Injector injector = Guice.createInjector(_capellaXtextRuntimeModule);
    injector.injectMembers(this);
    Set<String> _fileExtensions = this.fileExtensionProvider.getFileExtensions();
    for (final String fileExt : _fileExtensions) {
      this.registry.getExtensionToFactoryMap().put(fileExt, this.resourceServiceProvider);
    }
    return injector;
  }
}
