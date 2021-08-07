/**
 */
package correspondences.impl;

import correspondences.CorrespondencesPackage;
import correspondences.SourceCodeMethod;
import correspondences.SourceCodeParamter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Code Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link correspondences.impl.SourceCodeMethodImpl#getSourcecodeparamter <em>Sourcecodeparamter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceCodeMethodImpl extends CorrespondenceElementImpl implements SourceCodeMethod {
	/**
	 * The cached value of the '{@link #getSourcecodeparamter() <em>Sourcecodeparamter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcecodeparamter()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceCodeParamter> sourcecodeparamter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceCodeMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencesPackage.Literals.SOURCE_CODE_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceCodeParamter> getSourcecodeparamter() {
		if (sourcecodeparamter == null) {
			sourcecodeparamter = new EObjectContainmentEList<SourceCodeParamter>(SourceCodeParamter.class, this, CorrespondencesPackage.SOURCE_CODE_METHOD__SOURCECODEPARAMTER);
		}
		return sourcecodeparamter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencesPackage.SOURCE_CODE_METHOD__SOURCECODEPARAMTER:
				return ((InternalEList<?>)getSourcecodeparamter()).basicRemove(otherEnd, msgs);
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
			case CorrespondencesPackage.SOURCE_CODE_METHOD__SOURCECODEPARAMTER:
				return getSourcecodeparamter();
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
			case CorrespondencesPackage.SOURCE_CODE_METHOD__SOURCECODEPARAMTER:
				getSourcecodeparamter().clear();
				getSourcecodeparamter().addAll((Collection<? extends SourceCodeParamter>)newValue);
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
			case CorrespondencesPackage.SOURCE_CODE_METHOD__SOURCECODEPARAMTER:
				getSourcecodeparamter().clear();
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
			case CorrespondencesPackage.SOURCE_CODE_METHOD__SOURCECODEPARAMTER:
				return sourcecodeparamter != null && !sourcecodeparamter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceCodeMethodImpl
