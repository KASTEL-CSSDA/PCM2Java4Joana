/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMOperation#getPcmparameter <em>Pcmparameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getPCMOperation()
 * @model
 * @generated
 */
public interface PCMOperation extends PCMElement {
	/**
	 * Returns the value of the '<em><b>Pcmparameter</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmparameter</em>' reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getPCMOperation_Pcmparameter()
	 * @model
	 * @generated
	 */
	EList<PCMParameter> getPcmparameter();

} // PCMOperation
