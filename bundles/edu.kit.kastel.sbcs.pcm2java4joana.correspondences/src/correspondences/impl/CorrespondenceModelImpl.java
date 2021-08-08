/**
 */
package correspondences.impl;

import correspondences.ComponentCorrespondence;
import correspondences.CorrespondenceModel;
import correspondences.CorrespondencesPackage;
import correspondences.InterfaceCorrespondence;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correspondence Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link correspondences.impl.CorrespondenceModelImpl#getComponentcorrespondence <em>Componentcorrespondence</em>}</li>
 *   <li>{@link correspondences.impl.CorrespondenceModelImpl#getInterfacecorrespondence <em>Interfacecorrespondence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorrespondenceModelImpl extends MinimalEObjectImpl.Container implements CorrespondenceModel {
	/**
	 * The cached value of the '{@link #getComponentcorrespondence() <em>Componentcorrespondence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentcorrespondence()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentCorrespondence> componentcorrespondence;

	/**
	 * The cached value of the '{@link #getInterfacecorrespondence() <em>Interfacecorrespondence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacecorrespondence()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceCorrespondence> interfacecorrespondence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrespondenceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencesPackage.Literals.CORRESPONDENCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentCorrespondence> getComponentcorrespondence() {
		if (componentcorrespondence == null) {
			componentcorrespondence = new EObjectContainmentEList<ComponentCorrespondence>(ComponentCorrespondence.class, this, CorrespondencesPackage.CORRESPONDENCE_MODEL__COMPONENTCORRESPONDENCE);
		}
		return componentcorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceCorrespondence> getInterfacecorrespondence() {
		if (interfacecorrespondence == null) {
			interfacecorrespondence = new EObjectContainmentEList<InterfaceCorrespondence>(InterfaceCorrespondence.class, this, CorrespondencesPackage.CORRESPONDENCE_MODEL__INTERFACECORRESPONDENCE);
		}
		return interfacecorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencesPackage.CORRESPONDENCE_MODEL__COMPONENTCORRESPONDENCE:
				return ((InternalEList<?>)getComponentcorrespondence()).basicRemove(otherEnd, msgs);
			case CorrespondencesPackage.CORRESPONDENCE_MODEL__INTERFACECORRESPONDENCE:
				return ((InternalEList<?>)getInterfacecorrespondence()).basicRemove(otherEnd, msgs);
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
			case CorrespondencesPackage.CORRESPONDENCE_MODEL__COMPONENTCORRESPONDENCE:
				return getComponentcorrespondence();
			case CorrespondencesPackage.CORRESPONDENCE_MODEL__INTERFACECORRESPONDENCE:
				return getInterfacecorrespondence();
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
			case CorrespondencesPackage.CORRESPONDENCE_MODEL__COMPONENTCORRESPONDENCE:
				getComponentcorrespondence().clear();
				getComponentcorrespondence().addAll((Collection<? extends ComponentCorrespondence>)newValue);
				return;
			case CorrespondencesPackage.CORRESPONDENCE_MODEL__INTERFACECORRESPONDENCE:
				getInterfacecorrespondence().clear();
				getInterfacecorrespondence().addAll((Collection<? extends InterfaceCorrespondence>)newValue);
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
			case CorrespondencesPackage.CORRESPONDENCE_MODEL__COMPONENTCORRESPONDENCE:
				getComponentcorrespondence().clear();
				return;
			case CorrespondencesPackage.CORRESPONDENCE_MODEL__INTERFACECORRESPONDENCE:
				getInterfacecorrespondence().clear();
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
			case CorrespondencesPackage.CORRESPONDENCE_MODEL__COMPONENTCORRESPONDENCE:
				return componentcorrespondence != null && !componentcorrespondence.isEmpty();
			case CorrespondencesPackage.CORRESPONDENCE_MODEL__INTERFACECORRESPONDENCE:
				return interfacecorrespondence != null && !interfacecorrespondence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CorrespondenceModelImpl
