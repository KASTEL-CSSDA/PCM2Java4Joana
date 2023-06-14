/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage
 * @generated
 */
public interface JoanasimplifiedresultFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoanasimplifiedresultFactory eINSTANCE = edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.JoanasimplifiedresultFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
	Result createResult();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Trace createTrace();

	/**
	 * Returns a new object of class '<em>Trace State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace State</em>'.
	 * @generated
	 */
	TraceState createTraceState();

	/**
	 * Returns a new object of class '<em>Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Type</em>'.
	 * @generated
	 */
	ResultType createResultType();

	/**
	 * Returns a new object of class '<em>Result Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Method</em>'.
	 * @generated
	 */
	ResultMethod createResultMethod();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JoanasimplifiedresultPackage getJoanasimplifiedresultPackage();

} //JoanasimplifiedresultFactory
