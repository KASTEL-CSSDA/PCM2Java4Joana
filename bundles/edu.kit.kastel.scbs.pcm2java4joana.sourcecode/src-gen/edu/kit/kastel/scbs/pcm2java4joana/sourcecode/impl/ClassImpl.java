/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Field;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ClassImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends TopLevelTypeImpl implements edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class {
	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> implements_;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcecodePackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList<Interface>(Interface.class, this,
					SourcecodePackage.CLASS__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectResolvingEList<Field>(Field.class, this, SourcecodePackage.CLASS__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SourcecodePackage.CLASS__IMPLEMENTS:
			return getImplements();
		case SourcecodePackage.CLASS__FIELDS:
			return getFields();
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
		case SourcecodePackage.CLASS__IMPLEMENTS:
			getImplements().clear();
			getImplements().addAll((Collection<? extends Interface>) newValue);
			return;
		case SourcecodePackage.CLASS__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends Field>) newValue);
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
		case SourcecodePackage.CLASS__IMPLEMENTS:
			getImplements().clear();
			return;
		case SourcecodePackage.CLASS__FIELDS:
			getFields().clear();
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
		case SourcecodePackage.CLASS__IMPLEMENTS:
			return implements_ != null && !implements_.isEmpty();
		case SourcecodePackage.CLASS__FIELDS:
			return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
