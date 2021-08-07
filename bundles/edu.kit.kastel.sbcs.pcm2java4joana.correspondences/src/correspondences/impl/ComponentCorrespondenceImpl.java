/**
 */
package correspondences.impl;

import correspondences.ComponentCorrespondence;
import correspondences.CorrespondencesPackage;
import correspondences.MethodCorrespondence;
import correspondences.PCMComponent;
import correspondences.SourceCodeClass;

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
 * An implementation of the model object '<em><b>Component Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link correspondences.impl.ComponentCorrespondenceImpl#getPcmcomponent <em>Pcmcomponent</em>}</li>
 *   <li>{@link correspondences.impl.ComponentCorrespondenceImpl#getSourcecodeclass <em>Sourcecodeclass</em>}</li>
 *   <li>{@link correspondences.impl.ComponentCorrespondenceImpl#getMethodcorrespondence <em>Methodcorrespondence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentCorrespondenceImpl extends CorrespondenceElementImpl implements ComponentCorrespondence {
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
	 * The cached value of the '{@link #getSourcecodeclass() <em>Sourcecodeclass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcecodeclass()
	 * @generated
	 * @ordered
	 */
	protected SourceCodeClass sourcecodeclass;

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
	protected ComponentCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencesPackage.Literals.COMPONENT_CORRESPONDENCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.COMPONENT_CORRESPONDENCE__PCMCOMPONENT, oldPcmcomponent, newPcmcomponent);
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
				msgs = ((InternalEObject)pcmcomponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.COMPONENT_CORRESPONDENCE__PCMCOMPONENT, null, msgs);
			if (newPcmcomponent != null)
				msgs = ((InternalEObject)newPcmcomponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.COMPONENT_CORRESPONDENCE__PCMCOMPONENT, null, msgs);
			msgs = basicSetPcmcomponent(newPcmcomponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.COMPONENT_CORRESPONDENCE__PCMCOMPONENT, newPcmcomponent, newPcmcomponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCodeClass getSourcecodeclass() {
		return sourcecodeclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourcecodeclass(SourceCodeClass newSourcecodeclass, NotificationChain msgs) {
		SourceCodeClass oldSourcecodeclass = sourcecodeclass;
		sourcecodeclass = newSourcecodeclass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.COMPONENT_CORRESPONDENCE__SOURCECODECLASS, oldSourcecodeclass, newSourcecodeclass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcecodeclass(SourceCodeClass newSourcecodeclass) {
		if (newSourcecodeclass != sourcecodeclass) {
			NotificationChain msgs = null;
			if (sourcecodeclass != null)
				msgs = ((InternalEObject)sourcecodeclass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.COMPONENT_CORRESPONDENCE__SOURCECODECLASS, null, msgs);
			if (newSourcecodeclass != null)
				msgs = ((InternalEObject)newSourcecodeclass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.COMPONENT_CORRESPONDENCE__SOURCECODECLASS, null, msgs);
			msgs = basicSetSourcecodeclass(newSourcecodeclass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.COMPONENT_CORRESPONDENCE__SOURCECODECLASS, newSourcecodeclass, newSourcecodeclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodCorrespondence> getMethodcorrespondence() {
		if (methodcorrespondence == null) {
			methodcorrespondence = new EObjectContainmentEList<MethodCorrespondence>(MethodCorrespondence.class, this, CorrespondencesPackage.COMPONENT_CORRESPONDENCE__METHODCORRESPONDENCE);
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
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__PCMCOMPONENT:
				return basicSetPcmcomponent(null, msgs);
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__SOURCECODECLASS:
				return basicSetSourcecodeclass(null, msgs);
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__METHODCORRESPONDENCE:
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
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__PCMCOMPONENT:
				return getPcmcomponent();
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__SOURCECODECLASS:
				return getSourcecodeclass();
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__METHODCORRESPONDENCE:
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
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__PCMCOMPONENT:
				setPcmcomponent((PCMComponent)newValue);
				return;
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__SOURCECODECLASS:
				setSourcecodeclass((SourceCodeClass)newValue);
				return;
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__METHODCORRESPONDENCE:
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
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__PCMCOMPONENT:
				setPcmcomponent((PCMComponent)null);
				return;
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__SOURCECODECLASS:
				setSourcecodeclass((SourceCodeClass)null);
				return;
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__METHODCORRESPONDENCE:
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
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__PCMCOMPONENT:
				return pcmcomponent != null;
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__SOURCECODECLASS:
				return sourcecodeclass != null;
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE__METHODCORRESPONDENCE:
				return methodcorrespondence != null && !methodcorrespondence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentCorrespondenceImpl
