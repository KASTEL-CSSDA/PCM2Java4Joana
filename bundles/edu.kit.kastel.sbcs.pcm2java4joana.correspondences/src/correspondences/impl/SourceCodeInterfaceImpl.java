/**
 */
package correspondences.impl;

import correspondences.CorrespondencesPackage;
import correspondences.SourceCodeInterface;
import correspondences.SourceCodeMethod;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Code Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link correspondences.impl.SourceCodeInterfaceImpl#getSourcecodemethod <em>Sourcecodemethod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceCodeInterfaceImpl extends CorrespondenceElementImpl implements SourceCodeInterface {
	/**
	 * The cached value of the '{@link #getSourcecodemethod() <em>Sourcecodemethod</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcecodemethod()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceCodeMethod> sourcecodemethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceCodeInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencesPackage.Literals.SOURCE_CODE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceCodeMethod> getSourcecodemethod() {
		if (sourcecodemethod == null) {
			sourcecodemethod = new EObjectContainmentEList<SourceCodeMethod>(SourceCodeMethod.class, this, CorrespondencesPackage.SOURCE_CODE_INTERFACE__SOURCECODEMETHOD);
		}
		return sourcecodemethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencesPackage.SOURCE_CODE_INTERFACE__SOURCECODEMETHOD:
				return ((InternalEList<?>)getSourcecodemethod()).basicRemove(otherEnd, msgs);
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
			case CorrespondencesPackage.SOURCE_CODE_INTERFACE__SOURCECODEMETHOD:
				return getSourcecodemethod();
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
			case CorrespondencesPackage.SOURCE_CODE_INTERFACE__SOURCECODEMETHOD:
				getSourcecodemethod().clear();
				getSourcecodemethod().addAll((Collection<? extends SourceCodeMethod>)newValue);
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
			case CorrespondencesPackage.SOURCE_CODE_INTERFACE__SOURCECODEMETHOD:
				getSourcecodemethod().clear();
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
			case CorrespondencesPackage.SOURCE_CODE_INTERFACE__SOURCECODEMETHOD:
				return sourcecodemethod != null && !sourcecodemethod.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceCodeInterfaceImpl
