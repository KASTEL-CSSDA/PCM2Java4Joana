/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter2 Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter#getPcmParameter <em>Pcm Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter#getJavaParameter <em>Java Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getParameter2Parameter()
 * @model
 * @generated
 */
public interface Parameter2Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Pcm Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Parameter</em>' reference.
	 * @see #setPcmParameter(Parameter)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getParameter2Parameter_PcmParameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getPcmParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter#getPcmParameter <em>Pcm Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Parameter</em>' reference.
	 * @see #getPcmParameter()
	 * @generated
	 */
	void setPcmParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Java Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Parameter</em>' reference.
	 * @see #setJavaParameter(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getParameter2Parameter_JavaParameter()
	 * @model required="true"
	 * @generated
	 */
	edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter getJavaParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter#getJavaParameter <em>Java Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Parameter</em>' reference.
	 * @see #getJavaParameter()
	 * @generated
	 */
	void setJavaParameter(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter value);

} // Parameter2Parameter
