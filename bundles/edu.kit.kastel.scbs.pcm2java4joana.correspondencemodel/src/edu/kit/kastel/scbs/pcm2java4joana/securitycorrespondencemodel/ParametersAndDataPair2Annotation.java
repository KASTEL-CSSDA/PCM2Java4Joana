/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel;

import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters And Data Pair2 Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getJoanaAnnotation <em>Joana Annotation</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getConf4cbseparametersanddatapair <em>Conf4cbseparametersanddatapair</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getParametersAndDataPair2Annotation()
 * @model
 * @generated
 */
public interface ParametersAndDataPair2Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Joana Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joana Annotation</em>' containment reference.
	 * @see #setJoanaAnnotation(Annotation)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getParametersAndDataPair2Annotation_JoanaAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Annotation getJoanaAnnotation();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getJoanaAnnotation <em>Joana Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joana Annotation</em>' containment reference.
	 * @see #getJoanaAnnotation()
	 * @generated
	 */
	void setJoanaAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Conf4cbseparametersanddatapair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf4cbseparametersanddatapair</em>' containment reference.
	 * @see #setConf4cbseparametersanddatapair(Conf4CBSEParametersAndDataPair)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getParametersAndDataPair2Annotation_Conf4cbseparametersanddatapair()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Conf4CBSEParametersAndDataPair getConf4cbseparametersanddatapair();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getConf4cbseparametersanddatapair <em>Conf4cbseparametersanddatapair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf4cbseparametersanddatapair</em>' containment reference.
	 * @see #getConf4cbseparametersanddatapair()
	 * @generated
	 */
	void setConf4cbseparametersanddatapair(Conf4CBSEParametersAndDataPair value);

} // ParametersAndDataPair2Annotation
