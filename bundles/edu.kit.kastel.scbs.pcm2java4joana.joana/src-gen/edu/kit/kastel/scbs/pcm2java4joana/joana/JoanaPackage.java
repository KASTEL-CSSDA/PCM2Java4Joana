/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana;

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
 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaFactory
 * @model kind="package"
 * @generated
 */
public interface JoanaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "joana";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/joana";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "joana";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoanaPackage eINSTANCE = edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationElementImpl <em>Flow Specification Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationElementImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getFlowSpecificationElement()
	 * @generated
	 */
	int FLOW_SPECIFICATION_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_ELEMENT__TAG = 0;

	/**
	 * The feature id for the '<em><b>Annotated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Annotated Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD = 2;

	/**
	 * The number of structural features of the '<em>Flow Specification Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Flow Specification Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.EntryPointImpl <em>Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.EntryPointImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getEntryPoint()
	 * @generated
	 */
	int ENTRY_POINT = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__TAG = FLOW_SPECIFICATION_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Annotated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__ANNOTATED_CLASS = FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS;

	/**
	 * The feature id for the '<em><b>Annotated Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__ANNOTATED_METHOD = FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD;

	/**
	 * The feature id for the '<em><b>Securitylevels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__SECURITYLEVELS = FLOW_SPECIFICATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lattice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__LATTICE = FLOW_SPECIFICATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_FEATURE_COUNT = FLOW_SPECIFICATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_OPERATION_COUNT = FLOW_SPECIFICATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.AnnotationImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TAG = FLOW_SPECIFICATION_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Annotated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATED_CLASS = FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS;

	/**
	 * The feature id for the '<em><b>Annotated Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATED_METHOD = FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = FLOW_SPECIFICATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = FLOW_SPECIFICATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SinkImpl <em>Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SinkImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getSink()
	 * @generated
	 */
	int SINK = 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__TAG = ANNOTATION__TAG;

	/**
	 * The feature id for the '<em><b>Annotated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__ANNOTATED_CLASS = ANNOTATION__ANNOTATED_CLASS;

	/**
	 * The feature id for the '<em><b>Annotated Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__ANNOTATED_METHOD = ANNOTATION__ANNOTATED_METHOD;

	/**
	 * The number of structural features of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SourceImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TAG = ANNOTATION__TAG;

	/**
	 * The feature id for the '<em><b>Annotated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ANNOTATED_CLASS = ANNOTATION__ANNOTATED_CLASS;

	/**
	 * The feature id for the '<em><b>Annotated Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ANNOTATED_METHOD = ANNOTATION__ANNOTATED_METHOD;

	/**
	 * The feature id for the '<em><b>Annotated Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ANNOTATED_PARAMETER = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SecurityLevelImpl <em>Security Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SecurityLevelImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getSecurityLevel()
	 * @generated
	 */
	int SECURITY_LEVEL = 5;

	/**
	 * The number of structural features of the '<em>Security Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Security Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.LatticeImpl <em>Lattice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.LatticeImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getLattice()
	 * @generated
	 */
	int LATTICE = 6;

	/**
	 * The feature id for the '<em><b>Flowrelation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTICE__FLOWRELATION = 0;

	/**
	 * The number of structural features of the '<em>Lattice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lattice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowRelationImpl <em>Flow Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowRelationImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getFlowRelation()
	 * @generated
	 */
	int FLOW_RELATION = 7;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATION__TO = 1;

	/**
	 * The number of structural features of the '<em>Flow Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flow Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JOANARootImpl <em>JOANA Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JOANARootImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getJOANARoot()
	 * @generated
	 */
	int JOANA_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Flowspecification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANA_ROOT__FLOWSPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>JOANA Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANA_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>JOANA Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOANA_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationImpl <em>Flow Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getFlowSpecification()
	 * @generated
	 */
	int FLOW_SPECIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION__ENTRYPOINT = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION__ANNOTATION = 1;

	/**
	 * The number of structural features of the '<em>Flow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint
	 * @generated
	 */
	EClass getEntryPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint#getSecuritylevels <em>Securitylevels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Securitylevels</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint#getSecuritylevels()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EReference getEntryPoint_Securitylevels();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint#getLattice <em>Lattice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lattice</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint#getLattice()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EReference getEntryPoint_Lattice();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement <em>Flow Specification Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Specification Element</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement
	 * @generated
	 */
	EClass getFlowSpecificationElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement#getTag()
	 * @see #getFlowSpecificationElement()
	 * @generated
	 */
	EAttribute getFlowSpecificationElement_Tag();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement#getAnnotatedClass <em>Annotated Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated Class</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement#getAnnotatedClass()
	 * @see #getFlowSpecificationElement()
	 * @generated
	 */
	EReference getFlowSpecificationElement_AnnotatedClass();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement#getAnnotatedMethod <em>Annotated Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated Method</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement#getAnnotatedMethod()
	 * @see #getFlowSpecificationElement()
	 * @generated
	 */
	EReference getFlowSpecificationElement_AnnotatedMethod();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.Sink
	 * @generated
	 */
	EClass getSink();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.Source#getAnnotatedParameter <em>Annotated Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated Parameter</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.Source#getAnnotatedParameter()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_AnnotatedParameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Level</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel
	 * @generated
	 */
	EClass getSecurityLevel();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice <em>Lattice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lattice</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice
	 * @generated
	 */
	EClass getLattice();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice#getFlowrelation <em>Flowrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flowrelation</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice#getFlowrelation()
	 * @see #getLattice()
	 * @generated
	 */
	EReference getLattice_Flowrelation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation <em>Flow Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Relation</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation
	 * @generated
	 */
	EClass getFlowRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>From</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation#getFrom()
	 * @see #getFlowRelation()
	 * @generated
	 */
	EReference getFlowRelation_From();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation#getTo()
	 * @see #getFlowRelation()
	 * @generated
	 */
	EReference getFlowRelation_To();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot <em>JOANA Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JOANA Root</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot
	 * @generated
	 */
	EClass getJOANARoot();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot#getFlowspecification <em>Flowspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flowspecification</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot#getFlowspecification()
	 * @see #getJOANARoot()
	 * @generated
	 */
	EReference getJOANARoot_Flowspecification();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification <em>Flow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Specification</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification
	 * @generated
	 */
	EClass getFlowSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entrypoint</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification#getEntrypoint()
	 * @see #getFlowSpecification()
	 * @generated
	 */
	EReference getFlowSpecification_Entrypoint();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification#getAnnotation()
	 * @see #getFlowSpecification()
	 * @generated
	 */
	EReference getFlowSpecification_Annotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JoanaFactory getJoanaFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.EntryPointImpl <em>Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.EntryPointImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getEntryPoint()
		 * @generated
		 */
		EClass ENTRY_POINT = eINSTANCE.getEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Securitylevels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT__SECURITYLEVELS = eINSTANCE.getEntryPoint_Securitylevels();

		/**
		 * The meta object literal for the '<em><b>Lattice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT__LATTICE = eINSTANCE.getEntryPoint_Lattice();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.AnnotationImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationElementImpl <em>Flow Specification Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationElementImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getFlowSpecificationElement()
		 * @generated
		 */
		EClass FLOW_SPECIFICATION_ELEMENT = eINSTANCE.getFlowSpecificationElement();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_SPECIFICATION_ELEMENT__TAG = eINSTANCE.getFlowSpecificationElement_Tag();

		/**
		 * The meta object literal for the '<em><b>Annotated Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS = eINSTANCE.getFlowSpecificationElement_AnnotatedClass();

		/**
		 * The meta object literal for the '<em><b>Annotated Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD = eINSTANCE
				.getFlowSpecificationElement_AnnotatedMethod();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SinkImpl <em>Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SinkImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getSink()
		 * @generated
		 */
		EClass SINK = eINSTANCE.getSink();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SourceImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Annotated Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__ANNOTATED_PARAMETER = eINSTANCE.getSource_AnnotatedParameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SecurityLevelImpl <em>Security Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SecurityLevelImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getSecurityLevel()
		 * @generated
		 */
		EClass SECURITY_LEVEL = eINSTANCE.getSecurityLevel();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.LatticeImpl <em>Lattice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.LatticeImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getLattice()
		 * @generated
		 */
		EClass LATTICE = eINSTANCE.getLattice();

		/**
		 * The meta object literal for the '<em><b>Flowrelation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATTICE__FLOWRELATION = eINSTANCE.getLattice_Flowrelation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowRelationImpl <em>Flow Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowRelationImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getFlowRelation()
		 * @generated
		 */
		EClass FLOW_RELATION = eINSTANCE.getFlowRelation();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_RELATION__FROM = eINSTANCE.getFlowRelation_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_RELATION__TO = eINSTANCE.getFlowRelation_To();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JOANARootImpl <em>JOANA Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JOANARootImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getJOANARoot()
		 * @generated
		 */
		EClass JOANA_ROOT = eINSTANCE.getJOANARoot();

		/**
		 * The meta object literal for the '<em><b>Flowspecification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOANA_ROOT__FLOWSPECIFICATION = eINSTANCE.getJOANARoot_Flowspecification();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationImpl <em>Flow Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JoanaPackageImpl#getFlowSpecification()
		 * @generated
		 */
		EClass FLOW_SPECIFICATION = eINSTANCE.getFlowSpecification();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SPECIFICATION__ENTRYPOINT = eINSTANCE.getFlowSpecification_Entrypoint();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SPECIFICATION__ANNOTATION = eINSTANCE.getFlowSpecification_Annotation();

	}

} //JoanaPackage
