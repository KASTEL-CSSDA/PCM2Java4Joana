/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint;
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationImpl#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowSpecificationImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowSpecificationImpl extends MinimalEObjectImpl.Container implements FlowSpecification {
	/**
	 * The cached value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected EntryPoint entrypoint;

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
	protected FlowSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaPackage.Literals.FLOW_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint getEntrypoint() {
		return entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntrypoint(EntryPoint newEntrypoint, NotificationChain msgs) {
		EntryPoint oldEntrypoint = entrypoint;
		entrypoint = newEntrypoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JoanaPackage.FLOW_SPECIFICATION__ENTRYPOINT, oldEntrypoint, newEntrypoint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntrypoint(EntryPoint newEntrypoint) {
		if (newEntrypoint != entrypoint) {
			NotificationChain msgs = null;
			if (entrypoint != null)
				msgs = ((InternalEObject) entrypoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JoanaPackage.FLOW_SPECIFICATION__ENTRYPOINT, null, msgs);
			if (newEntrypoint != null)
				msgs = ((InternalEObject) newEntrypoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JoanaPackage.FLOW_SPECIFICATION__ENTRYPOINT, null, msgs);
			msgs = basicSetEntrypoint(newEntrypoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoanaPackage.FLOW_SPECIFICATION__ENTRYPOINT,
					newEntrypoint, newEntrypoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this,
					JoanaPackage.FLOW_SPECIFICATION__ANNOTATION);
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
		case JoanaPackage.FLOW_SPECIFICATION__ENTRYPOINT:
			return basicSetEntrypoint(null, msgs);
		case JoanaPackage.FLOW_SPECIFICATION__ANNOTATION:
			return ((InternalEList<?>) getAnnotation()).basicRemove(otherEnd, msgs);
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
		case JoanaPackage.FLOW_SPECIFICATION__ENTRYPOINT:
			return getEntrypoint();
		case JoanaPackage.FLOW_SPECIFICATION__ANNOTATION:
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
		case JoanaPackage.FLOW_SPECIFICATION__ENTRYPOINT:
			setEntrypoint((EntryPoint) newValue);
			return;
		case JoanaPackage.FLOW_SPECIFICATION__ANNOTATION:
			getAnnotation().clear();
			getAnnotation().addAll((Collection<? extends Annotation>) newValue);
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
		case JoanaPackage.FLOW_SPECIFICATION__ENTRYPOINT:
			setEntrypoint((EntryPoint) null);
			return;
		case JoanaPackage.FLOW_SPECIFICATION__ANNOTATION:
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
		case JoanaPackage.FLOW_SPECIFICATION__ENTRYPOINT:
			return entrypoint != null;
		case JoanaPackage.FLOW_SPECIFICATION__ANNOTATION:
			return annotation != null && !annotation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowSpecificationImpl
