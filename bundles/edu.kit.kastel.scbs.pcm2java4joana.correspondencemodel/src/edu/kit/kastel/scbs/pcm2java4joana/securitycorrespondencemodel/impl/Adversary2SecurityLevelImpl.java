/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl;

import edu.kit.kastel.scbs.confidentiality.adversary.Adversary;

import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;

import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adversary2 Security Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Adversary2SecurityLevelImpl#getSecurityLevels <em>Security Levels</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.Adversary2SecurityLevelImpl#getAdversaries <em>Adversaries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Adversary2SecurityLevelImpl extends MinimalEObjectImpl.Container implements Adversary2SecurityLevel {
	/**
	 * The cached value of the '{@link #getSecurityLevels() <em>Security Levels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevel> securityLevels;

	/**
	 * The cached value of the '{@link #getAdversaries() <em>Adversaries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdversaries()
	 * @generated
	 * @ordered
	 */
	protected EList<Adversary> adversaries;

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
			securityLevels = new EObjectResolvingEList<SecurityLevel>(SecurityLevel.class, this, SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__SECURITY_LEVELS);
		}
		return securityLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Adversary> getAdversaries() {
		if (adversaries == null) {
			adversaries = new EObjectResolvingEList<Adversary>(Adversary.class, this, SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__ADVERSARIES);
		}
		return adversaries;
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
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__ADVERSARIES:
				return getAdversaries();
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
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__ADVERSARIES:
				getAdversaries().clear();
				getAdversaries().addAll((Collection<? extends Adversary>)newValue);
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
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__ADVERSARIES:
				getAdversaries().clear();
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
			case SecuritycorrespondencemodelPackage.ADVERSARY2_SECURITY_LEVEL__ADVERSARIES:
				return adversaries != null && !adversaries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Adversary2SecurityLevelImpl
