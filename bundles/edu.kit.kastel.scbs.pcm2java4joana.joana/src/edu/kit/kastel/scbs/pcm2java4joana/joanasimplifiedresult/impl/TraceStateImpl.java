/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.JoanasimplifiedresultPackage;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.TraceStateImpl#getTracePosition <em>Trace Position</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.TraceStateImpl#getTraceClassName <em>Trace Class Name</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.TraceStateImpl#getSecurityLevelName <em>Security Level Name</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.TraceStateImpl#getTraceMethod <em>Trace Method</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.impl.TraceStateImpl#getParameterIndex <em>Parameter Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceStateImpl extends MinimalEObjectImpl.Container implements TraceState {
	/**
	 * The default value of the '{@link #getTracePosition() <em>Trace Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracePosition()
	 * @generated
	 * @ordered
	 */
	protected static final int TRACE_POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTracePosition() <em>Trace Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracePosition()
	 * @generated
	 * @ordered
	 */
	protected int tracePosition = TRACE_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceClassName() <em>Trace Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceClassName() <em>Trace Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceClassName()
	 * @generated
	 * @ordered
	 */
	protected String traceClassName = TRACE_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityLevelName() <em>Security Level Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevelName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_LEVEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityLevelName() <em>Security Level Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevelName()
	 * @generated
	 * @ordered
	 */
	protected String securityLevelName = SECURITY_LEVEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTraceMethod() <em>Trace Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceMethod()
	 * @generated
	 * @ordered
	 */
	protected Method traceMethod;

	/**
	 * The default value of the '{@link #getParameterIndex() <em>Parameter Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int PARAMETER_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getParameterIndex() <em>Parameter Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterIndex()
	 * @generated
	 * @ordered
	 */
	protected int parameterIndex = PARAMETER_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanasimplifiedresultPackage.Literals.TRACE_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTracePosition() {
		return tracePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTracePosition(int newTracePosition) {
		int oldTracePosition = tracePosition;
		tracePosition = newTracePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanasimplifiedresultPackage.TRACE_STATE__TRACE_POSITION, oldTracePosition, tracePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceClassName() {
		return traceClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceClassName(String newTraceClassName) {
		String oldTraceClassName = traceClassName;
		traceClassName = newTraceClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanasimplifiedresultPackage.TRACE_STATE__TRACE_CLASS_NAME, oldTraceClassName, traceClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityLevelName() {
		return securityLevelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityLevelName(String newSecurityLevelName) {
		String oldSecurityLevelName = securityLevelName;
		securityLevelName = newSecurityLevelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanasimplifiedresultPackage.TRACE_STATE__SECURITY_LEVEL_NAME, oldSecurityLevelName, securityLevelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getTraceMethod() {
		if (traceMethod != null && traceMethod.eIsProxy()) {
			InternalEObject oldTraceMethod = (InternalEObject)traceMethod;
			traceMethod = (Method)eResolveProxy(oldTraceMethod);
			if (traceMethod != oldTraceMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoanasimplifiedresultPackage.TRACE_STATE__TRACE_METHOD, oldTraceMethod, traceMethod));
			}
		}
		return traceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetTraceMethod() {
		return traceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceMethod(Method newTraceMethod) {
		Method oldTraceMethod = traceMethod;
		traceMethod = newTraceMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanasimplifiedresultPackage.TRACE_STATE__TRACE_METHOD, oldTraceMethod, traceMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParameterIndex() {
		return parameterIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterIndex(int newParameterIndex) {
		int oldParameterIndex = parameterIndex;
		parameterIndex = newParameterIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanasimplifiedresultPackage.TRACE_STATE__PARAMETER_INDEX, oldParameterIndex, parameterIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoanasimplifiedresultPackage.TRACE_STATE__TRACE_POSITION:
				return getTracePosition();
			case JoanasimplifiedresultPackage.TRACE_STATE__TRACE_CLASS_NAME:
				return getTraceClassName();
			case JoanasimplifiedresultPackage.TRACE_STATE__SECURITY_LEVEL_NAME:
				return getSecurityLevelName();
			case JoanasimplifiedresultPackage.TRACE_STATE__TRACE_METHOD:
				if (resolve) return getTraceMethod();
				return basicGetTraceMethod();
			case JoanasimplifiedresultPackage.TRACE_STATE__PARAMETER_INDEX:
				return getParameterIndex();
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
			case JoanasimplifiedresultPackage.TRACE_STATE__TRACE_POSITION:
				setTracePosition((Integer)newValue);
				return;
			case JoanasimplifiedresultPackage.TRACE_STATE__TRACE_CLASS_NAME:
				setTraceClassName((String)newValue);
				return;
			case JoanasimplifiedresultPackage.TRACE_STATE__SECURITY_LEVEL_NAME:
				setSecurityLevelName((String)newValue);
				return;
			case JoanasimplifiedresultPackage.TRACE_STATE__TRACE_METHOD:
				setTraceMethod((Method)newValue);
				return;
			case JoanasimplifiedresultPackage.TRACE_STATE__PARAMETER_INDEX:
				setParameterIndex((Integer)newValue);
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
			case JoanasimplifiedresultPackage.TRACE_STATE__TRACE_POSITION:
				setTracePosition(TRACE_POSITION_EDEFAULT);
				return;
			case JoanasimplifiedresultPackage.TRACE_STATE__TRACE_CLASS_NAME:
				setTraceClassName(TRACE_CLASS_NAME_EDEFAULT);
				return;
			case JoanasimplifiedresultPackage.TRACE_STATE__SECURITY_LEVEL_NAME:
				setSecurityLevelName(SECURITY_LEVEL_NAME_EDEFAULT);
				return;
			case JoanasimplifiedresultPackage.TRACE_STATE__TRACE_METHOD:
				setTraceMethod((Method)null);
				return;
			case JoanasimplifiedresultPackage.TRACE_STATE__PARAMETER_INDEX:
				setParameterIndex(PARAMETER_INDEX_EDEFAULT);
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
			case JoanasimplifiedresultPackage.TRACE_STATE__TRACE_POSITION:
				return tracePosition != TRACE_POSITION_EDEFAULT;
			case JoanasimplifiedresultPackage.TRACE_STATE__TRACE_CLASS_NAME:
				return TRACE_CLASS_NAME_EDEFAULT == null ? traceClassName != null : !TRACE_CLASS_NAME_EDEFAULT.equals(traceClassName);
			case JoanasimplifiedresultPackage.TRACE_STATE__SECURITY_LEVEL_NAME:
				return SECURITY_LEVEL_NAME_EDEFAULT == null ? securityLevelName != null : !SECURITY_LEVEL_NAME_EDEFAULT.equals(securityLevelName);
			case JoanasimplifiedresultPackage.TRACE_STATE__TRACE_METHOD:
				return traceMethod != null;
			case JoanasimplifiedresultPackage.TRACE_STATE__PARAMETER_INDEX:
				return parameterIndex != PARAMETER_INDEX_EDEFAULT;
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
		result.append(" (tracePosition: ");
		result.append(tracePosition);
		result.append(", traceClassName: ");
		result.append(traceClassName);
		result.append(", securityLevelName: ");
		result.append(securityLevelName);
		result.append(", parameterIndex: ");
		result.append(parameterIndex);
		result.append(')');
		return result.toString();
	}

} //TraceStateImpl
