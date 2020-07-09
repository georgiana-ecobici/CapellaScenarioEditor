/**
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dslscenario.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.scenario.editor.dslscenario.dsl.Model#getScenarioType <em>Scenario Type</em>}</li>
 *   <li>{@link org.polarsys.capella.scenario.editor.dslscenario.dsl.Model#getMessagesOrReferences <em>Messages Or References</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.scenario.editor.dslscenario.dsl.DslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Scenario Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenario Type</em>' containment reference.
   * @see #setScenarioType(ScenarioTypeAndParticipants)
   * @see org.polarsys.capella.scenario.editor.dslscenario.dsl.DslPackage#getModel_ScenarioType()
   * @model containment="true"
   * @generated
   */
  ScenarioTypeAndParticipants getScenarioType();

  /**
   * Sets the value of the '{@link org.polarsys.capella.scenario.editor.dslscenario.dsl.Model#getScenarioType <em>Scenario Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenario Type</em>' containment reference.
   * @see #getScenarioType()
   * @generated
   */
  void setScenarioType(ScenarioTypeAndParticipants value);

  /**
   * Returns the value of the '<em><b>Messages Or References</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages Or References</em>' containment reference list.
   * @see org.polarsys.capella.scenario.editor.dslscenario.dsl.DslPackage#getModel_MessagesOrReferences()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getMessagesOrReferences();

} // Model
