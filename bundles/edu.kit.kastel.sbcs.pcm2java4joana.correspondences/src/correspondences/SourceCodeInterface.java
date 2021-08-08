/**
 */
package correspondences;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Code Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link correspondences.SourceCodeInterface#getSourcecodemethod <em>Sourcecodemethod</em>}</li>
 * </ul>
 *
 * @see correspondences.CorrespondencesPackage#getSourceCodeInterface()
 * @model
 * @generated
 */
public interface SourceCodeInterface extends CorrespondenceElement {
	/**
	 * Returns the value of the '<em><b>Sourcecodemethod</b></em>' containment reference list.
	 * The list contents are of type {@link correspondences.SourceCodeMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcecodemethod</em>' containment reference list.
	 * @see correspondences.CorrespondencesPackage#getSourceCodeInterface_Sourcecodemethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceCodeMethod> getSourcecodemethod();

} // SourceCodeInterface
