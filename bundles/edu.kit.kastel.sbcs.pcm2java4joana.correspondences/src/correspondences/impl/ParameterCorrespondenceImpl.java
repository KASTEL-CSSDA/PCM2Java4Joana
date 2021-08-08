/**
 */
package correspondences.impl;

import correspondences.CorrespondencesPackage;
import correspondences.PCMParameter;
import correspondences.ParameterCorrespondence;
import correspondences.SourceCodeParameter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The cached value of the '{@link #getSourcecodeparamter() <em>Sourcecodeparamter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcecodeparamter()
	 * @generated
	 * @ordered
	 */
	protected SourceCodeParameter sourcecodeparamter;

	/**
	 * The cached value of the '{@link #getPcmparameter() <em>Pcmparameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmparameter()
	 * @generated
	 * @ordered
	 */
	protected PCMParameter pcmparameter;

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
	public SourceCodeParameter getSourcecodeparamter() {
		return sourcecodeparamter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourcecodeparamter(SourceCodeParameter newSourcecodeparamter, NotificationChain msgs) {
		SourceCodeParameter oldSourcecodeparamter = sourcecodeparamter;
		sourcecodeparamter = newSourcecodeparamter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.PARAMETER_CORRESPONDENCE__SOURCECODEPARAMTER, oldSourcecodeparamter, newSourcecodeparamter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcecodeparamter(SourceCodeParameter newSourcecodeparamter) {
		if (newSourcecodeparamter != sourcecodeparamter) {
			NotificationChain msgs = null;
			if (sourcecodeparamter != null)
				msgs = ((InternalEObject)sourcecodeparamter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.PARAMETER_CORRESPONDENCE__SOURCECODEPARAMTER, null, msgs);
			if (newSourcecodeparamter != null)
				msgs = ((InternalEObject)newSourcecodeparamter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.PARAMETER_CORRESPONDENCE__SOURCECODEPARAMTER, null, msgs);
			msgs = basicSetSourcecodeparamter(newSourcecodeparamter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.PARAMETER_CORRESPONDENCE__SOURCECODEPARAMTER, newSourcecodeparamter, newSourcecodeparamter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMParameter getPcmparameter() {
		return pcmparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPcmparameter(PCMParameter newPcmparameter, NotificationChain msgs) {
		PCMParameter oldPcmparameter = pcmparameter;
		pcmparameter = newPcmparameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER, oldPcmparameter, newPcmparameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmparameter(PCMParameter newPcmparameter) {
		if (newPcmparameter != pcmparameter) {
			NotificationChain msgs = null;
			if (pcmparameter != null)
				msgs = ((InternalEObject)pcmparameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER, null, msgs);
			if (newPcmparameter != null)
				msgs = ((InternalEObject)newPcmparameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER, null, msgs);
			msgs = basicSetPcmparameter(newPcmparameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER, newPcmparameter, newPcmparameter));
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
				return basicSetSourcecodeparamter(null, msgs);
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER:
				return basicSetPcmparameter(null, msgs);
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
				setSourcecodeparamter((SourceCodeParameter)newValue);
				return;
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER:
				setPcmparameter((PCMParameter)newValue);
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
				setSourcecodeparamter((SourceCodeParameter)null);
				return;
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER:
				setPcmparameter((PCMParameter)null);
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
				return sourcecodeparamter != null;
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE__PCMPARAMETER:
				return pcmparameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterCorrespondenceImpl
