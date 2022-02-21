/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.*;

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
public class JoanaFactoryImpl extends EFactoryImpl implements JoanaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JoanaFactory init() {
		try {
			JoanaFactory theJoanaFactory = (JoanaFactory)EPackage.Registry.INSTANCE.getEFactory(JoanaPackage.eNS_URI);
			if (theJoanaFactory != null) {
				return theJoanaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JoanaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanaFactoryImpl() {
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
			case JoanaPackage.ENTRY_POINT: return createEntryPoint();
			case JoanaPackage.ANNOTATION: return createAnnotation();
			case JoanaPackage.SINK: return createSink();
			case JoanaPackage.SOURCE: return createSource();
			case JoanaPackage.SECURITY_LEVEL: return createSecurityLevel();
			case JoanaPackage.LATTICE: return createLattice();
			case JoanaPackage.FLOW_RELATION: return createFlowRelation();
			case JoanaPackage.JOANA_ROOT: return createJOANARoot();
			case JoanaPackage.FLOW_SPECIFICATION: return createFlowSpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint createEntryPoint() {
		EntryPointImpl entryPoint = new EntryPointImpl();
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sink createSink() {
		SinkImpl sink = new SinkImpl();
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel createSecurityLevel() {
		SecurityLevelImpl securityLevel = new SecurityLevelImpl();
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lattice createLattice() {
		LatticeImpl lattice = new LatticeImpl();
		return lattice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowRelation createFlowRelation() {
		FlowRelationImpl flowRelation = new FlowRelationImpl();
		return flowRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOANARoot createJOANARoot() {
		JOANARootImpl joanaRoot = new JOANARootImpl();
		return joanaRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSpecification createFlowSpecification() {
		FlowSpecificationImpl flowSpecification = new FlowSpecificationImpl();
		return flowSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanaPackage getJoanaPackage() {
		return (JoanaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JoanaPackage getPackage() {
		return JoanaPackage.eINSTANCE;
	}

} //JoanaFactoryImpl
