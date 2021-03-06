/**
 * generated by Xtext 2.22.0
 */
package org.architecture.cnl.archcnl.impl;

import org.architecture.cnl.archcnl.ArchcnlPackage;
import org.architecture.cnl.archcnl.Concept;
import org.architecture.cnl.archcnl.Variable;
import org.architecture.cnl.archcnl.VariableStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.architecture.cnl.archcnl.impl.VariableStatementImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.architecture.cnl.archcnl.impl.VariableStatementImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableStatementImpl extends MinimalEObjectImpl.Container implements VariableStatement
{
  /**
   * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcept()
   * @generated
   * @ordered
   */
  protected Concept concept;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable variable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ArchcnlPackage.Literals.VARIABLE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Concept getConcept()
  {
    return concept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConcept(Concept newConcept, NotificationChain msgs)
  {
    Concept oldConcept = concept;
    concept = newConcept;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchcnlPackage.VARIABLE_STATEMENT__CONCEPT, oldConcept, newConcept);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConcept(Concept newConcept)
  {
    if (newConcept != concept)
    {
      NotificationChain msgs = null;
      if (concept != null)
        msgs = ((InternalEObject)concept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchcnlPackage.VARIABLE_STATEMENT__CONCEPT, null, msgs);
      if (newConcept != null)
        msgs = ((InternalEObject)newConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchcnlPackage.VARIABLE_STATEMENT__CONCEPT, null, msgs);
      msgs = basicSetConcept(newConcept, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchcnlPackage.VARIABLE_STATEMENT__CONCEPT, newConcept, newConcept));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs)
  {
    Variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchcnlPackage.VARIABLE_STATEMENT__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariable(Variable newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchcnlPackage.VARIABLE_STATEMENT__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchcnlPackage.VARIABLE_STATEMENT__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchcnlPackage.VARIABLE_STATEMENT__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ArchcnlPackage.VARIABLE_STATEMENT__CONCEPT:
        return basicSetConcept(null, msgs);
      case ArchcnlPackage.VARIABLE_STATEMENT__VARIABLE:
        return basicSetVariable(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ArchcnlPackage.VARIABLE_STATEMENT__CONCEPT:
        return getConcept();
      case ArchcnlPackage.VARIABLE_STATEMENT__VARIABLE:
        return getVariable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArchcnlPackage.VARIABLE_STATEMENT__CONCEPT:
        setConcept((Concept)newValue);
        return;
      case ArchcnlPackage.VARIABLE_STATEMENT__VARIABLE:
        setVariable((Variable)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ArchcnlPackage.VARIABLE_STATEMENT__CONCEPT:
        setConcept((Concept)null);
        return;
      case ArchcnlPackage.VARIABLE_STATEMENT__VARIABLE:
        setVariable((Variable)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ArchcnlPackage.VARIABLE_STATEMENT__CONCEPT:
        return concept != null;
      case ArchcnlPackage.VARIABLE_STATEMENT__VARIABLE:
        return variable != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableStatementImpl
