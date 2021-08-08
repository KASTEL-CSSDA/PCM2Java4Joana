/**
 */
package correspondences;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link correspondences.ParameterCorrespondence#getSourcecodeparamter <em>Sourcecodeparamter</em>}</li>
 *   <li>{@link correspondences.ParameterCorrespondence#getPcmparameter <em>Pcmparameter</em>}</li>
 * </ul>
 *
 * @see correspondences.CorrespondencesPackage#getParameterCorrespondence()
 * @model
 * @generated
 */
public interface ParameterCorrespondence extends CorrespondenceElement {
	/**
	 * Returns the value of the '<em><b>Sourcecodeparamter</b></em>' containment reference list.
	 * The list contents are of type {@link correspondences.SourceCodeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcecodeparamter</em>' containment reference list.
	 * @see correspondences.CorrespondencesPackage#getParameterCorrespondence_Sourcecodeparamter()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceCodeParameter> getSourcecodeparamter();

	/**
	 * Returns the value of the '<em><b>Pcmparameter</b></em>' containment reference list.
	 * The list contents are of type {@link correspondences.PCMParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmparameter</em>' containment reference list.
	 * @see correspondences.CorrespondencesPackage#getParameterCorrespondence_Pcmparameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCMParameter> getPcmparameter();

} // ParameterCorrespondence
