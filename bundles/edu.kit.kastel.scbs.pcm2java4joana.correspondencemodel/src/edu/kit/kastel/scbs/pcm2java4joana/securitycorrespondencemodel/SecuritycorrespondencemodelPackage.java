/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel;

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
 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelFactory
 * @model kind="package"
 * @generated
 */
public interface SecuritycorrespondencemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "securitycorrespondencemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.example.org/securitycorrespondencemodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "securitycorrespondencemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecuritycorrespondencemodelPackage eINSTANCE = edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Adversary2SecurityLevelImpl <em>Adversary2 Security Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Adversary2SecurityLevelImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getAdversary2SecurityLevel()
	 * @generated
	 */
	int ADVERSARY2_SECURITY_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Security Levels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARY2_SECURITY_LEVEL__SECURITY_LEVELS = 0;

	/**
	 * The feature id for the '<em><b>Adversaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARY2_SECURITY_LEVEL__ADVERSARIES = 1;

	/**
	 * The number of structural features of the '<em>Adversary2 Security Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARY2_SECURITY_LEVEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Adversary2 Security Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERSARY2_SECURITY_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.ParametersAndDataPair2AnnotationImpl <em>Parameters And Data Pair2 Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.ParametersAndDataPair2AnnotationImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getParametersAndDataPair2Annotation()
	 * @generated
	 */
	int PARAMETERS_AND_DATA_PAIR2_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Joana Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Parameters And Data Pair</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_AND_DATA_PAIR2_ANNOTATION__PARAMETERS_AND_DATA_PAIR = 1;

	/**
	 * The number of structural features of the '<em>Parameters And Data Pair2 Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_AND_DATA_PAIR2_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameters And Data Pair2 Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_AND_DATA_PAIR2_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecurityCorrespondenceModelImpl <em>Security Correspondence Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecurityCorrespondenceModelImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getSecurityCorrespondenceModel()
	 * @generated
	 */
	int SECURITY_CORRESPONDENCE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Adversary2securitylevel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CORRESPONDENCE_MODEL__ADVERSARY2SECURITYLEVEL = 0;

	/**
	 * The feature id for the '<em><b>Parametersanddatapair2annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CORRESPONDENCE_MODEL__PARAMETERSANDDATAPAIR2ANNOTATION = 1;

	/**
	 * The number of structural features of the '<em>Security Correspondence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CORRESPONDENCE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Correspondence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CORRESPONDENCE_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel <em>Adversary2 Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adversary2 Security Level</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel
	 * @generated
	 */
	EClass getAdversary2SecurityLevel();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel#getSecurityLevels <em>Security Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Levels</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel#getSecurityLevels()
	 * @see #getAdversary2SecurityLevel()
	 * @generated
	 */
	EReference getAdversary2SecurityLevel_SecurityLevels();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel#getAdversaries <em>Adversaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adversaries</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel#getAdversaries()
	 * @see #getAdversary2SecurityLevel()
	 * @generated
	 */
	EReference getAdversary2SecurityLevel_Adversaries();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation <em>Parameters And Data Pair2 Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters And Data Pair2 Annotation</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation
	 * @generated
	 */
	EClass getParametersAndDataPair2Annotation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getJoanaAnnotation <em>Joana Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Joana Annotation</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getJoanaAnnotation()
	 * @see #getParametersAndDataPair2Annotation()
	 * @generated
	 */
	EReference getParametersAndDataPair2Annotation_JoanaAnnotation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getParametersAndDataPair <em>Parameters And Data Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameters And Data Pair</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getParametersAndDataPair()
	 * @see #getParametersAndDataPair2Annotation()
	 * @generated
	 */
	EReference getParametersAndDataPair2Annotation_ParametersAndDataPair();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel <em>Security Correspondence Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Correspondence Model</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel
	 * @generated
	 */
	EClass getSecurityCorrespondenceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel#getAdversary2securitylevel <em>Adversary2securitylevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adversary2securitylevel</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel#getAdversary2securitylevel()
	 * @see #getSecurityCorrespondenceModel()
	 * @generated
	 */
	EReference getSecurityCorrespondenceModel_Adversary2securitylevel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel#getParametersanddatapair2annotation <em>Parametersanddatapair2annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametersanddatapair2annotation</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel#getParametersanddatapair2annotation()
	 * @see #getSecurityCorrespondenceModel()
	 * @generated
	 */
	EReference getSecurityCorrespondenceModel_Parametersanddatapair2annotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecuritycorrespondencemodelFactory getSecuritycorrespondencemodelFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Adversary2SecurityLevelImpl <em>Adversary2 Security Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Adversary2SecurityLevelImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getAdversary2SecurityLevel()
		 * @generated
		 */
		EClass ADVERSARY2_SECURITY_LEVEL = eINSTANCE.getAdversary2SecurityLevel();

		/**
		 * The meta object literal for the '<em><b>Security Levels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVERSARY2_SECURITY_LEVEL__SECURITY_LEVELS = eINSTANCE.getAdversary2SecurityLevel_SecurityLevels();

		/**
		 * The meta object literal for the '<em><b>Adversaries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVERSARY2_SECURITY_LEVEL__ADVERSARIES = eINSTANCE.getAdversary2SecurityLevel_Adversaries();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.ParametersAndDataPair2AnnotationImpl <em>Parameters And Data Pair2 Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.ParametersAndDataPair2AnnotationImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getParametersAndDataPair2Annotation()
		 * @generated
		 */
		EClass PARAMETERS_AND_DATA_PAIR2_ANNOTATION = eINSTANCE.getParametersAndDataPair2Annotation();

		/**
		 * The meta object literal for the '<em><b>Joana Annotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION = eINSTANCE.getParametersAndDataPair2Annotation_JoanaAnnotation();

		/**
		 * The meta object literal for the '<em><b>Parameters And Data Pair</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERS_AND_DATA_PAIR2_ANNOTATION__PARAMETERS_AND_DATA_PAIR = eINSTANCE.getParametersAndDataPair2Annotation_ParametersAndDataPair();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecurityCorrespondenceModelImpl <em>Security Correspondence Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecurityCorrespondenceModelImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getSecurityCorrespondenceModel()
		 * @generated
		 */
		EClass SECURITY_CORRESPONDENCE_MODEL = eINSTANCE.getSecurityCorrespondenceModel();

		/**
		 * The meta object literal for the '<em><b>Adversary2securitylevel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CORRESPONDENCE_MODEL__ADVERSARY2SECURITYLEVEL = eINSTANCE.getSecurityCorrespondenceModel_Adversary2securitylevel();

		/**
		 * The meta object literal for the '<em><b>Parametersanddatapair2annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CORRESPONDENCE_MODEL__PARAMETERSANDDATAPAIR2ANNOTATION = eINSTANCE.getSecurityCorrespondenceModel_Parametersanddatapair2annotation();

	}

} //SecuritycorrespondencemodelPackage
