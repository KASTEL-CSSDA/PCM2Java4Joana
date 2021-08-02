/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana;

import sourcecode.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.Source#getAnnotatedParameter <em>Annotated Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends Annotation {
	/**
	 * Returns the value of the '<em><b>Annotated Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Parameter</em>' reference.
	 * @see #setAnnotatedParameter(Parameter)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getSource_AnnotatedParameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getAnnotatedParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.Source#getAnnotatedParameter <em>Annotated Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Parameter</em>' reference.
	 * @see #getAnnotatedParameter()
	 * @generated
	 */
	void setAnnotatedParameter(Parameter value);

} // Source
