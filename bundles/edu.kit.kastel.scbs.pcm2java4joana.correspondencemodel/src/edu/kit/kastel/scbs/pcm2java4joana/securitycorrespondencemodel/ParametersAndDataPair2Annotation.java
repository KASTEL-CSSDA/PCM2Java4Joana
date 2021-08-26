/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel;

import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;

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
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getParametersAndDataPair <em>Parameters And Data Pair</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getParametersAndDataPair2Annotation()
 * @model
 * @generated
 */
public interface ParametersAndDataPair2Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Joana Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joana Annotation</em>' reference.
	 * @see #setJoanaAnnotation(Annotation)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getParametersAndDataPair2Annotation_JoanaAnnotation()
	 * @model required="true"
	 * @generated
	 */
	Annotation getJoanaAnnotation();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getJoanaAnnotation <em>Joana Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joana Annotation</em>' reference.
	 * @see #getJoanaAnnotation()
	 * @generated
	 */
	void setJoanaAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Parameters And Data Pair</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters And Data Pair</em>' reference.
	 * @see #setParametersAndDataPair(ParametersAndDataPair)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage#getParametersAndDataPair2Annotation_ParametersAndDataPair()
	 * @model required="true"
	 * @generated
	 */
	ParametersAndDataPair getParametersAndDataPair();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation#getParametersAndDataPair <em>Parameters And Data Pair</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters And Data Pair</em>' reference.
	 * @see #getParametersAndDataPair()
	 * @generated
	 */
	void setParametersAndDataPair(ParametersAndDataPair value);

} // ParametersAndDataPair2Annotation
