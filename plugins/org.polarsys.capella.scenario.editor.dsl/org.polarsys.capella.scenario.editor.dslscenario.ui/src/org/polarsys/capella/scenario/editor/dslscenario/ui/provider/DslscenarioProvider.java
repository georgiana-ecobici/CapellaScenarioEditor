package org.polarsys.capella.scenario.editor.dslscenario.ui.provider;

import com.google.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

public class DslscenarioProvider implements IEditedResourceProvider {
	@Inject
	private IResourceSetProvider resourceSetProvider;
	@Inject
	private FileExtensionProvider ext;
	private XtextResource resource;

	@Override
	public XtextResource createResource() {
		ResourceSet resourceSet = resourceSetProvider.get(null);
		URI uri = URI.createURI("synthetic:/dslscenario." + ext.getPrimaryFileExtension());
		resource = (XtextResource) resourceSet.createResource(uri);
		resourceSet.getResources().add(resource);
		return resource;
	}
	
	public XtextResource getResource() {
		return resource;
	}
}
