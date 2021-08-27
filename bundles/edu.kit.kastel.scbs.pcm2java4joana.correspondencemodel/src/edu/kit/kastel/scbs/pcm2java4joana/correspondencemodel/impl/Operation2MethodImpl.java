/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMOperation;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation2 Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Operation2MethodImpl#getJavaMethod <em>Java Method</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Operation2MethodImpl#getParameter2parameter <em>Parameter2parameter</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Operation2MethodImpl#getPcmoperation <em>Pcmoperation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Operation2MethodImpl extends MinimalEObjectImpl.Container implements Operation2Method {
	/**
	 * The cached value of the '{@link #getJavaMethod() <em>Java Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaMethod()
	 * @generated
	 * @ordered
	 */
	protected Method javaMethod;

	/**
	 * The cached value of the '{@link #getParameter2parameter() <em>Parameter2parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter2parameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter2Parameter> parameter2parameter;

	/**
	 * The cached value of the '{@link #getPcmoperation() <em>Pcmoperation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmoperation()
	 * @generated
	 * @ordered
	 */
	protected PCMOperation pcmoperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Operation2MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencemodelPackage.Literals.OPERATION2_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getJavaMethod() {
		if (javaMethod != null && javaMethod.eIsProxy()) {
			InternalEObject oldJavaMethod = (InternalEObject)javaMethod;
			javaMethod = (Method)eResolveProxy(oldJavaMethod);
			if (javaMethod != oldJavaMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorrespondencemodelPackage.OPERATION2_METHOD__JAVA_METHOD, oldJavaMethod, javaMethod));
			}
		}
		return javaMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetJavaMethod() {
		return javaMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaMethod(Method newJavaMethod) {
		Method oldJavaMethod = javaMethod;
		javaMethod = newJavaMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.OPERATION2_METHOD__JAVA_METHOD, oldJavaMethod, javaMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter2Parameter> getParameter2parameter() {
		if (parameter2parameter == null) {
			parameter2parameter = new EObjectContainmentEList<Parameter2Parameter>(Parameter2Parameter.class, this, CorrespondencemodelPackage.OPERATION2_METHOD__PARAMETER2PARAMETER);
		}
		return parameter2parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMOperation getPcmoperation() {
		return pcmoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPcmoperation(PCMOperation newPcmoperation, NotificationChain msgs) {
		PCMOperation oldPcmoperation = pcmoperation;
		pcmoperation = newPcmoperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.OPERATION2_METHOD__PCMOPERATION, oldPcmoperation, newPcmoperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmoperation(PCMOperation newPcmoperation) {
		if (newPcmoperation != pcmoperation) {
			NotificationChain msgs = null;
			if (pcmoperation != null)
				msgs = ((InternalEObject)pcmoperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorrespondencemodelPackage.OPERATION2_METHOD__PCMOPERATION, null, msgs);
			if (newPcmoperation != null)
				msgs = ((InternalEObject)newPcmoperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorrespondencemodelPackage.OPERATION2_METHOD__PCMOPERATION, null, msgs);
			msgs = basicSetPcmoperation(newPcmoperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.OPERATION2_METHOD__PCMOPERATION, newPcmoperation, newPcmoperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencemodelPackage.OPERATION2_METHOD__PARAMETER2PARAMETER:
				return ((InternalEList<?>)getParameter2parameter()).basicRemove(otherEnd, msgs);
			case CorrespondencemodelPackage.OPERATION2_METHOD__PCMOPERATION:
				return basicSetPcmoperation(null, msgs);
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
			case CorrespondencemodelPackage.OPERATION2_METHOD__JAVA_METHOD:
				if (resolve) return getJavaMethod();
				return basicGetJavaMethod();
			case CorrespondencemodelPackage.OPERATION2_METHOD__PARAMETER2PARAMETER:
				return getParameter2parameter();
			case CorrespondencemodelPackage.OPERATION2_METHOD__PCMOPERATION:
				return getPcmoperation();
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
			case CorrespondencemodelPackage.OPERATION2_METHOD__JAVA_METHOD:
				setJavaMethod((Method)newValue);
				return;
			case CorrespondencemodelPackage.OPERATION2_METHOD__PARAMETER2PARAMETER:
				getParameter2parameter().clear();
				getParameter2parameter().addAll((Collection<? extends Parameter2Parameter>)newValue);
				return;
			case CorrespondencemodelPackage.OPERATION2_METHOD__PCMOPERATION:
				setPcmoperation((PCMOperation)newValue);
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
			case CorrespondencemodelPackage.OPERATION2_METHOD__JAVA_METHOD:
				setJavaMethod((Method)null);
				return;
			case CorrespondencemodelPackage.OPERATION2_METHOD__PARAMETER2PARAMETER:
				getParameter2parameter().clear();
				return;
			case CorrespondencemodelPackage.OPERATION2_METHOD__PCMOPERATION:
				setPcmoperation((PCMOperation)null);
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
			case CorrespondencemodelPackage.OPERATION2_METHOD__JAVA_METHOD:
				return javaMethod != null;
			case CorrespondencemodelPackage.OPERATION2_METHOD__PARAMETER2PARAMETER:
				return parameter2parameter != null && !parameter2parameter.isEmpty();
			case CorrespondencemodelPackage.OPERATION2_METHOD__PCMOPERATION:
				return pcmoperation != null;
		}
		return super.eIsSet(featureID);
	}

} //Operation2MethodImpl
