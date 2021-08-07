/**
 */
package correspondences.impl;

import correspondences.CorrespondencesPackage;
import correspondences.PCMParameter;
import correspondences.ParameterCorrespondence;
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
 * An implementation of the model object '<em><b>Parameter Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link correspondences.impl.ParameterCorrespondenceImpl#getSourcecodeparamter <em>Sourcecodeparamter</em>}</li>
 *   <li>{@link correspondences.impl.ParameterCorrespondenceImpl#getPcmparameter <em>Pcmparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterCorrespondenceImpl extends CorrespondenceElementImpl implements ParameterCorrespondence {
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
	 * The cached value of the '{@link #getPcmparameter() <em>Pcmparameter</em>}' containment reference list.
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
	protected ParameterCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencesPackage.Literals.PARAMETER_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceCodeParamter> getSourcecodeparamter() {
		if (sourcecodeparamter == null) {
			sourcecodeparamter = new EObjectContainmentEList<SourceCodeParamter>(SourceCodeParamter.class, this, CorrespondencesPackage.PARAMETER_CORRESPONDENCE__SOURCECODEPARAMTER);
		}
		return sourcecodeparamter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCMParameter> getPcmparameter() {
		if (pcmparameter == null) {
			pcmparameter = new EObjectContainmentEList<PCMParameter>(PCMParameter.class, this, CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER);
		}
		return pcmparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__SOURCECODEPARAMTER:
				return ((InternalEList<?>)getSourcecodeparamter()).basicRemove(otherEnd, msgs);
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER:
				return ((InternalEList<?>)getPcmparameter()).basicRemove(otherEnd, msgs);
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
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__SOURCECODEPARAMTER:
				return getSourcecodeparamter();
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER:
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
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__SOURCECODEPARAMTER:
				getSourcecodeparamter().clear();
				getSourcecodeparamter().addAll((Collection<? extends SourceCodeParamter>)newValue);
				return;
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER:
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
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__SOURCECODEPARAMTER:
				getSourcecodeparamter().clear();
				return;
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER:
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
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__SOURCECODEPARAMTER:
				return sourcecodeparamter != null && !sourcecodeparamter.isEmpty();
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER:
				return pcmparameter != null && !pcmparameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterCorrespondenceImpl
