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

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Activity;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Actor;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Component;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ConfigurationItem;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Entity;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Function;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Model;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Participant;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Role;
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
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal(keyword.getValue(), this.getKeywordDisplayString(keyword), this.getImage(keyword), contentAssistContext);
    ICompletionProposal proposal = ((ICompletionProposal) _createCompletionProposal);
    boolean _checkValidKeyword = EmbeddedEditorInstanceHelper.checkValidKeyword(proposal.getDisplayString());
    if (_checkValidKeyword) {
      this.getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
      acceptor.accept(proposal);
    }
  }
  
  @Override
  public void completeActor_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("actor", context, acceptor);
  }
  
  @Override
  public void completeComponent_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("component", context, acceptor);
  }
  
  @Override
  public void completeConfigurationItem_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("configuration_item", context, acceptor);
  }
  
  @Override
  public void completeFunction_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("function", context, acceptor);
  }
  
  @Override
  public void completeActivity_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("activity", context, acceptor);
  }
  
  @Override
  public void completeEntity_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("entity", context, acceptor);
  }
  
  @Override
  public void completeRole_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("role", context, acceptor);
  }
  
  public void getExistingParticipants(final String keyword, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    List<String> _availablePartNames = EmbeddedEditorInstanceHelper.getAvailablePartNames(keyword);
    for (final String el : _availablePartNames) {
      acceptor.accept(this.createCompletionProposal((("\"" + el) + "\""), (("\"" + el) + "\""), null, context));
    }
  }
  
  @Override
  public void completeSequenceMessage_Source(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    EList<Participant> _variablesDefinedBefore2 = this.variablesDefinedBefore2(((Model) model));
    for (final EObject el : _variablesDefinedBefore2) {
      this.createAcceptorForParticipants(el, acceptor, context);
    }
  }
  
  @Override
  public void completeSequenceMessage_Target(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    EList<Participant> _variablesDefinedBefore3 = this.variablesDefinedBefore3(((SequenceMessage) model));
    for (final EObject el : _variablesDefinedBefore3) {
      this.createAcceptorForParticipants(el, acceptor, context);
    }
  }
  
  @Override
  public void completeSequenceMessage_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    List<String> _messagesDefinedBefore = this.messagesDefinedBefore(((SequenceMessage) model));
    for (final String el : _messagesDefinedBefore) {
      acceptor.accept(this.createCompletionProposal((("\"" + el) + "\""), (("\"" + el) + "\""), null, context));
    }
  }
  
  public void createAcceptorForParticipants(final EObject el, final ICompletionProposalAcceptor acceptor, final ContentAssistContext context) {
    if ((el instanceof Actor)) {
      String _name = ((Actor) el).getName();
      String _plus = ("\"" + _name);
      String _plus_1 = (_plus + "\"");
      String _name_1 = ((Actor) el).getName();
      String _plus_2 = ("\"" + _name_1);
      String _plus_3 = (_plus_2 + "\"");
      acceptor.accept(
        this.createCompletionProposal(_plus_1, _plus_3, null, context));
    } else {
      if ((el instanceof Component)) {
        String _name_2 = ((Component) el).getName();
        String _plus_4 = ("\"" + _name_2);
        String _plus_5 = (_plus_4 + "\"");
        String _name_3 = ((Component) el).getName();
        String _plus_6 = ("\"" + _name_3);
        String _plus_7 = (_plus_6 + "\"");
        acceptor.accept(
          this.createCompletionProposal(_plus_5, _plus_7, 
            null, context));
      } else {
        if ((el instanceof Activity)) {
          String _name_4 = ((Activity) el).getName();
          String _plus_8 = ("\"" + _name_4);
          String _plus_9 = (_plus_8 + "\"");
          String _name_5 = ((Activity) el).getName();
          String _plus_10 = ("\"" + _name_5);
          String _plus_11 = (_plus_10 + "\"");
          acceptor.accept(
            this.createCompletionProposal(_plus_9, _plus_11, null, context));
        } else {
          if ((el instanceof Entity)) {
            String _name_6 = ((Entity) el).getName();
            String _plus_12 = ("\"" + _name_6);
            String _plus_13 = (_plus_12 + "\"");
            String _name_7 = ((Entity) el).getName();
            String _plus_14 = ("\"" + _name_7);
            String _plus_15 = (_plus_14 + "\"");
            acceptor.accept(
              this.createCompletionProposal(_plus_13, _plus_15, null, context));
          } else {
            if ((el instanceof Role)) {
              String _name_8 = ((Role) el).getName();
              String _plus_16 = ("\"" + _name_8);
              String _plus_17 = (_plus_16 + "\"");
              String _name_9 = ((Role) el).getName();
              String _plus_18 = ("\"" + _name_9);
              String _plus_19 = (_plus_18 + "\"");
              acceptor.accept(
                this.createCompletionProposal(_plus_17, _plus_19, null, context));
            } else {
              if ((el instanceof ConfigurationItem)) {
                String _name_10 = ((ConfigurationItem) el).getName();
                String _plus_20 = ("\"" + _name_10);
                String _plus_21 = (_plus_20 + "\"");
                String _name_11 = ((ConfigurationItem) el).getName();
                String _plus_22 = ("\"" + _name_11);
                String _plus_23 = (_plus_22 + "\"");
                acceptor.accept(
                  this.createCompletionProposal(_plus_21, _plus_23, null, context));
              } else {
                if ((el instanceof Function)) {
                  String _name_12 = ((Function) el).getName();
                  String _plus_24 = ("\"" + _name_12);
                  String _plus_25 = (_plus_24 + "\"");
                  String _name_13 = ((Function) el).getName();
                  String _plus_26 = ("\"" + _name_13);
                  String _plus_27 = (_plus_26 + "\"");
                  acceptor.accept(
                    this.createCompletionProposal(_plus_25, _plus_27, null, context));
                }
              }
            }
          }
        }
      }
    }
  }
  
  public List<String> messagesDefinedBefore(final SequenceMessage message) {
    return EmbeddedEditorInstanceHelper.getMessageSequenceName(message.getSource(), message.getTarget());
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
