/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoanasimplifiedresultFactoryImpl extends EFactoryImpl implements JoanasimplifiedresultFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JoanasimplifiedresultFactory init() {
		try {
			JoanasimplifiedresultFactory theJoanasimplifiedresultFactory = (JoanasimplifiedresultFactory)EPackage.Registry.INSTANCE.getEFactory(JoanasimplifiedresultPackage.eNS_URI);
			if (theJoanasimplifiedresultFactory != null) {
				return theJoanasimplifiedresultFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JoanasimplifiedresultFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanasimplifiedresultFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JoanasimplifiedresultPackage.RESULT: return createResult();
			case JoanasimplifiedresultPackage.TRACE: return createTrace();
			case JoanasimplifiedresultPackage.TRACE_STATE: return createTraceState();
			case JoanasimplifiedresultPackage.RESULT_TYPE: return createResultType();
			case JoanasimplifiedresultPackage.RESULT_METHOD: return createResultMethod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result createResult() {
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceState createTraceState() {
		TraceStateImpl traceState = new TraceStateImpl();
		return traceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType createResultType() {
		ResultTypeImpl resultType = new ResultTypeImpl();
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultMethod createResultMethod() {
		ResultMethodImpl resultMethod = new ResultMethodImpl();
		return resultMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanasimplifiedresultPackage getJoanasimplifiedresultPackage() {
		return (JoanasimplifiedresultPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JoanasimplifiedresultPackage getPackage() {
		return JoanasimplifiedresultPackage.eINSTANCE;
	}

} //JoanasimplifiedresultFactoryImpl
