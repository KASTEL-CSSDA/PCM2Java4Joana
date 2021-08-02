/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 * </ul>
 *
 * @generated
 */
public class FlowSpecificationElementImpl extends MinimalEObjectImpl.Container implements FlowSpecificationElement {
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
		result.append(')');
		return result.toString();
	}

} //FlowSpecificationElementImpl
