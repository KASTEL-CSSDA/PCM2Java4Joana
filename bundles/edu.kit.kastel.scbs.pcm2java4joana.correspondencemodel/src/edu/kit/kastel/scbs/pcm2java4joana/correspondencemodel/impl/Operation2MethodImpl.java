/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation2 Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Operation2MethodImpl#getPcmOperation <em>Pcm Operation</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Operation2MethodImpl#getJavaMethod <em>Java Method</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Operation2MethodImpl#getParameter2parameter <em>Parameter2parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Operation2MethodImpl extends MinimalEObjectImpl.Container implements Operation2Method {
	/**
	 * The cached value of the '{@link #getPcmOperation() <em>Pcm Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmOperation()
	 * @generated
	 * @ordered
	 */
	protected OperationSignature pcmOperation;

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
	public OperationSignature getPcmOperation() {
		if (pcmOperation != null && ((EObject)pcmOperation).eIsProxy()) {
			InternalEObject oldPcmOperation = (InternalEObject)pcmOperation;
			pcmOperation = (OperationSignature)eResolveProxy(oldPcmOperation);
			if (pcmOperation != oldPcmOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorrespondencemodelPackage.OPERATION2_METHOD__PCM_OPERATION, oldPcmOperation, pcmOperation));
			}
		}
		return pcmOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature basicGetPcmOperation() {
		return pcmOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmOperation(OperationSignature newPcmOperation) {
		OperationSignature oldPcmOperation = pcmOperation;
		pcmOperation = newPcmOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.OPERATION2_METHOD__PCM_OPERATION, oldPcmOperation, pcmOperation));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencemodelPackage.OPERATION2_METHOD__PARAMETER2PARAMETER:
				return ((InternalEList<?>)getParameter2parameter()).basicRemove(otherEnd, msgs);
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
			case CorrespondencemodelPackage.OPERATION2_METHOD__PCM_OPERATION:
				if (resolve) return getPcmOperation();
				return basicGetPcmOperation();
			case CorrespondencemodelPackage.OPERATION2_METHOD__JAVA_METHOD:
				if (resolve) return getJavaMethod();
				return basicGetJavaMethod();
			case CorrespondencemodelPackage.OPERATION2_METHOD__PARAMETER2PARAMETER:
				return getParameter2parameter();
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
			case CorrespondencemodelPackage.OPERATION2_METHOD__PCM_OPERATION:
				setPcmOperation((OperationSignature)newValue);
				return;
			case CorrespondencemodelPackage.OPERATION2_METHOD__JAVA_METHOD:
				setJavaMethod((Method)newValue);
				return;
			case CorrespondencemodelPackage.OPERATION2_METHOD__PARAMETER2PARAMETER:
				getParameter2parameter().clear();
				getParameter2parameter().addAll((Collection<? extends Parameter2Parameter>)newValue);
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
			case CorrespondencemodelPackage.OPERATION2_METHOD__PCM_OPERATION:
				setPcmOperation((OperationSignature)null);
				return;
			case CorrespondencemodelPackage.OPERATION2_METHOD__JAVA_METHOD:
				setJavaMethod((Method)null);
				return;
			case CorrespondencemodelPackage.OPERATION2_METHOD__PARAMETER2PARAMETER:
				getParameter2parameter().clear();
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
			case CorrespondencemodelPackage.OPERATION2_METHOD__PCM_OPERATION:
				return pcmOperation != null;
			case CorrespondencemodelPackage.OPERATION2_METHOD__JAVA_METHOD:
				return javaMethod != null;
			case CorrespondencemodelPackage.OPERATION2_METHOD__PARAMETER2PARAMETER:
				return parameter2parameter != null && !parameter2parameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Operation2MethodImpl
