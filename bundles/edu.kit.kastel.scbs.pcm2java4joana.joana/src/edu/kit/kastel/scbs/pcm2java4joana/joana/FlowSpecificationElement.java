/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Specification Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement#getTag <em>Tag</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement#getAnnotatedClass <em>Annotated Class</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement#getAnnotatedMethod <em>Annotated Method</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getFlowSpecificationElement()
 * @model abstract="true"
 * @generated
 */
public interface FlowSpecificationElement extends JoanaElement {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getFlowSpecificationElement_Tag()
	 * @model default=""
	 * @generated
	 */
	EList<String> getTag();

	/**
	 * Returns the value of the '<em><b>Annotated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Class</em>' reference.
	 * @see #setAnnotatedClass(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getFlowSpecificationElement_AnnotatedClass()
	 * @model required="true"
	 * @generated
	 */
	edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class getAnnotatedClass();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement#getAnnotatedClass <em>Annotated Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Class</em>' reference.
	 * @see #getAnnotatedClass()
	 * @generated
	 */
	void setAnnotatedClass(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class value);

	/**
	 * Returns the value of the '<em><b>Annotated Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Method</em>' reference.
	 * @see #setAnnotatedMethod(Method)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getFlowSpecificationElement_AnnotatedMethod()
	 * @model required="true"
	 * @generated
	 */
	Method getAnnotatedMethod();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement#getAnnotatedMethod <em>Annotated Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Method</em>' reference.
	 * @see #getAnnotatedMethod()
	 * @generated
	 */
	void setAnnotatedMethod(Method value);

} // FlowSpecificationElement
