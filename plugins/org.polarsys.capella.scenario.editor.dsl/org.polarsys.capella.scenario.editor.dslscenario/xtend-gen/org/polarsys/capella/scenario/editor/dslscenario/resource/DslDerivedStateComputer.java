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
package org.polarsys.capella.scenario.editor.dslscenario.resource;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Participant;
import org.polarsys.capella.scenario.editor.helper.EmbeddedEditorInstanceHelper;

@SuppressWarnings("all")
public class DslDerivedStateComputer implements IDerivedStateComputer {
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    final Procedure1<Participant> _function = (Participant participant) -> {
      participant.setId(null);
    };
    IteratorExtensions.<Participant>forEach(Iterators.<Participant>filter(resource.getAllContents(), Participant.class), _function);
  }
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    if ((!preLinkingPhase)) {
      final Procedure1<Participant> _function = (Participant participant) -> {
        String _idOfElementToCompute = EmbeddedEditorInstanceHelper.getIdOfElementToCompute(participant.getName());
        String id = ((String) _idOfElementToCompute);
        boolean _notEquals = (!Objects.equal(id, null));
        if (_notEquals) {
          participant.setId(id);
        }
      };
      IteratorExtensions.<Participant>forEach(Iterators.<Participant>filter(resource.getAllContents(), Participant.class), _function);
    }
  }
}
