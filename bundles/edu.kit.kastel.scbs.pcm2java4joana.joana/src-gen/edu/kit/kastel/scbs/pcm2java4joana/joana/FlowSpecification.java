/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getFlowSpecification()
 * @model
 * @generated
 */
public interface FlowSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrypoint</em>' containment reference.
	 * @see #setEntrypoint(EntryPoint)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getFlowSpecification_Entrypoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EntryPoint getEntrypoint();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification#getEntrypoint <em>Entrypoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrypoint</em>' containment reference.
	 * @see #getEntrypoint()
	 * @generated
	 */
	void setEntrypoint(EntryPoint value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getFlowSpecification_Annotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

} // FlowSpecification
