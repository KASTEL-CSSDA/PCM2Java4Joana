/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Source;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sourcecode.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SourceImpl#getAnnotatedParameter <em>Annotated Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceImpl extends AnnotationImpl implements Source {
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
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaPackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getAnnotatedParameter() {
		if (annotatedParameter != null && annotatedParameter.eIsProxy()) {
			InternalEObject oldAnnotatedParameter = (InternalEObject) annotatedParameter;
			annotatedParameter = (Parameter) eResolveProxy(oldAnnotatedParameter);
			if (annotatedParameter != oldAnnotatedParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoanaPackage.SOURCE__ANNOTATED_PARAMETER,
							oldAnnotatedParameter, annotatedParameter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JoanaPackage.SOURCE__ANNOTATED_PARAMETER,
					oldAnnotatedParameter, annotatedParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JoanaPackage.SOURCE__ANNOTATED_PARAMETER:
			if (resolve)
				return getAnnotatedParameter();
			return basicGetAnnotatedParameter();
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
		case JoanaPackage.SOURCE__ANNOTATED_PARAMETER:
			setAnnotatedParameter((Parameter) newValue);
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
		case JoanaPackage.SOURCE__ANNOTATED_PARAMETER:
			setAnnotatedParameter((Parameter) null);
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
		case JoanaPackage.SOURCE__ANNOTATED_PARAMETER:
			return annotatedParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceImpl
