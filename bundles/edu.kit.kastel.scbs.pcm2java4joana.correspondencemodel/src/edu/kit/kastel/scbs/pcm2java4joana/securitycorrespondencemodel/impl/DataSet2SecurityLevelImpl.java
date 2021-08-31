/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;

import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEDataSet;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel;
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
 * An implementation of the model object '<em><b>Data Set2 Security Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.DataSet2SecurityLevelImpl#getSecurityLevels <em>Security Levels</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.impl.DataSet2SecurityLevelImpl#getConf4cbsedataset <em>Conf4cbsedataset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSet2SecurityLevelImpl extends MinimalEObjectImpl.Container implements DataSet2SecurityLevel {
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
	 * The cached value of the '{@link #getConf4cbsedataset() <em>Conf4cbsedataset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConf4cbsedataset()
	 * @generated
	 * @ordered
	 */
	protected EList<Conf4CBSEDataSet> conf4cbsedataset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSet2SecurityLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritycorrespondencemodelPackage.Literals.DATA_SET2_SECURITY_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevel> getSecurityLevels() {
		if (securityLevels == null) {
			securityLevels = new EObjectContainmentEList<SecurityLevel>(SecurityLevel.class, this, SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL__SECURITY_LEVELS);
		}
		return securityLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conf4CBSEDataSet> getConf4cbsedataset() {
		if (conf4cbsedataset == null) {
			conf4cbsedataset = new EObjectContainmentEList<Conf4CBSEDataSet>(Conf4CBSEDataSet.class, this, SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL__CONF4CBSEDATASET);
		}
		return conf4cbsedataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL__SECURITY_LEVELS:
				return ((InternalEList<?>)getSecurityLevels()).basicRemove(otherEnd, msgs);
			case SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL__CONF4CBSEDATASET:
				return ((InternalEList<?>)getConf4cbsedataset()).basicRemove(otherEnd, msgs);
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
			case SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL__SECURITY_LEVELS:
				return getSecurityLevels();
			case SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL__CONF4CBSEDATASET:
				return getConf4cbsedataset();
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
			case SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL__SECURITY_LEVELS:
				getSecurityLevels().clear();
				getSecurityLevels().addAll((Collection<? extends SecurityLevel>)newValue);
				return;
			case SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL__CONF4CBSEDATASET:
				getConf4cbsedataset().clear();
				getConf4cbsedataset().addAll((Collection<? extends Conf4CBSEDataSet>)newValue);
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
			case SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL__SECURITY_LEVELS:
				getSecurityLevels().clear();
				return;
			case SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL__CONF4CBSEDATASET:
				getConf4cbsedataset().clear();
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
			case SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL__SECURITY_LEVELS:
				return securityLevels != null && !securityLevels.isEmpty();
			case SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL__CONF4CBSEDATASET:
				return conf4cbsedataset != null && !conf4cbsedataset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataSet2SecurityLevelImpl
