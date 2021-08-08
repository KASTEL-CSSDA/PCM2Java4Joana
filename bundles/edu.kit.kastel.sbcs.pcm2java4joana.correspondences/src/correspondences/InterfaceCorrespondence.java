/**
 */
package correspondences;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link correspondences.InterfaceCorrespondence#getSourcecodeinterface <em>Sourcecodeinterface</em>}</li>
 *   <li>{@link correspondences.InterfaceCorrespondence#getPcmprovidedinterface <em>Pcmprovidedinterface</em>}</li>
 *   <li>{@link correspondences.InterfaceCorrespondence#getMethodcorrespondence <em>Methodcorrespondence</em>}</li>
 * </ul>
 *
 * @see correspondences.CorrespondencesPackage#getInterfaceCorrespondence()
 * @model
 * @generated
 */
public interface InterfaceCorrespondence extends CorrespondenceElement {
	/**
	 * Returns the value of the '<em><b>Sourcecodeinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcecodeinterface</em>' containment reference.
	 * @see #setSourcecodeinterface(SourceCodeInterface)
	 * @see correspondences.CorrespondencesPackage#getInterfaceCorrespondence_Sourcecodeinterface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceCodeInterface getSourcecodeinterface();

	/**
	 * Sets the value of the '{@link correspondences.InterfaceCorrespondence#getSourcecodeinterface <em>Sourcecodeinterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sourcecodeinterface</em>' containment reference.
	 * @see #getSourcecodeinterface()
	 * @generated
	 */
	void setSourcecodeinterface(SourceCodeInterface value);

	/**
	 * Returns the value of the '<em><b>Pcmprovidedinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmprovidedinterface</em>' containment reference.
	 * @see #setPcmprovidedinterface(PCMProvidedInterface)
	 * @see correspondences.CorrespondencesPackage#getInterfaceCorrespondence_Pcmprovidedinterface()
	 * @model containment="true"
	 * @generated
	 */
	PCMProvidedInterface getPcmprovidedinterface();

	/**
	 * Sets the value of the '{@link correspondences.InterfaceCorrespondence#getPcmprovidedinterface <em>Pcmprovidedinterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcmprovidedinterface</em>' containment reference.
	 * @see #getPcmprovidedinterface()
	 * @generated
	 */
	void setPcmprovidedinterface(PCMProvidedInterface value);

	/**
	 * Returns the value of the '<em><b>Methodcorrespondence</b></em>' containment reference list.
	 * The list contents are of type {@link correspondences.MethodCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodcorrespondence</em>' containment reference list.
	 * @see correspondences.CorrespondencesPackage#getInterfaceCorrespondence_Methodcorrespondence()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodCorrespondence> getMethodcorrespondence();

} // InterfaceCorrespondence
