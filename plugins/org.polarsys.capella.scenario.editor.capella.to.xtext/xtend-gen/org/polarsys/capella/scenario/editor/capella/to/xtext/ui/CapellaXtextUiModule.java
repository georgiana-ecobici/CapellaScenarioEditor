/**
 * Copyright (c) 2017 TypeFox and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.polarsys.capella.scenario.editor.capella.to.xtext.ui;

import com.google.inject.Binder;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.LanguageSpecific;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.resource.generic.EmfUiModule;
import org.polarsys.capella.scenario.editor.capella.to.xtext.ui.CapellaXtextEditorOpener;

@SuppressWarnings("all")
public class CapellaXtextUiModule extends EmfUiModule {
  public CapellaXtextUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public void configureLanguageSpecificURIEditorOpener(final Binder binder) {
    binder.<IURIEditorOpener>bind(IURIEditorOpener.class).annotatedWith(LanguageSpecific.class).to(CapellaXtextEditorOpener.class);
  }
}
