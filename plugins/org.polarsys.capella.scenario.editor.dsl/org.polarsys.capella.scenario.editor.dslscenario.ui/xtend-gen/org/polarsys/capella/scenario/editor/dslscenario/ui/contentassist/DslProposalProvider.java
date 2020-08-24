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
package org.polarsys.capella.scenario.editor.dslscenario.ui.contentassist;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Actor;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Model;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Participant;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage;
import org.polarsys.capella.scenario.editor.dslscenario.ui.contentassist.AbstractDslProposalProvider;
import org.polarsys.capella.scenario.editor.helper.EmbeddedEditorInstanceHelper;

/**
 * This class is used to display auto-complete proposals when pressing ctrl+space
 */
@SuppressWarnings("all")
public class DslProposalProvider extends AbstractDslProposalProvider {
  /**
   * filter the proposed keywords based on the context in which we edit the text scenario;
   * check the context of the Capella Diagram - layer (OA, SA, LA, PA), type of scenario (IS, ES FS)
   */
  @Override
  public void completeKeyword(final Keyword keyword, final ContentAssistContext contentAssistContext, final ICompletionProposalAcceptor acceptor) {
    boolean _checkValidKeyword = EmbeddedEditorInstanceHelper.checkValidKeyword(keyword.getValue());
    if (_checkValidKeyword) {
      super.completeKeyword(keyword, contentAssistContext, acceptor);
    }
  }
  
  @Override
  public void completeActor_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("actor", context, acceptor, model, assignment);
  }
  
  @Override
  public void completeComponent_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("component", context, acceptor, model, assignment);
  }
  
  @Override
  public void completeConfigurationItem_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("configuration_item", context, acceptor, model, assignment);
  }
  
  @Override
  public void completeFunction_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("function", context, acceptor, model, assignment);
  }
  
  @Override
  public void completeActivity_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("activity", context, acceptor, model, assignment);
  }
  
  @Override
  public void completeEntity_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("entity", context, acceptor, model, assignment);
  }
  
  @Override
  public void completeRole_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("role", context, acceptor, model, assignment);
  }
  
  public void getExistingParticipants(final String keyword, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor, final EObject model, final Assignment assignment) {
    Collection<? extends EObject> _availableElements = EmbeddedEditorInstanceHelper.getAvailableElements(keyword);
    for (final EObject el : _availableElements) {
      {
        ConfigurableCompletionProposal.IReplacementTextApplier textApplier = new ConfigurableCompletionProposal.IReplacementTextApplier() {
          @Override
          public void apply(final IDocument document, final ConfigurableCompletionProposal proposal) throws BadLocationException {
            Object _additionalData = proposal.getAdditionalData("participant");
            Participant participant = ((Participant) _additionalData);
            Object _additionalData_1 = proposal.getAdditionalData("id");
            participant.setId(((String) _additionalData_1));
            participant.setName("A");
            document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), proposal.getReplacementString());
          }
        };
        String _name = EmbeddedEditorInstanceHelper.getName(el);
        String _plus = ("\"" + _name);
        String _plus_1 = (_plus + "\"");
        ICompletionProposal _createCompletionProposal = this.createCompletionProposal(_plus_1, 
          EmbeddedEditorInstanceHelper.getLabel(el), null, context);
        ConfigurableCompletionProposal proposal = ((ConfigurableCompletionProposal) _createCompletionProposal);
        proposal.setTextApplier(textApplier);
        proposal.setAdditionalData("id", EmbeddedEditorInstanceHelper.getId(el));
        proposal.setAdditionalData("participant", context.getCurrentModel());
        proposal.setAdditionalProposalInfo(EmbeddedEditorInstanceHelper.getId(el));
        proposal.setAutoInsertable(true);
        proposal.setSimpleLinkedMode(context.getViewer(), '\t', ' ');
        acceptor.accept(proposal);
      }
    }
  }
  
  @Override
  public void completeSequenceMessage_Source(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    EList<Participant> _variablesDefinedBefore2 = this.variablesDefinedBefore2(((Model) model));
    for (final EObject el : _variablesDefinedBefore2) {
      String _name = ((Actor) el).getName();
      String _plus = ("\"" + _name);
      String _plus_1 = (_plus + "\"");
      acceptor.accept(
        this.createCompletionProposal(_plus_1, EmbeddedEditorInstanceHelper.getLabel(el), 
          null, context));
    }
  }
  
  @Override
  public void completeSequenceMessage_Target(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    EList<Participant> _variablesDefinedBefore3 = this.variablesDefinedBefore3(((SequenceMessage) model));
    for (final EObject el : _variablesDefinedBefore3) {
      String _name = ((Actor) el).getName();
      String _plus = ("\"" + _name);
      String _plus_1 = (_plus + "\"");
      acceptor.accept(
        this.createCompletionProposal(_plus_1, EmbeddedEditorInstanceHelper.getLabel(el), 
          null, context));
    }
  }
  
  public Participant variablesDefinedBefore(final Participant sc) {
    return sc;
  }
  
  public EList<Participant> variablesDefinedBefore2(final Model m) {
    return m.getParticipants();
  }
  
  public EList<Participant> variablesDefinedBefore3(final SequenceMessage seq) {
    EObject _eContainer = seq.eContainer();
    return ((Model) _eContainer).getParticipants();
  }
}
