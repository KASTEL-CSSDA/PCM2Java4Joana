/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMComponent;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMInterface;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.PCMComponentImpl#getPcminterface <em>Pcminterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMComponentImpl extends PCMElementImpl implements PCMComponent {
	/**
	 * The cached value of the '{@link #getPcminterface() <em>Pcminterface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcminterface()
	 * @generated
	 * @ordered
	 */
	protected EList<PCMInterface> pcminterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencemodelPackage.Literals.PCM_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCMInterface> getPcminterface() {
		if (pcminterface == null) {
			pcminterface = new EObjectResolvingEList<PCMInterface>(PCMInterface.class, this, CorrespondencemodelPackage.PCM_COMPONENT__PCMINTERFACE);
		}
		return pcminterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorrespondencemodelPackage.PCM_COMPONENT__PCMINTERFACE:
				return getPcminterface();
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
			case CorrespondencemodelPackage.PCM_COMPONENT__PCMINTERFACE:
				getPcminterface().clear();
				getPcminterface().addAll((Collection<? extends PCMInterface>)newValue);
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
			case CorrespondencemodelPackage.PCM_COMPONENT__PCMINTERFACE:
				getPcminterface().clear();
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
			case CorrespondencemodelPackage.PCM_COMPONENT__PCMINTERFACE:
				return pcminterface != null && !pcminterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCMComponentImpl
