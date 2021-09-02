/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.sourcecode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class#getImplements <em>Implements</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends TopLevelType {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodePackage#getClass_Implements()
	 * @model
	 * @generated
	 */
	EList<Interface> getImplements();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodePackage#getClass_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // Class
