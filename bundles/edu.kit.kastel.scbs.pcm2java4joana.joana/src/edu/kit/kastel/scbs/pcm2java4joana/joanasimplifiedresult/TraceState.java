/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getTracePosition <em>Trace Position</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getTraceClassName <em>Trace Class Name</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getSecurityLevelName <em>Security Level Name</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getParameterIndex <em>Parameter Index</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getResultmethod <em>Resultmethod</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage#getTraceState()
 * @model
 * @generated
 */
public interface TraceState extends EObject {
	/**
	 * Returns the value of the '<em><b>Trace Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Position</em>' attribute.
	 * @see #setTracePosition(int)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage#getTraceState_TracePosition()
	 * @model required="true"
	 * @generated
	 */
	int getTracePosition();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getTracePosition <em>Trace Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Position</em>' attribute.
	 * @see #getTracePosition()
	 * @generated
	 */
	void setTracePosition(int value);

	/**
	 * Returns the value of the '<em><b>Trace Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Class Name</em>' attribute.
	 * @see #setTraceClassName(String)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage#getTraceState_TraceClassName()
	 * @model required="true"
	 * @generated
	 */
	String getTraceClassName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getTraceClassName <em>Trace Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Class Name</em>' attribute.
	 * @see #getTraceClassName()
	 * @generated
	 */
	void setTraceClassName(String value);

	/**
	 * Returns the value of the '<em><b>Security Level Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level Name</em>' attribute.
	 * @see #setSecurityLevelName(String)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage#getTraceState_SecurityLevelName()
	 * @model required="true"
	 * @generated
	 */
	String getSecurityLevelName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getSecurityLevelName <em>Security Level Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level Name</em>' attribute.
	 * @see #getSecurityLevelName()
	 * @generated
	 */
	void setSecurityLevelName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Index</em>' attribute.
	 * @see #setParameterIndex(int)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage#getTraceState_ParameterIndex()
	 * @model
	 * @generated
	 */
	int getParameterIndex();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getParameterIndex <em>Parameter Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Index</em>' attribute.
	 * @see #getParameterIndex()
	 * @generated
	 */
	void setParameterIndex(int value);

	/**
	 * Returns the value of the '<em><b>Resultmethod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultmethod</em>' containment reference.
	 * @see #setResultmethod(ResultMethod)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage#getTraceState_Resultmethod()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResultMethod getResultmethod();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getResultmethod <em>Resultmethod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultmethod</em>' containment reference.
	 * @see #getResultmethod()
	 * @generated
	 */
	void setResultmethod(ResultMethod value);

} // TraceState
