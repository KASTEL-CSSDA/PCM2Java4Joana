/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;

import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEParametersAndDataPair;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.ParametersAndDataPair2AnnotationImpl#getConf4cbseparametersanddatapair <em>Conf4cbseparametersanddatapair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParametersAndDataPair2AnnotationImpl extends MinimalEObjectImpl.Container implements ParametersAndDataPair2Annotation {
	/**
	 * The cached value of the '{@link #getJoanaAnnotation() <em>Joana Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoanaAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation joanaAnnotation;

	/**
	 * The cached value of the '{@link #getConf4cbseparametersanddatapair() <em>Conf4cbseparametersanddatapair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConf4cbseparametersanddatapair()
	 * @generated
	 * @ordered
	 */
	protected Conf4CBSEParametersAndDataPair conf4cbseparametersanddatapair;

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
		return joanaAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoanaAnnotation(Annotation newJoanaAnnotation, NotificationChain msgs) {
		Annotation oldJoanaAnnotation = joanaAnnotation;
		joanaAnnotation = newJoanaAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION, oldJoanaAnnotation, newJoanaAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoanaAnnotation(Annotation newJoanaAnnotation) {
		if (newJoanaAnnotation != joanaAnnotation) {
			NotificationChain msgs = null;
			if (joanaAnnotation != null)
				msgs = ((InternalEObject)joanaAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION, null, msgs);
			if (newJoanaAnnotation != null)
				msgs = ((InternalEObject)newJoanaAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION, null, msgs);
			msgs = basicSetJoanaAnnotation(newJoanaAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION, newJoanaAnnotation, newJoanaAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conf4CBSEParametersAndDataPair getConf4cbseparametersanddatapair() {
		return conf4cbseparametersanddatapair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConf4cbseparametersanddatapair(Conf4CBSEParametersAndDataPair newConf4cbseparametersanddatapair, NotificationChain msgs) {
		Conf4CBSEParametersAndDataPair oldConf4cbseparametersanddatapair = conf4cbseparametersanddatapair;
		conf4cbseparametersanddatapair = newConf4cbseparametersanddatapair;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__CONF4CBSEPARAMETERSANDDATAPAIR, oldConf4cbseparametersanddatapair, newConf4cbseparametersanddatapair);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConf4cbseparametersanddatapair(Conf4CBSEParametersAndDataPair newConf4cbseparametersanddatapair) {
		if (newConf4cbseparametersanddatapair != conf4cbseparametersanddatapair) {
			NotificationChain msgs = null;
			if (conf4cbseparametersanddatapair != null)
				msgs = ((InternalEObject)conf4cbseparametersanddatapair).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__CONF4CBSEPARAMETERSANDDATAPAIR, null, msgs);
			if (newConf4cbseparametersanddatapair != null)
				msgs = ((InternalEObject)newConf4cbseparametersanddatapair).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__CONF4CBSEPARAMETERSANDDATAPAIR, null, msgs);
			msgs = basicSetConf4cbseparametersanddatapair(newConf4cbseparametersanddatapair, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__CONF4CBSEPARAMETERSANDDATAPAIR, newConf4cbseparametersanddatapair, newConf4cbseparametersanddatapair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION:
				return basicSetJoanaAnnotation(null, msgs);
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__CONF4CBSEPARAMETERSANDDATAPAIR:
				return basicSetConf4cbseparametersanddatapair(null, msgs);
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
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__JOANA_ANNOTATION:
				return getJoanaAnnotation();
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__CONF4CBSEPARAMETERSANDDATAPAIR:
				return getConf4cbseparametersanddatapair();
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
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__CONF4CBSEPARAMETERSANDDATAPAIR:
				setConf4cbseparametersanddatapair((Conf4CBSEParametersAndDataPair)newValue);
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
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__CONF4CBSEPARAMETERSANDDATAPAIR:
				setConf4cbseparametersanddatapair((Conf4CBSEParametersAndDataPair)null);
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
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION__CONF4CBSEPARAMETERSANDDATAPAIR:
				return conf4cbseparametersanddatapair != null;
		}
		return super.eIsSet(featureID);
	}

} //ParametersAndDataPair2AnnotationImpl
