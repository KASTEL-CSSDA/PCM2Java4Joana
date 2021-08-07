/**
 */
package correspondences;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link correspondences.PCMMethod#getPcmparameter <em>Pcmparameter</em>}</li>
 * </ul>
 *
 * @see correspondences.CorrespondencesPackage#getPCMMethod()
 * @model
 * @generated
 */
public interface PCMMethod extends CorrespondenceElement {
	/**
	 * Returns the value of the '<em><b>Pcmparameter</b></em>' containment reference list.
	 * The list contents are of type {@link correspondences.PCMParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmparameter</em>' containment reference list.
	 * @see correspondences.CorrespondencesPackage#getPCMMethod_Pcmparameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCMParameter> getPcmparameter();

} // PCMMethod
