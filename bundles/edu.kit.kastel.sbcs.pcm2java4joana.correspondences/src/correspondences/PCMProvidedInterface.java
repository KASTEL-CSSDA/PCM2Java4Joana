/**
 */
package correspondences;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Provided Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link correspondences.PCMProvidedInterface#getPcmmethod <em>Pcmmethod</em>}</li>
 * </ul>
 *
 * @see correspondences.CorrespondencesPackage#getPCMProvidedInterface()
 * @model
 * @generated
 */
public interface PCMProvidedInterface extends CorrespondenceElement {
	/**
	 * Returns the value of the '<em><b>Pcmmethod</b></em>' containment reference list.
	 * The list contents are of type {@link correspondences.PCMMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmmethod</em>' containment reference list.
	 * @see correspondences.CorrespondencesPackage#getPCMProvidedInterface_Pcmmethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCMMethod> getPcmmethod();

} // PCMProvidedInterface
