/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.AnnotationImpl#getSecuritylevel <em>Securitylevel</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.AnnotationImpl#getAnnotatedParameter <em>Annotated Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends FlowSpecificationElementImpl implements Annotation {
	/**
	 * The cached value of the '{@link #getSecuritylevel() <em>Securitylevel</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritylevel()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevel> securitylevel;

	/**
	 * The cached value of the '{@link #getAnnotatedParameter() <em>Annotated Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter annotatedParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevel> getSecuritylevel() {
		if (securitylevel == null) {
			securitylevel = new EObjectResolvingEList<SecurityLevel>(SecurityLevel.class, this, JoanaPackage.ANNOTATION__SECURITYLEVEL);
		}
		return securitylevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getAnnotatedParameter() {
		if (annotatedParameter != null && annotatedParameter.eIsProxy()) {
			InternalEObject oldAnnotatedParameter = (InternalEObject)annotatedParameter;
			annotatedParameter = (Parameter)eResolveProxy(oldAnnotatedParameter);
			if (annotatedParameter != oldAnnotatedParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoanaPackage.ANNOTATION__ANNOTATED_PARAMETER, oldAnnotatedParameter, annotatedParameter));
			}
		}
		return annotatedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetAnnotatedParameter() {
		return annotatedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedParameter(Parameter newAnnotatedParameter) {
		Parameter oldAnnotatedParameter = annotatedParameter;
		annotatedParameter = newAnnotatedParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanaPackage.ANNOTATION__ANNOTATED_PARAMETER, oldAnnotatedParameter, annotatedParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoanaPackage.ANNOTATION__SECURITYLEVEL:
				return getSecuritylevel();
			case JoanaPackage.ANNOTATION__ANNOTATED_PARAMETER:
				if (resolve) return getAnnotatedParameter();
				return basicGetAnnotatedParameter();
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
			case JoanaPackage.ANNOTATION__SECURITYLEVEL:
				getSecuritylevel().clear();
				getSecuritylevel().addAll((Collection<? extends SecurityLevel>)newValue);
				return;
			case JoanaPackage.ANNOTATION__ANNOTATED_PARAMETER:
				setAnnotatedParameter((Parameter)newValue);
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
			case JoanaPackage.ANNOTATION__SECURITYLEVEL:
				getSecuritylevel().clear();
				return;
			case JoanaPackage.ANNOTATION__ANNOTATED_PARAMETER:
				setAnnotatedParameter((Parameter)null);
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
			case JoanaPackage.ANNOTATION__SECURITYLEVEL:
				return securitylevel != null && !securitylevel.isEmpty();
			case JoanaPackage.ANNOTATION__ANNOTATED_PARAMETER:
				return annotatedParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationImpl
