/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.*;

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
public class SecuritycorrespondencemodelFactoryImpl extends EFactoryImpl implements SecuritycorrespondencemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecuritycorrespondencemodelFactory init() {
		try {
			SecuritycorrespondencemodelFactory theSecuritycorrespondencemodelFactory = (SecuritycorrespondencemodelFactory)EPackage.Registry.INSTANCE.getEFactory(SecuritycorrespondencemodelPackage.eNS_URI);
			if (theSecuritycorrespondencemodelFactory != null) {
				return theSecuritycorrespondencemodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecuritycorrespondencemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritycorrespondencemodelFactoryImpl() {
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
			case SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL: return createDataSet2SecurityLevel();
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION: return createParametersAndDataPair2Annotation();
			case SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL: return createSecurityCorrespondenceModel();
			case SecuritycorrespondencemodelPackage.CONF4_CBSE_PARAMETERS_AND_DATA_PAIR: return createConf4CBSEParametersAndDataPair();
			case SecuritycorrespondencemodelPackage.CONF4_CBSE_ELEMENT: return createConf4CBSEElement();
			case SecuritycorrespondencemodelPackage.CONF4_CBSE_DATA_SET: return createConf4CBSEDataSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet2SecurityLevel createDataSet2SecurityLevel() {
		DataSet2SecurityLevelImpl dataSet2SecurityLevel = new DataSet2SecurityLevelImpl();
		return dataSet2SecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersAndDataPair2Annotation createParametersAndDataPair2Annotation() {
		ParametersAndDataPair2AnnotationImpl parametersAndDataPair2Annotation = new ParametersAndDataPair2AnnotationImpl();
		return parametersAndDataPair2Annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityCorrespondenceModel createSecurityCorrespondenceModel() {
		SecurityCorrespondenceModelImpl securityCorrespondenceModel = new SecurityCorrespondenceModelImpl();
		return securityCorrespondenceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conf4CBSEParametersAndDataPair createConf4CBSEParametersAndDataPair() {
		Conf4CBSEParametersAndDataPairImpl conf4CBSEParametersAndDataPair = new Conf4CBSEParametersAndDataPairImpl();
		return conf4CBSEParametersAndDataPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conf4CBSEElement createConf4CBSEElement() {
		Conf4CBSEElementImpl conf4CBSEElement = new Conf4CBSEElementImpl();
		return conf4CBSEElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conf4CBSEDataSet createConf4CBSEDataSet() {
		Conf4CBSEDataSetImpl conf4CBSEDataSet = new Conf4CBSEDataSetImpl();
		return conf4CBSEDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritycorrespondencemodelPackage getSecuritycorrespondencemodelPackage() {
		return (SecuritycorrespondencemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecuritycorrespondencemodelPackage getPackage() {
		return SecuritycorrespondencemodelPackage.eINSTANCE;
	}

} //SecuritycorrespondencemodelFactoryImpl
