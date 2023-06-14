/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.sourcecode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Built In Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInType#getBuiltInType <em>Built In Type</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodePackage#getBuiltInType()
 * @model
 * @generated
 */
public interface BuiltInType extends Type {
	/**
	 * Returns the value of the '<em><b>Built In Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In Type</em>' attribute.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInTypes
	 * @see #setBuiltInType(BuiltInTypes)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodePackage#getBuiltInType_BuiltInType()
	 * @model required="true"
	 * @generated
	 */
	BuiltInTypes getBuiltInType();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInType#getBuiltInType <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Built In Type</em>' attribute.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInTypes
	 * @see #getBuiltInType()
	 * @generated
	 */
	void setBuiltInType(BuiltInTypes value);

} // BuiltInType
