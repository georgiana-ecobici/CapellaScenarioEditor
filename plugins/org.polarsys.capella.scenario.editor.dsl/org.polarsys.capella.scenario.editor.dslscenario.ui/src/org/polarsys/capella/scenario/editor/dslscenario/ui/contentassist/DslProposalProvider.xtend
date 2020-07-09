/*
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dslscenario.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import java.util.Arrays
import org.eclipse.xtext.Assignment
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Actor

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class DslProposalProvider extends AbstractDslProposalProvider {

	override completeActor_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		for (String el : getPropose()) {
			acceptor.accept(createCompletionProposal(el, el, null, context));
			}
		}
	
	
	def getPropose(){
		return Arrays.asList("Hello", "World!", "How", "Are", "You")	
	}
   
	
}


