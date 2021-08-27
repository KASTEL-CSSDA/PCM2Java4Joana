/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel;

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
 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelFactory
 * @model kind="package"
 * @generated
 */
public interface CorrespondencemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "correspondencemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/correspondencemodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "correspondencemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorrespondencemodelPackage eINSTANCE = edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Component2ClassImpl <em>Component2 Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Component2ClassImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getComponent2Class()
	 * @generated
	 */
	int COMPONENT2_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Java Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2_CLASS__JAVA_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Interface2interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2_CLASS__INTERFACE2INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Pcmcomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2_CLASS__PCMCOMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Component2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2_CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Interface2InterfaceImpl <em>Interface2 Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Interface2InterfaceImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getInterface2Interface()
	 * @generated
	 */
	int INTERFACE2_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Java Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE2_INTERFACE__JAVA_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Operation2method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE2_INTERFACE__OPERATION2METHOD = 1;

	/**
	 * The feature id for the '<em><b>Pcminterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE2_INTERFACE__PCMINTERFACE = 2;

	/**
	 * The number of structural features of the '<em>Interface2 Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE2_INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interface2 Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE2_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Operation2MethodImpl <em>Operation2 Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Operation2MethodImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getOperation2Method()
	 * @generated
	 */
	int OPERATION2_METHOD = 2;

	/**
	 * The feature id for the '<em><b>Java Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_METHOD__JAVA_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Parameter2parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_METHOD__PARAMETER2PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Pcmoperation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_METHOD__PCMOPERATION = 2;

	/**
	 * The number of structural features of the '<em>Operation2 Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_METHOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation2 Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Parameter2ParameterImpl <em>Parameter2 Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Parameter2ParameterImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getParameter2Parameter()
	 * @generated
	 */
	int PARAMETER2_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Java Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER2_PARAMETER__JAVA_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Pcmparameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER2_PARAMETER__PCMPARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Parameter2 Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER2_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter2 Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER2_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.StructuralCorrespondenceModelImpl <em>Structural Correspondence Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.StructuralCorrespondenceModelImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getStructuralCorrespondenceModel()
	 * @generated
	 */
	int STRUCTURAL_CORRESPONDENCE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Component2class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CORRESPONDENCE_MODEL__COMPONENT2CLASS = 0;

	/**
	 * The number of structural features of the '<em>Structural Correspondence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CORRESPONDENCE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Structural Correspondence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CORRESPONDENCE_MODEL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMElementImpl <em>PCM Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMElementImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getPCMElement()
	 * @generated
	 */
	int PCM_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>PCM Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PCM Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMComponentImpl <em>PCM Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMComponentImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getPCMComponent()
	 * @generated
	 */
	int PCM_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_COMPONENT__ID = PCM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_COMPONENT__NAME = PCM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pcminterface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_COMPONENT__PCMINTERFACE = PCM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_COMPONENT_FEATURE_COUNT = PCM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PCM Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_COMPONENT_OPERATION_COUNT = PCM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMInterfaceImpl <em>PCM Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMInterfaceImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getPCMInterface()
	 * @generated
	 */
	int PCM_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTERFACE__ID = PCM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTERFACE__NAME = PCM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pcmoperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTERFACE__PCMOPERATION = PCM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTERFACE_FEATURE_COUNT = PCM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PCM Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_INTERFACE_OPERATION_COUNT = PCM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMOperationImpl <em>PCM Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMOperationImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getPCMOperation()
	 * @generated
	 */
	int PCM_OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_OPERATION__ID = PCM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_OPERATION__NAME = PCM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pcmparameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_OPERATION__PCMPARAMETER = PCM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_OPERATION_FEATURE_COUNT = PCM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PCM Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_OPERATION_OPERATION_COUNT = PCM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMParameterImpl <em>PCM Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMParameterImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getPCMParameter()
	 * @generated
	 */
	int PCM_PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER__ID = PCM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER__NAME = PCM_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>PCM Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER_FEATURE_COUNT = PCM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCM Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_PARAMETER_OPERATION_COUNT = PCM_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class <em>Component2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component2 Class</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class
	 * @generated
	 */
	EClass getComponent2Class();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class#getJavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Class</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class#getJavaClass()
	 * @see #getComponent2Class()
	 * @generated
	 */
	EReference getComponent2Class_JavaClass();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class#getInterface2interface <em>Interface2interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface2interface</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class#getInterface2interface()
	 * @see #getComponent2Class()
	 * @generated
	 */
	EReference getComponent2Class_Interface2interface();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class#getPcmcomponent <em>Pcmcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pcmcomponent</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class#getPcmcomponent()
	 * @see #getComponent2Class()
	 * @generated
	 */
	EReference getComponent2Class_Pcmcomponent();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface <em>Interface2 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface2 Interface</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface
	 * @generated
	 */
	EClass getInterface2Interface();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface#getJavaInterface <em>Java Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java Interface</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface#getJavaInterface()
	 * @see #getInterface2Interface()
	 * @generated
	 */
	EReference getInterface2Interface_JavaInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface#getOperation2method <em>Operation2method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation2method</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface#getOperation2method()
	 * @see #getInterface2Interface()
	 * @generated
	 */
	EReference getInterface2Interface_Operation2method();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface#getPcminterface <em>Pcminterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pcminterface</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface#getPcminterface()
	 * @see #getInterface2Interface()
	 * @generated
	 */
	EReference getInterface2Interface_Pcminterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method <em>Operation2 Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation2 Method</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method
	 * @generated
	 */
	EClass getOperation2Method();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method#getJavaMethod <em>Java Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Method</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method#getJavaMethod()
	 * @see #getOperation2Method()
	 * @generated
	 */
	EReference getOperation2Method_JavaMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method#getParameter2parameter <em>Parameter2parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter2parameter</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method#getParameter2parameter()
	 * @see #getOperation2Method()
	 * @generated
	 */
	EReference getOperation2Method_Parameter2parameter();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method#getPcmoperation <em>Pcmoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pcmoperation</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method#getPcmoperation()
	 * @see #getOperation2Method()
	 * @generated
	 */
	EReference getOperation2Method_Pcmoperation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter <em>Parameter2 Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter2 Parameter</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter
	 * @generated
	 */
	EClass getParameter2Parameter();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter#getJavaParameter <em>Java Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Parameter</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter#getJavaParameter()
	 * @see #getParameter2Parameter()
	 * @generated
	 */
	EReference getParameter2Parameter_JavaParameter();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter#getPcmparameter <em>Pcmparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pcmparameter</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter#getPcmparameter()
	 * @see #getParameter2Parameter()
	 * @generated
	 */
	EReference getParameter2Parameter_Pcmparameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel <em>Structural Correspondence Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Correspondence Model</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel
	 * @generated
	 */
	EClass getStructuralCorrespondenceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel#getComponent2class <em>Component2class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component2class</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel#getComponent2class()
	 * @see #getStructuralCorrespondenceModel()
	 * @generated
	 */
	EReference getStructuralCorrespondenceModel_Component2class();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMElement <em>PCM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Element</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMElement
	 * @generated
	 */
	EClass getPCMElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMElement#getId()
	 * @see #getPCMElement()
	 * @generated
	 */
	EAttribute getPCMElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMElement#getName()
	 * @see #getPCMElement()
	 * @generated
	 */
	EAttribute getPCMElement_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMComponent <em>PCM Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Component</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMComponent
	 * @generated
	 */
	EClass getPCMComponent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMComponent#getPcminterface <em>Pcminterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pcminterface</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMComponent#getPcminterface()
	 * @see #getPCMComponent()
	 * @generated
	 */
	EReference getPCMComponent_Pcminterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMInterface <em>PCM Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Interface</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMInterface
	 * @generated
	 */
	EClass getPCMInterface();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMInterface#getPcmoperation <em>Pcmoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pcmoperation</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMInterface#getPcmoperation()
	 * @see #getPCMInterface()
	 * @generated
	 */
	EReference getPCMInterface_Pcmoperation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMOperation <em>PCM Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Operation</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMOperation
	 * @generated
	 */
	EClass getPCMOperation();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMOperation#getPcmparameter <em>Pcmparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pcmparameter</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMOperation#getPcmparameter()
	 * @see #getPCMOperation()
	 * @generated
	 */
	EReference getPCMOperation_Pcmparameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMParameter <em>PCM Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Parameter</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMParameter
	 * @generated
	 */
	EClass getPCMParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CorrespondencemodelFactory getCorrespondencemodelFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Component2ClassImpl <em>Component2 Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Component2ClassImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getComponent2Class()
		 * @generated
		 */
		EClass COMPONENT2_CLASS = eINSTANCE.getComponent2Class();

		/**
		 * The meta object literal for the '<em><b>Java Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT2_CLASS__JAVA_CLASS = eINSTANCE.getComponent2Class_JavaClass();

		/**
		 * The meta object literal for the '<em><b>Interface2interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT2_CLASS__INTERFACE2INTERFACE = eINSTANCE.getComponent2Class_Interface2interface();

		/**
		 * The meta object literal for the '<em><b>Pcmcomponent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT2_CLASS__PCMCOMPONENT = eINSTANCE.getComponent2Class_Pcmcomponent();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Interface2InterfaceImpl <em>Interface2 Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Interface2InterfaceImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getInterface2Interface()
		 * @generated
		 */
		EClass INTERFACE2_INTERFACE = eINSTANCE.getInterface2Interface();

		/**
		 * The meta object literal for the '<em><b>Java Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE2_INTERFACE__JAVA_INTERFACE = eINSTANCE.getInterface2Interface_JavaInterface();

		/**
		 * The meta object literal for the '<em><b>Operation2method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE2_INTERFACE__OPERATION2METHOD = eINSTANCE.getInterface2Interface_Operation2method();

		/**
		 * The meta object literal for the '<em><b>Pcminterface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE2_INTERFACE__PCMINTERFACE = eINSTANCE.getInterface2Interface_Pcminterface();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Operation2MethodImpl <em>Operation2 Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Operation2MethodImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getOperation2Method()
		 * @generated
		 */
		EClass OPERATION2_METHOD = eINSTANCE.getOperation2Method();

		/**
		 * The meta object literal for the '<em><b>Java Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION2_METHOD__JAVA_METHOD = eINSTANCE.getOperation2Method_JavaMethod();

		/**
		 * The meta object literal for the '<em><b>Parameter2parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION2_METHOD__PARAMETER2PARAMETER = eINSTANCE.getOperation2Method_Parameter2parameter();

		/**
		 * The meta object literal for the '<em><b>Pcmoperation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION2_METHOD__PCMOPERATION = eINSTANCE.getOperation2Method_Pcmoperation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Parameter2ParameterImpl <em>Parameter2 Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Parameter2ParameterImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getParameter2Parameter()
		 * @generated
		 */
		EClass PARAMETER2_PARAMETER = eINSTANCE.getParameter2Parameter();

		/**
		 * The meta object literal for the '<em><b>Java Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER2_PARAMETER__JAVA_PARAMETER = eINSTANCE.getParameter2Parameter_JavaParameter();

		/**
		 * The meta object literal for the '<em><b>Pcmparameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER2_PARAMETER__PCMPARAMETER = eINSTANCE.getParameter2Parameter_Pcmparameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.StructuralCorrespondenceModelImpl <em>Structural Correspondence Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.StructuralCorrespondenceModelImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getStructuralCorrespondenceModel()
		 * @generated
		 */
		EClass STRUCTURAL_CORRESPONDENCE_MODEL = eINSTANCE.getStructuralCorrespondenceModel();

		/**
		 * The meta object literal for the '<em><b>Component2class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_CORRESPONDENCE_MODEL__COMPONENT2CLASS = eINSTANCE.getStructuralCorrespondenceModel_Component2class();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMElementImpl <em>PCM Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMElementImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getPCMElement()
		 * @generated
		 */
		EClass PCM_ELEMENT = eINSTANCE.getPCMElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCM_ELEMENT__ID = eINSTANCE.getPCMElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCM_ELEMENT__NAME = eINSTANCE.getPCMElement_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMComponentImpl <em>PCM Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMComponentImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getPCMComponent()
		 * @generated
		 */
		EClass PCM_COMPONENT = eINSTANCE.getPCMComponent();

		/**
		 * The meta object literal for the '<em><b>Pcminterface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_COMPONENT__PCMINTERFACE = eINSTANCE.getPCMComponent_Pcminterface();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMInterfaceImpl <em>PCM Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMInterfaceImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getPCMInterface()
		 * @generated
		 */
		EClass PCM_INTERFACE = eINSTANCE.getPCMInterface();

		/**
		 * The meta object literal for the '<em><b>Pcmoperation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_INTERFACE__PCMOPERATION = eINSTANCE.getPCMInterface_Pcmoperation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMOperationImpl <em>PCM Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMOperationImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getPCMOperation()
		 * @generated
		 */
		EClass PCM_OPERATION = eINSTANCE.getPCMOperation();

		/**
		 * The meta object literal for the '<em><b>Pcmparameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_OPERATION__PCMPARAMETER = eINSTANCE.getPCMOperation_Pcmparameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMParameterImpl <em>PCM Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMParameterImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelPackageImpl#getPCMParameter()
		 * @generated
		 */
		EClass PCM_PARAMETER = eINSTANCE.getPCMParameter();

	}

} //CorrespondencemodelPackage
