/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component2 Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class#getInterface2interface <em>Interface2interface</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class#getPcmcomponent <em>Pcmcomponent</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getComponent2Class()
 * @model
 * @generated
 */
public interface Component2Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Java Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Class</em>' reference.
	 * @see #setJavaClass(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getComponent2Class_JavaClass()
	 * @model required="true"
	 * @generated
	 */
	edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class getJavaClass();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class#getJavaClass <em>Java Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Class</em>' reference.
	 * @see #getJavaClass()
	 * @generated
	 */
	void setJavaClass(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class value);

	/**
	 * Returns the value of the '<em><b>Interface2interface</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface2interface</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getComponent2Class_Interface2interface()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface2Interface> getInterface2interface();

	/**
	 * Returns the value of the '<em><b>Pcmcomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmcomponent</em>' containment reference.
	 * @see #setPcmcomponent(PCMComponent)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getComponent2Class_Pcmcomponent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PCMComponent getPcmcomponent();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class#getPcmcomponent <em>Pcmcomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcmcomponent</em>' containment reference.
	 * @see #getPcmcomponent()
	 * @generated
	 */
	void setPcmcomponent(PCMComponent value);

} // Component2Class
