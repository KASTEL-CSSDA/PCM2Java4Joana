/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelPackage;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.PCMInterface;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;

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
 * An implementation of the model object '<em><b>Interface2 Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Interface2InterfaceImpl#getJavaInterface <em>Java Interface</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Interface2InterfaceImpl#getOperation2method <em>Operation2method</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl.Interface2InterfaceImpl#getPcminterface <em>Pcminterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface2InterfaceImpl extends MinimalEObjectImpl.Container implements Interface2Interface {
	/**
	 * The cached value of the '{@link #getJavaInterface() <em>Java Interface</em>}' containment reference.
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
	 * The cached value of the '{@link #getPcminterface() <em>Pcminterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcminterface()
	 * @generated
	 * @ordered
	 */
	protected PCMInterface pcminterface;

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
	public Interface getJavaInterface() {
		return javaInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaInterface(Interface newJavaInterface, NotificationChain msgs) {
		Interface oldJavaInterface = javaInterface;
		javaInterface = newJavaInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE, oldJavaInterface, newJavaInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaInterface(Interface newJavaInterface) {
		if (newJavaInterface != javaInterface) {
			NotificationChain msgs = null;
			if (javaInterface != null)
				msgs = ((InternalEObject)javaInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE, null, msgs);
			if (newJavaInterface != null)
				msgs = ((InternalEObject)newJavaInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE, null, msgs);
			msgs = basicSetJavaInterface(newJavaInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE, newJavaInterface, newJavaInterface));
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
	public PCMInterface getPcminterface() {
		return pcminterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPcminterface(PCMInterface newPcminterface, NotificationChain msgs) {
		PCMInterface oldPcminterface = pcminterface;
		pcminterface = newPcminterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCMINTERFACE, oldPcminterface, newPcminterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcminterface(PCMInterface newPcminterface) {
		if (newPcminterface != pcminterface) {
			NotificationChain msgs = null;
			if (pcminterface != null)
				msgs = ((InternalEObject)pcminterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCMINTERFACE, null, msgs);
			if (newPcminterface != null)
				msgs = ((InternalEObject)newPcminterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCMINTERFACE, null, msgs);
			msgs = basicSetPcminterface(newPcminterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCMINTERFACE, newPcminterface, newPcminterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE:
				return basicSetJavaInterface(null, msgs);
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__OPERATION2METHOD:
				return ((InternalEList<?>)getOperation2method()).basicRemove(otherEnd, msgs);
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCMINTERFACE:
				return basicSetPcminterface(null, msgs);
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
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE:
				return getJavaInterface();
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__OPERATION2METHOD:
				return getOperation2method();
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCMINTERFACE:
				return getPcminterface();
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
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE:
				setJavaInterface((Interface)newValue);
				return;
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__OPERATION2METHOD:
				getOperation2method().clear();
				getOperation2method().addAll((Collection<? extends Operation2Method>)newValue);
				return;
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCMINTERFACE:
				setPcminterface((PCMInterface)newValue);
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
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE:
				setJavaInterface((Interface)null);
				return;
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__OPERATION2METHOD:
				getOperation2method().clear();
				return;
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCMINTERFACE:
				setPcminterface((PCMInterface)null);
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
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__JAVA_INTERFACE:
				return javaInterface != null;
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__OPERATION2METHOD:
				return operation2method != null && !operation2method.isEmpty();
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE__PCMINTERFACE:
				return pcminterface != null;
		}
		return super.eIsSet(featureID);
	}

} //Interface2InterfaceImpl
