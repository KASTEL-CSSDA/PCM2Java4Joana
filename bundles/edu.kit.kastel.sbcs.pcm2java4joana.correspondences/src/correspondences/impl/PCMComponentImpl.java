/**
 */
package correspondences.impl;

import correspondences.CorrespondencesPackage;
import correspondences.PCMComponent;
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
 * An implementation of the model object '<em><b>PCM Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link correspondences.impl.PCMComponentImpl#getPcmprovidedinterfaces <em>Pcmprovidedinterfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMComponentImpl extends CorrespondenceElementImpl implements PCMComponent {
	/**
	 * The cached value of the '{@link #getPcmprovidedinterfaces() <em>Pcmprovidedinterfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmprovidedinterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<PCMProvidedInterface> pcmprovidedinterfaces;

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
		return CorrespondencesPackage.Literals.PCM_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCMProvidedInterface> getPcmprovidedinterfaces() {
		if (pcmprovidedinterfaces == null) {
			pcmprovidedinterfaces = new EObjectContainmentEList<PCMProvidedInterface>(PCMProvidedInterface.class, this, CorrespondencesPackage.PCM_COMPONENT__PCMPROVIDEDINTERFACES);
		}
		return pcmprovidedinterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencesPackage.PCM_COMPONENT__PCMPROVIDEDINTERFACES:
				return ((InternalEList<?>)getPcmprovidedinterfaces()).basicRemove(otherEnd, msgs);
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
			case CorrespondencesPackage.PCM_COMPONENT__PCMPROVIDEDINTERFACES:
				return getPcmprovidedinterfaces();
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
			case CorrespondencesPackage.PCM_COMPONENT__PCMPROVIDEDINTERFACES:
				getPcmprovidedinterfaces().clear();
				getPcmprovidedinterfaces().addAll((Collection<? extends PCMProvidedInterface>)newValue);
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
			case CorrespondencesPackage.PCM_COMPONENT__PCMPROVIDEDINTERFACES:
				getPcmprovidedinterfaces().clear();
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
			case CorrespondencesPackage.PCM_COMPONENT__PCMPROVIDEDINTERFACES:
				return pcmprovidedinterfaces != null && !pcmprovidedinterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCMComponentImpl
