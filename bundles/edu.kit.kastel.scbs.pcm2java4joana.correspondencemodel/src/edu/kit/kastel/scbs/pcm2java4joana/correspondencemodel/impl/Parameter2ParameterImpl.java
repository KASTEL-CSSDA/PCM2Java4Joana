/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.repository.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter2 Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Parameter2ParameterImpl#getPcmParameter <em>Pcm Parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Parameter2ParameterImpl#getJavaParameter <em>Java Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Parameter2ParameterImpl extends MinimalEObjectImpl.Container implements Parameter2Parameter {
	/**
	 * The cached value of the '{@link #getPcmParameter() <em>Pcm Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter pcmParameter;

	/**
	 * The cached value of the '{@link #getJavaParameter() <em>Java Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaParameter()
	 * @generated
	 * @ordered
	 */
	protected edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter javaParameter;

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
	public Parameter getPcmParameter() {
		if (pcmParameter != null && ((EObject)pcmParameter).eIsProxy()) {
			InternalEObject oldPcmParameter = (InternalEObject)pcmParameter;
			pcmParameter = (Parameter)eResolveProxy(oldPcmParameter);
			if (pcmParameter != oldPcmParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCM_PARAMETER, oldPcmParameter, pcmParameter));
			}
		}
		return pcmParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetPcmParameter() {
		return pcmParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmParameter(Parameter newPcmParameter) {
		Parameter oldPcmParameter = pcmParameter;
		pcmParameter = newPcmParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCM_PARAMETER, oldPcmParameter, pcmParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter getJavaParameter() {
		if (javaParameter != null && javaParameter.eIsProxy()) {
			InternalEObject oldJavaParameter = (InternalEObject)javaParameter;
			javaParameter = (edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter)eResolveProxy(oldJavaParameter);
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
	public edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter basicGetJavaParameter() {
		return javaParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaParameter(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter newJavaParameter) {
		edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter oldJavaParameter = javaParameter;
		javaParameter = newJavaParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.PARAMETER2_PARAMETER__JAVA_PARAMETER, oldJavaParameter, javaParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCM_PARAMETER:
				if (resolve) return getPcmParameter();
				return basicGetPcmParameter();
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__JAVA_PARAMETER:
				if (resolve) return getJavaParameter();
				return basicGetJavaParameter();
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
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCM_PARAMETER:
				setPcmParameter((Parameter)newValue);
				return;
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__JAVA_PARAMETER:
				setJavaParameter((edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter)newValue);
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
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCM_PARAMETER:
				setPcmParameter((Parameter)null);
				return;
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__JAVA_PARAMETER:
				setJavaParameter((edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter)null);
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
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__PCM_PARAMETER:
				return pcmParameter != null;
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER__JAVA_PARAMETER:
				return javaParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //Parameter2ParameterImpl
