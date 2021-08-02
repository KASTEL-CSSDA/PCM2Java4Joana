/**
 */
package sourcecode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Code Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sourcecode.SourceCodeRoot#getTopleveltype <em>Topleveltype</em>}</li>
 * </ul>
 *
 * @see sourcecode.SourcecodePackage#getSourceCodeRoot()
 * @model
 * @generated
 */
public interface SourceCodeRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Topleveltype</b></em>' reference list.
	 * The list contents are of type {@link sourcecode.TopLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topleveltype</em>' reference list.
	 * @see sourcecode.SourcecodePackage#getSourceCodeRoot_Topleveltype()
	 * @model
	 * @generated
	 */
	EList<TopLevelType> getTopleveltype();

} // SourceCodeRoot
