/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.util;

import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage
 * @generated
 */
public class SecuritycorrespondencemodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecuritycorrespondencemodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritycorrespondencemodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SecuritycorrespondencemodelPackage.eINSTANCE;
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
	protected SecuritycorrespondencemodelSwitch<Adapter> modelSwitch =
		new SecuritycorrespondencemodelSwitch<Adapter>() {
			@Override
			public Adapter caseDataSet2SecurityLevel(DataSet2SecurityLevel object) {
				return createDataSet2SecurityLevelAdapter();
			}
			@Override
			public Adapter caseParametersAndDataPair2Annotation(ParametersAndDataPair2Annotation object) {
				return createParametersAndDataPair2AnnotationAdapter();
			}
			@Override
			public Adapter caseSecurityCorrespondenceModel(SecurityCorrespondenceModel object) {
				return createSecurityCorrespondenceModelAdapter();
			}
			@Override
			public Adapter caseConf4CBSEParametersAndDataPair(Conf4CBSEParametersAndDataPair object) {
				return createConf4CBSEParametersAndDataPairAdapter();
			}
			@Override
			public Adapter caseConf4CBSEElement(Conf4CBSEElement object) {
				return createConf4CBSEElementAdapter();
			}
			@Override
			public Adapter caseConf4CBSEDataSet(Conf4CBSEDataSet object) {
				return createConf4CBSEDataSetAdapter();
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
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel <em>Data Set2 Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel
	 * @generated
	 */
	public Adapter createDataSet2SecurityLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation <em>Parameters And Data Pair2 Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation
	 * @generated
	 */
	public Adapter createParametersAndDataPair2AnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel <em>Security Correspondence Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel
	 * @generated
	 */
	public Adapter createSecurityCorrespondenceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEParametersAndDataPair <em>Conf4 CBSE Parameters And Data Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEParametersAndDataPair
	 * @generated
	 */
	public Adapter createConf4CBSEParametersAndDataPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEElement <em>Conf4 CBSE Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEElement
	 * @generated
	 */
	public Adapter createConf4CBSEElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEDataSet <em>Conf4 CBSE Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEDataSet
	 * @generated
	 */
	public Adapter createConf4CBSEDataSetAdapter() {
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

} //SecuritycorrespondencemodelAdapterFactory
