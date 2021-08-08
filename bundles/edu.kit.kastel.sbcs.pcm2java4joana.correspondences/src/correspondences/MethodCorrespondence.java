/**
 */
package correspondences;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link correspondences.MethodCorrespondence#getPcmmethod <em>Pcmmethod</em>}</li>
 *   <li>{@link correspondences.MethodCorrespondence#getSourcecodemethod <em>Sourcecodemethod</em>}</li>
 *   <li>{@link correspondences.MethodCorrespondence#getParametercorrespondence <em>Parametercorrespondence</em>}</li>
 * </ul>
 *
 * @see correspondences.CorrespondencesPackage#getMethodCorrespondence()
 * @model
 * @generated
 */
public interface MethodCorrespondence extends CorrespondenceElement {
	/**
	 * Returns the value of the '<em><b>Pcmmethod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmmethod</em>' containment reference.
	 * @see #setPcmmethod(PCMMethod)
	 * @see correspondences.CorrespondencesPackage#getMethodCorrespondence_Pcmmethod()
	 * @model containment="true"
	 * @generated
	 */
	PCMMethod getPcmmethod();

	/**
	 * Sets the value of the '{@link correspondences.MethodCorrespondence#getPcmmethod <em>Pcmmethod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcmmethod</em>' containment reference.
	 * @see #getPcmmethod()
	 * @generated
	 */
	void setPcmmethod(PCMMethod value);

	/**
	 * Returns the value of the '<em><b>Sourcecodemethod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcecodemethod</em>' containment reference.
	 * @see #setSourcecodemethod(SourceCodeMethod)
	 * @see correspondences.CorrespondencesPackage#getMethodCorrespondence_Sourcecodemethod()
	 * @model containment="true"
	 * @generated
	 */
	SourceCodeMethod getSourcecodemethod();

	/**
	 * Sets the value of the '{@link correspondences.MethodCorrespondence#getSourcecodemethod <em>Sourcecodemethod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sourcecodemethod</em>' containment reference.
	 * @see #getSourcecodemethod()
	 * @generated
	 */
	void setSourcecodemethod(SourceCodeMethod value);

	/**
	 * Returns the value of the '<em><b>Parametercorrespondence</b></em>' containment reference list.
	 * The list contents are of type {@link correspondences.ParameterCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametercorrespondence</em>' containment reference list.
	 * @see correspondences.CorrespondencesPackage#getMethodCorrespondence_Parametercorrespondence()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterCorrespondence> getParametercorrespondence();

} // MethodCorrespondence
