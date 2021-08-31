/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Correspondence Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel#getParametersanddatapair2annotation <em>Parametersanddatapair2annotation</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel#getDataset2securitylevel <em>Dataset2securitylevel</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getSecurityCorrespondenceModel()
 * @model
 * @generated
 */
public interface SecurityCorrespondenceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Parametersanddatapair2annotation</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametersanddatapair2annotation</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getSecurityCorrespondenceModel_Parametersanddatapair2annotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParametersAndDataPair2Annotation> getParametersanddatapair2annotation();

	/**
	 * Returns the value of the '<em><b>Dataset2securitylevel</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset2securitylevel</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getSecurityCorrespondenceModel_Dataset2securitylevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSet2SecurityLevel> getDataset2securitylevel();

} // SecurityCorrespondenceModel
