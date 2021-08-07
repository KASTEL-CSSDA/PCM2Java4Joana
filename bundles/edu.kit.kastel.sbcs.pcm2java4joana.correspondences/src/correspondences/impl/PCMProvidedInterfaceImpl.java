/**
 */
package correspondences.impl;

import correspondences.CorrespondencesPackage;
import correspondences.PCMMethod;
import correspondences.PCMProvidedInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Provided Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link correspondences.impl.PCMProvidedInterfaceImpl#getPcmmethod <em>Pcmmethod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMProvidedInterfaceImpl extends CorrespondenceElementImpl implements PCMProvidedInterface {
	/**
	 * The cached value of the '{@link #getPcmmethod() <em>Pcmmethod</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmmethod()
	 * @generated
	 * @ordered
	 */
	protected EList<PCMMethod> pcmmethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMProvidedInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencesPackage.Literals.PCM_PROVIDED_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCMMethod> getPcmmethod() {
		if (pcmmethod == null) {
			pcmmethod = new EObjectContainmentEList<PCMMethod>(PCMMethod.class, this, CorrespondencesPackage.PCM_PROVIDED_INTERFACE__PCMMETHOD);
		}
		return pcmmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencesPackage.PCM_PROVIDED_INTERFACE__PCMMETHOD:
				return ((InternalEList<?>)getPcmmethod()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorrespondencesPackage.PCM_PROVIDED_INTERFACE__PCMMETHOD:
				return getPcmmethod();
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
			case CorrespondencesPackage.PCM_PROVIDED_INTERFACE__PCMMETHOD:
				getPcmmethod().clear();
				getPcmmethod().addAll((Collection<? extends PCMMethod>)newValue);
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
			case CorrespondencesPackage.PCM_PROVIDED_INTERFACE__PCMMETHOD:
				getPcmmethod().clear();
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
			case CorrespondencesPackage.PCM_PROVIDED_INTERFACE__PCMMETHOD:
				return pcmmethod != null && !pcmmethod.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCMProvidedInterfaceImpl
