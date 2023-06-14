/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.tests;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelFactory;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMComponent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCM Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCMComponentTest extends PCMElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCMComponentTest.class);
	}

	/**
	 * Constructs a new PCM Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCM Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCMComponent getFixture() {
		return (PCMComponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CorrespondencemodelFactory.eINSTANCE.createPCMComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PCMComponentTest
