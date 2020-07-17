/**
 * generated by Xtext 2.22.0
 */
package org.architecture.cnl.archcnl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.architecture.cnl.archcnl.ConditionalRuleType#getStart <em>Start</em>}</li>
 *   <li>{@link org.architecture.cnl.archcnl.ConditionalRuleType#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.architecture.cnl.archcnl.ConditionalRuleType#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.architecture.cnl.archcnl.ConditionalRuleType#getObject <em>Object</em>}</li>
 *   <li>{@link org.architecture.cnl.archcnl.ConditionalRuleType#getRelation2 <em>Relation2</em>}</li>
 *   <li>{@link org.architecture.cnl.archcnl.ConditionalRuleType#getObject2 <em>Object2</em>}</li>
 * </ul>
 *
 * @see org.architecture.cnl.archcnl.ArchcnlPackage#getConditionalRuleType()
 * @model
 * @generated
 */
public interface ConditionalRuleType extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #setStart(String)
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getConditionalRuleType_Start()
   * @model
   * @generated
   */
  String getStart();

  /**
   * Sets the value of the '{@link org.architecture.cnl.archcnl.ConditionalRuleType#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #getStart()
   * @generated
   */
  void setStart(String value);

  /**
   * Returns the value of the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subject</em>' containment reference.
   * @see #setSubject(ConceptExpression)
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getConditionalRuleType_Subject()
   * @model containment="true"
   * @generated
   */
  ConceptExpression getSubject();

  /**
   * Sets the value of the '{@link org.architecture.cnl.archcnl.ConditionalRuleType#getSubject <em>Subject</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subject</em>' containment reference.
   * @see #getSubject()
   * @generated
   */
  void setSubject(ConceptExpression value);

  /**
   * Returns the value of the '<em><b>Relation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' containment reference.
   * @see #setRelation(Relation)
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getConditionalRuleType_Relation()
   * @model containment="true"
   * @generated
   */
  Relation getRelation();

  /**
   * Sets the value of the '{@link org.architecture.cnl.archcnl.ConditionalRuleType#getRelation <em>Relation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' containment reference.
   * @see #getRelation()
   * @generated
   */
  void setRelation(Relation value);

  /**
   * Returns the value of the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' containment reference.
   * @see #setObject(ConceptExpression)
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getConditionalRuleType_Object()
   * @model containment="true"
   * @generated
   */
  ConceptExpression getObject();

  /**
   * Sets the value of the '{@link org.architecture.cnl.archcnl.ConditionalRuleType#getObject <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' containment reference.
   * @see #getObject()
   * @generated
   */
  void setObject(ConceptExpression value);

  /**
   * Returns the value of the '<em><b>Relation2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation2</em>' containment reference.
   * @see #setRelation2(Relation)
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getConditionalRuleType_Relation2()
   * @model containment="true"
   * @generated
   */
  Relation getRelation2();

  /**
   * Sets the value of the '{@link org.architecture.cnl.archcnl.ConditionalRuleType#getRelation2 <em>Relation2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation2</em>' containment reference.
   * @see #getRelation2()
   * @generated
   */
  void setRelation2(Relation value);

  /**
   * Returns the value of the '<em><b>Object2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object2</em>' containment reference.
   * @see #setObject2(ConceptExpression)
   * @see org.architecture.cnl.archcnl.ArchcnlPackage#getConditionalRuleType_Object2()
   * @model containment="true"
   * @generated
   */
  ConceptExpression getObject2();

  /**
   * Sets the value of the '{@link org.architecture.cnl.archcnl.ConditionalRuleType#getObject2 <em>Object2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object2</em>' containment reference.
   * @see #getObject2()
   * @generated
   */
  void setObject2(ConceptExpression value);

} // ConditionalRuleType