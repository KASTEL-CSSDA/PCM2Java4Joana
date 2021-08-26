/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel;

import edu.kit.kastel.scbs.confidentiality.adversary.Adversary;

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
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel#getAdversaries <em>Adversaries</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getAdversary2SecurityLevel()
 * @model
 * @generated
 */
public interface Adversary2SecurityLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Levels</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Levels</em>' reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getAdversary2SecurityLevel_SecurityLevels()
	 * @model required="true"
	 * @generated
	 */
	EList<SecurityLevel> getSecurityLevels();

	/**
	 * Returns the value of the '<em><b>Adversaries</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.confidentiality.adversary.Adversary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adversaries</em>' reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getAdversary2SecurityLevel_Adversaries()
	 * @model required="true"
	 * @generated
	 */
	EList<Adversary> getAdversaries();

} // Adversary2SecurityLevel
