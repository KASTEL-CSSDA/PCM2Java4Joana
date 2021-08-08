/**
 */
package correspondences;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Code Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link correspondences.SourceCodeMethod#getSourcecodeparamter <em>Sourcecodeparamter</em>}</li>
 * </ul>
 *
 * @see correspondences.CorrespondencesPackage#getSourceCodeMethod()
 * @model
 * @generated
 */
public interface SourceCodeMethod extends CorrespondenceElement {
	/**
	 * Returns the value of the '<em><b>Sourcecodeparamter</b></em>' containment reference list.
	 * The list contents are of type {@link correspondences.SourceCodeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcecodeparamter</em>' containment reference list.
	 * @see correspondences.CorrespondencesPackage#getSourceCodeMethod_Sourcecodeparamter()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceCodeParameter> getSourcecodeparamter();

} // SourceCodeMethod
