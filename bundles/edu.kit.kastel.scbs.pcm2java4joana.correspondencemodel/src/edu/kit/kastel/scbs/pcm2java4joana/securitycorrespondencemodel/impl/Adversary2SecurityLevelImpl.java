/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;

import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEAdversary;
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
 * An implementation of the model object '<em><b>Adversary2 Security Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Adversary2SecurityLevelImpl#getSecurityLevels <em>Security Levels</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Adversary2SecurityLevelImpl#getConf4cbseadversary <em>Conf4cbseadversary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Adversary2SecurityLevelImpl extends MinimalEObjectImpl.Container implements Adversary2SecurityLevel {
	/**
	 * The cached value of the '{@link #getSecurityLevels() <em>Security Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevel> securityLevels;

	/**
	 * The cached value of the '{@link #getConf4cbseadversary() <em>Conf4cbseadversary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConf4cbseadversary()
	 * @generated
	 * @ordered
	 */
	protected EList<Conf4CBSEAdversary> conf4cbseadversary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Adversary2SecurityLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritycorrespondencemodelPackage.Literals.ADVERSARY2_SECURITY_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevel> getSecurityLevels() {
		if (securityLevels == null) {
			securityLevels = new EObjectContainmentEList<SecurityLevel>(SecurityLevel.class, this, SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__SECURITY_LEVELS);
		}
		return securityLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conf4CBSEAdversary> getConf4cbseadversary() {
		if (conf4cbseadversary == null) {
			conf4cbseadversary = new EObjectContainmentEList<Conf4CBSEAdversary>(Conf4CBSEAdversary.class, this, SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__CONF4CBSEADVERSARY);
		}
		return conf4cbseadversary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__SECURITY_LEVELS:
				return ((InternalEList<?>)getSecurityLevels()).basicRemove(otherEnd, msgs);
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__CONF4CBSEADVERSARY:
				return ((InternalEList<?>)getConf4cbseadversary()).basicRemove(otherEnd, msgs);
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
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__SECURITY_LEVELS:
				return getSecurityLevels();
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__CONF4CBSEADVERSARY:
				return getConf4cbseadversary();
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
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__SECURITY_LEVELS:
				getSecurityLevels().clear();
				getSecurityLevels().addAll((Collection<? extends SecurityLevel>)newValue);
				return;
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__CONF4CBSEADVERSARY:
				getConf4cbseadversary().clear();
				getConf4cbseadversary().addAll((Collection<? extends Conf4CBSEAdversary>)newValue);
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
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__SECURITY_LEVELS:
				getSecurityLevels().clear();
				return;
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__CONF4CBSEADVERSARY:
				getConf4cbseadversary().clear();
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
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__SECURITY_LEVELS:
				return securityLevels != null && !securityLevels.isEmpty();
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__CONF4CBSEADVERSARY:
				return conf4cbseadversary != null && !conf4cbseadversary.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Adversary2SecurityLevelImpl
