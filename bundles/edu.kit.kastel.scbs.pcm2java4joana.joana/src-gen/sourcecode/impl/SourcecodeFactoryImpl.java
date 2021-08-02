/**
 */
package sourcecode.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sourcecode.BuiltInType;
import sourcecode.BuiltInTypes;
import sourcecode.CollectionType;
import sourcecode.Field;
import sourcecode.Interface;
import sourcecode.Method;
import sourcecode.Parameter;
import sourcecode.ReferenceType;
import sourcecode.SourceCodeRoot;
import sourcecode.SourcecodeFactory;
import sourcecode.SourcecodePackage;
import sourcecode.TopLevelType;
import sourcecode.Type;
import sourcecode.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourcecodeFactoryImpl extends EFactoryImpl implements SourcecodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourcecodeFactory init() {
		try {
			SourcecodeFactory theSourcecodeFactory = (SourcecodeFactory) EPackage.Registry.INSTANCE
					.getEFactory(SourcecodePackage.eNS_URI);
			if (theSourcecodeFactory != null) {
				return theSourcecodeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SourcecodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcecodeFactoryImpl() {
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
		case SourcecodePackage.SOURCE_CODE_ROOT:
			return createSourceCodeRoot();
		case SourcecodePackage.TOP_LEVEL_TYPE:
			return createTopLevelType();
		case SourcecodePackage.INTERFACE:
			return createInterface();
		case SourcecodePackage.CLASS:
			return createClass();
		case SourcecodePackage.FIELD:
			return createField();
		case SourcecodePackage.METHOD:
			return createMethod();
		case SourcecodePackage.VARIABLE:
			return createVariable();
		case SourcecodePackage.TYPE:
			return createType();
		case SourcecodePackage.PARAMETER:
			return createParameter();
		case SourcecodePackage.BUILT_IN_TYPE:
			return createBuiltInType();
		case SourcecodePackage.REFERENCE_TYPE:
			return createReferenceType();
		case SourcecodePackage.COLLECTION_TYPE:
			return createCollectionType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SourcecodePackage.BUILT_IN_TYPES:
			return createBuiltInTypesFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SourcecodePackage.BUILT_IN_TYPES:
			return convertBuiltInTypesToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCodeRoot createSourceCodeRoot() {
		SourceCodeRootImpl sourceCodeRoot = new SourceCodeRootImpl();
		return sourceCodeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelType createTopLevelType() {
		TopLevelTypeImpl topLevelType = new TopLevelTypeImpl();
		return topLevelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sourcecode.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInType createBuiltInType() {
		BuiltInTypeImpl builtInType = new BuiltInTypeImpl();
		return builtInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInTypes createBuiltInTypesFromString(EDataType eDataType, String initialValue) {
		BuiltInTypes result = BuiltInTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuiltInTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcecodePackage getSourcecodePackage() {
		return (SourcecodePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SourcecodePackage getPackage() {
		return SourcecodePackage.eINSTANCE;
	}

} //SourcecodeFactoryImpl
