/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation#getFrom <em>From</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getFlowRelation()
 * @model
 * @generated
 */
public interface FlowRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference list.
	 * @see #isSetFrom()
	 * @see #unsetFrom()
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getFlowRelation_From()
	 * @model containment="true" unsettable="true" required="true"
	 * @generated
	 */
	EList<SecurityLevel> getFrom();

	/**
	 * Unsets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation#getFrom <em>From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrom()
	 * @see #getFrom()
	 * @generated
	 */
	void unsetFrom();

	/**
	 * Returns whether the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation#getFrom <em>From</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>From</em>' containment reference list is set.
	 * @see #unsetFrom()
	 * @see #getFrom()
	 * @generated
	 */
	boolean isSetFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getFlowRelation_To()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SecurityLevel> getTo();

} // FlowRelation
