/**
 */
package correspondences;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see correspondences.CorrespondencesPackage
 * @generated
 */
public interface CorrespondencesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorrespondencesFactory eINSTANCE = correspondences.impl.CorrespondencesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Correspondence Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correspondence Element</em>'.
	 * @generated
	 */
	CorrespondenceElement createCorrespondenceElement();

	/**
	 * Returns a new object of class '<em>PCM Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Component</em>'.
	 * @generated
	 */
	PCMComponent createPCMComponent();

	/**
	 * Returns a new object of class '<em>Source Code Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Code Class</em>'.
	 * @generated
	 */
	SourceCodeClass createSourceCodeClass();

	/**
	 * Returns a new object of class '<em>Source Code Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Code Method</em>'.
	 * @generated
	 */
	SourceCodeMethod createSourceCodeMethod();

	/**
	 * Returns a new object of class '<em>PCM Provided Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Provided Interface</em>'.
	 * @generated
	 */
	PCMProvidedInterface createPCMProvidedInterface();

	/**
	 * Returns a new object of class '<em>PCM Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Method</em>'.
	 * @generated
	 */
	PCMMethod createPCMMethod();

	/**
	 * Returns a new object of class '<em>Source Code Paramter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Code Paramter</em>'.
	 * @generated
	 */
	SourceCodeParamter createSourceCodeParamter();

	/**
	 * Returns a new object of class '<em>PCM Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Parameter</em>'.
	 * @generated
	 */
	PCMParameter createPCMParameter();

	/**
	 * Returns a new object of class '<em>Component Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Correspondence</em>'.
	 * @generated
	 */
	ComponentCorrespondence createComponentCorrespondence();

	/**
	 * Returns a new object of class '<em>Method Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Correspondence</em>'.
	 * @generated
	 */
	MethodCorrespondence createMethodCorrespondence();

	/**
	 * Returns a new object of class '<em>Parameter Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Correspondence</em>'.
	 * @generated
	 */
	ParameterCorrespondence createParameterCorrespondence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorrespondencesPackage getCorrespondencesPackage();

} //CorrespondencesFactory
