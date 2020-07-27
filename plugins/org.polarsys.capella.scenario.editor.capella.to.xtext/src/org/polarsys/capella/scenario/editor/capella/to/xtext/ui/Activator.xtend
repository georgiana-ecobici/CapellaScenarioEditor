/** 
 * Copyright (c) 2017 TypeFox and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.polarsys.capella.scenario.editor.capella.to.xtext.ui

import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.util.Modules
import org.apache.log4j.Logger
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtext.ui.shared.SharedStateModule
import org.osgi.framework.BundleContext
import org.polarsys.capella.scenario.editor.capella.to.xtext.CapellaXtextRuntimeModule

/** 
 * The activator class controls the plug-in life cycle
 */
class Activator extends AbstractUIPlugin {
	
	static val logger = Logger.getLogger(Activator)
	
	// The plug-in ID
	
	public static val PLUGIN_ID = "org.polarsys.capella.scenario.editor.capella.to.xtext"

	// The shared instance
	static Activator plugin

	Injector injector

	new() {
	}

	def Injector getInjector() {
		return injector
	}

	def private void initializeInjector() {
		injector = Guice.createInjector(
			Modules.^override(Modules.^override(new CapellaXtextRuntimeModule()).with(new CapellaXtextUiModule(plugin))).with(
				new SharedStateModule()))
	}

	override start(BundleContext context) throws Exception {
		super.start(context)
		plugin = this
		try {
			initializeInjector()
		} catch (Exception e) {
			logger.error(e.message, e)
			throw e
		}

	}

	override void stop(BundleContext context) throws Exception {
		plugin = null
		injector = null
		super.stop(context)
	}

	/** 
	 * Returns the shared instance
	 * @return the shared instance
	 */
	def static Activator getDefault() {
		return plugin
	}
}
