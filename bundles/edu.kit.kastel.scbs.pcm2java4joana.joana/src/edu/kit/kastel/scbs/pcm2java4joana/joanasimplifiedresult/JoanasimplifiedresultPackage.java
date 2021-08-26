/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultFactory
 * @model kind="package"
 * @generated
 */
public interface JoanasimplifiedresultPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "joanasimplifiedresult";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.example.org/joanasimplifiedresult";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "joanasimplifiedresult";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoanasimplifiedresultPackage eINSTANCE = edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.JoanasimplifiedresultPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.ResultImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.JoanasimplifiedresultPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 0;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TRACE = 0;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.TraceImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.JoanasimplifiedresultPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 1;

	/**
	 * The feature id for the '<em><b>Tracestate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TRACESTATE = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.TraceStateImpl <em>Trace State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.TraceStateImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.JoanasimplifiedresultPackageImpl#getTraceState()
	 * @generated
	 */
	int TRACE_STATE = 2;

	/**
	 * The feature id for the '<em><b>Trace Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_STATE__TRACE_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Trace Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_STATE__TRACE_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Security Level Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_STATE__SECURITY_LEVEL_NAME = 2;

	/**
	 * The feature id for the '<em><b>Trace Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_STATE__TRACE_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_STATE__PARAMETER = 4;

	/**
	 * The number of structural features of the '<em>Trace State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_STATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Trace State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_STATE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Result#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Result#getTrace()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Trace();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Trace#getTracestate <em>Tracestate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracestate</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Trace#getTracestate()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Tracestate();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState <em>Trace State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace State</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState
	 * @generated
	 */
	EClass getTraceState();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getTracePosition <em>Trace Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Position</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getTracePosition()
	 * @see #getTraceState()
	 * @generated
	 */
	EAttribute getTraceState_TracePosition();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getTraceClassName <em>Trace Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Class Name</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getTraceClassName()
	 * @see #getTraceState()
	 * @generated
	 */
	EAttribute getTraceState_TraceClassName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getSecurityLevelName <em>Security Level Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Level Name</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getSecurityLevelName()
	 * @see #getTraceState()
	 * @generated
	 */
	EAttribute getTraceState_SecurityLevelName();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getTraceMethod <em>Trace Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace Method</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getTraceMethod()
	 * @see #getTraceState()
	 * @generated
	 */
	EReference getTraceState_TraceMethod();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState#getParameter()
	 * @see #getTraceState()
	 * @generated
	 */
	EReference getTraceState_Parameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JoanasimplifiedresultFactory getJoanasimplifiedresultFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.ResultImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.JoanasimplifiedresultPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__TRACE = eINSTANCE.getResult_Trace();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.TraceImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.JoanasimplifiedresultPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Tracestate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TRACESTATE = eINSTANCE.getTrace_Tracestate();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.TraceStateImpl <em>Trace State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.TraceStateImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.JoanasimplifiedresultPackageImpl#getTraceState()
		 * @generated
		 */
		EClass TRACE_STATE = eINSTANCE.getTraceState();

		/**
		 * The meta object literal for the '<em><b>Trace Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_STATE__TRACE_POSITION = eINSTANCE.getTraceState_TracePosition();

		/**
		 * The meta object literal for the '<em><b>Trace Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_STATE__TRACE_CLASS_NAME = eINSTANCE.getTraceState_TraceClassName();

		/**
		 * The meta object literal for the '<em><b>Security Level Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_STATE__SECURITY_LEVEL_NAME = eINSTANCE.getTraceState_SecurityLevelName();

		/**
		 * The meta object literal for the '<em><b>Trace Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_STATE__TRACE_METHOD = eINSTANCE.getTraceState_TraceMethod();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_STATE__PARAMETER = eINSTANCE.getTraceState_Parameter();

	}

} //JoanasimplifiedresultPackage
