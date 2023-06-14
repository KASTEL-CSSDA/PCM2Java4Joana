/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.ReferenceType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodePackage;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ReferenceTypeImpl#getTopleveltype <em>Topleveltype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceTypeImpl extends TypeImpl implements ReferenceType {
	/**
	 * The cached value of the '{@link #getTopleveltype() <em>Topleveltype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopleveltype()
	 * @generated
	 * @ordered
	 */
	protected TopLevelType topleveltype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcecodePackage.Literals.REFERENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelType getTopleveltype() {
		if (topleveltype != null && topleveltype.eIsProxy()) {
			InternalEObject oldTopleveltype = (InternalEObject)topleveltype;
			topleveltype = (TopLevelType)eResolveProxy(oldTopleveltype);
			if (topleveltype != oldTopleveltype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SourcecodePackage.REFERENCE_TYPE__TOPLEVELTYPE, oldTopleveltype, topleveltype));
			}
		}
		return topleveltype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelType basicGetTopleveltype() {
		return topleveltype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopleveltype(TopLevelType newTopleveltype) {
		TopLevelType oldTopleveltype = topleveltype;
		topleveltype = newTopleveltype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourcecodePackage.REFERENCE_TYPE__TOPLEVELTYPE, oldTopleveltype, topleveltype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SourcecodePackage.REFERENCE_TYPE__TOPLEVELTYPE:
				if (resolve) return getTopleveltype();
				return basicGetTopleveltype();
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
			case SourcecodePackage.REFERENCE_TYPE__TOPLEVELTYPE:
				setTopleveltype((TopLevelType)newValue);
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
			case SourcecodePackage.REFERENCE_TYPE__TOPLEVELTYPE:
				setTopleveltype((TopLevelType)null);
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
			case SourcecodePackage.REFERENCE_TYPE__TOPLEVELTYPE:
				return topleveltype != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceTypeImpl
