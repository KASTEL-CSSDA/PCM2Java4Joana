/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage
 * @generated
 */
public interface SecuritycorrespondencemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecuritycorrespondencemodelFactory eINSTANCE = edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecuritycorrespondencemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adversary2 Security Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adversary2 Security Level</em>'.
	 * @generated
	 */
	Adversary2SecurityLevel createAdversary2SecurityLevel();

	/**
	 * Returns a new object of class '<em>Parameters And Data Pair2 Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameters And Data Pair2 Annotation</em>'.
	 * @generated
	 */
	ParametersAndDataPair2Annotation createParametersAndDataPair2Annotation();

	/**
	 * Returns a new object of class '<em>Security Correspondence Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Correspondence Model</em>'.
	 * @generated
	 */
	SecurityCorrespondenceModel createSecurityCorrespondenceModel();

	/**
	 * Returns a new object of class '<em>Conf4 CBSE Parameters And Data Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conf4 CBSE Parameters And Data Pair</em>'.
	 * @generated
	 */
	Conf4CBSEParametersAndDataPair createConf4CBSEParametersAndDataPair();

	/**
	 * Returns a new object of class '<em>Conf4 CBSE Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conf4 CBSE Element</em>'.
	 * @generated
	 */
	Conf4CBSEElement createConf4CBSEElement();

	/**
	 * Returns a new object of class '<em>Conf4 CBSE Adversary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conf4 CBSE Adversary</em>'.
	 * @generated
	 */
	Conf4CBSEAdversary createConf4CBSEAdversary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecuritycorrespondencemodelPackage getSecuritycorrespondencemodelPackage();

} //SecuritycorrespondencemodelFactory
