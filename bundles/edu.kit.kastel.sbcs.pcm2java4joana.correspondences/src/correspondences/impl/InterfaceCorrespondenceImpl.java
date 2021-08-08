/**
 */
package correspondences.impl;

import correspondences.CorrespondencesPackage;
import correspondences.InterfaceCorrespondence;
import correspondences.MethodCorrespondence;
import correspondences.PCMProvidedInterface;
import correspondences.SourceCodeInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link correspondences.impl.InterfaceCorrespondenceImpl#getSourcecodeinterface <em>Sourcecodeinterface</em>}</li>
 *   <li>{@link correspondences.impl.InterfaceCorrespondenceImpl#getPcmprovidedinterface <em>Pcmprovidedinterface</em>}</li>
 *   <li>{@link correspondences.impl.InterfaceCorrespondenceImpl#getMethodcorrespondence <em>Methodcorrespondence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceCorrespondenceImpl extends CorrespondenceElementImpl implements InterfaceCorrespondence {
	/**
	 * The cached value of the '{@link #getSourcecodeinterface() <em>Sourcecodeinterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcecodeinterface()
	 * @generated
	 * @ordered
	 */
	protected SourceCodeInterface sourcecodeinterface;

	/**
	 * The cached value of the '{@link #getPcmprovidedinterface() <em>Pcmprovidedinterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmprovidedinterface()
	 * @generated
	 * @ordered
	 */
	protected PCMProvidedInterface pcmprovidedinterface;

	/**
	 * The cached value of the '{@link #getMethodcorrespondence() <em>Methodcorrespondence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodcorrespondence()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodCorrespondence> methodcorrespondence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencesPackage.Literals.INTERFACE_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCodeInterface getSourcecodeinterface() {
		return sourcecodeinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourcecodeinterface(SourceCodeInterface newSourcecodeinterface, NotificationChain msgs) {
		SourceCodeInterface oldSourcecodeinterface = sourcecodeinterface;
		sourcecodeinterface = newSourcecodeinterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.INTERFACE_CORRESPONDENCE__SOURCECODEINTERFACE, oldSourcecodeinterface, newSourcecodeinterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcecodeinterface(SourceCodeInterface newSourcecodeinterface) {
		if (newSourcecodeinterface != sourcecodeinterface) {
			NotificationChain msgs = null;
			if (sourcecodeinterface != null)
				msgs = ((InternalEObject)sourcecodeinterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.INTERFACE_CORRESPONDENCE__SOURCECODEINTERFACE, null, msgs);
			if (newSourcecodeinterface != null)
				msgs = ((InternalEObject)newSourcecodeinterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.INTERFACE_CORRESPONDENCE__SOURCECODEINTERFACE, null, msgs);
			msgs = basicSetSourcecodeinterface(newSourcecodeinterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.INTERFACE_CORRESPONDENCE__SOURCECODEINTERFACE, newSourcecodeinterface, newSourcecodeinterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMProvidedInterface getPcmprovidedinterface() {
		return pcmprovidedinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPcmprovidedinterface(PCMProvidedInterface newPcmprovidedinterface, NotificationChain msgs) {
		PCMProvidedInterface oldPcmprovidedinterface = pcmprovidedinterface;
		pcmprovidedinterface = newPcmprovidedinterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.INTERFACE_CORRESPONDENCE__PCMPROVIDEDINTERFACE, oldPcmprovidedinterface, newPcmprovidedinterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmprovidedinterface(PCMProvidedInterface newPcmprovidedinterface) {
		if (newPcmprovidedinterface != pcmprovidedinterface) {
			NotificationChain msgs = null;
			if (pcmprovidedinterface != null)
				msgs = ((InternalEObject)pcmprovidedinterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.INTERFACE_CORRESPONDENCE__PCMPROVIDEDINTERFACE, null, msgs);
			if (newPcmprovidedinterface != null)
				msgs = ((InternalEObject)newPcmprovidedinterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.INTERFACE_CORRESPONDENCE__PCMPROVIDEDINTERFACE, null, msgs);
			msgs = basicSetPcmprovidedinterface(newPcmprovidedinterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.INTERFACE_CORRESPONDENCE__PCMPROVIDEDINTERFACE, newPcmprovidedinterface, newPcmprovidedinterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodCorrespondence> getMethodcorrespondence() {
		if (methodcorrespondence == null) {
			methodcorrespondence = new EObjectContainmentEList<MethodCorrespondence>(MethodCorrespondence.class, this, CorrespondencesPackage.INTERFACE_CORRESPONDENCE__METHODCORRESPONDENCE);
		}
		return methodcorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__SOURCECODEINTERFACE:
				return basicSetSourcecodeinterface(null, msgs);
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__PCMPROVIDEDINTERFACE:
				return basicSetPcmprovidedinterface(null, msgs);
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__METHODCORRESPONDENCE:
				return ((InternalEList<?>)getMethodcorrespondence()).basicRemove(otherEnd, msgs);
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
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__SOURCECODEINTERFACE:
				return getSourcecodeinterface();
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__PCMPROVIDEDINTERFACE:
				return getPcmprovidedinterface();
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__METHODCORRESPONDENCE:
				return getMethodcorrespondence();
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
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__SOURCECODEINTERFACE:
				setSourcecodeinterface((SourceCodeInterface)newValue);
				return;
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__PCMPROVIDEDINTERFACE:
				setPcmprovidedinterface((PCMProvidedInterface)newValue);
				return;
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__METHODCORRESPONDENCE:
				getMethodcorrespondence().clear();
				getMethodcorrespondence().addAll((Collection<? extends MethodCorrespondence>)newValue);
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
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__SOURCECODEINTERFACE:
				setSourcecodeinterface((SourceCodeInterface)null);
				return;
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__PCMPROVIDEDINTERFACE:
				setPcmprovidedinterface((PCMProvidedInterface)null);
				return;
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__METHODCORRESPONDENCE:
				getMethodcorrespondence().clear();
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
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__SOURCECODEINTERFACE:
				return sourcecodeinterface != null;
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__PCMPROVIDEDINTERFACE:
				return pcmprovidedinterface != null;
			case CorrespondencesPackage.INTERFACE_CORRESPONDENCE__METHODCORRESPONDENCE:
				return methodcorrespondence != null && !methodcorrespondence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceCorrespondenceImpl
