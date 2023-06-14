/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMInterface;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMOperation;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMInterfaceImpl#getPcmoperation <em>Pcmoperation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMInterfaceImpl extends PCMElementImpl implements PCMInterface {
	/**
	 * The cached value of the '{@link #getPcmoperation() <em>Pcmoperation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmoperation()
	 * @generated
	 * @ordered
	 */
	protected EList<PCMOperation> pcmoperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencemodelPackage.Literals.PCM_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCMOperation> getPcmoperation() {
		if (pcmoperation == null) {
			pcmoperation = new EObjectResolvingEList<PCMOperation>(PCMOperation.class, this, CorrespondencemodelPackage.PCM_INTERFACE__PCMOPERATION);
		}
		return pcmoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorrespondencemodelPackage.PCM_INTERFACE__PCMOPERATION:
				return getPcmoperation();
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
			case CorrespondencemodelPackage.PCM_INTERFACE__PCMOPERATION:
				getPcmoperation().clear();
				getPcmoperation().addAll((Collection<? extends PCMOperation>)newValue);
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
			case CorrespondencemodelPackage.PCM_INTERFACE__PCMOPERATION:
				getPcmoperation().clear();
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
			case CorrespondencemodelPackage.PCM_INTERFACE__PCMOPERATION:
				return pcmoperation != null && !pcmoperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCMInterfaceImpl
