/**
 */
package correspondences.util;

import correspondences.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see correspondences.CorrespondencesPackage
 * @generated
 */
public class CorrespondencesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorrespondencesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondencesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorrespondencesPackage.eINSTANCE;
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
	protected CorrespondencesSwitch<Adapter> modelSwitch =
		new CorrespondencesSwitch<Adapter>() {
			@Override
			public Adapter caseCorrespondenceElement(CorrespondenceElement object) {
				return createCorrespondenceElementAdapter();
			}
			@Override
			public Adapter casePCMComponent(PCMComponent object) {
				return createPCMComponentAdapter();
			}
			@Override
			public Adapter caseSourceCodeClass(SourceCodeClass object) {
				return createSourceCodeClassAdapter();
			}
			@Override
			public Adapter caseSourceCodeMethod(SourceCodeMethod object) {
				return createSourceCodeMethodAdapter();
			}
			@Override
			public Adapter casePCMProvidedInterface(PCMProvidedInterface object) {
				return createPCMProvidedInterfaceAdapter();
			}
			@Override
			public Adapter casePCMMethod(PCMMethod object) {
				return createPCMMethodAdapter();
			}
			@Override
			public Adapter caseSourceCodeParamter(SourceCodeParamter object) {
				return createSourceCodeParamterAdapter();
			}
			@Override
			public Adapter casePCMParameter(PCMParameter object) {
				return createPCMParameterAdapter();
			}
			@Override
			public Adapter caseComponentCorrespondence(ComponentCorrespondence object) {
				return createComponentCorrespondenceAdapter();
			}
			@Override
			public Adapter caseMethodCorrespondence(MethodCorrespondence object) {
				return createMethodCorrespondenceAdapter();
			}
			@Override
			public Adapter caseParameterCorrespondence(ParameterCorrespondence object) {
				return createParameterCorrespondenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link correspondences.CorrespondenceElement <em>Correspondence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see correspondences.CorrespondenceElement
	 * @generated
	 */
	public Adapter createCorrespondenceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link correspondences.PCMComponent <em>PCM Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see correspondences.PCMComponent
	 * @generated
	 */
	public Adapter createPCMComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link correspondences.SourceCodeClass <em>Source Code Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see correspondences.SourceCodeClass
	 * @generated
	 */
	public Adapter createSourceCodeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link correspondences.SourceCodeMethod <em>Source Code Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see correspondences.SourceCodeMethod
	 * @generated
	 */
	public Adapter createSourceCodeMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link correspondences.PCMProvidedInterface <em>PCM Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see correspondences.PCMProvidedInterface
	 * @generated
	 */
	public Adapter createPCMProvidedInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link correspondences.PCMMethod <em>PCM Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see correspondences.PCMMethod
	 * @generated
	 */
	public Adapter createPCMMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link correspondences.SourceCodeParamter <em>Source Code Paramter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see correspondences.SourceCodeParamter
	 * @generated
	 */
	public Adapter createSourceCodeParamterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link correspondences.PCMParameter <em>PCM Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see correspondences.PCMParameter
	 * @generated
	 */
	public Adapter createPCMParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link correspondences.ComponentCorrespondence <em>Component Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see correspondences.ComponentCorrespondence
	 * @generated
	 */
	public Adapter createComponentCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link correspondences.MethodCorrespondence <em>Method Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see correspondences.MethodCorrespondence
	 * @generated
	 */
	public Adapter createMethodCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link correspondences.ParameterCorrespondence <em>Parameter Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see correspondences.ParameterCorrespondence
	 * @generated
	 */
	public Adapter createParameterCorrespondenceAdapter() {
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

} //CorrespondencesAdapterFactory
