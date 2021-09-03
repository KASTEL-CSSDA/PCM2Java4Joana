/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage;

import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEDataSet;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEElement;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEParametersAndDataPair;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelFactory;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecuritycorrespondencemodelPackageImpl extends EPackageImpl implements SecuritycorrespondencemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSet2SecurityLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersAndDataPair2AnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityCorrespondenceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conf4CBSEParametersAndDataPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conf4CBSEElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conf4CBSEDataSetEClass = null;

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
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecuritycorrespondencemodelPackageImpl() {
		super(eNS_URI, SecuritycorrespondencemodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SecuritycorrespondencemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecuritycorrespondencemodelPackage init() {
		if (isInited) return (SecuritycorrespondencemodelPackage)EPackage.Registry.INSTANCE.getEPackage(SecuritycorrespondencemodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSecuritycorrespondencemodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SecuritycorrespondencemodelPackageImpl theSecuritycorrespondencemodelPackage = registeredSecuritycorrespondencemodelPackage instanceof SecuritycorrespondencemodelPackageImpl ? (SecuritycorrespondencemodelPackageImpl)registeredSecuritycorrespondencemodelPackage : new SecuritycorrespondencemodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		JoanaPackage.eINSTANCE.eClass();
		SourcecodePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSecuritycorrespondencemodelPackage.createPackageContents();

		// Initialize created meta-data
		theSecuritycorrespondencemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecuritycorrespondencemodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecuritycorrespondencemodelPackage.eNS_URI, theSecuritycorrespondencemodelPackage);
		return theSecuritycorrespondencemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSet2SecurityLevel() {
		return dataSet2SecurityLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSet2SecurityLevel_SecurityLevels() {
		return (EReference)dataSet2SecurityLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSet2SecurityLevel_Conf4cbsedataset() {
		return (EReference)dataSet2SecurityLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametersAndDataPair2Annotation() {
		return parametersAndDataPair2AnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersAndDataPair2Annotation_JoanaAnnotation() {
		return (EReference)parametersAndDataPair2AnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersAndDataPair2Annotation_Conf4cbseparametersanddatapair() {
		return (EReference)parametersAndDataPair2AnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityCorrespondenceModel() {
		return securityCorrespondenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityCorrespondenceModel_Parametersanddatapair2annotation() {
		return (EReference)securityCorrespondenceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityCorrespondenceModel_Dataset2securitylevel() {
		return (EReference)securityCorrespondenceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConf4CBSEParametersAndDataPair() {
		return conf4CBSEParametersAndDataPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConf4CBSEElement() {
		return conf4CBSEElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConf4CBSEElement_Id() {
		return (EAttribute)conf4CBSEElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConf4CBSEDataSet() {
		return conf4CBSEDataSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritycorrespondencemodelFactory getSecuritycorrespondencemodelFactory() {
		return (SecuritycorrespondencemodelFactory)getEFactoryInstance();
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
		dataSet2SecurityLevelEClass = createEClass(DATA_SET2_SECURITY_LEVEL);
		createEReference(dataSet2SecurityLevelEClass, DATA_SET2_SECURITY_LEVEL__SECURITY_LEVELS);
		createEReference(dataSet2SecurityLevelEClass, DATA_SET2_SECURITY_LEVEL__CONF4CBSEDATASET);

		parametersAndDataPair2AnnotationEClass = createEClass(PARAMETERS_AND_DATA_PAIR2_ANNOTATION);
		createEReference(parametersAndDataPair2AnnotationEClass, PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION);
		createEReference(parametersAndDataPair2AnnotationEClass, PARAMETERS_AND_DATA_PAIR2_ANNOTATION__CONF4CBSEPARAMETERSANDDATAPAIR);

		securityCorrespondenceModelEClass = createEClass(SECURITY_CORRESPONDENCE_MODEL);
		createEReference(securityCorrespondenceModelEClass, SECURITY_CORRESPONDENCE_MODEL__PARAMETERSANDDATAPAIR2ANNOTATION);
		createEReference(securityCorrespondenceModelEClass, SECURITY_CORRESPONDENCE_MODEL__DATASET2SECURITYLEVEL);

		conf4CBSEParametersAndDataPairEClass = createEClass(CONF4_CBSE_PARAMETERS_AND_DATA_PAIR);

		conf4CBSEElementEClass = createEClass(CONF4_CBSE_ELEMENT);
		createEAttribute(conf4CBSEElementEClass, CONF4_CBSE_ELEMENT__ID);

		conf4CBSEDataSetEClass = createEClass(CONF4_CBSE_DATA_SET);
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
		JoanaPackage theJoanaPackage = (JoanaPackage)EPackage.Registry.INSTANCE.getEPackage(JoanaPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		conf4CBSEParametersAndDataPairEClass.getESuperTypes().add(this.getConf4CBSEElement());
		conf4CBSEDataSetEClass.getESuperTypes().add(this.getConf4CBSEElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataSet2SecurityLevelEClass, DataSet2SecurityLevel.class, "DataSet2SecurityLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSet2SecurityLevel_SecurityLevels(), theJoanaPackage.getSecurityLevel(), null, "securityLevels", null, 1, -1, DataSet2SecurityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSet2SecurityLevel_Conf4cbsedataset(), this.getConf4CBSEDataSet(), null, "conf4cbsedataset", null, 1, -1, DataSet2SecurityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametersAndDataPair2AnnotationEClass, ParametersAndDataPair2Annotation.class, "ParametersAndDataPair2Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametersAndDataPair2Annotation_JoanaAnnotation(), theJoanaPackage.getAnnotation(), null, "joanaAnnotation", null, 1, 1, ParametersAndDataPair2Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParametersAndDataPair2Annotation_Conf4cbseparametersanddatapair(), this.getConf4CBSEParametersAndDataPair(), null, "conf4cbseparametersanddatapair", null, 1, 1, ParametersAndDataPair2Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityCorrespondenceModelEClass, SecurityCorrespondenceModel.class, "SecurityCorrespondenceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityCorrespondenceModel_Parametersanddatapair2annotation(), this.getParametersAndDataPair2Annotation(), null, "parametersanddatapair2annotation", null, 0, -1, SecurityCorrespondenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityCorrespondenceModel_Dataset2securitylevel(), this.getDataSet2SecurityLevel(), null, "dataset2securitylevel", null, 0, -1, SecurityCorrespondenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conf4CBSEParametersAndDataPairEClass, Conf4CBSEParametersAndDataPair.class, "Conf4CBSEParametersAndDataPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conf4CBSEElementEClass, Conf4CBSEElement.class, "Conf4CBSEElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConf4CBSEElement_Id(), theEcorePackage.getEString(), "id", null, 1, 1, Conf4CBSEElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conf4CBSEDataSetEClass, Conf4CBSEDataSet.class, "Conf4CBSEDataSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SecuritycorrespondencemodelPackageImpl
