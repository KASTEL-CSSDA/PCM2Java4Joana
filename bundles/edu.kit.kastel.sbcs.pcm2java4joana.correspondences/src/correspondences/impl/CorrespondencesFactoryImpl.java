/**
 */
package correspondences.impl;

import correspondences.*;

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
public class CorrespondencesFactoryImpl extends EFactoryImpl implements CorrespondencesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CorrespondencesFactory init() {
		try {
			CorrespondencesFactory theCorrespondencesFactory = (CorrespondencesFactory)EPackage.Registry.INSTANCE.getEFactory(CorrespondencesPackage.eNS_URI);
			if (theCorrespondencesFactory != null) {
				return theCorrespondencesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CorrespondencesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondencesFactoryImpl() {
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
			case CorrespondencesPackage.CORRESPONDENCE_ELEMENT: return createCorrespondenceElement();
			case CorrespondencesPackage.PCM_COMPONENT: return createPCMComponent();
			case CorrespondencesPackage.SOURCE_CODE_CLASS: return createSourceCodeClass();
			case CorrespondencesPackage.SOURCE_CODE_METHOD: return createSourceCodeMethod();
			case CorrespondencesPackage.PCM_PROVIDED_INTERFACE: return createPCMProvidedInterface();
			case CorrespondencesPackage.PCM_METHOD: return createPCMMethod();
			case CorrespondencesPackage.SOURCE_CODE_PARAMETER: return createSourceCodeParameter();
			case CorrespondencesPackage.PCM_PARAMETER: return createPCMParameter();
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE: return createComponentCorrespondence();
			case CorrespondencesPackage.METHOD_CORRESPONDENCE: return createMethodCorrespondence();
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE: return createParameterCorrespondence();
			case CorrespondencesPackage.CORRESPONDENCE_MODEL: return createCorrespondenceModel();
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE: return createInterfaceCorrespondence();
			case CorrespondencesPackage.SOURCE_CODE_INTERFACE: return createSourceCodeInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondenceElement createCorrespondenceElement() {
		CorrespondenceElementImpl correspondenceElement = new CorrespondenceElementImpl();
		return correspondenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMComponent createPCMComponent() {
		PCMComponentImpl pcmComponent = new PCMComponentImpl();
		return pcmComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCodeClass createSourceCodeClass() {
		SourceCodeClassImpl sourceCodeClass = new SourceCodeClassImpl();
		return sourceCodeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCodeMethod createSourceCodeMethod() {
		SourceCodeMethodImpl sourceCodeMethod = new SourceCodeMethodImpl();
		return sourceCodeMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMProvidedInterface createPCMProvidedInterface() {
		PCMProvidedInterfaceImpl pcmProvidedInterface = new PCMProvidedInterfaceImpl();
		return pcmProvidedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMMethod createPCMMethod() {
		PCMMethodImpl pcmMethod = new PCMMethodImpl();
		return pcmMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCodeParameter createSourceCodeParameter() {
		SourceCodeParameterImpl sourceCodeParameter = new SourceCodeParameterImpl();
		return sourceCodeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMParameter createPCMParameter() {
		PCMParameterImpl pcmParameter = new PCMParameterImpl();
		return pcmParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentCorrespondence createComponentCorrespondence() {
		ComponentCorrespondenceImpl componentCorrespondence = new ComponentCorrespondenceImpl();
		return componentCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCorrespondence createMethodCorrespondence() {
		MethodCorrespondenceImpl methodCorrespondence = new MethodCorrespondenceImpl();
		return methodCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCorrespondence createParameterCorrespondence() {
		ParameterCorrespondenceImpl parameterCorrespondence = new ParameterCorrespondenceImpl();
		return parameterCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondenceModel createCorrespondenceModel() {
		CorrespondenceModelImpl correspondenceModel = new CorrespondenceModelImpl();
		return correspondenceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceCorrespondence createInterfaceCorrespondence() {
		InterfaceCorrespondenceImpl interfaceCorrespondence = new InterfaceCorrespondenceImpl();
		return interfaceCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCodeInterface createSourceCodeInterface() {
		SourceCodeInterfaceImpl sourceCodeInterface = new SourceCodeInterfaceImpl();
		return sourceCodeInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondencesPackage getCorrespondencesPackage() {
		return (CorrespondencesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorrespondencesPackage getPackage() {
		return CorrespondencesPackage.eINSTANCE;
	}

} //CorrespondencesFactoryImpl
