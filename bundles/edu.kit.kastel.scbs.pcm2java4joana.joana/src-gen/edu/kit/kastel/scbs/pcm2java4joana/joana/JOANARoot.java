/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JOANA Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot#getFlowspecification <em>Flowspecification</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot#getLattice <em>Lattice</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot#getSecuritylevel <em>Securitylevel</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getJOANARoot()
 * @model
 * @generated
 */
public interface JOANARoot extends JoanaElement {
	/**
	 * Returns the value of the '<em><b>Flowspecification</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowspecification</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getJOANARoot_Flowspecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowSpecification> getFlowspecification();

	/**
	 * Returns the value of the '<em><b>Lattice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lattice</em>' containment reference.
	 * @see #setLattice(Lattice)
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getJOANARoot_Lattice()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Lattice getLattice();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot#getLattice <em>Lattice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lattice</em>' containment reference.
	 * @see #getLattice()
	 * @generated
	 */
	void setLattice(Lattice value);

	/**
	 * Returns the value of the '<em><b>Securitylevel</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitylevel</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getJOANARoot_Securitylevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityLevel> getSecuritylevel();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage#getJOANARoot_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

} // JOANARoot
