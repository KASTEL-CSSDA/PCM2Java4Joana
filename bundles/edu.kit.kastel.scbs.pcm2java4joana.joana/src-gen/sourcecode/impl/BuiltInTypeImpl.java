/**
 */
package sourcecode.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sourcecode.BuiltInType;
import sourcecode.BuiltInTypes;
import sourcecode.SourcecodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Built In Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sourcecode.impl.BuiltInTypeImpl#getBuiltInType <em>Built In Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuiltInTypeImpl extends TypeImpl implements BuiltInType {
	/**
	 * The default value of the '{@link #getBuiltInType() <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInType()
	 * @generated
	 * @ordered
	 */
	protected static final BuiltInTypes BUILT_IN_TYPE_EDEFAULT = BuiltInTypes.BOOLEAN;

	/**
	 * The cached value of the '{@link #getBuiltInType() <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInTypes builtInType = BUILT_IN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuiltInTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcecodePackage.Literals.BUILT_IN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInTypes getBuiltInType() {
		return builtInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuiltInType(BuiltInTypes newBuiltInType) {
		BuiltInTypes oldBuiltInType = builtInType;
		builtInType = newBuiltInType == null ? BUILT_IN_TYPE_EDEFAULT : newBuiltInType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourcecodePackage.BUILT_IN_TYPE__BUILT_IN_TYPE,
					oldBuiltInType, builtInType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SourcecodePackage.BUILT_IN_TYPE__BUILT_IN_TYPE:
			return getBuiltInType();
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
		case SourcecodePackage.BUILT_IN_TYPE__BUILT_IN_TYPE:
			setBuiltInType((BuiltInTypes) newValue);
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
		case SourcecodePackage.BUILT_IN_TYPE__BUILT_IN_TYPE:
			setBuiltInType(BUILT_IN_TYPE_EDEFAULT);
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
		case SourcecodePackage.BUILT_IN_TYPE__BUILT_IN_TYPE:
			return builtInType != BUILT_IN_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (builtInType: ");
		result.append(builtInType);
		result.append(')');
		return result.toString();
	}

} //BuiltInTypeImpl
