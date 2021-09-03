/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.EntryPointImpl#getSecuritylevels <em>Securitylevels</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.EntryPointImpl#getLattice <em>Lattice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryPointImpl extends FlowSpecificationElementImpl implements EntryPoint {
	/**
	 * The cached value of the '{@link #getSecuritylevels() <em>Securitylevels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritylevels()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevel> securitylevels;

	/**
	 * The cached value of the '{@link #getLattice() <em>Lattice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLattice()
	 * @generated
	 * @ordered
	 */
	protected Lattice lattice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaPackage.Literals.ENTRY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevel> getSecuritylevels() {
		if (securitylevels == null) {
			securitylevels = new EObjectResolvingEList<SecurityLevel>(SecurityLevel.class, this, JoanaPackage.ENTRY_POINT__SECURITYLEVELS);
		}
		return securitylevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lattice getLattice() {
		if (lattice != null && lattice.eIsProxy()) {
			InternalEObject oldLattice = (InternalEObject)lattice;
			lattice = (Lattice)eResolveProxy(oldLattice);
			if (lattice != oldLattice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoanaPackage.ENTRY_POINT__LATTICE, oldLattice, lattice));
			}
		}
		return lattice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lattice basicGetLattice() {
		return lattice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLattice(Lattice newLattice) {
		Lattice oldLattice = lattice;
		lattice = newLattice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanaPackage.ENTRY_POINT__LATTICE, oldLattice, lattice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoanaPackage.ENTRY_POINT__SECURITYLEVELS:
				return getSecuritylevels();
			case JoanaPackage.ENTRY_POINT__LATTICE:
				if (resolve) return getLattice();
				return basicGetLattice();
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
			case JoanaPackage.ENTRY_POINT__SECURITYLEVELS:
				getSecuritylevels().clear();
				getSecuritylevels().addAll((Collection<? extends SecurityLevel>)newValue);
				return;
			case JoanaPackage.ENTRY_POINT__LATTICE:
				setLattice((Lattice)newValue);
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
			case JoanaPackage.ENTRY_POINT__SECURITYLEVELS:
				getSecuritylevels().clear();
				return;
			case JoanaPackage.ENTRY_POINT__LATTICE:
				setLattice((Lattice)null);
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
			case JoanaPackage.ENTRY_POINT__SECURITYLEVELS:
				return securitylevels != null && !securitylevels.isEmpty();
			case JoanaPackage.ENTRY_POINT__LATTICE:
				return lattice != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryPointImpl
