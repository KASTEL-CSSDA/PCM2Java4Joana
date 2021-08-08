/**
 */
package correspondences.impl;

import correspondences.CorrespondencesPackage;
import correspondences.MethodCorrespondence;
import correspondences.PCMMethod;
import correspondences.ParameterCorrespondence;
import correspondences.SourceCodeMethod;

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
 * An implementation of the model object '<em><b>Method Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link correspondences.impl.MethodCorrespondenceImpl#getPcmmethod <em>Pcmmethod</em>}</li>
 *   <li>{@link correspondences.impl.MethodCorrespondenceImpl#getSourcecodemethod <em>Sourcecodemethod</em>}</li>
 *   <li>{@link correspondences.impl.MethodCorrespondenceImpl#getParametercorrespondence <em>Parametercorrespondence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCorrespondenceImpl extends CorrespondenceElementImpl implements MethodCorrespondence {
	/**
	 * The cached value of the '{@link #getPcmmethod() <em>Pcmmethod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmmethod()
	 * @generated
	 * @ordered
	 */
	protected PCMMethod pcmmethod;

	/**
	 * The cached value of the '{@link #getSourcecodemethod() <em>Sourcecodemethod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcecodemethod()
	 * @generated
	 * @ordered
	 */
	protected SourceCodeMethod sourcecodemethod;

	/**
	 * The cached value of the '{@link #getParametercorrespondence() <em>Parametercorrespondence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametercorrespondence()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCorrespondence> parametercorrespondence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencesPackage.Literals.METHOD_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMMethod getPcmmethod() {
		return pcmmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPcmmethod(PCMMethod newPcmmethod, NotificationChain msgs) {
		PCMMethod oldPcmmethod = pcmmethod;
		pcmmethod = newPcmmethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD, oldPcmmethod, newPcmmethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmmethod(PCMMethod newPcmmethod) {
		if (newPcmmethod != pcmmethod) {
			NotificationChain msgs = null;
			if (pcmmethod != null)
				msgs = ((InternalEObject)pcmmethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD, null, msgs);
			if (newPcmmethod != null)
				msgs = ((InternalEObject)newPcmmethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD, null, msgs);
			msgs = basicSetPcmmethod(newPcmmethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD, newPcmmethod, newPcmmethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCodeMethod getSourcecodemethod() {
		return sourcecodemethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourcecodemethod(SourceCodeMethod newSourcecodemethod, NotificationChain msgs) {
		SourceCodeMethod oldSourcecodemethod = sourcecodemethod;
		sourcecodemethod = newSourcecodemethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD, oldSourcecodemethod, newSourcecodemethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcecodemethod(SourceCodeMethod newSourcecodemethod) {
		if (newSourcecodemethod != sourcecodemethod) {
			NotificationChain msgs = null;
			if (sourcecodemethod != null)
				msgs = ((InternalEObject)sourcecodemethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD, null, msgs);
			if (newSourcecodemethod != null)
				msgs = ((InternalEObject)newSourcecodemethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD, null, msgs);
			msgs = basicSetSourcecodemethod(newSourcecodemethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD, newSourcecodemethod, newSourcecodemethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCorrespondence> getParametercorrespondence() {
		if (parametercorrespondence == null) {
			parametercorrespondence = new EObjectContainmentEList<ParameterCorrespondence>(ParameterCorrespondence.class, this, CorrespondencesPackage.METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE);
		}
		return parametercorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD:
				return basicSetPcmmethod(null, msgs);
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD:
				return basicSetSourcecodemethod(null, msgs);
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE:
				return ((InternalEList<?>)getParametercorrespondence()).basicRemove(otherEnd, msgs);
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
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD:
				return getPcmmethod();
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD:
				return getSourcecodemethod();
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE:
				return getParametercorrespondence();
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
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD:
				setPcmmethod((PCMMethod)newValue);
				return;
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD:
				setSourcecodemethod((SourceCodeMethod)newValue);
				return;
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE:
				getParametercorrespondence().clear();
				getParametercorrespondence().addAll((Collection<? extends ParameterCorrespondence>)newValue);
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
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD:
				setPcmmethod((PCMMethod)null);
				return;
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD:
				setSourcecodemethod((SourceCodeMethod)null);
				return;
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE:
				getParametercorrespondence().clear();
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
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD:
				return pcmmethod != null;
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD:
				return sourcecodemethod != null;
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE:
				return parametercorrespondence != null && !parametercorrespondence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodCorrespondenceImpl
