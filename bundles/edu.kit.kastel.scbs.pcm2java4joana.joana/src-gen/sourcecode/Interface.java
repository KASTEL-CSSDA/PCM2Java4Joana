/**
 */
package sourcecode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sourcecode.Interface#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see sourcecode.SourcecodePackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends TopLevelType {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' reference list.
	 * The list contents are of type {@link sourcecode.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' reference list.
	 * @see sourcecode.SourcecodePackage#getInterface_Methods()
	 * @model
	 * @generated
	 */
	EList<Method> getMethods();

} // Interface
