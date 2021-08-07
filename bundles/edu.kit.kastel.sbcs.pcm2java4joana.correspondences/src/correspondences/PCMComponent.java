/**
 */
package correspondences;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link correspondences.PCMComponent#getPcmprovidedinterfaces <em>Pcmprovidedinterfaces</em>}</li>
 * </ul>
 *
 * @see correspondences.CorrespondencesPackage#getPCMComponent()
 * @model
 * @generated
 */
public interface PCMComponent extends CorrespondenceElement {
	/**
	 * Returns the value of the '<em><b>Pcmprovidedinterfaces</b></em>' containment reference list.
	 * The list contents are of type {@link correspondences.PCMProvidedInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmprovidedinterfaces</em>' containment reference list.
	 * @see correspondences.CorrespondencesPackage#getPCMComponent_Pcmprovidedinterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCMProvidedInterface> getPcmprovidedinterfaces();

} // PCMComponent
