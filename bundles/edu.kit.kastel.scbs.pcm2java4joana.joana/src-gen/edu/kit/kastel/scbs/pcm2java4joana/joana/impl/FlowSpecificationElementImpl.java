/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import sourcecode.Method;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Specification Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationElementImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationElementImpl#getAnnotatedClass <em>Annotated Class</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationElementImpl#getAnnotatedMethod <em>Annotated Method</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationElementImpl#getAnnotatedClassName <em>Annotated Class Name</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationElementImpl#getAnnotatedMethodName <em>Annotated Method Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowSpecificationElementImpl extends JoanaElementImpl implements FlowSpecificationElement {
	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotatedClass() <em>Annotated Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedClass()
	 * @generated
	 * @ordered
	 */
	protected sourcecode.Class annotatedClass;

	/**
	 * The cached value of the '{@link #getAnnotatedMethod() <em>Annotated Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedMethod()
	 * @generated
	 * @ordered
	 */
	protected Method annotatedMethod;

	/**
	 * The default value of the '{@link #getAnnotatedClassName() <em>Annotated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATED_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotatedClassName() <em>Annotated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedClassName()
	 * @generated
	 * @ordered
	 */
	protected String annotatedClassName = ANNOTATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnnotatedMethodName() <em>Annotated Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATED_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotatedMethodName() <em>Annotated Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedMethodName()
	 * @generated
	 * @ordered
	 */
	protected String annotatedMethodName = ANNOTATED_METHOD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowSpecificationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaPackage.Literals.FLOW_SPECIFICATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanaPackage.FLOW_SPECIFICATION_ELEMENT__TAG, oldTag,
					tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sourcecode.Class getAnnotatedClass() {
		if (annotatedClass != null && annotatedClass.eIsProxy()) {
			InternalEObject oldAnnotatedClass = (InternalEObject) annotatedClass;
			annotatedClass = (sourcecode.Class) eResolveProxy(oldAnnotatedClass);
			if (annotatedClass != oldAnnotatedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS, oldAnnotatedClass,
							annotatedClass));
			}
		}
		return annotatedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sourcecode.Class basicGetAnnotatedClass() {
		return annotatedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedClass(sourcecode.Class newAnnotatedClass) {
		sourcecode.Class oldAnnotatedClass = annotatedClass;
		annotatedClass = newAnnotatedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS, oldAnnotatedClass, annotatedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getAnnotatedMethod() {
		if (annotatedMethod != null && annotatedMethod.eIsProxy()) {
			InternalEObject oldAnnotatedMethod = (InternalEObject) annotatedMethod;
			annotatedMethod = (Method) eResolveProxy(oldAnnotatedMethod);
			if (annotatedMethod != oldAnnotatedMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD, oldAnnotatedMethod,
							annotatedMethod));
			}
		}
		return annotatedMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetAnnotatedMethod() {
		return annotatedMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedMethod(Method newAnnotatedMethod) {
		Method oldAnnotatedMethod = annotatedMethod;
		annotatedMethod = newAnnotatedMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD, oldAnnotatedMethod, annotatedMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotatedClassName() {
		return annotatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedClassName(String newAnnotatedClassName) {
		String oldAnnotatedClassName = annotatedClassName;
		annotatedClassName = newAnnotatedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS_NAME, oldAnnotatedClassName,
					annotatedClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotatedMethodName() {
		return annotatedMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedMethodName(String newAnnotatedMethodName) {
		String oldAnnotatedMethodName = annotatedMethodName;
		annotatedMethodName = newAnnotatedMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD_NAME, oldAnnotatedMethodName,
					annotatedMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__TAG:
			return getTag();
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS:
			if (resolve)
				return getAnnotatedClass();
			return basicGetAnnotatedClass();
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD:
			if (resolve)
				return getAnnotatedMethod();
			return basicGetAnnotatedMethod();
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS_NAME:
			return getAnnotatedClassName();
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD_NAME:
			return getAnnotatedMethodName();
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
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__TAG:
			setTag((String) newValue);
			return;
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS:
			setAnnotatedClass((sourcecode.Class) newValue);
			return;
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD:
			setAnnotatedMethod((Method) newValue);
			return;
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS_NAME:
			setAnnotatedClassName((String) newValue);
			return;
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD_NAME:
			setAnnotatedMethodName((String) newValue);
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
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__TAG:
			setTag(TAG_EDEFAULT);
			return;
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS:
			setAnnotatedClass((sourcecode.Class) null);
			return;
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD:
			setAnnotatedMethod((Method) null);
			return;
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS_NAME:
			setAnnotatedClassName(ANNOTATED_CLASS_NAME_EDEFAULT);
			return;
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD_NAME:
			setAnnotatedMethodName(ANNOTATED_METHOD_NAME_EDEFAULT);
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
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__TAG:
			return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS:
			return annotatedClass != null;
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD:
			return annotatedMethod != null;
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS_NAME:
			return ANNOTATED_CLASS_NAME_EDEFAULT == null ? annotatedClassName != null
					: !ANNOTATED_CLASS_NAME_EDEFAULT.equals(annotatedClassName);
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD_NAME:
			return ANNOTATED_METHOD_NAME_EDEFAULT == null ? annotatedMethodName != null
					: !ANNOTATED_METHOD_NAME_EDEFAULT.equals(annotatedMethodName);
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
		result.append(" (tag: ");
		result.append(tag);
		result.append(", annotatedClassName: ");
		result.append(annotatedClassName);
		result.append(", annotatedMethodName: ");
		result.append(annotatedMethodName);
		result.append(')');
		return result.toString();
	}

} //FlowSpecificationElementImpl
