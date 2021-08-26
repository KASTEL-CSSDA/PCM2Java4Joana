/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.util;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage
 * @generated
 */
public class CorrespondencemodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorrespondencemodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondencemodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorrespondencemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrespondencemodelSwitch<Adapter> modelSwitch =
		new CorrespondencemodelSwitch<Adapter>() {
			@Override
			public Adapter caseComponent2Class(Component2Class object) {
				return createComponent2ClassAdapter();
			}
			@Override
			public Adapter caseInterface2Interface(Interface2Interface object) {
				return createInterface2InterfaceAdapter();
			}
			@Override
			public Adapter caseOperation2Method(Operation2Method object) {
				return createOperation2MethodAdapter();
			}
			@Override
			public Adapter caseParameter2Parameter(Parameter2Parameter object) {
				return createParameter2ParameterAdapter();
			}
			@Override
			public Adapter caseStructuralCorrespondenceModel(StructuralCorrespondenceModel object) {
				return createStructuralCorrespondenceModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class <em>Component2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class
	 * @generated
	 */
	public Adapter createComponent2ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface <em>Interface2 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface
	 * @generated
	 */
	public Adapter createInterface2InterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method <em>Operation2 Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method
	 * @generated
	 */
	public Adapter createOperation2MethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter <em>Parameter2 Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter
	 * @generated
	 */
	public Adapter createParameter2ParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel <em>Structural Correspondence Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel
	 * @generated
	 */
	public Adapter createStructuralCorrespondenceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CorrespondencemodelAdapterFactory
