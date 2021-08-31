/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel;

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
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.DataSet2SecurityLevelImpl <em>Data Set2 Security Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.DataSet2SecurityLevelImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getDataSet2SecurityLevel()
	 * @generated
	 */
	int DATA_SET2_SECURITY_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Security Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET2_SECURITY_LEVEL__SECURITY_LEVELS = 0;

	/**
	 * The feature id for the '<em><b>Conf4cbsedataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET2_SECURITY_LEVEL__CONF4CBSEDATASET = 1;

	/**
	 * The number of structural features of the '<em>Data Set2 Security Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET2_SECURITY_LEVEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Set2 Security Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET2_SECURITY_LEVEL_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Joana Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Conf4cbseparametersanddatapair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_AND_DATA_PAIR2_ANNOTATION__CONF4CBSEPARAMETERSANDDATAPAIR = 1;

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
	 * The feature id for the '<em><b>Parametersanddatapair2annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CORRESPONDENCE_MODEL__PARAMETERSANDDATAPAIR2ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Dataset2securitylevel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CORRESPONDENCE_MODEL__DATASET2SECURITYLEVEL = 1;

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
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Conf4CBSEElementImpl <em>Conf4 CBSE Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Conf4CBSEElementImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getConf4CBSEElement()
	 * @generated
	 */
	int CONF4_CBSE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF4_CBSE_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Conf4 CBSE Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF4_CBSE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Conf4 CBSE Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF4_CBSE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Conf4CBSEParametersAndDataPairImpl <em>Conf4 CBSE Parameters And Data Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Conf4CBSEParametersAndDataPairImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getConf4CBSEParametersAndDataPair()
	 * @generated
	 */
	int CONF4_CBSE_PARAMETERS_AND_DATA_PAIR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF4_CBSE_PARAMETERS_AND_DATA_PAIR__ID = CONF4_CBSE_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Conf4 CBSE Parameters And Data Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF4_CBSE_PARAMETERS_AND_DATA_PAIR_FEATURE_COUNT = CONF4_CBSE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conf4 CBSE Parameters And Data Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF4_CBSE_PARAMETERS_AND_DATA_PAIR_OPERATION_COUNT = CONF4_CBSE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Conf4CBSEDataSetImpl <em>Conf4 CBSE Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Conf4CBSEDataSetImpl
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getConf4CBSEDataSet()
	 * @generated
	 */
	int CONF4_CBSE_DATA_SET = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF4_CBSE_DATA_SET__ID = CONF4_CBSE_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Conf4 CBSE Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF4_CBSE_DATA_SET_FEATURE_COUNT = CONF4_CBSE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conf4 CBSE Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF4_CBSE_DATA_SET_OPERATION_COUNT = CONF4_CBSE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel <em>Data Set2 Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set2 Security Level</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel
	 * @generated
	 */
	EClass getDataSet2SecurityLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel#getSecurityLevels <em>Security Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Levels</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel#getSecurityLevels()
	 * @see #getDataSet2SecurityLevel()
	 * @generated
	 */
	EReference getDataSet2SecurityLevel_SecurityLevels();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel#getConf4cbsedataset <em>Conf4cbsedataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conf4cbsedataset</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel#getConf4cbsedataset()
	 * @see #getDataSet2SecurityLevel()
	 * @generated
	 */
	EReference getDataSet2SecurityLevel_Conf4cbsedataset();

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
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getJoanaAnnotation <em>Joana Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Joana Annotation</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getJoanaAnnotation()
	 * @see #getParametersAndDataPair2Annotation()
	 * @generated
	 */
	EReference getParametersAndDataPair2Annotation_JoanaAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getConf4cbseparametersanddatapair <em>Conf4cbseparametersanddatapair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conf4cbseparametersanddatapair</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getConf4cbseparametersanddatapair()
	 * @see #getParametersAndDataPair2Annotation()
	 * @generated
	 */
	EReference getParametersAndDataPair2Annotation_Conf4cbseparametersanddatapair();

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
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel#getDataset2securitylevel <em>Dataset2securitylevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset2securitylevel</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel#getDataset2securitylevel()
	 * @see #getSecurityCorrespondenceModel()
	 * @generated
	 */
	EReference getSecurityCorrespondenceModel_Dataset2securitylevel();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEParametersAndDataPair <em>Conf4 CBSE Parameters And Data Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conf4 CBSE Parameters And Data Pair</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEParametersAndDataPair
	 * @generated
	 */
	EClass getConf4CBSEParametersAndDataPair();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEElement <em>Conf4 CBSE Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conf4 CBSE Element</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEElement
	 * @generated
	 */
	EClass getConf4CBSEElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEElement#getId()
	 * @see #getConf4CBSEElement()
	 * @generated
	 */
	EAttribute getConf4CBSEElement_Id();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEDataSet <em>Conf4 CBSE Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conf4 CBSE Data Set</em>'.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEDataSet
	 * @generated
	 */
	EClass getConf4CBSEDataSet();

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
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.DataSet2SecurityLevelImpl <em>Data Set2 Security Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.DataSet2SecurityLevelImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getDataSet2SecurityLevel()
		 * @generated
		 */
		EClass DATA_SET2_SECURITY_LEVEL = eINSTANCE.getDataSet2SecurityLevel();

		/**
		 * The meta object literal for the '<em><b>Security Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET2_SECURITY_LEVEL__SECURITY_LEVELS = eINSTANCE.getDataSet2SecurityLevel_SecurityLevels();

		/**
		 * The meta object literal for the '<em><b>Conf4cbsedataset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET2_SECURITY_LEVEL__CONF4CBSEDATASET = eINSTANCE.getDataSet2SecurityLevel_Conf4cbsedataset();

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
		 * The meta object literal for the '<em><b>Joana Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION = eINSTANCE.getParametersAndDataPair2Annotation_JoanaAnnotation();

		/**
		 * The meta object literal for the '<em><b>Conf4cbseparametersanddatapair</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERS_AND_DATA_PAIR2_ANNOTATION__CONF4CBSEPARAMETERSANDDATAPAIR = eINSTANCE.getParametersAndDataPair2Annotation_Conf4cbseparametersanddatapair();

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
		 * The meta object literal for the '<em><b>Parametersanddatapair2annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CORRESPONDENCE_MODEL__PARAMETERSANDDATAPAIR2ANNOTATION = eINSTANCE.getSecurityCorrespondenceModel_Parametersanddatapair2annotation();

		/**
		 * The meta object literal for the '<em><b>Dataset2securitylevel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CORRESPONDENCE_MODEL__DATASET2SECURITYLEVEL = eINSTANCE.getSecurityCorrespondenceModel_Dataset2securitylevel();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Conf4CBSEParametersAndDataPairImpl <em>Conf4 CBSE Parameters And Data Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Conf4CBSEParametersAndDataPairImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getConf4CBSEParametersAndDataPair()
		 * @generated
		 */
		EClass CONF4_CBSE_PARAMETERS_AND_DATA_PAIR = eINSTANCE.getConf4CBSEParametersAndDataPair();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Conf4CBSEElementImpl <em>Conf4 CBSE Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Conf4CBSEElementImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getConf4CBSEElement()
		 * @generated
		 */
		EClass CONF4_CBSE_ELEMENT = eINSTANCE.getConf4CBSEElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONF4_CBSE_ELEMENT__ID = eINSTANCE.getConf4CBSEElement_Id();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Conf4CBSEDataSetImpl <em>Conf4 CBSE Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Conf4CBSEDataSetImpl
		 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelPackageImpl#getConf4CBSEDataSet()
		 * @generated
		 */
		EClass CONF4_CBSE_DATA_SET = eINSTANCE.getConf4CBSEDataSet();

	}

} //SecuritycorrespondencemodelPackage
