/*
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dslscenario.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Activity;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Actor;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ArmTimerMessage;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Component;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ConfigurationItem;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.CreateMessage;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.DeleteMessage;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.DslPackage;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Entity;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Function;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Model;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ParticipantDeactivation;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.PhysicalComponent;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Reference;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ReturnMessage;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Role;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ScenarioTypeAndParticipants;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage;
import org.polarsys.capella.scenario.editor.dslscenario.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DslPackage.ACTIVITY:
				sequence_Activity(context, (Activity) semanticObject); 
				return; 
			case DslPackage.ACTOR:
				sequence_Actor(context, (Actor) semanticObject); 
				return; 
			case DslPackage.ARM_TIMER_MESSAGE:
				sequence_ArmTimerMessage(context, (ArmTimerMessage) semanticObject); 
				return; 
			case DslPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case DslPackage.CONFIGURATION_ITEM:
				sequence_ConfigurationItem(context, (ConfigurationItem) semanticObject); 
				return; 
			case DslPackage.CREATE_MESSAGE:
				if (rule == grammarAccess.getCreateMessageRule()) {
					sequence_CreateMessage(context, (CreateMessage) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMessageRule()
						|| rule == grammarAccess.getSequenceMessageTypeRule()) {
					sequence_CreateMessage_SequenceMessageType(context, (CreateMessage) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.DELETE_MESSAGE:
				if (rule == grammarAccess.getDeleteMessageRule()) {
					sequence_DeleteMessage(context, (DeleteMessage) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMessageRule()
						|| rule == grammarAccess.getSequenceMessageTypeRule()) {
					sequence_DeleteMessage_SequenceMessageType(context, (DeleteMessage) semanticObject); 
					return; 
				}
				else break;
			case DslPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case DslPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case DslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case DslPackage.PARTICIPANT_DEACTIVATION:
				sequence_ParticipantDeactivation(context, (ParticipantDeactivation) semanticObject); 
				return; 
			case DslPackage.PHYSICAL_COMPONENT:
				sequence_PhysicalComponent(context, (PhysicalComponent) semanticObject); 
				return; 
			case DslPackage.REFERENCE:
				sequence_Reference(context, (Reference) semanticObject); 
				return; 
			case DslPackage.RETURN_MESSAGE:
				sequence_ReturnMessage(context, (ReturnMessage) semanticObject); 
				return; 
			case DslPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case DslPackage.SCENARIO_TYPE_AND_PARTICIPANTS:
				sequence_ScenarioTypeAndParticipants(context, (ScenarioTypeAndParticipants) semanticObject); 
				return; 
			case DslPackage.SEQUENCE_MESSAGE:
				if (rule == grammarAccess.getSequenceMessageRule()) {
					sequence_SequenceMessage(context, (SequenceMessage) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMessageRule()
						|| rule == grammarAccess.getSequenceMessageTypeRule()) {
					sequence_SequenceMessage_SequenceMessageType(context, (SequenceMessage) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Activity returns Activity
	 *
	 * Constraint:
	 *     (name=STRING id=ID)
	 */
	protected void sequence_Activity(ISerializationContext context, Activity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.ACTIVITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ACTIVITY__NAME));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.ACTIVITY__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ACTIVITY__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActivityAccess().getIdIDTerminalRuleCall_3_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Actor returns Actor
	 *
	 * Constraint:
	 *     (name=STRING id=ID)
	 */
	protected void sequence_Actor(ISerializationContext context, Actor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.ACTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ACTOR__NAME));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.ACTOR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ACTOR__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActorAccess().getIdIDTerminalRuleCall_3_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Message returns ArmTimerMessage
	 *     ArmTimerMessage returns ArmTimerMessage
	 *
	 * Constraint:
	 *     (participant=ID name=STRING)
	 */
	protected void sequence_ArmTimerMessage(ISerializationContext context, ArmTimerMessage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.ARM_TIMER_MESSAGE__PARTICIPANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ARM_TIMER_MESSAGE__PARTICIPANT));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.MESSAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.MESSAGE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArmTimerMessageAccess().getParticipantIDTerminalRuleCall_1_0(), semanticObject.getParticipant());
		feeder.accept(grammarAccess.getArmTimerMessageAccess().getNameSTRINGTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (name=STRING id=ID)
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.COMPONENT__NAME));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.COMPONENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.COMPONENT__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getComponentAccess().getIdIDTerminalRuleCall_3_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationItem returns ConfigurationItem
	 *
	 * Constraint:
	 *     (name=STRING id=ID)
	 */
	protected void sequence_ConfigurationItem(ISerializationContext context, ConfigurationItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.CONFIGURATION_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.CONFIGURATION_ITEM__NAME));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.CONFIGURATION_ITEM__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.CONFIGURATION_ITEM__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConfigurationItemAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConfigurationItemAccess().getIdIDTerminalRuleCall_3_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CreateMessage returns CreateMessage
	 *
	 * Constraint:
	 *     (source=ID target=ID name=STRING)
	 */
	protected void sequence_CreateMessage(ISerializationContext context, CreateMessage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.SEQUENCE_MESSAGE_TYPE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.SEQUENCE_MESSAGE_TYPE__SOURCE));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.SEQUENCE_MESSAGE_TYPE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.SEQUENCE_MESSAGE_TYPE__TARGET));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.MESSAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.MESSAGE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCreateMessageAccess().getSourceIDTerminalRuleCall_0_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getCreateMessageAccess().getTargetIDTerminalRuleCall_2_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getCreateMessageAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Message returns CreateMessage
	 *     SequenceMessageType returns CreateMessage
	 *
	 * Constraint:
	 *     (source=ID target=ID name=STRING return=ReturnMessage?)
	 */
	protected void sequence_CreateMessage_SequenceMessageType(ISerializationContext context, CreateMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeleteMessage returns DeleteMessage
	 *
	 * Constraint:
	 *     (source=ID target=ID name=STRING)
	 */
	protected void sequence_DeleteMessage(ISerializationContext context, DeleteMessage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.SEQUENCE_MESSAGE_TYPE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.SEQUENCE_MESSAGE_TYPE__SOURCE));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.SEQUENCE_MESSAGE_TYPE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.SEQUENCE_MESSAGE_TYPE__TARGET));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.MESSAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.MESSAGE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeleteMessageAccess().getSourceIDTerminalRuleCall_0_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getDeleteMessageAccess().getTargetIDTerminalRuleCall_2_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getDeleteMessageAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Message returns DeleteMessage
	 *     SequenceMessageType returns DeleteMessage
	 *
	 * Constraint:
	 *     (source=ID target=ID name=STRING return=ReturnMessage?)
	 */
	protected void sequence_DeleteMessage_SequenceMessageType(ISerializationContext context, DeleteMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=STRING id=ID)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ENTITY__NAME));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.ENTITY__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ENTITY__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEntityAccess().getIdIDTerminalRuleCall_3_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (name=STRING id=ID)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.FUNCTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.FUNCTION__NAME));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.FUNCTION__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.FUNCTION__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFunctionAccess().getIdIDTerminalRuleCall_3_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (scenarioType=ScenarioTypeAndParticipants (messagesOrReferences+=Message | messagesOrReferences+=Reference)*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Message returns ParticipantDeactivation
	 *     ParticipantDeactivation returns ParticipantDeactivation
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ParticipantDeactivation(ISerializationContext context, ParticipantDeactivation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.MESSAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.MESSAGE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParticipantDeactivationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PhysicalComponent returns PhysicalComponent
	 *
	 * Constraint:
	 *     component=Component
	 */
	protected void sequence_PhysicalComponent(ISerializationContext context, PhysicalComponent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.PHYSICAL_COMPONENT__COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.PHYSICAL_COMPONENT__COMPONENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPhysicalComponentAccess().getComponentComponentParserRuleCall_0_0(), semanticObject.getComponent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     (timelines+=ID+ name=STRING)
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReturnMessage returns ReturnMessage
	 *
	 * Constraint:
	 *     (target=ID source=ID name=STRING)
	 */
	protected void sequence_ReturnMessage(ISerializationContext context, ReturnMessage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.RETURN_MESSAGE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.RETURN_MESSAGE__TARGET));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.RETURN_MESSAGE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.RETURN_MESSAGE__SOURCE));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.RETURN_MESSAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.RETURN_MESSAGE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReturnMessageAccess().getTargetIDTerminalRuleCall_0_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getReturnMessageAccess().getSourceIDTerminalRuleCall_2_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getReturnMessageAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (name=STRING id=ID)
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ROLE__NAME));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.ROLE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.ROLE__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRoleAccess().getIdIDTerminalRuleCall_3_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ScenarioTypeAndParticipants returns ScenarioTypeAndParticipants
	 *
	 * Constraint:
	 *     (
	 *         (name=STRING participants+=Actor*) | 
	 *         (name=STRING (participants+=Actor | participants+=Component)*) | 
	 *         (name=STRING (participant+=Actor | participant+=PhysicalComponent)*) | 
	 *         (name=STRING participants+=Function*) | 
	 *         (name=STRING participants+=ConfigurationItem*) | 
	 *         (name=STRING participants+=Activity*) | 
	 *         (name=STRING (participants+=Entity | participants+=Actor | participants+=Role)*)
	 *     )
	 */
	protected void sequence_ScenarioTypeAndParticipants(ISerializationContext context, ScenarioTypeAndParticipants semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SequenceMessage returns SequenceMessage
	 *
	 * Constraint:
	 *     (source=ID target=ID name=STRING)
	 */
	protected void sequence_SequenceMessage(ISerializationContext context, SequenceMessage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.SEQUENCE_MESSAGE_TYPE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.SEQUENCE_MESSAGE_TYPE__SOURCE));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.SEQUENCE_MESSAGE_TYPE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.SEQUENCE_MESSAGE_TYPE__TARGET));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.MESSAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.MESSAGE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSequenceMessageAccess().getSourceIDTerminalRuleCall_0_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getSequenceMessageAccess().getTargetIDTerminalRuleCall_2_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getSequenceMessageAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Message returns SequenceMessage
	 *     SequenceMessageType returns SequenceMessage
	 *
	 * Constraint:
	 *     (source=ID target=ID name=STRING return=ReturnMessage?)
	 */
	protected void sequence_SequenceMessage_SequenceMessageType(ISerializationContext context, SequenceMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
