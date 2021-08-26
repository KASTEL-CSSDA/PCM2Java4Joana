/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation2 Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method#getPcmOperation <em>Pcm Operation</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method#getJavaMethod <em>Java Method</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method#getParameter2parameter <em>Parameter2parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getOperation2Method()
 * @model
 * @generated
 */
public interface Operation2Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Pcm Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Operation</em>' reference.
	 * @see #setPcmOperation(OperationSignature)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getOperation2Method_PcmOperation()
	 * @model required="true"
	 * @generated
	 */
	OperationSignature getPcmOperation();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method#getPcmOperation <em>Pcm Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Operation</em>' reference.
	 * @see #getPcmOperation()
	 * @generated
	 */
	void setPcmOperation(OperationSignature value);

	/**
	 * Returns the value of the '<em><b>Java Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Method</em>' reference.
	 * @see #setJavaMethod(Method)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getOperation2Method_JavaMethod()
	 * @model required="true"
	 * @generated
	 */
	Method getJavaMethod();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method#getJavaMethod <em>Java Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Method</em>' reference.
	 * @see #getJavaMethod()
	 * @generated
	 */
	void setJavaMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Parameter2parameter</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter2parameter</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getOperation2Method_Parameter2parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter2Parameter> getParameter2parameter();

} // Operation2Method
