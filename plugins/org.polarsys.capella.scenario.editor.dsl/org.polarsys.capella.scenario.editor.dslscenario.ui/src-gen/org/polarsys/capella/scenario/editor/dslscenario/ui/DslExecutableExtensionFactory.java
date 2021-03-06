/*
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dslscenario.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.polarsys.capella.scenario.editor.dslscenario.ui.internal.DslscenarioActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(DslscenarioActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		DslscenarioActivator activator = DslscenarioActivator.getInstance();
		return activator != null ? activator.getInjector(DslscenarioActivator.ORG_POLARSYS_CAPELLA_SCENARIO_EDITOR_DSLSCENARIO_DSL) : null;
	}

}
