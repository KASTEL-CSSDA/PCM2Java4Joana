/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter2 Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter#getJavaParameter <em>Java Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter#getPcmparameter <em>Pcmparameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getParameter2Parameter()
 * @model
 * @generated
 */
public interface Parameter2Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Java Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Parameter</em>' reference.
	 * @see #setJavaParameter(Parameter)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getParameter2Parameter_JavaParameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getJavaParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter#getJavaParameter <em>Java Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Parameter</em>' reference.
	 * @see #getJavaParameter()
	 * @generated
	 */
	void setJavaParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Pcmparameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmparameter</em>' containment reference.
	 * @see #setPcmparameter(org.palladiosimulator.pcm.repository.Parameter)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getParameter2Parameter_Pcmparameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.palladiosimulator.pcm.repository.Parameter getPcmparameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter#getPcmparameter <em>Pcmparameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcmparameter</em>' containment reference.
	 * @see #getPcmparameter()
	 * @generated
	 */
	void setPcmparameter(org.palladiosimulator.pcm.repository.Parameter value);

} // Parameter2Parameter
