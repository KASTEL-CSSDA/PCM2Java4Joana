/**
 */
package correspondences.tests;

import correspondences.CorrespondencesFactory;
import correspondences.MethodCorrespondence;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Method Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodCorrespondenceTest extends CorrespondenceElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MethodCorrespondenceTest.class);
	}

	/**
	 * Constructs a new Method Correspondence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCorrespondenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Method Correspondence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MethodCorrespondence getFixture() {
		return (MethodCorrespondence)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CorrespondencesFactory.eINSTANCE.createMethodCorrespondence());
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

} //MethodCorrespondenceTest
