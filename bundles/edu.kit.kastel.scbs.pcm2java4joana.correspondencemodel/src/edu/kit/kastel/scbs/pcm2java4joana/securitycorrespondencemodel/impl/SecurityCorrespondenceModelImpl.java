/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Correspondence Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecurityCorrespondenceModelImpl#getAdversary2securitylevel <em>Adversary2securitylevel</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.SecurityCorrespondenceModelImpl#getParametersanddatapair2annotation <em>Parametersanddatapair2annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityCorrespondenceModelImpl extends MinimalEObjectImpl.Container implements SecurityCorrespondenceModel {
	/**
	 * The cached value of the '{@link #getAdversary2securitylevel() <em>Adversary2securitylevel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdversary2securitylevel()
	 * @generated
	 * @ordered
	 */
	protected EList<Adversary2SecurityLevel> adversary2securitylevel;

	/**
	 * The cached value of the '{@link #getParametersanddatapair2annotation() <em>Parametersanddatapair2annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametersanddatapair2annotation()
	 * @generated
	 * @ordered
	 */
	protected EList<ParametersAndDataPair2Annotation> parametersanddatapair2annotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityCorrespondenceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritycorrespondencemodelPackage.Literals.SECURITY_CORRESPONDENCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Adversary2SecurityLevel> getAdversary2securitylevel() {
		if (adversary2securitylevel == null) {
			adversary2securitylevel = new EObjectContainmentEList<Adversary2SecurityLevel>(Adversary2SecurityLevel.class, this, SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL__ADVERSARY2SECURITYLEVEL);
		}
		return adversary2securitylevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParametersAndDataPair2Annotation> getParametersanddatapair2annotation() {
		if (parametersanddatapair2annotation == null) {
			parametersanddatapair2annotation = new EObjectContainmentEList<ParametersAndDataPair2Annotation>(ParametersAndDataPair2Annotation.class, this, SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL__PARAMETERSANDDATAPAIR2ANNOTATION);
		}
		return parametersanddatapair2annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL__ADVERSARY2SECURITYLEVEL:
				return ((InternalEList<?>)getAdversary2securitylevel()).basicRemove(otherEnd, msgs);
			case SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL__PARAMETERSANDDATAPAIR2ANNOTATION:
				return ((InternalEList<?>)getParametersanddatapair2annotation()).basicRemove(otherEnd, msgs);
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
			case SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL__ADVERSARY2SECURITYLEVEL:
				return getAdversary2securitylevel();
			case SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL__PARAMETERSANDDATAPAIR2ANNOTATION:
				return getParametersanddatapair2annotation();
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
			case SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL__ADVERSARY2SECURITYLEVEL:
				getAdversary2securitylevel().clear();
				getAdversary2securitylevel().addAll((Collection<? extends Adversary2SecurityLevel>)newValue);
				return;
			case SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL__PARAMETERSANDDATAPAIR2ANNOTATION:
				getParametersanddatapair2annotation().clear();
				getParametersanddatapair2annotation().addAll((Collection<? extends ParametersAndDataPair2Annotation>)newValue);
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
			case SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL__ADVERSARY2SECURITYLEVEL:
				getAdversary2securitylevel().clear();
				return;
			case SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL__PARAMETERSANDDATAPAIR2ANNOTATION:
				getParametersanddatapair2annotation().clear();
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
			case SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL__ADVERSARY2SECURITYLEVEL:
				return adversary2securitylevel != null && !adversary2securitylevel.isEmpty();
			case SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL__PARAMETERSANDDATAPAIR2ANNOTATION:
				return parametersanddatapair2annotation != null && !parametersanddatapair2annotation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityCorrespondenceModelImpl
