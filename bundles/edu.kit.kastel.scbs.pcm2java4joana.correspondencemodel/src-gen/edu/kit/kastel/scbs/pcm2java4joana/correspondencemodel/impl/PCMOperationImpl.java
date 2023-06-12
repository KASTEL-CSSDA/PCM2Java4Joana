/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMOperation;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMParameter;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMOperationImpl#getPcmparameter <em>Pcmparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMOperationImpl extends PCMElementImpl implements PCMOperation {
	/**
	 * The cached value of the '{@link #getPcmparameter() <em>Pcmparameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<PCMParameter> pcmparameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencemodelPackage.Literals.PCM_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCMParameter> getPcmparameter() {
		if (pcmparameter == null) {
			pcmparameter = new EObjectResolvingEList<PCMParameter>(PCMParameter.class, this, CorrespondencemodelPackage.PCM_OPERATION__PCMPARAMETER);
		}
		return pcmparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorrespondencemodelPackage.PCM_OPERATION__PCMPARAMETER:
				return getPcmparameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorrespondencemodelPackage.PCM_OPERATION__PCMPARAMETER:
				getPcmparameter().clear();
				getPcmparameter().addAll((Collection<? extends PCMParameter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorrespondencemodelPackage.PCM_OPERATION__PCMPARAMETER:
				getPcmparameter().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorrespondencemodelPackage.PCM_OPERATION__PCMPARAMETER:
				return pcmparameter != null && !pcmparameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCMOperationImpl
