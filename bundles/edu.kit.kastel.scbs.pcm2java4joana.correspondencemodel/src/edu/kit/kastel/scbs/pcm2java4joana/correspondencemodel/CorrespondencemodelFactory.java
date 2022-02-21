/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage
 * @generated
 */
public interface CorrespondencemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorrespondencemodelFactory eINSTANCE = edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.CorrespondencemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component2 Class</em>'.
	 * @generated
	 */
	Component2Class createComponent2Class();

	/**
	 * Returns a new object of class '<em>Interface2 Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface2 Interface</em>'.
	 * @generated
	 */
	Interface2Interface createInterface2Interface();

	/**
	 * Returns a new object of class '<em>Operation2 Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation2 Method</em>'.
	 * @generated
	 */
	Operation2Method createOperation2Method();

	/**
	 * Returns a new object of class '<em>Parameter2 Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter2 Parameter</em>'.
	 * @generated
	 */
	Parameter2Parameter createParameter2Parameter();

	/**
	 * Returns a new object of class '<em>Structural Correspondence Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structural Correspondence Model</em>'.
	 * @generated
	 */
	StructuralCorrespondenceModel createStructuralCorrespondenceModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorrespondencemodelPackage getCorrespondencemodelPackage();

} //CorrespondencemodelFactory
