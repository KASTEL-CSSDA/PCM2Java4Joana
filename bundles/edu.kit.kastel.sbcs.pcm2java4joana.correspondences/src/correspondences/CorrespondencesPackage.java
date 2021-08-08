/**
 */
package correspondences;

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
 * @see correspondences.CorrespondencesFactory
 * @model kind="package"
 * @generated
 */
public interface CorrespondencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "correspondences";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/correspondences";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "correspondences";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorrespondencesPackage eINSTANCE = correspondences.impl.CorrespondencesPackageImpl.init();

	/**
	 * The meta object id for the '{@link correspondences.impl.CorrespondenceElementImpl <em>Correspondence Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.CorrespondenceElementImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getCorrespondenceElement()
	 * @generated
	 */
	int CORRESPONDENCE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Correspondence Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Correspondence Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link correspondences.impl.PCMComponentImpl <em>PCM Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.PCMComponentImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getPCMComponent()
	 * @generated
	 */
	int PCM_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_COMPONENT__NAME = CORRESPONDENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pcmprovidedinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_COMPONENT__PCMPROVIDEDINTERFACES = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_COMPONENT_FEATURE_COUNT = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PCM Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_COMPONENT_OPERATION_COUNT = CORRESPONDENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link correspondences.impl.SourceCodeClassImpl <em>Source Code Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.SourceCodeClassImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getSourceCodeClass()
	 * @generated
	 */
	int SOURCE_CODE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_CLASS__NAME = CORRESPONDENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sourcecodemethod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_CLASS__SOURCECODEMETHOD = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Code Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_CLASS_FEATURE_COUNT = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source Code Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_CLASS_OPERATION_COUNT = CORRESPONDENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link correspondences.impl.SourceCodeMethodImpl <em>Source Code Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.SourceCodeMethodImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getSourceCodeMethod()
	 * @generated
	 */
	int SOURCE_CODE_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_METHOD__NAME = CORRESPONDENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sourcecodeparamter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_METHOD__SOURCECODEPARAMTER = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Code Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_METHOD_FEATURE_COUNT = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source Code Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_METHOD_OPERATION_COUNT = CORRESPONDENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link correspondences.impl.PCMProvidedInterfaceImpl <em>PCM Provided Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.PCMProvidedInterfaceImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getPCMProvidedInterface()
	 * @generated
	 */
	int PCM_PROVIDED_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_INTERFACE__NAME = CORRESPONDENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pcmmethod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_INTERFACE__PCMMETHOD = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_INTERFACE_FEATURE_COUNT = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PCM Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PROVIDED_INTERFACE_OPERATION_COUNT = CORRESPONDENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link correspondences.impl.PCMMethodImpl <em>PCM Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.PCMMethodImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getPCMMethod()
	 * @generated
	 */
	int PCM_METHOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_METHOD__NAME = CORRESPONDENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pcmparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_METHOD__PCMPARAMETER = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_METHOD_FEATURE_COUNT = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PCM Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_METHOD_OPERATION_COUNT = CORRESPONDENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link correspondences.impl.SourceCodeParameterImpl <em>Source Code Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.SourceCodeParameterImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getSourceCodeParameter()
	 * @generated
	 */
	int SOURCE_CODE_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_PARAMETER__NAME = CORRESPONDENCE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Source Code Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_PARAMETER_FEATURE_COUNT = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source Code Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_PARAMETER_OPERATION_COUNT = CORRESPONDENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link correspondences.impl.PCMParameterImpl <em>PCM Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.PCMParameterImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getPCMParameter()
	 * @generated
	 */
	int PCM_PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER__NAME = CORRESPONDENCE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>PCM Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER_FEATURE_COUNT = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCM Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER_OPERATION_COUNT = CORRESPONDENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link correspondences.impl.ComponentCorrespondenceImpl <em>Component Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.ComponentCorrespondenceImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getComponentCorrespondence()
	 * @generated
	 */
	int COMPONENT_CORRESPONDENCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CORRESPONDENCE__NAME = CORRESPONDENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pcmcomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CORRESPONDENCE__PCMCOMPONENT = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sourcecodeclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CORRESPONDENCE__SOURCECODECLASS = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Methodcorrespondence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CORRESPONDENCE__METHODCORRESPONDENCE = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CORRESPONDENCE_FEATURE_COUNT = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CORRESPONDENCE_OPERATION_COUNT = CORRESPONDENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link correspondences.impl.MethodCorrespondenceImpl <em>Method Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.MethodCorrespondenceImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getMethodCorrespondence()
	 * @generated
	 */
	int METHOD_CORRESPONDENCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CORRESPONDENCE__NAME = CORRESPONDENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pcmmethod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CORRESPONDENCE__PCMMETHOD = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sourcecodemethod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CORRESPONDENCE__SOURCECODEMETHOD = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parametercorrespondence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CORRESPONDENCE_FEATURE_COUNT = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Method Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CORRESPONDENCE_OPERATION_COUNT = CORRESPONDENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link correspondences.impl.ParameterCorrespondenceImpl <em>Parameter Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.ParameterCorrespondenceImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getParameterCorrespondence()
	 * @generated
	 */
	int PARAMETER_CORRESPONDENCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE__NAME = CORRESPONDENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sourcecodeparamter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE__SOURCECODEPARAMTER = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pcmparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE__PCMPARAMETER = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_FEATURE_COUNT = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CORRESPONDENCE_OPERATION_COUNT = CORRESPONDENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link correspondences.impl.CorrespondenceModelImpl <em>Correspondence Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.CorrespondenceModelImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getCorrespondenceModel()
	 * @generated
	 */
	int CORRESPONDENCE_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Componentcorrespondence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE_MODEL__COMPONENTCORRESPONDENCE = 0;

	/**
	 * The feature id for the '<em><b>Interfacecorrespondence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE_MODEL__INTERFACECORRESPONDENCE = 1;

	/**
	 * The number of structural features of the '<em>Correspondence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Correspondence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link correspondences.impl.InterfaceCorrespondenceImpl <em>Interface Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.InterfaceCorrespondenceImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getInterfaceCorrespondence()
	 * @generated
	 */
	int INTERFACE_CORRESPONDENCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CORRESPONDENCE__NAME = CORRESPONDENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sourcecodeinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CORRESPONDENCE__SOURCECODEINTERFACE = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pcmprovidedinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CORRESPONDENCE__PCMPROVIDEDINTERFACE = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Methodcorrespondence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CORRESPONDENCE__METHODCORRESPONDENCE = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interface Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CORRESPONDENCE_FEATURE_COUNT = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interface Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CORRESPONDENCE_OPERATION_COUNT = CORRESPONDENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link correspondences.impl.SourceCodeInterfaceImpl <em>Source Code Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondences.impl.SourceCodeInterfaceImpl
	 * @see correspondences.impl.CorrespondencesPackageImpl#getSourceCodeInterface()
	 * @generated
	 */
	int SOURCE_CODE_INTERFACE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_INTERFACE__NAME = CORRESPONDENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sourcecodemethod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_INTERFACE__SOURCECODEMETHOD = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Code Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_INTERFACE_FEATURE_COUNT = CORRESPONDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source Code Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_INTERFACE_OPERATION_COUNT = CORRESPONDENCE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link correspondences.CorrespondenceElement <em>Correspondence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correspondence Element</em>'.
	 * @see correspondences.CorrespondenceElement
	 * @generated
	 */
	EClass getCorrespondenceElement();

	/**
	 * Returns the meta object for the attribute '{@link correspondences.CorrespondenceElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see correspondences.CorrespondenceElement#getName()
	 * @see #getCorrespondenceElement()
	 * @generated
	 */
	EAttribute getCorrespondenceElement_Name();

	/**
	 * Returns the meta object for class '{@link correspondences.PCMComponent <em>PCM Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Component</em>'.
	 * @see correspondences.PCMComponent
	 * @generated
	 */
	EClass getPCMComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.PCMComponent#getPcmprovidedinterfaces <em>Pcmprovidedinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pcmprovidedinterfaces</em>'.
	 * @see correspondences.PCMComponent#getPcmprovidedinterfaces()
	 * @see #getPCMComponent()
	 * @generated
	 */
	EReference getPCMComponent_Pcmprovidedinterfaces();

	/**
	 * Returns the meta object for class '{@link correspondences.SourceCodeClass <em>Source Code Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Code Class</em>'.
	 * @see correspondences.SourceCodeClass
	 * @generated
	 */
	EClass getSourceCodeClass();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.SourceCodeClass#getSourcecodemethod <em>Sourcecodemethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sourcecodemethod</em>'.
	 * @see correspondences.SourceCodeClass#getSourcecodemethod()
	 * @see #getSourceCodeClass()
	 * @generated
	 */
	EReference getSourceCodeClass_Sourcecodemethod();

	/**
	 * Returns the meta object for class '{@link correspondences.SourceCodeMethod <em>Source Code Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Code Method</em>'.
	 * @see correspondences.SourceCodeMethod
	 * @generated
	 */
	EClass getSourceCodeMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.SourceCodeMethod#getSourcecodeparamter <em>Sourcecodeparamter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sourcecodeparamter</em>'.
	 * @see correspondences.SourceCodeMethod#getSourcecodeparamter()
	 * @see #getSourceCodeMethod()
	 * @generated
	 */
	EReference getSourceCodeMethod_Sourcecodeparamter();

	/**
	 * Returns the meta object for class '{@link correspondences.PCMProvidedInterface <em>PCM Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Provided Interface</em>'.
	 * @see correspondences.PCMProvidedInterface
	 * @generated
	 */
	EClass getPCMProvidedInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.PCMProvidedInterface#getPcmmethod <em>Pcmmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pcmmethod</em>'.
	 * @see correspondences.PCMProvidedInterface#getPcmmethod()
	 * @see #getPCMProvidedInterface()
	 * @generated
	 */
	EReference getPCMProvidedInterface_Pcmmethod();

	/**
	 * Returns the meta object for class '{@link correspondences.PCMMethod <em>PCM Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Method</em>'.
	 * @see correspondences.PCMMethod
	 * @generated
	 */
	EClass getPCMMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.PCMMethod#getPcmparameter <em>Pcmparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pcmparameter</em>'.
	 * @see correspondences.PCMMethod#getPcmparameter()
	 * @see #getPCMMethod()
	 * @generated
	 */
	EReference getPCMMethod_Pcmparameter();

	/**
	 * Returns the meta object for class '{@link correspondences.SourceCodeParameter <em>Source Code Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Code Parameter</em>'.
	 * @see correspondences.SourceCodeParameter
	 * @generated
	 */
	EClass getSourceCodeParameter();

	/**
	 * Returns the meta object for class '{@link correspondences.PCMParameter <em>PCM Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Parameter</em>'.
	 * @see correspondences.PCMParameter
	 * @generated
	 */
	EClass getPCMParameter();

	/**
	 * Returns the meta object for class '{@link correspondences.ComponentCorrespondence <em>Component Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Correspondence</em>'.
	 * @see correspondences.ComponentCorrespondence
	 * @generated
	 */
	EClass getComponentCorrespondence();

	/**
	 * Returns the meta object for the containment reference '{@link correspondences.ComponentCorrespondence#getPcmcomponent <em>Pcmcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pcmcomponent</em>'.
	 * @see correspondences.ComponentCorrespondence#getPcmcomponent()
	 * @see #getComponentCorrespondence()
	 * @generated
	 */
	EReference getComponentCorrespondence_Pcmcomponent();

	/**
	 * Returns the meta object for the containment reference '{@link correspondences.ComponentCorrespondence#getSourcecodeclass <em>Sourcecodeclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sourcecodeclass</em>'.
	 * @see correspondences.ComponentCorrespondence#getSourcecodeclass()
	 * @see #getComponentCorrespondence()
	 * @generated
	 */
	EReference getComponentCorrespondence_Sourcecodeclass();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.ComponentCorrespondence#getMethodcorrespondence <em>Methodcorrespondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methodcorrespondence</em>'.
	 * @see correspondences.ComponentCorrespondence#getMethodcorrespondence()
	 * @see #getComponentCorrespondence()
	 * @generated
	 */
	EReference getComponentCorrespondence_Methodcorrespondence();

	/**
	 * Returns the meta object for class '{@link correspondences.MethodCorrespondence <em>Method Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Correspondence</em>'.
	 * @see correspondences.MethodCorrespondence
	 * @generated
	 */
	EClass getMethodCorrespondence();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.MethodCorrespondence#getPcmmethod <em>Pcmmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pcmmethod</em>'.
	 * @see correspondences.MethodCorrespondence#getPcmmethod()
	 * @see #getMethodCorrespondence()
	 * @generated
	 */
	EReference getMethodCorrespondence_Pcmmethod();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.MethodCorrespondence#getSourcecodemethod <em>Sourcecodemethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sourcecodemethod</em>'.
	 * @see correspondences.MethodCorrespondence#getSourcecodemethod()
	 * @see #getMethodCorrespondence()
	 * @generated
	 */
	EReference getMethodCorrespondence_Sourcecodemethod();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.MethodCorrespondence#getParametercorrespondence <em>Parametercorrespondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametercorrespondence</em>'.
	 * @see correspondences.MethodCorrespondence#getParametercorrespondence()
	 * @see #getMethodCorrespondence()
	 * @generated
	 */
	EReference getMethodCorrespondence_Parametercorrespondence();

	/**
	 * Returns the meta object for class '{@link correspondences.ParameterCorrespondence <em>Parameter Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Correspondence</em>'.
	 * @see correspondences.ParameterCorrespondence
	 * @generated
	 */
	EClass getParameterCorrespondence();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.ParameterCorrespondence#getSourcecodeparamter <em>Sourcecodeparamter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sourcecodeparamter</em>'.
	 * @see correspondences.ParameterCorrespondence#getSourcecodeparamter()
	 * @see #getParameterCorrespondence()
	 * @generated
	 */
	EReference getParameterCorrespondence_Sourcecodeparamter();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.ParameterCorrespondence#getPcmparameter <em>Pcmparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pcmparameter</em>'.
	 * @see correspondences.ParameterCorrespondence#getPcmparameter()
	 * @see #getParameterCorrespondence()
	 * @generated
	 */
	EReference getParameterCorrespondence_Pcmparameter();

	/**
	 * Returns the meta object for class '{@link correspondences.CorrespondenceModel <em>Correspondence Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correspondence Model</em>'.
	 * @see correspondences.CorrespondenceModel
	 * @generated
	 */
	EClass getCorrespondenceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.CorrespondenceModel#getComponentcorrespondence <em>Componentcorrespondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Componentcorrespondence</em>'.
	 * @see correspondences.CorrespondenceModel#getComponentcorrespondence()
	 * @see #getCorrespondenceModel()
	 * @generated
	 */
	EReference getCorrespondenceModel_Componentcorrespondence();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.CorrespondenceModel#getInterfacecorrespondence <em>Interfacecorrespondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacecorrespondence</em>'.
	 * @see correspondences.CorrespondenceModel#getInterfacecorrespondence()
	 * @see #getCorrespondenceModel()
	 * @generated
	 */
	EReference getCorrespondenceModel_Interfacecorrespondence();

	/**
	 * Returns the meta object for class '{@link correspondences.InterfaceCorrespondence <em>Interface Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Correspondence</em>'.
	 * @see correspondences.InterfaceCorrespondence
	 * @generated
	 */
	EClass getInterfaceCorrespondence();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.InterfaceCorrespondence#getSourcecodeinterface <em>Sourcecodeinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sourcecodeinterface</em>'.
	 * @see correspondences.InterfaceCorrespondence#getSourcecodeinterface()
	 * @see #getInterfaceCorrespondence()
	 * @generated
	 */
	EReference getInterfaceCorrespondence_Sourcecodeinterface();

	/**
	 * Returns the meta object for the containment reference '{@link correspondences.InterfaceCorrespondence#getPcmprovidedinterface <em>Pcmprovidedinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pcmprovidedinterface</em>'.
	 * @see correspondences.InterfaceCorrespondence#getPcmprovidedinterface()
	 * @see #getInterfaceCorrespondence()
	 * @generated
	 */
	EReference getInterfaceCorrespondence_Pcmprovidedinterface();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.InterfaceCorrespondence#getMethodcorrespondence <em>Methodcorrespondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methodcorrespondence</em>'.
	 * @see correspondences.InterfaceCorrespondence#getMethodcorrespondence()
	 * @see #getInterfaceCorrespondence()
	 * @generated
	 */
	EReference getInterfaceCorrespondence_Methodcorrespondence();

	/**
	 * Returns the meta object for class '{@link correspondences.SourceCodeInterface <em>Source Code Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Code Interface</em>'.
	 * @see correspondences.SourceCodeInterface
	 * @generated
	 */
	EClass getSourceCodeInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link correspondences.SourceCodeInterface#getSourcecodemethod <em>Sourcecodemethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sourcecodemethod</em>'.
	 * @see correspondences.SourceCodeInterface#getSourcecodemethod()
	 * @see #getSourceCodeInterface()
	 * @generated
	 */
	EReference getSourceCodeInterface_Sourcecodemethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CorrespondencesFactory getCorrespondencesFactory();

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
		 * The meta object literal for the '{@link correspondences.impl.CorrespondenceElementImpl <em>Correspondence Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.CorrespondenceElementImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getCorrespondenceElement()
		 * @generated
		 */
		EClass CORRESPONDENCE_ELEMENT = eINSTANCE.getCorrespondenceElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRESPONDENCE_ELEMENT__NAME = eINSTANCE.getCorrespondenceElement_Name();

		/**
		 * The meta object literal for the '{@link correspondences.impl.PCMComponentImpl <em>PCM Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.PCMComponentImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getPCMComponent()
		 * @generated
		 */
		EClass PCM_COMPONENT = eINSTANCE.getPCMComponent();

		/**
		 * The meta object literal for the '<em><b>Pcmprovidedinterfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_COMPONENT__PCMPROVIDEDINTERFACES = eINSTANCE.getPCMComponent_Pcmprovidedinterfaces();

		/**
		 * The meta object literal for the '{@link correspondences.impl.SourceCodeClassImpl <em>Source Code Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.SourceCodeClassImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getSourceCodeClass()
		 * @generated
		 */
		EClass SOURCE_CODE_CLASS = eINSTANCE.getSourceCodeClass();

		/**
		 * The meta object literal for the '<em><b>Sourcecodemethod</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_CLASS__SOURCECODEMETHOD = eINSTANCE.getSourceCodeClass_Sourcecodemethod();

		/**
		 * The meta object literal for the '{@link correspondences.impl.SourceCodeMethodImpl <em>Source Code Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.SourceCodeMethodImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getSourceCodeMethod()
		 * @generated
		 */
		EClass SOURCE_CODE_METHOD = eINSTANCE.getSourceCodeMethod();

		/**
		 * The meta object literal for the '<em><b>Sourcecodeparamter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_METHOD__SOURCECODEPARAMTER = eINSTANCE.getSourceCodeMethod_Sourcecodeparamter();

		/**
		 * The meta object literal for the '{@link correspondences.impl.PCMProvidedInterfaceImpl <em>PCM Provided Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.PCMProvidedInterfaceImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getPCMProvidedInterface()
		 * @generated
		 */
		EClass PCM_PROVIDED_INTERFACE = eINSTANCE.getPCMProvidedInterface();

		/**
		 * The meta object literal for the '<em><b>Pcmmethod</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_PROVIDED_INTERFACE__PCMMETHOD = eINSTANCE.getPCMProvidedInterface_Pcmmethod();

		/**
		 * The meta object literal for the '{@link correspondences.impl.PCMMethodImpl <em>PCM Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.PCMMethodImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getPCMMethod()
		 * @generated
		 */
		EClass PCM_METHOD = eINSTANCE.getPCMMethod();

		/**
		 * The meta object literal for the '<em><b>Pcmparameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_METHOD__PCMPARAMETER = eINSTANCE.getPCMMethod_Pcmparameter();

		/**
		 * The meta object literal for the '{@link correspondences.impl.SourceCodeParameterImpl <em>Source Code Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.SourceCodeParameterImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getSourceCodeParameter()
		 * @generated
		 */
		EClass SOURCE_CODE_PARAMETER = eINSTANCE.getSourceCodeParameter();

		/**
		 * The meta object literal for the '{@link correspondences.impl.PCMParameterImpl <em>PCM Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.PCMParameterImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getPCMParameter()
		 * @generated
		 */
		EClass PCM_PARAMETER = eINSTANCE.getPCMParameter();

		/**
		 * The meta object literal for the '{@link correspondences.impl.ComponentCorrespondenceImpl <em>Component Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.ComponentCorrespondenceImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getComponentCorrespondence()
		 * @generated
		 */
		EClass COMPONENT_CORRESPONDENCE = eINSTANCE.getComponentCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Pcmcomponent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CORRESPONDENCE__PCMCOMPONENT = eINSTANCE.getComponentCorrespondence_Pcmcomponent();

		/**
		 * The meta object literal for the '<em><b>Sourcecodeclass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CORRESPONDENCE__SOURCECODECLASS = eINSTANCE.getComponentCorrespondence_Sourcecodeclass();

		/**
		 * The meta object literal for the '<em><b>Methodcorrespondence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CORRESPONDENCE__METHODCORRESPONDENCE = eINSTANCE.getComponentCorrespondence_Methodcorrespondence();

		/**
		 * The meta object literal for the '{@link correspondences.impl.MethodCorrespondenceImpl <em>Method Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.MethodCorrespondenceImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getMethodCorrespondence()
		 * @generated
		 */
		EClass METHOD_CORRESPONDENCE = eINSTANCE.getMethodCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Pcmmethod</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CORRESPONDENCE__PCMMETHOD = eINSTANCE.getMethodCorrespondence_Pcmmethod();

		/**
		 * The meta object literal for the '<em><b>Sourcecodemethod</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CORRESPONDENCE__SOURCECODEMETHOD = eINSTANCE.getMethodCorrespondence_Sourcecodemethod();

		/**
		 * The meta object literal for the '<em><b>Parametercorrespondence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE = eINSTANCE.getMethodCorrespondence_Parametercorrespondence();

		/**
		 * The meta object literal for the '{@link correspondences.impl.ParameterCorrespondenceImpl <em>Parameter Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.ParameterCorrespondenceImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getParameterCorrespondence()
		 * @generated
		 */
		EClass PARAMETER_CORRESPONDENCE = eINSTANCE.getParameterCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Sourcecodeparamter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CORRESPONDENCE__SOURCECODEPARAMTER = eINSTANCE.getParameterCorrespondence_Sourcecodeparamter();

		/**
		 * The meta object literal for the '<em><b>Pcmparameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CORRESPONDENCE__PCMPARAMETER = eINSTANCE.getParameterCorrespondence_Pcmparameter();

		/**
		 * The meta object literal for the '{@link correspondences.impl.CorrespondenceModelImpl <em>Correspondence Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.CorrespondenceModelImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getCorrespondenceModel()
		 * @generated
		 */
		EClass CORRESPONDENCE_MODEL = eINSTANCE.getCorrespondenceModel();

		/**
		 * The meta object literal for the '<em><b>Componentcorrespondence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCE_MODEL__COMPONENTCORRESPONDENCE = eINSTANCE.getCorrespondenceModel_Componentcorrespondence();

		/**
		 * The meta object literal for the '<em><b>Interfacecorrespondence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCE_MODEL__INTERFACECORRESPONDENCE = eINSTANCE.getCorrespondenceModel_Interfacecorrespondence();

		/**
		 * The meta object literal for the '{@link correspondences.impl.InterfaceCorrespondenceImpl <em>Interface Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.InterfaceCorrespondenceImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getInterfaceCorrespondence()
		 * @generated
		 */
		EClass INTERFACE_CORRESPONDENCE = eINSTANCE.getInterfaceCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Sourcecodeinterface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CORRESPONDENCE__SOURCECODEINTERFACE = eINSTANCE.getInterfaceCorrespondence_Sourcecodeinterface();

		/**
		 * The meta object literal for the '<em><b>Pcmprovidedinterface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CORRESPONDENCE__PCMPROVIDEDINTERFACE = eINSTANCE.getInterfaceCorrespondence_Pcmprovidedinterface();

		/**
		 * The meta object literal for the '<em><b>Methodcorrespondence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CORRESPONDENCE__METHODCORRESPONDENCE = eINSTANCE.getInterfaceCorrespondence_Methodcorrespondence();

		/**
		 * The meta object literal for the '{@link correspondences.impl.SourceCodeInterfaceImpl <em>Source Code Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondences.impl.SourceCodeInterfaceImpl
		 * @see correspondences.impl.CorrespondencesPackageImpl#getSourceCodeInterface()
		 * @generated
		 */
		EClass SOURCE_CODE_INTERFACE = eINSTANCE.getSourceCodeInterface();

		/**
		 * The meta object literal for the '<em><b>Sourcecodemethod</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_INTERFACE__SOURCECODEMETHOD = eINSTANCE.getSourceCodeInterface_Sourcecodemethod();

	}

} //CorrespondencesPackage
