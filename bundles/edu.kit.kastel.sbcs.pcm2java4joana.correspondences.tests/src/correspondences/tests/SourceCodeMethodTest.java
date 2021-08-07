/**
 */
package correspondences.tests;

import correspondences.CorrespondencesFactory;
import correspondences.SourceCodeMethod;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Source Code Method</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceCodeMethodTest extends CorrespondenceElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SourceCodeMethodTest.class);
	}

	/**
	 * Constructs a new Source Code Method test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCodeMethodTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Source Code Method test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SourceCodeMethod getFixture() {
		return (SourceCodeMethod)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CorrespondencesFactory.eINSTANCE.createSourceCodeMethod());
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

} //SourceCodeMethodTest
