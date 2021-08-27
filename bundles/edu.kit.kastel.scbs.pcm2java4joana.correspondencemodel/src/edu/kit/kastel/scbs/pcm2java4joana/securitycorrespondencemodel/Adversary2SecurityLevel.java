/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel;

import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adversary2 Security Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel#getSecurityLevels <em>Security Levels</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel#getConf4cbseadversary <em>Conf4cbseadversary</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getAdversary2SecurityLevel()
 * @model
 * @generated
 */
public interface Adversary2SecurityLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Levels</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Levels</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getAdversary2SecurityLevel_SecurityLevels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SecurityLevel> getSecurityLevels();

	/**
	 * Returns the value of the '<em><b>Conf4cbseadversary</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEAdversary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf4cbseadversary</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getAdversary2SecurityLevel_Conf4cbseadversary()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Conf4CBSEAdversary> getConf4cbseadversary();

} // Adversary2SecurityLevel
