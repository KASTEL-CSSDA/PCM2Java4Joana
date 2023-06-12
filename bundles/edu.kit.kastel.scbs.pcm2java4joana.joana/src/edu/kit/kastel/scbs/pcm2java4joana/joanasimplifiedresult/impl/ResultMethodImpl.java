/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.ResultMethod;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.ResultType;

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
 * An implementation of the model object '<em><b>Result Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.ResultMethodImpl#getParamterTypes <em>Paramter Types</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.ResultMethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.ResultMethodImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultMethodImpl extends MinimalEObjectImpl.Container implements ResultMethod {
	/**
	 * The cached value of the '{@link #getParamterTypes() <em>Paramter Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamterTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultType> paramterTypes;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected ResultType returnType;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanasimplifiedresultPackage.Literals.RESULT_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultType> getParamterTypes() {
		if (paramterTypes == null) {
			paramterTypes = new EObjectContainmentEList<ResultType>(ResultType.class, this, JoanasimplifiedresultPackage.RESULT_METHOD__PARAMTER_TYPES);
		}
		return paramterTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(ResultType newReturnType, NotificationChain msgs) {
		ResultType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoanasimplifiedresultPackage.RESULT_METHOD__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(ResultType newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoanasimplifiedresultPackage.RESULT_METHOD__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoanasimplifiedresultPackage.RESULT_METHOD__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanasimplifiedresultPackage.RESULT_METHOD__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanasimplifiedresultPackage.RESULT_METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JoanasimplifiedresultPackage.RESULT_METHOD__PARAMTER_TYPES:
				return ((InternalEList<?>)getParamterTypes()).basicRemove(otherEnd, msgs);
			case JoanasimplifiedresultPackage.RESULT_METHOD__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
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
			case JoanasimplifiedresultPackage.RESULT_METHOD__PARAMTER_TYPES:
				return getParamterTypes();
			case JoanasimplifiedresultPackage.RESULT_METHOD__RETURN_TYPE:
				return getReturnType();
			case JoanasimplifiedresultPackage.RESULT_METHOD__NAME:
				return getName();
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
			case JoanasimplifiedresultPackage.RESULT_METHOD__PARAMTER_TYPES:
				getParamterTypes().clear();
				getParamterTypes().addAll((Collection<? extends ResultType>)newValue);
				return;
			case JoanasimplifiedresultPackage.RESULT_METHOD__RETURN_TYPE:
				setReturnType((ResultType)newValue);
				return;
			case JoanasimplifiedresultPackage.RESULT_METHOD__NAME:
				setName((String)newValue);
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
			case JoanasimplifiedresultPackage.RESULT_METHOD__PARAMTER_TYPES:
				getParamterTypes().clear();
				return;
			case JoanasimplifiedresultPackage.RESULT_METHOD__RETURN_TYPE:
				setReturnType((ResultType)null);
				return;
			case JoanasimplifiedresultPackage.RESULT_METHOD__NAME:
				setName(NAME_EDEFAULT);
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
			case JoanasimplifiedresultPackage.RESULT_METHOD__PARAMTER_TYPES:
				return paramterTypes != null && !paramterTypes.isEmpty();
			case JoanasimplifiedresultPackage.RESULT_METHOD__RETURN_TYPE:
				return returnType != null;
			case JoanasimplifiedresultPackage.RESULT_METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResultMethodImpl
