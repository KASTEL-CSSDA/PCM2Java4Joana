/**
 */
package correspondences.impl;

import correspondences.CorrespondencesPackage;
import correspondences.MethodCorrespondence;
import correspondences.PCMMethod;
import correspondences.ParameterCorrespondence;
import correspondences.SourceCodeMethod;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link correspondences.impl.MethodCorrespondenceImpl#getPcmmethod <em>Pcmmethod</em>}</li>
 *   <li>{@link correspondences.impl.MethodCorrespondenceImpl#getSourcecodemethod <em>Sourcecodemethod</em>}</li>
 *   <li>{@link correspondences.impl.MethodCorrespondenceImpl#getParametercorrespondence <em>Parametercorrespondence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCorrespondenceImpl extends CorrespondenceElementImpl implements MethodCorrespondence {
	/**
	 * The cached value of the '{@link #getPcmmethod() <em>Pcmmethod</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmmethod()
	 * @generated
	 * @ordered
	 */
	protected EList<PCMMethod> pcmmethod;

	/**
	 * The cached value of the '{@link #getSourcecodemethod() <em>Sourcecodemethod</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcecodemethod()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceCodeMethod> sourcecodemethod;

	/**
	 * The cached value of the '{@link #getParametercorrespondence() <em>Parametercorrespondence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametercorrespondence()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCorrespondence> parametercorrespondence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencesPackage.Literals.METHOD_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCMMethod> getPcmmethod() {
		if (pcmmethod == null) {
			pcmmethod = new EObjectContainmentEList<PCMMethod>(PCMMethod.class, this, CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD);
		}
		return pcmmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceCodeMethod> getSourcecodemethod() {
		if (sourcecodemethod == null) {
			sourcecodemethod = new EObjectContainmentEList<SourceCodeMethod>(SourceCodeMethod.class, this, CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD);
		}
		return sourcecodemethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCorrespondence> getParametercorrespondence() {
		if (parametercorrespondence == null) {
			parametercorrespondence = new EObjectContainmentEList<ParameterCorrespondence>(ParameterCorrespondence.class, this, CorrespondencesPackage.METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE);
		}
		return parametercorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD:
				return ((InternalEList<?>)getPcmmethod()).basicRemove(otherEnd, msgs);
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD:
				return ((InternalEList<?>)getSourcecodemethod()).basicRemove(otherEnd, msgs);
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE:
				return ((InternalEList<?>)getParametercorrespondence()).basicRemove(otherEnd, msgs);
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
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD:
				return getPcmmethod();
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD:
				return getSourcecodemethod();
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE:
				return getParametercorrespondence();
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
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD:
				getPcmmethod().clear();
				getPcmmethod().addAll((Collection<? extends PCMMethod>)newValue);
				return;
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD:
				getSourcecodemethod().clear();
				getSourcecodemethod().addAll((Collection<? extends SourceCodeMethod>)newValue);
				return;
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE:
				getParametercorrespondence().clear();
				getParametercorrespondence().addAll((Collection<? extends ParameterCorrespondence>)newValue);
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
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD:
				getPcmmethod().clear();
				return;
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD:
				getSourcecodemethod().clear();
				return;
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE:
				getParametercorrespondence().clear();
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
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PCMMETHOD:
				return pcmmethod != null && !pcmmethod.isEmpty();
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__SOURCECODEMETHOD:
				return sourcecodemethod != null && !sourcecodemethod.isEmpty();
			case CorrespondencesPackage.METHOD_CORRESPONDENCE__PARAMETERCORRESPONDENCE:
				return parametercorrespondence != null && !parametercorrespondence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodCorrespondenceImpl
