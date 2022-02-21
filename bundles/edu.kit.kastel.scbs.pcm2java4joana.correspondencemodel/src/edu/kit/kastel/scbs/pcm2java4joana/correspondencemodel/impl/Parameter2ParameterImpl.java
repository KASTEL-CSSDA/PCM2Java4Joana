/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter2 Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Parameter2ParameterImpl#getJavaParameter <em>Java Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Parameter2ParameterImpl#getPcmparameter <em>Pcmparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Parameter2ParameterImpl extends MinimalEObjectImpl.Container implements Parameter2Parameter {
	/**
	 * The cached value of the '{@link #getJavaParameter() <em>Java Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter javaParameter;

	/**
	 * The cached value of the '{@link #getPcmparameter() <em>Pcmparameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmparameter()
	 * @generated
	 * @ordered
	 */
	protected org.palladiosimulator.pcm.repository.Parameter pcmparameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Parameter2ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencemodelPackage.Literals.PARAMETER2_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getJavaParameter() {
		if (javaParameter != null && javaParameter.eIsProxy()) {
			InternalEObject oldJavaParameter = (InternalEObject)javaParameter;
			javaParameter = (Parameter)eResolveProxy(oldJavaParameter);
			if (javaParameter != oldJavaParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorrespondencemodelPackage.PARAMETER2_PARAMETER__JAVA_PARAMETER, oldJavaParameter, javaParameter));
			}
		}
		return javaParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetJavaParameter() {
		return javaParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaParameter(Parameter newJavaParameter) {
		Parameter oldJavaParameter = javaParameter;
		javaParameter = newJavaParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.PARAMETER2_PARAMETER__JAVA_PARAMETER, oldJavaParameter, javaParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.pcm.repository.Parameter getPcmparameter() {
		return pcmparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPcmparameter(org.palladiosimulator.pcm.repository.Parameter newPcmparameter, NotificationChain msgs) {
		org.palladiosimulator.pcm.repository.Parameter oldPcmparameter = pcmparameter;
		pcmparameter = newPcmparameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCMPARAMETER, oldPcmparameter, newPcmparameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmparameter(org.palladiosimulator.pcm.repository.Parameter newPcmparameter) {
		if (newPcmparameter != pcmparameter) {
			NotificationChain msgs = null;
			if (pcmparameter != null)
				msgs = ((InternalEObject)pcmparameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCMPARAMETER, null, msgs);
			if (newPcmparameter != null)
				msgs = ((InternalEObject)newPcmparameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCMPARAMETER, null, msgs);
			msgs = basicSetPcmparameter(newPcmparameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCMPARAMETER, newPcmparameter, newPcmparameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCMPARAMETER:
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
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__JAVA_PARAMETER:
				if (resolve) return getJavaParameter();
				return basicGetJavaParameter();
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCMPARAMETER:
				return getPcmparameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__JAVA_PARAMETER:
				setJavaParameter((Parameter)newValue);
				return;
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCMPARAMETER:
				setPcmparameter((org.palladiosimulator.pcm.repository.Parameter)newValue);
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
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__JAVA_PARAMETER:
				setJavaParameter((Parameter)null);
				return;
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCMPARAMETER:
				setPcmparameter((org.palladiosimulator.pcm.repository.Parameter)null);
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
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__JAVA_PARAMETER:
				return javaParameter != null;
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCMPARAMETER:
				return pcmparameter != null;
		}
		return super.eIsSet(featureID);
	}

} //Parameter2ParameterImpl
