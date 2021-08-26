/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface;

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

import org.palladiosimulator.pcm.repository.BasicComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component2 Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Component2ClassImpl#getPcmComponent <em>Pcm Component</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Component2ClassImpl#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Component2ClassImpl#getInterface2interface <em>Interface2interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Component2ClassImpl extends MinimalEObjectImpl.Container implements Component2Class {
	/**
	 * The cached value of the '{@link #getPcmComponent() <em>Pcm Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmComponent()
	 * @generated
	 * @ordered
	 */
	protected BasicComponent pcmComponent;

	/**
	 * The cached value of the '{@link #getJavaClass() <em>Java Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClass()
	 * @generated
	 * @ordered
	 */
	protected edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class javaClass;

	/**
	 * The cached value of the '{@link #getInterface2interface() <em>Interface2interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface2interface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface2Interface> interface2interface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Component2ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencemodelPackage.Literals.COMPONENT2_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicComponent getPcmComponent() {
		if (pcmComponent != null && ((EObject)pcmComponent).eIsProxy()) {
			InternalEObject oldPcmComponent = (InternalEObject)pcmComponent;
			pcmComponent = (BasicComponent)eResolveProxy(oldPcmComponent);
			if (pcmComponent != oldPcmComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorrespondencemodelPackage.COMPONENT2_CLASS__PCM_COMPONENT, oldPcmComponent, pcmComponent));
			}
		}
		return pcmComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicComponent basicGetPcmComponent() {
		return pcmComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmComponent(BasicComponent newPcmComponent) {
		BasicComponent oldPcmComponent = pcmComponent;
		pcmComponent = newPcmComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.COMPONENT2_CLASS__PCM_COMPONENT, oldPcmComponent, pcmComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class getJavaClass() {
		if (javaClass != null && javaClass.eIsProxy()) {
			InternalEObject oldJavaClass = (InternalEObject)javaClass;
			javaClass = (edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class)eResolveProxy(oldJavaClass);
			if (javaClass != oldJavaClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorrespondencemodelPackage.COMPONENT2_CLASS__JAVA_CLASS, oldJavaClass, javaClass));
			}
		}
		return javaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class basicGetJavaClass() {
		return javaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaClass(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class newJavaClass) {
		edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class oldJavaClass = javaClass;
		javaClass = newJavaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.COMPONENT2_CLASS__JAVA_CLASS, oldJavaClass, javaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface2Interface> getInterface2interface() {
		if (interface2interface == null) {
			interface2interface = new EObjectContainmentEList<Interface2Interface>(Interface2Interface.class, this, CorrespondencemodelPackage.COMPONENT2_CLASS__INTERFACE2INTERFACE);
		}
		return interface2interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencemodelPackage.COMPONENT2_CLASS__INTERFACE2INTERFACE:
				return ((InternalEList<?>)getInterface2interface()).basicRemove(otherEnd, msgs);
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
			case CorrespondencemodelPackage.COMPONENT2_CLASS__PCM_COMPONENT:
				if (resolve) return getPcmComponent();
				return basicGetPcmComponent();
			case CorrespondencemodelPackage.COMPONENT2_CLASS__JAVA_CLASS:
				if (resolve) return getJavaClass();
				return basicGetJavaClass();
			case CorrespondencemodelPackage.COMPONENT2_CLASS__INTERFACE2INTERFACE:
				return getInterface2interface();
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
			case CorrespondencemodelPackage.COMPONENT2_CLASS__PCM_COMPONENT:
				setPcmComponent((BasicComponent)newValue);
				return;
			case CorrespondencemodelPackage.COMPONENT2_CLASS__JAVA_CLASS:
				setJavaClass((edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class)newValue);
				return;
			case CorrespondencemodelPackage.COMPONENT2_CLASS__INTERFACE2INTERFACE:
				getInterface2interface().clear();
				getInterface2interface().addAll((Collection<? extends Interface2Interface>)newValue);
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
			case CorrespondencemodelPackage.COMPONENT2_CLASS__PCM_COMPONENT:
				setPcmComponent((BasicComponent)null);
				return;
			case CorrespondencemodelPackage.COMPONENT2_CLASS__JAVA_CLASS:
				setJavaClass((edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class)null);
				return;
			case CorrespondencemodelPackage.COMPONENT2_CLASS__INTERFACE2INTERFACE:
				getInterface2interface().clear();
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
			case CorrespondencemodelPackage.COMPONENT2_CLASS__PCM_COMPONENT:
				return pcmComponent != null;
			case CorrespondencemodelPackage.COMPONENT2_CLASS__JAVA_CLASS:
				return javaClass != null;
			case CorrespondencemodelPackage.COMPONENT2_CLASS__INTERFACE2INTERFACE:
				return interface2interface != null && !interface2interface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Component2ClassImpl
