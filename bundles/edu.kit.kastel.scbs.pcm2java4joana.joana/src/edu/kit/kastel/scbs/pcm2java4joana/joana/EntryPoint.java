/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint#getSecuritylevels <em>Securitylevels</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint#getLattice <em>Lattice</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getEntryPoint()
 * @model
 * @generated
 */
public interface EntryPoint extends FlowSpecificationElement {
	/**
	 * Returns the value of the '<em><b>Securitylevels</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitylevels</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getEntryPoint_Securitylevels()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityLevel> getSecuritylevels();

	/**
	 * Returns the value of the '<em><b>Lattice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lattice</em>' containment reference.
	 * @see #setLattice(Lattice)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getEntryPoint_Lattice()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Lattice getLattice();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint#getLattice <em>Lattice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lattice</em>' containment reference.
	 * @see #getLattice()
	 * @generated
	 */
	void setLattice(Lattice value);

} // EntryPoint
