/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana.impl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tools.mdsd.modelingfoundations.identifier.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowRelationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.joana.impl.FlowRelationImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowRelationImpl extends EntityImpl implements FlowRelation {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevel> from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityLevel> to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoanaPackage.Literals.FLOW_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevel> getFrom() {
		if (from == null) {
			from = new EObjectResolvingEList.Unsettable<SecurityLevel>(SecurityLevel.class, this, JoanaPackage.FLOW_RELATION__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrom() {
		if (from != null) ((InternalEList.Unsettable<?>)from).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrom() {
		return from != null && ((InternalEList.Unsettable<?>)from).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityLevel> getTo() {
		if (to == null) {
			to = new EObjectResolvingEList<SecurityLevel>(SecurityLevel.class, this, JoanaPackage.FLOW_RELATION__TO);
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoanaPackage.FLOW_RELATION__FROM:
				return getFrom();
			case JoanaPackage.FLOW_RELATION__TO:
				return getTo();
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
			case JoanaPackage.FLOW_RELATION__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends SecurityLevel>)newValue);
				return;
			case JoanaPackage.FLOW_RELATION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends SecurityLevel>)newValue);
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
			case JoanaPackage.FLOW_RELATION__FROM:
				unsetFrom();
				return;
			case JoanaPackage.FLOW_RELATION__TO:
				getTo().clear();
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
			case JoanaPackage.FLOW_RELATION__FROM:
				return isSetFrom();
			case JoanaPackage.FLOW_RELATION__TO:
				return to != null && !to.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowRelationImpl
