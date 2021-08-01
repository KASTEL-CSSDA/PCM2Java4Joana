/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodePackage;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Code Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.SourceCodeRootImpl#getTopleveltype <em>Topleveltype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceCodeRootImpl extends MinimalEObjectImpl.Container implements SourceCodeRoot {
	/**
	 * The cached value of the '{@link #getTopleveltype() <em>Topleveltype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopleveltype()
	 * @generated
	 * @ordered
	 */
	protected EList<TopLevelType> topleveltype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceCodeRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcecodePackage.Literals.SOURCE_CODE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopLevelType> getTopleveltype() {
		if (topleveltype == null) {
			topleveltype = new EObjectResolvingEList<TopLevelType>(TopLevelType.class, this,
					SourcecodePackage.SOURCE_CODE_ROOT__TOPLEVELTYPE);
		}
		return topleveltype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SourcecodePackage.SOURCE_CODE_ROOT__TOPLEVELTYPE:
			return getTopleveltype();
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
		case SourcecodePackage.SOURCE_CODE_ROOT__TOPLEVELTYPE:
			getTopleveltype().clear();
			getTopleveltype().addAll((Collection<? extends TopLevelType>) newValue);
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
		case SourcecodePackage.SOURCE_CODE_ROOT__TOPLEVELTYPE:
			getTopleveltype().clear();
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
		case SourcecodePackage.SOURCE_CODE_ROOT__TOPLEVELTYPE:
			return topleveltype != null && !topleveltype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceCodeRootImpl
