/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultFactory;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Result;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.ResultMethod;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.ResultType;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Trace;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoanasimplifiedresultPackageImpl extends EPackageImpl implements JoanasimplifiedresultPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultMethodEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JoanasimplifiedresultPackageImpl() {
		super(eNS_URI, JoanasimplifiedresultFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JoanasimplifiedresultPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JoanasimplifiedresultPackage init() {
		if (isInited) return (JoanasimplifiedresultPackage)EPackage.Registry.INSTANCE.getEPackage(JoanasimplifiedresultPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJoanasimplifiedresultPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JoanasimplifiedresultPackageImpl theJoanasimplifiedresultPackage = registeredJoanasimplifiedresultPackage instanceof JoanasimplifiedresultPackageImpl ? (JoanasimplifiedresultPackageImpl)registeredJoanasimplifiedresultPackage : new JoanasimplifiedresultPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theJoanasimplifiedresultPackage.createPackageContents();

		// Initialize created meta-data
		theJoanasimplifiedresultPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJoanasimplifiedresultPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JoanasimplifiedresultPackage.eNS_URI, theJoanasimplifiedresultPackage);
		return theJoanasimplifiedresultPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResult() {
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_Trace() {
		return (EReference)resultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Tracestate() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceState() {
		return traceStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceState_TracePosition() {
		return (EAttribute)traceStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceState_TraceClassName() {
		return (EAttribute)traceStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceState_SecurityLevelName() {
		return (EAttribute)traceStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceState_ParameterIndex() {
		return (EAttribute)traceStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceState_Resultmethod() {
		return (EReference)traceStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultType() {
		return resultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_TypeString() {
		return (EAttribute)resultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultMethod() {
		return resultMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultMethod_ParamterTypes() {
		return (EReference)resultMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultMethod_ReturnType() {
		return (EReference)resultMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultMethod_Name() {
		return (EAttribute)resultMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanasimplifiedresultFactory getJoanasimplifiedresultFactory() {
		return (JoanasimplifiedresultFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resultEClass = createEClass(RESULT);
		createEReference(resultEClass, RESULT__TRACE);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__TRACESTATE);

		traceStateEClass = createEClass(TRACE_STATE);
		createEAttribute(traceStateEClass, TRACE_STATE__TRACE_POSITION);
		createEAttribute(traceStateEClass, TRACE_STATE__TRACE_CLASS_NAME);
		createEAttribute(traceStateEClass, TRACE_STATE__SECURITY_LEVEL_NAME);
		createEAttribute(traceStateEClass, TRACE_STATE__PARAMETER_INDEX);
		createEReference(traceStateEClass, TRACE_STATE__RESULTMETHOD);

		resultTypeEClass = createEClass(RESULT_TYPE);
		createEAttribute(resultTypeEClass, RESULT_TYPE__TYPE_STRING);

		resultMethodEClass = createEClass(RESULT_METHOD);
		createEReference(resultMethodEClass, RESULT_METHOD__PARAMTER_TYPES);
		createEReference(resultMethodEClass, RESULT_METHOD__RETURN_TYPE);
		createEAttribute(resultMethodEClass, RESULT_METHOD__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResult_Trace(), this.getTrace(), null, "trace", null, 0, -1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_Tracestate(), this.getTraceState(), null, "tracestate", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceStateEClass, TraceState.class, "TraceState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceState_TracePosition(), ecorePackage.getEInt(), "tracePosition", null, 1, 1, TraceState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceState_TraceClassName(), ecorePackage.getEString(), "traceClassName", null, 1, 1, TraceState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceState_SecurityLevelName(), ecorePackage.getEString(), "securityLevelName", null, 1, 1, TraceState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceState_ParameterIndex(), ecorePackage.getEInt(), "parameterIndex", null, 0, 1, TraceState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceState_Resultmethod(), this.getResultMethod(), null, "resultmethod", null, 1, 1, TraceState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultTypeEClass, ResultType.class, "ResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultType_TypeString(), ecorePackage.getEString(), "typeString", null, 1, 1, ResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultMethodEClass, ResultMethod.class, "ResultMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultMethod_ParamterTypes(), this.getResultType(), null, "paramterTypes", null, 0, -1, ResultMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultMethod_ReturnType(), this.getResultType(), null, "returnType", null, 0, 1, ResultMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResultMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JoanasimplifiedresultPackageImpl
