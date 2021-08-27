/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMInterface#getPcmoperation <em>Pcmoperation</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getPCMInterface()
 * @model
 * @generated
 */
public interface PCMInterface extends PCMElement {
	/**
	 * Returns the value of the '<em><b>Pcmoperation</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcmoperation</em>' reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage#getPCMInterface_Pcmoperation()
	 * @model
	 * @generated
	 */
	EList<PCMOperation> getPcmoperation();

} // PCMInterface
