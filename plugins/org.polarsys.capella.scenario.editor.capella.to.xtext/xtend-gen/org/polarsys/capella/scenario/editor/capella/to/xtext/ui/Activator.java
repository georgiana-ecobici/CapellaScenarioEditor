/**
 * Copyright (c) 2017 TypeFox and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.polarsys.capella.scenario.editor.capella.to.xtext.ui;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.util.Modules;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.osgi.framework.BundleContext;
import org.polarsys.capella.scenario.editor.capella.to.xtext.CapellaXtextRuntimeModule;
import org.polarsys.capella.scenario.editor.capella.to.xtext.ui.CapellaXtextUiModule;

/**
 * The activator class controls the plug-in life cycle
 */
@SuppressWarnings("all")
public class Activator extends AbstractUIPlugin {
  private static final Logger logger = Logger.getLogger(Activator.class);
  
  public static final String PLUGIN_ID = "org.polarsys.capella.scenario.editor.capella.to.xtext";
  
  private static Activator plugin;
  
  private Injector injector;
  
  public Activator() {
  }
  
  public Injector getInjector() {
    return this.injector;
  }
  
  private void initializeInjector() {
    CapellaXtextRuntimeModule _capellaXtextRuntimeModule = new CapellaXtextRuntimeModule();
    Modules.OverriddenModuleBuilder _override = Modules.override(_capellaXtextRuntimeModule);
    CapellaXtextUiModule _capellaXtextUiModule = new CapellaXtextUiModule(Activator.plugin);
    Modules.OverriddenModuleBuilder _override_1 = Modules.override(_override.with(_capellaXtextUiModule));
    SharedStateModule _sharedStateModule = new SharedStateModule();
    this.injector = Guice.createInjector(
      _override_1.with(_sharedStateModule));
  }
  
  @Override
  public void start(final BundleContext context) throws Exception {
    super.start(context);
    Activator.plugin = this;
    try {
      this.initializeInjector();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        Activator.logger.error(e.getMessage(), e);
        throw e;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Override
  public void stop(final BundleContext context) throws Exception {
    Activator.plugin = null;
    this.injector = null;
    super.stop(context);
  }
  
  /**
   * Returns the shared instance
   * @return the shared instance
   */
  public static Activator getDefault() {
    return Activator.plugin;
  }
}
