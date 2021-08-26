/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl;

import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;

import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;

import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters And Data Pair2 Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.ParametersAndDataPair2AnnotationImpl#getJoanaAnnotation <em>Joana Annotation</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.ParametersAndDataPair2AnnotationImpl#getParametersAndDataPair <em>Parameters And Data Pair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParametersAndDataPair2AnnotationImpl extends MinimalEObjectImpl.Container implements ParametersAndDataPair2Annotation {
	/**
	 * The cached value of the '{@link #getJoanaAnnotation() <em>Joana Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoanaAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation joanaAnnotation;

	/**
	 * The cached value of the '{@link #getParametersAndDataPair() <em>Parameters And Data Pair</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametersAndDataPair()
	 * @generated
	 * @ordered
	 */
	protected ParametersAndDataPair parametersAndDataPair;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametersAndDataPair2AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritycorrespondencemodelPackage.Literals.PARAMETERS_AND_DATA_PAIR2_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getJoanaAnnotation() {
		if (joanaAnnotation != null && joanaAnnotation.eIsProxy()) {
			InternalEObject oldJoanaAnnotation = (InternalEObject)joanaAnnotation;
			joanaAnnotation = (Annotation)eResolveProxy(oldJoanaAnnotation);
			if (joanaAnnotation != oldJoanaAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION, oldJoanaAnnotation, joanaAnnotation));
			}
		}
		return joanaAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation basicGetJoanaAnnotation() {
		return joanaAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoanaAnnotation(Annotation newJoanaAnnotation) {
		Annotation oldJoanaAnnotation = joanaAnnotation;
		joanaAnnotation = newJoanaAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION, oldJoanaAnnotation, joanaAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersAndDataPair getParametersAndDataPair() {
		if (parametersAndDataPair != null && parametersAndDataPair.eIsProxy()) {
			InternalEObject oldParametersAndDataPair = (InternalEObject)parametersAndDataPair;
			parametersAndDataPair = (ParametersAndDataPair)eResolveProxy(oldParametersAndDataPair);
			if (parametersAndDataPair != oldParametersAndDataPair) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__PARAMETERS_AND_DATA_PAIR, oldParametersAndDataPair, parametersAndDataPair));
			}
		}
		return parametersAndDataPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersAndDataPair basicGetParametersAndDataPair() {
		return parametersAndDataPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametersAndDataPair(ParametersAndDataPair newParametersAndDataPair) {
		ParametersAndDataPair oldParametersAndDataPair = parametersAndDataPair;
		parametersAndDataPair = newParametersAndDataPair;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__PARAMETERS_AND_DATA_PAIR, oldParametersAndDataPair, parametersAndDataPair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION:
				if (resolve) return getJoanaAnnotation();
				return basicGetJoanaAnnotation();
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__PARAMETERS_AND_DATA_PAIR:
				if (resolve) return getParametersAndDataPair();
				return basicGetParametersAndDataPair();
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
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION:
				setJoanaAnnotation((Annotation)newValue);
				return;
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__PARAMETERS_AND_DATA_PAIR:
				setParametersAndDataPair((ParametersAndDataPair)newValue);
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
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION:
				setJoanaAnnotation((Annotation)null);
				return;
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__PARAMETERS_AND_DATA_PAIR:
				setParametersAndDataPair((ParametersAndDataPair)null);
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
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION:
				return joanaAnnotation != null;
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__PARAMETERS_AND_DATA_PAIR:
				return parametersAndDataPair != null;
		}
		return super.eIsSet(featureID);
	}

} //ParametersAndDataPair2AnnotationImpl
