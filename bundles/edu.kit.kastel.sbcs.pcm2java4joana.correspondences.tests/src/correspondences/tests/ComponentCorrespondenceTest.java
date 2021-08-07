/**
 */
package correspondences.tests;

import correspondences.ComponentCorrespondence;
import correspondences.CorrespondencesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentCorrespondenceTest extends CorrespondenceElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentCorrespondenceTest.class);
	}

	/**
	 * Constructs a new Component Correspondence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentCorrespondenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Component Correspondence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComponentCorrespondence getFixture() {
		return (ComponentCorrespondence)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CorrespondencesFactory.eINSTANCE.createComponentCorrespondence());
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

} //ComponentCorrespondenceTest
