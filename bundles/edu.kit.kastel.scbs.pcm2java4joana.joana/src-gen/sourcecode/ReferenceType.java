/**
 */
package sourcecode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sourcecode.ReferenceType#getTopleveltype <em>Topleveltype</em>}</li>
 * </ul>
 *
 * @see sourcecode.SourcecodePackage#getReferenceType()
 * @model
 * @generated
 */
public interface ReferenceType extends Type {
	/**
	 * Returns the value of the '<em><b>Topleveltype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topleveltype</em>' reference.
	 * @see #setTopleveltype(TopLevelType)
	 * @see sourcecode.SourcecodePackage#getReferenceType_Topleveltype()
	 * @model required="true"
	 * @generated
	 */
	TopLevelType getTopleveltype();

	/**
	 * Sets the value of the '{@link sourcecode.ReferenceType#getTopleveltype <em>Topleveltype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topleveltype</em>' reference.
	 * @see #getTopleveltype()
	 * @generated
	 */
	void setTopleveltype(TopLevelType value);

} // ReferenceType
