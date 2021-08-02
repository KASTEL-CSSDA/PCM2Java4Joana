/**
 */
package sourcecode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Built In Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sourcecode.BuiltInType#getBuiltInType <em>Built In Type</em>}</li>
 * </ul>
 *
 * @see sourcecode.SourcecodePackage#getBuiltInType()
 * @model
 * @generated
 */
public interface BuiltInType extends Type {
	/**
	 * Returns the value of the '<em><b>Built In Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sourcecode.BuiltInTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In Type</em>' attribute.
	 * @see sourcecode.BuiltInTypes
	 * @see #setBuiltInType(BuiltInTypes)
	 * @see sourcecode.SourcecodePackage#getBuiltInType_BuiltInType()
	 * @model required="true"
	 * @generated
	 */
	BuiltInTypes getBuiltInType();

	/**
	 * Sets the value of the '{@link sourcecode.BuiltInType#getBuiltInType <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Built In Type</em>' attribute.
	 * @see sourcecode.BuiltInTypes
	 * @see #getBuiltInType()
	 * @generated
	 */
	void setBuiltInType(BuiltInTypes value);

} // BuiltInType
