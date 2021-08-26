/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;

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
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getTraceMethod <em>Trace Method</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getParameter <em>Parameter</em>}</li>
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
	 * Returns the value of the '<em><b>Trace Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Method</em>' reference.
	 * @see #setTraceMethod(Method)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage#getTraceState_TraceMethod()
	 * @model required="true"
	 * @generated
	 */
	Method getTraceMethod();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getTraceMethod <em>Trace Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Method</em>' reference.
	 * @see #getTraceMethod()
	 * @generated
	 */
	void setTraceMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage#getTraceState_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // TraceState
