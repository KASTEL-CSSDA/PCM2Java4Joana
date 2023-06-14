/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.sourcecode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodeFactory
 * @model kind="package"
 * @generated
 */
public interface SourcecodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sourcecode";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sourcecode";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sourcecode";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SourcecodePackage eINSTANCE = edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourceCodeElementImpl <em>Source Code Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourceCodeElementImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getSourceCodeElement()
	 * @generated
	 */
	int SOURCE_CODE_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Source Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourceCodeRootImpl <em>Source Code Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourceCodeRootImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getSourceCodeRoot()
	 * @generated
	 */
	int SOURCE_CODE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ROOT__NAME = SOURCE_CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Topleveltype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ROOT__TOPLEVELTYPE = SOURCE_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Code Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ROOT_FEATURE_COUNT = SOURCE_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source Code Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_ROOT_OPERATION_COUNT = SOURCE_CODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.TopLevelTypeImpl <em>Top Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.TopLevelTypeImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getTopLevelType()
	 * @generated
	 */
	int TOP_LEVEL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_TYPE__NAME = SOURCE_CODE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Top Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_TYPE_FEATURE_COUNT = SOURCE_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Top Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_TYPE_OPERATION_COUNT = SOURCE_CODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.InterfaceImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = TOP_LEVEL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__METHODS = TOP_LEVEL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = TOP_LEVEL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = TOP_LEVEL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ClassImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = TOP_LEVEL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPLEMENTS = TOP_LEVEL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FIELDS = TOP_LEVEL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TOP_LEVEL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = TOP_LEVEL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.FieldImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getField()
	 * @generated
	 */
	int FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = SOURCE_CODE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = SOURCE_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = SOURCE_CODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.MethodImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TYPE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETER = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.VariableImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.TypeImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = SOURCE_CODE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = SOURCE_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = SOURCE_CODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ParameterImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = SOURCE_CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = SOURCE_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = SOURCE_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = SOURCE_CODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.BuiltInTypeImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getBuiltInType()
	 * @generated
	 */
	int BUILT_IN_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Built In Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE__BUILT_IN_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Built In Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Built In Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ReferenceTypeImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Topleveltype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__TOPLEVELTYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.CollectionTypeImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInTypes <em>Built In Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInTypes
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getBuiltInTypes()
	 * @generated
	 */
	int BUILT_IN_TYPES = 13;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot <em>Source Code Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Code Root</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot
	 * @generated
	 */
	EClass getSourceCodeRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot#getTopleveltype <em>Topleveltype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topleveltype</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot#getTopleveltype()
	 * @see #getSourceCodeRoot()
	 * @generated
	 */
	EReference getSourceCodeRoot_Topleveltype();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType <em>Top Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level Type</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType
	 * @generated
	 */
	EClass getTopLevelType();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface#getMethods()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Methods();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class#getImplements()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Implements();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class#getFields()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Fields();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method#getType()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method#getParameter()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInType <em>Built In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Type</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInType
	 * @generated
	 */
	EClass getBuiltInType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInType#getBuiltInType <em>Built In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Built In Type</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInType#getBuiltInType()
	 * @see #getBuiltInType()
	 * @generated
	 */
	EAttribute getBuiltInType_BuiltInType();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.ReferenceType#getTopleveltype <em>Topleveltype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topleveltype</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.ReferenceType#getTopleveltype()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_Topleveltype();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.CollectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.CollectionType#getType()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeElement <em>Source Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Code Element</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeElement
	 * @generated
	 */
	EClass getSourceCodeElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeElement#getName()
	 * @see #getSourceCodeElement()
	 * @generated
	 */
	EAttribute getSourceCodeElement_Name();

	/**
	 * Returns the meta object for enum '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInTypes <em>Built In Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Built In Types</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInTypes
	 * @generated
	 */
	EEnum getBuiltInTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SourcecodeFactory getSourcecodeFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourceCodeRootImpl <em>Source Code Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourceCodeRootImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getSourceCodeRoot()
		 * @generated
		 */
		EClass SOURCE_CODE_ROOT = eINSTANCE.getSourceCodeRoot();

		/**
		 * The meta object literal for the '<em><b>Topleveltype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CODE_ROOT__TOPLEVELTYPE = eINSTANCE.getSourceCodeRoot_Topleveltype();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.TopLevelTypeImpl <em>Top Level Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.TopLevelTypeImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getTopLevelType()
		 * @generated
		 */
		EClass TOP_LEVEL_TYPE = eINSTANCE.getTopLevelType();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.InterfaceImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__METHODS = eINSTANCE.getInterface_Methods();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ClassImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__IMPLEMENTS = eINSTANCE.getClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__FIELDS = eINSTANCE.getClass_Fields();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.FieldImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.MethodImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__TYPE = eINSTANCE.getMethod_Type();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMETER = eINSTANCE.getMethod_Parameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.VariableImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.TypeImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ParameterImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.BuiltInTypeImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getBuiltInType()
		 * @generated
		 */
		EClass BUILT_IN_TYPE = eINSTANCE.getBuiltInType();

		/**
		 * The meta object literal for the '<em><b>Built In Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILT_IN_TYPE__BUILT_IN_TYPE = eINSTANCE.getBuiltInType_BuiltInType();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ReferenceTypeImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getReferenceType()
		 * @generated
		 */
		EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '<em><b>Topleveltype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE__TOPLEVELTYPE = eINSTANCE.getReferenceType_Topleveltype();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.CollectionTypeImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getCollectionType()
		 * @generated
		 */
		EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE__TYPE = eINSTANCE.getCollectionType_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourceCodeElementImpl <em>Source Code Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourceCodeElementImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getSourceCodeElement()
		 * @generated
		 */
		EClass SOURCE_CODE_ELEMENT = eINSTANCE.getSourceCodeElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_CODE_ELEMENT__NAME = eINSTANCE.getSourceCodeElement_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInTypes <em>Built In Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInTypes
		 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourcecodePackageImpl#getBuiltInTypes()
		 * @generated
		 */
		EEnum BUILT_IN_TYPES = eINSTANCE.getBuiltInTypes();

	}

} //SourcecodePackage
