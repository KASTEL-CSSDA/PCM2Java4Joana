/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;

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

import org.palladiosimulator.pcm.repository.OperationInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface2 Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Interface2InterfaceImpl#getPcmInterface <em>Pcm Interface</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Interface2InterfaceImpl#getJavaInterface <em>Java Interface</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Interface2InterfaceImpl#getOperation2method <em>Operation2method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface2InterfaceImpl extends MinimalEObjectImpl.Container implements Interface2Interface {
	/**
	 * The cached value of the '{@link #getPcmInterface() <em>Pcm Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmInterface()
	 * @generated
	 * @ordered
	 */
	protected OperationInterface pcmInterface;

	/**
	 * The cached value of the '{@link #getJavaInterface() <em>Java Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface javaInterface;

	/**
	 * The cached value of the '{@link #getOperation2method() <em>Operation2method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation2method()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation2Method> operation2method;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interface2InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencemodelPackage.Literals.INTERFACE2_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface getPcmInterface() {
		if (pcmInterface != null && ((EObject)pcmInterface).eIsProxy()) {
			InternalEObject oldPcmInterface = (InternalEObject)pcmInterface;
			pcmInterface = (OperationInterface)eResolveProxy(oldPcmInterface);
			if (pcmInterface != oldPcmInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCM_INTERFACE, oldPcmInterface, pcmInterface));
			}
		}
		return pcmInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface basicGetPcmInterface() {
		return pcmInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmInterface(OperationInterface newPcmInterface) {
		OperationInterface oldPcmInterface = pcmInterface;
		pcmInterface = newPcmInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCM_INTERFACE, oldPcmInterface, pcmInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getJavaInterface() {
		if (javaInterface != null && javaInterface.eIsProxy()) {
			InternalEObject oldJavaInterface = (InternalEObject)javaInterface;
			javaInterface = (Interface)eResolveProxy(oldJavaInterface);
			if (javaInterface != oldJavaInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE, oldJavaInterface, javaInterface));
			}
		}
		return javaInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetJavaInterface() {
		return javaInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaInterface(Interface newJavaInterface) {
		Interface oldJavaInterface = javaInterface;
		javaInterface = newJavaInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE, oldJavaInterface, javaInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation2Method> getOperation2method() {
		if (operation2method == null) {
			operation2method = new EObjectContainmentEList<Operation2Method>(Operation2Method.class, this, CorrespondencemodelPackage.INTERFACE2_INTERFACE__OPERATION2METHOD);
		}
		return operation2method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__OPERATION2METHOD:
				return ((InternalEList<?>)getOperation2method()).basicRemove(otherEnd, msgs);
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
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCM_INTERFACE:
				if (resolve) return getPcmInterface();
				return basicGetPcmInterface();
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE:
				if (resolve) return getJavaInterface();
				return basicGetJavaInterface();
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__OPERATION2METHOD:
				return getOperation2method();
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
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCM_INTERFACE:
				setPcmInterface((OperationInterface)newValue);
				return;
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE:
				setJavaInterface((Interface)newValue);
				return;
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__OPERATION2METHOD:
				getOperation2method().clear();
				getOperation2method().addAll((Collection<? extends Operation2Method>)newValue);
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
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCM_INTERFACE:
				setPcmInterface((OperationInterface)null);
				return;
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE:
				setJavaInterface((Interface)null);
				return;
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__OPERATION2METHOD:
				getOperation2method().clear();
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
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCM_INTERFACE:
				return pcmInterface != null;
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE:
				return javaInterface != null;
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__OPERATION2METHOD:
				return operation2method != null && !operation2method.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Interface2InterfaceImpl
