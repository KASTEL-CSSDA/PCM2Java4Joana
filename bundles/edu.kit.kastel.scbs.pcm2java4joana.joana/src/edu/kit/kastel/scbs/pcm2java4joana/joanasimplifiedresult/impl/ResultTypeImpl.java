/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.ResultType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.ResultTypeImpl#getTypeString <em>Type String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultTypeImpl extends MinimalEObjectImpl.Container implements ResultType {
	/**
	 * The default value of the '{@link #getTypeString() <em>Type String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeString()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeString() <em>Type String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeString()
	 * @generated
	 * @ordered
	 */
	protected String typeString = TYPE_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanasimplifiedresultPackage.Literals.RESULT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeString() {
		return typeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeString(String newTypeString) {
		String oldTypeString = typeString;
		typeString = newTypeString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanasimplifiedresultPackage.RESULT_TYPE__TYPE_STRING, oldTypeString, typeString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoanasimplifiedresultPackage.RESULT_TYPE__TYPE_STRING:
				return getTypeString();
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
			case JoanasimplifiedresultPackage.RESULT_TYPE__TYPE_STRING:
				setTypeString((String)newValue);
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
			case JoanasimplifiedresultPackage.RESULT_TYPE__TYPE_STRING:
				setTypeString(TYPE_STRING_EDEFAULT);
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
			case JoanasimplifiedresultPackage.RESULT_TYPE__TYPE_STRING:
				return TYPE_STRING_EDEFAULT == null ? typeString != null : !TYPE_STRING_EDEFAULT.equals(typeString);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (typeString: ");
		result.append(typeString);
		result.append(')');
		return result.toString();
	}

} //ResultTypeImpl
