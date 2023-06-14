/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel;

import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set2 Security Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel#getSecurityLevels <em>Security Levels</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel#getConf4cbsedataset <em>Conf4cbsedataset</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getDataSet2SecurityLevel()
 * @model
 * @generated
 */
public interface DataSet2SecurityLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Levels</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Levels</em>' reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getDataSet2SecurityLevel_SecurityLevels()
	 * @model required="true"
	 * @generated
	 */
	EList<SecurityLevel> getSecurityLevels();

	/**
	 * Returns the value of the '<em><b>Conf4cbsedataset</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEDataSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf4cbsedataset</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getDataSet2SecurityLevel_Conf4cbsedataset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Conf4CBSEDataSet> getConf4cbsedataset();

} // DataSet2SecurityLevel
