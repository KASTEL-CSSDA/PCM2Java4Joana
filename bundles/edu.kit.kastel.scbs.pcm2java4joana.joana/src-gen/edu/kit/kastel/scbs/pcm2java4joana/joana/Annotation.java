/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation#getSecuritylevel <em>Securitylevel</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation#getAnnotatedParameter <em>Annotated Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends FlowSpecificationElement {
	/**
	 * Returns the value of the '<em><b>Securitylevel</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitylevel</em>' reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getAnnotation_Securitylevel()
	 * @model required="true"
	 * @generated
	 */
	EList<SecurityLevel> getSecuritylevel();

	/**
	 * Returns the value of the '<em><b>Annotated Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Parameter</em>' reference.
	 * @see #setAnnotatedParameter(Parameter)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getAnnotation_AnnotatedParameter()
	 * @model
	 * @generated
	 */
	Parameter getAnnotatedParameter();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation#getAnnotatedParameter <em>Annotated Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Parameter</em>' reference.
	 * @see #getAnnotatedParameter()
	 * @generated
	 */
	void setAnnotatedParameter(Parameter value);

} // Annotation
