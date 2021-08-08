/**
 */
package correspondences.impl;

import correspondences.ComponentCorrespondence;
import correspondences.CorrespondenceElement;
import correspondences.CorrespondenceModel;
import correspondences.CorrespondencesFactory;
import correspondences.CorrespondencesPackage;
import correspondences.InterfaceCorrespondence;
import correspondences.MethodCorrespondence;
import correspondences.PCMComponent;
import correspondences.PCMMethod;
import correspondences.PCMParameter;
import correspondences.PCMProvidedInterface;
import correspondences.ParameterCorrespondence;
import correspondences.SourceCodeClass;
import correspondences.SourceCodeInterface;
import correspondences.SourceCodeMethod;
import correspondences.SourceCodeParameter;

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
public class CorrespondencesPackageImpl extends EPackageImpl implements CorrespondencesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correspondenceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceCodeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceCodeMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmProvidedInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceCodeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correspondenceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceCodeInterfaceEClass = null;

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
	 * @see correspondences.CorrespondencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorrespondencesPackageImpl() {
		super(eNS_URI, CorrespondencesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorrespondencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorrespondencesPackage init() {
		if (isInited) return (CorrespondencesPackage)EPackage.Registry.INSTANCE.getEPackage(CorrespondencesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCorrespondencesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CorrespondencesPackageImpl theCorrespondencesPackage = registeredCorrespondencesPackage instanceof CorrespondencesPackageImpl ? (CorrespondencesPackageImpl)registeredCorrespondencesPackage : new CorrespondencesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCorrespondencesPackage.createPackageContents();

		// Initialize created meta-data
		theCorrespondencesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorrespondencesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorrespondencesPackage.eNS_URI, theCorrespondencesPackage);
		return theCorrespondencesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrespondenceElement() {
		return correspondenceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrespondenceElement_Name() {
		return (EAttribute)correspondenceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCMComponent() {
		return pcmComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMComponent_Pcmprovidedinterfaces() {
		return (EReference)pcmComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceCodeClass() {
		return sourceCodeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceCodeClass_Sourcecodemethod() {
		return (EReference)sourceCodeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceCodeMethod() {
		return sourceCodeMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceCodeMethod_Sourcecodeparamter() {
		return (EReference)sourceCodeMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCMProvidedInterface() {
		return pcmProvidedInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMProvidedInterface_Pcmmethod() {
		return (EReference)pcmProvidedInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCMMethod() {
		return pcmMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMMethod_Pcmparameter() {
		return (EReference)pcmMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceCodeParameter() {
		return sourceCodeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCMParameter() {
		return pcmParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentCorrespondence() {
		return componentCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentCorrespondence_Pcmcomponent() {
		return (EReference)componentCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentCorrespondence_Sourcecodeclass() {
		return (EReference)componentCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentCorrespondence_Methodcorrespondence() {
		return (EReference)componentCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodCorrespondence() {
		return methodCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodCorrespondence_Pcmmethod() {
		return (EReference)methodCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodCorrespondence_Sourcecodemethod() {
		return (EReference)methodCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodCorrespondence_Parametercorrespondence() {
		return (EReference)methodCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterCorrespondence() {
		return parameterCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCorrespondence_Sourcecodeparamter() {
		return (EReference)parameterCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCorrespondence_Pcmparameter() {
		return (EReference)parameterCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrespondenceModel() {
		return correspondenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondenceModel_Componentcorrespondence() {
		return (EReference)correspondenceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondenceModel_Interfacecorrespondence() {
		return (EReference)correspondenceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceCorrespondence() {
		return interfaceCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceCorrespondence_Sourcecodeinterface() {
		return (EReference)interfaceCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceCorrespondence_Pcmprovidedinterface() {
		return (EReference)interfaceCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceCorrespondence_Methodcorrespondence() {
		return (EReference)interfaceCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceCodeInterface() {
		return sourceCodeInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceCodeInterface_Sourcecodemethod() {
		return (EReference)sourceCodeInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondencesFactory getCorrespondencesFactory() {
		return (CorrespondencesFactory)getEFactoryInstance();
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
		correspondenceElementEClass = createEClass(CORRESPONDENCE_ELEMENT);
		createEAttribute(correspondenceElementEClass, CORRESPONDENCE_ELEMENT__NAME);

		pcmComponentEClass = createEClass(PCM_COMPONENT);
		createEReference(pcmComponentEClass, PCM_COMPONENT__PCMPROVIDEDINTERFACES);

		sourceCodeClassEClass = createEClass(SOURCE_CODE_CLASS);
		createEReference(sourceCodeClassEClass, SOURCE_CODE_CLASS__SOURCECODEMETHOD);

		sourceCodeMethodEClass = createEClass(SOURCE_CODE_METHOD);
		createEReference(sourceCodeMethodEClass, SOURCE_CODE_METHOD__SOURCECODEPARAMTER);

		pcmProvidedInterfaceEClass = createEClass(PCM_PROVIDED_INTERFACE);
		createEReference(pcmProvidedInterfaceEClass, PCM_PROVIDED_INTERFACE__PCMMETHOD);

		pcmMethodEClass = createEClass(PCM_METHOD);
		createEReference(pcmMethodEClass, PCM_METHOD__PCMPARAMETER);

		sourceCodeParameterEClass = createEClass(SOURCE_CODE_PARAMETER);

		pcmParameterEClass = createEClass(PCM_PARAMETER);

		componentCorrespondenceEClass = createEClass(COMPONENT_CORRESPONDENCE);
		createEReference(componentCorrespondenceEClass, COMPONENT_CORRESPONDENCE__PCMCOMPONENT);
		createEReference(componentCorrespondenceEClass, COMPONENT_CORRESPONDENCE__SOURCECODECLASS);
		createEReference(componentCorrespondenceEClass, COMPONENT_CORRESPONDENCE__METHODCORRESPONDENCE);

		methodCorrespondenceEClass = createEClass(METHOD_CORRESPONDENCE);
		createEReference(methodCorrespondenceEClass, METHOD_CORRESPONDENCE__PCMMETHOD);
		createEReference(methodCorrespondenceEClass, METHOD_CORRESPONDENCE__SOURCECODEMETHOD);
		createEReference(methodCorrespondenceEClass, METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE);

		parameterCorrespondenceEClass = createEClass(PARAMETER_CORRESPONDENCE);
		createEReference(parameterCorrespondenceEClass, PARAMETER_CORRESPONDENCE__SOURCECODEPARAMTER);
		createEReference(parameterCorrespondenceEClass, PARAMETER_CORRESPONDENCE__PCMPARAMETER);

		correspondenceModelEClass = createEClass(CORRESPONDENCE_MODEL);
		createEReference(correspondenceModelEClass, CORRESPONDENCE_MODEL__COMPONENTCORRESPONDENCE);
		createEReference(correspondenceModelEClass, CORRESPONDENCE_MODEL__INTERFACECORRESPONDENCE);

		interfaceCorrespondenceEClass = createEClass(INTERFACE_CORRESPONDENCE);
		createEReference(interfaceCorrespondenceEClass, INTERFACE_CORRESPONDENCE__SOURCECODEINTERFACE);
		createEReference(interfaceCorrespondenceEClass, INTERFACE_CORRESPONDENCE__PCMPROVIDEDINTERFACE);
		createEReference(interfaceCorrespondenceEClass, INTERFACE_CORRESPONDENCE__METHODCORRESPONDENCE);

		sourceCodeInterfaceEClass = createEClass(SOURCE_CODE_INTERFACE);
		createEReference(sourceCodeInterfaceEClass, SOURCE_CODE_INTERFACE__SOURCECODEMETHOD);
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
		pcmComponentEClass.getESuperTypes().add(this.getCorrespondenceElement());
		sourceCodeClassEClass.getESuperTypes().add(this.getCorrespondenceElement());
		sourceCodeMethodEClass.getESuperTypes().add(this.getCorrespondenceElement());
		pcmProvidedInterfaceEClass.getESuperTypes().add(this.getCorrespondenceElement());
		pcmMethodEClass.getESuperTypes().add(this.getCorrespondenceElement());
		sourceCodeParameterEClass.getESuperTypes().add(this.getCorrespondenceElement());
		pcmParameterEClass.getESuperTypes().add(this.getCorrespondenceElement());
		componentCorrespondenceEClass.getESuperTypes().add(this.getCorrespondenceElement());
		methodCorrespondenceEClass.getESuperTypes().add(this.getCorrespondenceElement());
		parameterCorrespondenceEClass.getESuperTypes().add(this.getCorrespondenceElement());
		interfaceCorrespondenceEClass.getESuperTypes().add(this.getCorrespondenceElement());
		sourceCodeInterfaceEClass.getESuperTypes().add(this.getCorrespondenceElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(correspondenceElementEClass, CorrespondenceElement.class, "CorrespondenceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCorrespondenceElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CorrespondenceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcmComponentEClass, PCMComponent.class, "PCMComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCMComponent_Pcmprovidedinterfaces(), this.getPCMProvidedInterface(), null, "pcmprovidedinterfaces", null, 0, -1, PCMComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceCodeClassEClass, SourceCodeClass.class, "SourceCodeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceCodeClass_Sourcecodemethod(), this.getSourceCodeMethod(), null, "sourcecodemethod", null, 0, -1, SourceCodeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceCodeMethodEClass, SourceCodeMethod.class, "SourceCodeMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceCodeMethod_Sourcecodeparamter(), this.getSourceCodeParameter(), null, "sourcecodeparamter", null, 0, -1, SourceCodeMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcmProvidedInterfaceEClass, PCMProvidedInterface.class, "PCMProvidedInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCMProvidedInterface_Pcmmethod(), this.getPCMMethod(), null, "pcmmethod", null, 0, -1, PCMProvidedInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcmMethodEClass, PCMMethod.class, "PCMMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCMMethod_Pcmparameter(), this.getPCMParameter(), null, "pcmparameter", null, 0, -1, PCMMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceCodeParameterEClass, SourceCodeParameter.class, "SourceCodeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcmParameterEClass, PCMParameter.class, "PCMParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentCorrespondenceEClass, ComponentCorrespondence.class, "ComponentCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentCorrespondence_Pcmcomponent(), this.getPCMComponent(), null, "pcmcomponent", null, 1, 1, ComponentCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentCorrespondence_Sourcecodeclass(), this.getSourceCodeClass(), null, "sourcecodeclass", null, 1, 1, ComponentCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentCorrespondence_Methodcorrespondence(), this.getMethodCorrespondence(), null, "methodcorrespondence", null, 0, -1, ComponentCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodCorrespondenceEClass, MethodCorrespondence.class, "MethodCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodCorrespondence_Pcmmethod(), this.getPCMMethod(), null, "pcmmethod", null, 0, -1, MethodCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodCorrespondence_Sourcecodemethod(), this.getSourceCodeMethod(), null, "sourcecodemethod", null, 0, -1, MethodCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodCorrespondence_Parametercorrespondence(), this.getParameterCorrespondence(), null, "parametercorrespondence", null, 0, -1, MethodCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterCorrespondenceEClass, ParameterCorrespondence.class, "ParameterCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterCorrespondence_Sourcecodeparamter(), this.getSourceCodeParameter(), null, "sourcecodeparamter", null, 0, -1, ParameterCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterCorrespondence_Pcmparameter(), this.getPCMParameter(), null, "pcmparameter", null, 0, -1, ParameterCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(correspondenceModelEClass, CorrespondenceModel.class, "CorrespondenceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorrespondenceModel_Componentcorrespondence(), this.getComponentCorrespondence(), null, "componentcorrespondence", null, 0, -1, CorrespondenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondenceModel_Interfacecorrespondence(), this.getInterfaceCorrespondence(), null, "interfacecorrespondence", null, 0, -1, CorrespondenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceCorrespondenceEClass, InterfaceCorrespondence.class, "InterfaceCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceCorrespondence_Sourcecodeinterface(), this.getSourceCodeInterface(), null, "sourcecodeinterface", null, 1, -1, InterfaceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceCorrespondence_Pcmprovidedinterface(), this.getPCMProvidedInterface(), null, "pcmprovidedinterface", null, 0, 1, InterfaceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceCorrespondence_Methodcorrespondence(), this.getMethodCorrespondence(), null, "methodcorrespondence", null, 0, -1, InterfaceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceCodeInterfaceEClass, SourceCodeInterface.class, "SourceCodeInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceCodeInterface_Sourcecodemethod(), this.getSourceCodeMethod(), null, "sourcecodemethod", null, 0, -1, SourceCodeInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CorrespondencesPackageImpl
