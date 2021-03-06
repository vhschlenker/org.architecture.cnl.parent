/**
 * generated by Xtext 2.22.0
 */
package org.architecture.cnl.archcnl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.architecture.cnl.archcnl.RoleAssertion#getIndividual <em>Individual</em>}</li>
 *   <li>{@link org.architecture.cnl.archcnl.RoleAssertion#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see org.architecture.cnl.archcnl.ArchcnlPackage#getRoleAssertion()
 * @model
 * @generated
 */
public interface RoleAssertion extends EObject
{
  /**
   * Returns the value of the '<em><b>Individual</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Individual</em>' attribute.
   * @see #setIndividual(String)
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getRoleAssertion_Individual()
   * @model
   * @generated
   */
  String getIndividual();

  /**
   * Sets the value of the '{@link org.architecture.cnl.archcnl.RoleAssertion#getIndividual <em>Individual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Individual</em>' attribute.
   * @see #getIndividual()
   * @generated
   */
  void setIndividual(String value);

  /**
   * Returns the value of the '<em><b>Relation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' containment reference.
   * @see #setRelation(Relation)
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getRoleAssertion_Relation()
   * @model containment="true"
   * @generated
   */
  Relation getRelation();

  /**
   * Sets the value of the '{@link org.architecture.cnl.archcnl.RoleAssertion#getRelation <em>Relation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' containment reference.
   * @see #getRelation()
   * @generated
   */
  void setRelation(Relation value);

} // RoleAssertion
