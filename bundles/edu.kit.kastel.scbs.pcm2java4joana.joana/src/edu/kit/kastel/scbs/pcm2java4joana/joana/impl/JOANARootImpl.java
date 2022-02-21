/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tools.mdsd.modelingfoundations.identifier.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JOANA Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JOANARootImpl#getFlowspecification <em>Flowspecification</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JOANARootImpl#getLattice <em>Lattice</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JOANARootImpl#getSecuritylevel <em>Securitylevel</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.JOANARootImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JOANARootImpl extends EntityImpl implements JOANARoot {
	/**
	 * The cached value of the '{@link #getFlowspecification() <em>Flowspecification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowspecification()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowSpecification> flowspecification;

	/**
	 * The cached value of the '{@link #getLattice() <em>Lattice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLattice()
	 * @generated
	 * @ordered
	 */
	protected Lattice lattice;

	/**
	 * The cached value of the '{@link #getSecuritylevel() <em>Securitylevel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritylevel()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevel> securitylevel;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JOANARootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaPackage.Literals.JOANA_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowSpecification> getFlowspecification() {
		if (flowspecification == null) {
			flowspecification = new EObjectContainmentEList<FlowSpecification>(FlowSpecification.class, this, JoanaPackage.JOANA_ROOT__FLOWSPECIFICATION);
		}
		return flowspecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lattice getLattice() {
		return lattice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLattice(Lattice newLattice, NotificationChain msgs) {
		Lattice oldLattice = lattice;
		lattice = newLattice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoanaPackage.JOANA_ROOT__LATTICE, oldLattice, newLattice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLattice(Lattice newLattice) {
		if (newLattice != lattice) {
			NotificationChain msgs = null;
			if (lattice != null)
				msgs = ((InternalEObject)lattice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoanaPackage.JOANA_ROOT__LATTICE, null, msgs);
			if (newLattice != null)
				msgs = ((InternalEObject)newLattice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoanaPackage.JOANA_ROOT__LATTICE, null, msgs);
			msgs = basicSetLattice(newLattice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanaPackage.JOANA_ROOT__LATTICE, newLattice, newLattice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevel> getSecuritylevel() {
		if (securitylevel == null) {
			securitylevel = new EObjectContainmentEList<SecurityLevel>(SecurityLevel.class, this, JoanaPackage.JOANA_ROOT__SECURITYLEVEL);
		}
		return securitylevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, JoanaPackage.JOANA_ROOT__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JoanaPackage.JOANA_ROOT__FLOWSPECIFICATION:
				return ((InternalEList<?>)getFlowspecification()).basicRemove(otherEnd, msgs);
			case JoanaPackage.JOANA_ROOT__LATTICE:
				return basicSetLattice(null, msgs);
			case JoanaPackage.JOANA_ROOT__SECURITYLEVEL:
				return ((InternalEList<?>)getSecuritylevel()).basicRemove(otherEnd, msgs);
			case JoanaPackage.JOANA_ROOT__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
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
			case JoanaPackage.JOANA_ROOT__FLOWSPECIFICATION:
				return getFlowspecification();
			case JoanaPackage.JOANA_ROOT__LATTICE:
				return getLattice();
			case JoanaPackage.JOANA_ROOT__SECURITYLEVEL:
				return getSecuritylevel();
			case JoanaPackage.JOANA_ROOT__ANNOTATION:
				return getAnnotation();
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
			case JoanaPackage.JOANA_ROOT__FLOWSPECIFICATION:
				getFlowspecification().clear();
				getFlowspecification().addAll((Collection<? extends FlowSpecification>)newValue);
				return;
			case JoanaPackage.JOANA_ROOT__LATTICE:
				setLattice((Lattice)newValue);
				return;
			case JoanaPackage.JOANA_ROOT__SECURITYLEVEL:
				getSecuritylevel().clear();
				getSecuritylevel().addAll((Collection<? extends SecurityLevel>)newValue);
				return;
			case JoanaPackage.JOANA_ROOT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
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
			case JoanaPackage.JOANA_ROOT__FLOWSPECIFICATION:
				getFlowspecification().clear();
				return;
			case JoanaPackage.JOANA_ROOT__LATTICE:
				setLattice((Lattice)null);
				return;
			case JoanaPackage.JOANA_ROOT__SECURITYLEVEL:
				getSecuritylevel().clear();
				return;
			case JoanaPackage.JOANA_ROOT__ANNOTATION:
				getAnnotation().clear();
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
			case JoanaPackage.JOANA_ROOT__FLOWSPECIFICATION:
				return flowspecification != null && !flowspecification.isEmpty();
			case JoanaPackage.JOANA_ROOT__LATTICE:
				return lattice != null;
			case JoanaPackage.JOANA_ROOT__SECURITYLEVEL:
				return securitylevel != null && !securitylevel.isEmpty();
			case JoanaPackage.JOANA_ROOT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JOANARootImpl
