/**
 */
package correspondences;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correspondence Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link correspondences.CorrespondenceModel#getComponentcorrespondence <em>Componentcorrespondence</em>}</li>
 *   <li>{@link correspondences.CorrespondenceModel#getInterfacecorrespondence <em>Interfacecorrespondence</em>}</li>
 * </ul>
 *
 * @see correspondences.CorrespondencesPackage#getCorrespondenceModel()
 * @model
 * @generated
 */
public interface CorrespondenceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Componentcorrespondence</b></em>' containment reference list.
	 * The list contents are of type {@link correspondences.ComponentCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentcorrespondence</em>' containment reference list.
	 * @see correspondences.CorrespondencesPackage#getCorrespondenceModel_Componentcorrespondence()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentCorrespondence> getComponentcorrespondence();

	/**
	 * Returns the value of the '<em><b>Interfacecorrespondence</b></em>' containment reference list.
	 * The list contents are of type {@link correspondences.InterfaceCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacecorrespondence</em>' containment reference list.
	 * @see correspondences.CorrespondencesPackage#getCorrespondenceModel_Interfacecorrespondence()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceCorrespondence> getInterfacecorrespondence();

} // CorrespondenceModel
