/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.OperationInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface2 Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface#getPcmInterface <em>Pcm Interface</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface#getJavaInterface <em>Java Interface</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface#getOperation2method <em>Operation2method</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getInterface2Interface()
 * @model
 * @generated
 */
public interface Interface2Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>Pcm Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Interface</em>' reference.
	 * @see #setPcmInterface(OperationInterface)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getInterface2Interface_PcmInterface()
	 * @model required="true"
	 * @generated
	 */
	OperationInterface getPcmInterface();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface#getPcmInterface <em>Pcm Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Interface</em>' reference.
	 * @see #getPcmInterface()
	 * @generated
	 */
	void setPcmInterface(OperationInterface value);

	/**
	 * Returns the value of the '<em><b>Java Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Interface</em>' reference.
	 * @see #setJavaInterface(Interface)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getInterface2Interface_JavaInterface()
	 * @model required="true"
	 * @generated
	 */
	Interface getJavaInterface();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface#getJavaInterface <em>Java Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Interface</em>' reference.
	 * @see #getJavaInterface()
	 * @generated
	 */
	void setJavaInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Operation2method</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation2method</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getInterface2Interface_Operation2method()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation2Method> getOperation2method();

} // Interface2Interface
