/**
 */
package correspondences;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link correspondences.ComponentCorrespondence#getPcmcomponent <em>Pcmcomponent</em>}</li>
 *   <li>{@link correspondences.ComponentCorrespondence#getSourcecodeclass <em>Sourcecodeclass</em>}</li>
 *   <li>{@link correspondences.ComponentCorrespondence#getMethodcorrespondence <em>Methodcorrespondence</em>}</li>
 * </ul>
 *
 * @see correspondences.CorrespondencesPackage#getComponentCorrespondence()
 * @model
 * @generated
 */
public interface ComponentCorrespondence extends CorrespondenceElement {
	/**
	 * Returns the value of the '<em><b>Pcmcomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmcomponent</em>' containment reference.
	 * @see #setPcmcomponent(PCMComponent)
	 * @see correspondences.CorrespondencesPackage#getComponentCorrespondence_Pcmcomponent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PCMComponent getPcmcomponent();

	/**
	 * Sets the value of the '{@link correspondences.ComponentCorrespondence#getPcmcomponent <em>Pcmcomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcmcomponent</em>' containment reference.
	 * @see #getPcmcomponent()
	 * @generated
	 */
	void setPcmcomponent(PCMComponent value);

	/**
	 * Returns the value of the '<em><b>Sourcecodeclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcecodeclass</em>' containment reference.
	 * @see #setSourcecodeclass(SourceCodeClass)
	 * @see correspondences.CorrespondencesPackage#getComponentCorrespondence_Sourcecodeclass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceCodeClass getSourcecodeclass();

	/**
	 * Sets the value of the '{@link correspondences.ComponentCorrespondence#getSourcecodeclass <em>Sourcecodeclass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sourcecodeclass</em>' containment reference.
	 * @see #getSourcecodeclass()
	 * @generated
	 */
	void setSourcecodeclass(SourceCodeClass value);

	/**
	 * Returns the value of the '<em><b>Methodcorrespondence</b></em>' containment reference list.
	 * The list contents are of type {@link correspondences.MethodCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodcorrespondence</em>' containment reference list.
	 * @see correspondences.CorrespondencesPackage#getComponentCorrespondence_Methodcorrespondence()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodCorrespondence> getMethodcorrespondence();

} // ComponentCorrespondence
