/**
 */
package correspondences;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Code Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link correspondences.SourceCodeClass#getSourcecodemethod <em>Sourcecodemethod</em>}</li>
 * </ul>
 *
 * @see correspondences.CorrespondencesPackage#getSourceCodeClass()
 * @model
 * @generated
 */
public interface SourceCodeClass extends CorrespondenceElement {
	/**
	 * Returns the value of the '<em><b>Sourcecodemethod</b></em>' containment reference list.
	 * The list contents are of type {@link correspondences.SourceCodeMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcecodemethod</em>' containment reference list.
	 * @see correspondences.CorrespondencesPackage#getSourceCodeClass_Sourcecodemethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceCodeMethod> getSourcecodemethod();

} // SourceCodeClass
