/**
 * generated by Xtext 2.22.0
 */
package org.architecture.cnl.archcnl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.architecture.cnl.archcnl.ConceptAssertion#getIndividual <em>Individual</em>}</li>
 *   <li>{@link org.architecture.cnl.archcnl.ConceptAssertion#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @see org.architecture.cnl.archcnl.ArchcnlPackage#getConceptAssertion()
 * @model
 * @generated
 */
public interface ConceptAssertion extends EObject
{
  /**
   * Returns the value of the '<em><b>Individual</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Individual</em>' attribute.
   * @see #setIndividual(String)
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getConceptAssertion_Individual()
   * @model
   * @generated
   */
  String getIndividual();

  /**
   * Sets the value of the '{@link org.architecture.cnl.archcnl.ConceptAssertion#getIndividual <em>Individual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Individual</em>' attribute.
   * @see #getIndividual()
   * @generated
   */
  void setIndividual(String value);

  /**
   * Returns the value of the '<em><b>Concept</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concept</em>' containment reference.
   * @see #setConcept(Concept)
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getConceptAssertion_Concept()
   * @model containment="true"
   * @generated
   */
  Concept getConcept();

  /**
   * Sets the value of the '{@link org.architecture.cnl.archcnl.ConceptAssertion#getConcept <em>Concept</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concept</em>' containment reference.
   * @see #getConcept()
   * @generated
   */
  void setConcept(Concept value);

} // ConceptAssertion