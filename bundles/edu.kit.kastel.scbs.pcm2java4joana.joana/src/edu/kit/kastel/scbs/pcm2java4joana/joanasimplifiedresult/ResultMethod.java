/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.ResultMethod#getParamterTypes <em>Paramter Types</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.ResultMethod#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.ResultMethod#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage#getResultMethod()
 * @model
 * @generated
 */
public interface ResultMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Paramter Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.ResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paramter Types</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage#getResultMethod_ParamterTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResultType> getParamterTypes();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(ResultType)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage#getResultMethod_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	ResultType getReturnType();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.ResultMethod#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(ResultType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage#getResultMethod_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.ResultMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ResultMethod
