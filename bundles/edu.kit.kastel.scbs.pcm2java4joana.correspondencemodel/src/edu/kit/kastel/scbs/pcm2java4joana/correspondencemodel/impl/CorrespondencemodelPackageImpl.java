/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelFactory;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorrespondencemodelPackageImpl extends EPackageImpl implements CorrespondencemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass component2ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface2InterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operation2MethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameter2ParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralCorrespondenceModelEClass = null;

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
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorrespondencemodelPackageImpl() {
		super(eNS_URI, CorrespondencemodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorrespondencemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorrespondencemodelPackage init() {
		if (isInited) return (CorrespondencemodelPackage)EPackage.Registry.INSTANCE.getEPackage(CorrespondencemodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCorrespondencemodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CorrespondencemodelPackageImpl theCorrespondencemodelPackage = registeredCorrespondencemodelPackage instanceof CorrespondencemodelPackageImpl ? (CorrespondencemodelPackageImpl)registeredCorrespondencemodelPackage : new CorrespondencemodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		SourcecodePackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		tools.mdsd.modelingfoundations.identifier.IdentifierPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCorrespondencemodelPackage.createPackageContents();

		// Initialize created meta-data
		theCorrespondencemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorrespondencemodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorrespondencemodelPackage.eNS_URI, theCorrespondencemodelPackage);
		return theCorrespondencemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent2Class() {
		return component2ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent2Class_JavaClass() {
		return (EReference)component2ClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent2Class_Interface2interface() {
		return (EReference)component2ClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent2Class_Pcmcomponent() {
		return (EReference)component2ClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface2Interface() {
		return interface2InterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface2Interface_JavaInterface() {
		return (EReference)interface2InterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface2Interface_Operation2method() {
		return (EReference)interface2InterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface2Interface_Pcminterface() {
		return (EReference)interface2InterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation2Method() {
		return operation2MethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation2Method_JavaMethod() {
		return (EReference)operation2MethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation2Method_Parameter2parameter() {
		return (EReference)operation2MethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation2Method_Pcmoperation() {
		return (EReference)operation2MethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter2Parameter() {
		return parameter2ParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter2Parameter_JavaParameter() {
		return (EReference)parameter2ParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter2Parameter_Pcmparameter() {
		return (EReference)parameter2ParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralCorrespondenceModel() {
		return structuralCorrespondenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralCorrespondenceModel_Component2class() {
		return (EReference)structuralCorrespondenceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondencemodelFactory getCorrespondencemodelFactory() {
		return (CorrespondencemodelFactory)getEFactoryInstance();
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
		component2ClassEClass = createEClass(COMPONENT2_CLASS);
		createEReference(component2ClassEClass, COMPONENT2_CLASS__JAVA_CLASS);
		createEReference(component2ClassEClass, COMPONENT2_CLASS__INTERFACE2INTERFACE);
		createEReference(component2ClassEClass, COMPONENT2_CLASS__PCMCOMPONENT);

		interface2InterfaceEClass = createEClass(INTERFACE2_INTERFACE);
		createEReference(interface2InterfaceEClass, INTERFACE2_INTERFACE__JAVA_INTERFACE);
		createEReference(interface2InterfaceEClass, INTERFACE2_INTERFACE__OPERATION2METHOD);
		createEReference(interface2InterfaceEClass, INTERFACE2_INTERFACE__PCMINTERFACE);

		operation2MethodEClass = createEClass(OPERATION2_METHOD);
		createEReference(operation2MethodEClass, OPERATION2_METHOD__JAVA_METHOD);
		createEReference(operation2MethodEClass, OPERATION2_METHOD__PARAMETER2PARAMETER);
		createEReference(operation2MethodEClass, OPERATION2_METHOD__PCMOPERATION);

		parameter2ParameterEClass = createEClass(PARAMETER2_PARAMETER);
		createEReference(parameter2ParameterEClass, PARAMETER2_PARAMETER__JAVA_PARAMETER);
		createEReference(parameter2ParameterEClass, PARAMETER2_PARAMETER__PCMPARAMETER);

		structuralCorrespondenceModelEClass = createEClass(STRUCTURAL_CORRESPONDENCE_MODEL);
		createEReference(structuralCorrespondenceModelEClass, STRUCTURAL_CORRESPONDENCE_MODEL__COMPONENT2CLASS);
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

		// Obtain other dependent packages
		SourcecodePackage theSourcecodePackage = (SourcecodePackage)EPackage.Registry.INSTANCE.getEPackage(SourcecodePackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(component2ClassEClass, Component2Class.class, "Component2Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent2Class_JavaClass(), theSourcecodePackage.getClass_(), null, "javaClass", null, 1, 1, Component2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent2Class_Interface2interface(), this.getInterface2Interface(), null, "interface2interface", null, 0, -1, Component2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent2Class_Pcmcomponent(), theRepositoryPackage.getBasicComponent(), null, "pcmcomponent", null, 1, 1, Component2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interface2InterfaceEClass, Interface2Interface.class, "Interface2Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface2Interface_JavaInterface(), theSourcecodePackage.getInterface(), null, "javaInterface", null, 1, 1, Interface2Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface2Interface_Operation2method(), this.getOperation2Method(), null, "operation2method", null, 0, -1, Interface2Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface2Interface_Pcminterface(), theRepositoryPackage.getInterface(), null, "pcminterface", null, 1, 1, Interface2Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operation2MethodEClass, Operation2Method.class, "Operation2Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation2Method_JavaMethod(), theSourcecodePackage.getMethod(), null, "javaMethod", null, 1, 1, Operation2Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation2Method_Parameter2parameter(), this.getParameter2Parameter(), null, "parameter2parameter", null, 0, -1, Operation2Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation2Method_Pcmoperation(), theRepositoryPackage.getOperationSignature(), null, "pcmoperation", null, 1, 1, Operation2Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameter2ParameterEClass, Parameter2Parameter.class, "Parameter2Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter2Parameter_JavaParameter(), theSourcecodePackage.getParameter(), null, "javaParameter", null, 1, 1, Parameter2Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter2Parameter_Pcmparameter(), theRepositoryPackage.getParameter(), null, "pcmparameter", null, 1, 1, Parameter2Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralCorrespondenceModelEClass, StructuralCorrespondenceModel.class, "StructuralCorrespondenceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuralCorrespondenceModel_Component2class(), this.getComponent2Class(), null, "component2class", null, 0, -1, StructuralCorrespondenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CorrespondencemodelPackageImpl
