/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.sourcecode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Code Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot#getTopleveltype <em>Topleveltype</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodePackage#getSourceCodeRoot()
 * @model
 * @generated
 */
public interface SourceCodeRoot extends SourceCodeElement {
	/**
	 * Returns the value of the '<em><b>Topleveltype</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topleveltype</em>' reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodePackage#getSourceCodeRoot_Topleveltype()
	 * @model
	 * @generated
	 */
	EList<TopLevelType> getTopleveltype();

} // SourceCodeRoot
