/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMComponent;

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
 * An implementation of the model object '<em><b>Component2 Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Component2ClassImpl#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Component2ClassImpl#getInterface2interface <em>Interface2interface</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Component2ClassImpl#getPcmcomponent <em>Pcmcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Component2ClassImpl extends MinimalEObjectImpl.Container implements Component2Class {
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
	 * The cached value of the '{@link #getPcmcomponent() <em>Pcmcomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmcomponent()
	 * @generated
	 * @ordered
	 */
	protected PCMComponent pcmcomponent;

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
	public PCMComponent getPcmcomponent() {
		return pcmcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPcmcomponent(PCMComponent newPcmcomponent, NotificationChain msgs) {
		PCMComponent oldPcmcomponent = pcmcomponent;
		pcmcomponent = newPcmcomponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.COMPONENT2_CLASS__PCMCOMPONENT, oldPcmcomponent, newPcmcomponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmcomponent(PCMComponent newPcmcomponent) {
		if (newPcmcomponent != pcmcomponent) {
			NotificationChain msgs = null;
			if (pcmcomponent != null)
				msgs = ((InternalEObject)pcmcomponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorrespondencemodelPackage.COMPONENT2_CLASS__PCMCOMPONENT, null, msgs);
			if (newPcmcomponent != null)
				msgs = ((InternalEObject)newPcmcomponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorrespondencemodelPackage.COMPONENT2_CLASS__PCMCOMPONENT, null, msgs);
			msgs = basicSetPcmcomponent(newPcmcomponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.COMPONENT2_CLASS__PCMCOMPONENT, newPcmcomponent, newPcmcomponent));
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
			case CorrespondencemodelPackage.COMPONENT2_CLASS__PCMCOMPONENT:
				return basicSetPcmcomponent(null, msgs);
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
			case CorrespondencemodelPackage.COMPONENT2_CLASS__JAVA_CLASS:
				if (resolve) return getJavaClass();
				return basicGetJavaClass();
			case CorrespondencemodelPackage.COMPONENT2_CLASS__INTERFACE2INTERFACE:
				return getInterface2interface();
			case CorrespondencemodelPackage.COMPONENT2_CLASS__PCMCOMPONENT:
				return getPcmcomponent();
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
			case CorrespondencemodelPackage.COMPONENT2_CLASS__JAVA_CLASS:
				setJavaClass((edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class)newValue);
				return;
			case CorrespondencemodelPackage.COMPONENT2_CLASS__INTERFACE2INTERFACE:
				getInterface2interface().clear();
				getInterface2interface().addAll((Collection<? extends Interface2Interface>)newValue);
				return;
			case CorrespondencemodelPackage.COMPONENT2_CLASS__PCMCOMPONENT:
				setPcmcomponent((PCMComponent)newValue);
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
			case CorrespondencemodelPackage.COMPONENT2_CLASS__JAVA_CLASS:
				setJavaClass((edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class)null);
				return;
			case CorrespondencemodelPackage.COMPONENT2_CLASS__INTERFACE2INTERFACE:
				getInterface2interface().clear();
				return;
			case CorrespondencemodelPackage.COMPONENT2_CLASS__PCMCOMPONENT:
				setPcmcomponent((PCMComponent)null);
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
			case CorrespondencemodelPackage.COMPONENT2_CLASS__JAVA_CLASS:
				return javaClass != null;
			case CorrespondencemodelPackage.COMPONENT2_CLASS__INTERFACE2INTERFACE:
				return interface2interface != null && !interface2interface.isEmpty();
			case CorrespondencemodelPackage.COMPONENT2_CLASS__PCMCOMPONENT:
				return pcmcomponent != null;
		}
		return super.eIsSet(featureID);
	}

} //Component2ClassImpl
