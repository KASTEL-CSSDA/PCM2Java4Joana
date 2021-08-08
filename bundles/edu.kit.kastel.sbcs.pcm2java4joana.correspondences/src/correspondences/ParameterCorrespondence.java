/**
 */
package correspondences;

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
	 * Returns the value of the '<em><b>Sourcecodeparamter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcecodeparamter</em>' containment reference.
	 * @see #setSourcecodeparamter(SourceCodeParameter)
	 * @see correspondences.CorrespondencesPackage#getParameterCorrespondence_Sourcecodeparamter()
	 * @model containment="true"
	 * @generated
	 */
	SourceCodeParameter getSourcecodeparamter();

	/**
	 * Sets the value of the '{@link correspondences.ParameterCorrespondence#getSourcecodeparamter <em>Sourcecodeparamter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sourcecodeparamter</em>' containment reference.
	 * @see #getSourcecodeparamter()
	 * @generated
	 */
	void setSourcecodeparamter(SourceCodeParameter value);

	/**
	 * Returns the value of the '<em><b>Pcmparameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmparameter</em>' containment reference.
	 * @see #setPcmparameter(PCMParameter)
	 * @see correspondences.CorrespondencesPackage#getParameterCorrespondence_Pcmparameter()
	 * @model containment="true"
	 * @generated
	 */
	PCMParameter getPcmparameter();

	/**
	 * Sets the value of the '{@link correspondences.ParameterCorrespondence#getPcmparameter <em>Pcmparameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcmparameter</em>' containment reference.
	 * @see #getPcmparameter()
	 * @generated
	 */
	void setPcmparameter(PCMParameter value);

} // ParameterCorrespondence
