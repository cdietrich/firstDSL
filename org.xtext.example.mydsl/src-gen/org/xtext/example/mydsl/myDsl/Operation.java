/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Operation#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Operation#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Operation#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' reference.
   * @see #setLeft(EClass)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOperation_Left()
   * @model
   * @generated
   */
  EClass getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Operation#getLeft <em>Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(EClass value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' reference.
   * @see #setRight(EClass)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOperation_Right()
   * @model
   * @generated
   */
  EClass getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Operation#getRight <em>Right</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' reference.
   * @see #getRight()
   * @generated
   */
  void setRight(EClass value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(XExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOperation_Condition()
   * @model containment="true"
   * @generated
   */
  XExpression getCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Operation#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(XExpression value);

} // Operation