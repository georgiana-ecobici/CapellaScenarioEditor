/**
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dslscenario.dsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.capella.scenario.editor.dslscenario.dsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.scenario.editor.dslscenario.dsl.DslPackage
 * @generated
 */
public class DslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SCENARIO_TYPE_AND_PARTICIPANTS:
      {
        ScenarioTypeAndParticipants scenarioTypeAndParticipants = (ScenarioTypeAndParticipants)theEObject;
        T result = caseScenarioTypeAndParticipants(scenarioTypeAndParticipants);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ACTOR:
      {
        Actor actor = (Actor)theEObject;
        T result = caseActor(actor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.PHYSICAL_COMPONENT:
      {
        PhysicalComponent physicalComponent = (PhysicalComponent)theEObject;
        T result = casePhysicalComponent(physicalComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CONFIGURATION_ITEM:
      {
        ConfigurationItem configurationItem = (ConfigurationItem)theEObject;
        T result = caseConfigurationItem(configurationItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ACTIVITY:
      {
        Activity activity = (Activity)theEObject;
        T result = caseActivity(activity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ROLE:
      {
        Role role = (Role)theEObject;
        T result = caseRole(role);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.MESSAGE:
      {
        Message message = (Message)theEObject;
        T result = caseMessage(message);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SEQUENCE_MESSAGE_TYPE:
      {
        SequenceMessageType sequenceMessageType = (SequenceMessageType)theEObject;
        T result = caseSequenceMessageType(sequenceMessageType);
        if (result == null) result = caseMessage(sequenceMessageType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SEQUENCE_MESSAGE:
      {
        SequenceMessage sequenceMessage = (SequenceMessage)theEObject;
        T result = caseSequenceMessage(sequenceMessage);
        if (result == null) result = caseSequenceMessageType(sequenceMessage);
        if (result == null) result = caseMessage(sequenceMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CREATE_MESSAGE:
      {
        CreateMessage createMessage = (CreateMessage)theEObject;
        T result = caseCreateMessage(createMessage);
        if (result == null) result = caseSequenceMessageType(createMessage);
        if (result == null) result = caseMessage(createMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.DELETE_MESSAGE:
      {
        DeleteMessage deleteMessage = (DeleteMessage)theEObject;
        T result = caseDeleteMessage(deleteMessage);
        if (result == null) result = caseSequenceMessageType(deleteMessage);
        if (result == null) result = caseMessage(deleteMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.RETURN_MESSAGE:
      {
        ReturnMessage returnMessage = (ReturnMessage)theEObject;
        T result = caseReturnMessage(returnMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ARM_TIMER_MESSAGE:
      {
        ArmTimerMessage armTimerMessage = (ArmTimerMessage)theEObject;
        T result = caseArmTimerMessage(armTimerMessage);
        if (result == null) result = caseMessage(armTimerMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.PARTICIPANT_DEACTIVATION:
      {
        ParticipantDeactivation participantDeactivation = (ParticipantDeactivation)theEObject;
        T result = caseParticipantDeactivation(participantDeactivation);
        if (result == null) result = caseMessage(participantDeactivation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario Type And Participants</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario Type And Participants</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenarioTypeAndParticipants(ScenarioTypeAndParticipants object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActor(Actor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Physical Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Physical Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhysicalComponent(PhysicalComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigurationItem(ConfigurationItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivity(Activity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRole(Role object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessage(Message object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Message Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Message Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceMessageType(SequenceMessageType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceMessage(SequenceMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateMessage(CreateMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteMessage(DeleteMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnMessage(ReturnMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arm Timer Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arm Timer Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArmTimerMessage(ArmTimerMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Participant Deactivation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Participant Deactivation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParticipantDeactivation(ParticipantDeactivation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DslSwitch
