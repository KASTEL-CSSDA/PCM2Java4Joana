/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.util;

import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelPackage
 * @generated
 */
public class SecuritycorrespondencemodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecuritycorrespondencemodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritycorrespondencemodelSwitch() {
		if (modelPackage == null) {
			modelPackage = SecuritycorrespondencemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SecuritycorrespondencemodelPackage.DATA_SET2_SECURITY_LEVEL: {
				DataSet2SecurityLevel dataSet2SecurityLevel = (DataSet2SecurityLevel)theEObject;
				T result = caseDataSet2SecurityLevel(dataSet2SecurityLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecuritycorrespondencemodelPackage.PARAMETERS_AND_DATA_PAIR2_ANNOTATION: {
				ParametersAndDataPair2Annotation parametersAndDataPair2Annotation = (ParametersAndDataPair2Annotation)theEObject;
				T result = caseParametersAndDataPair2Annotation(parametersAndDataPair2Annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecuritycorrespondencemodelPackage.SECURITY_CORRESPONDENCE_MODEL: {
				SecurityCorrespondenceModel securityCorrespondenceModel = (SecurityCorrespondenceModel)theEObject;
				T result = caseSecurityCorrespondenceModel(securityCorrespondenceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecuritycorrespondencemodelPackage.CONF4_CBSE_PARAMETERS_AND_DATA_PAIR: {
				Conf4CBSEParametersAndDataPair conf4CBSEParametersAndDataPair = (Conf4CBSEParametersAndDataPair)theEObject;
				T result = caseConf4CBSEParametersAndDataPair(conf4CBSEParametersAndDataPair);
				if (result == null) result = caseConf4CBSEElement(conf4CBSEParametersAndDataPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecuritycorrespondencemodelPackage.CONF4_CBSE_ELEMENT: {
				Conf4CBSEElement conf4CBSEElement = (Conf4CBSEElement)theEObject;
				T result = caseConf4CBSEElement(conf4CBSEElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecuritycorrespondencemodelPackage.CONF4_CBSE_DATA_SET: {
				Conf4CBSEDataSet conf4CBSEDataSet = (Conf4CBSEDataSet)theEObject;
				T result = caseConf4CBSEDataSet(conf4CBSEDataSet);
				if (result == null) result = caseConf4CBSEElement(conf4CBSEDataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Set2 Security Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Set2 Security Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSet2SecurityLevel(DataSet2SecurityLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters And Data Pair2 Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters And Data Pair2 Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersAndDataPair2Annotation(ParametersAndDataPair2Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Correspondence Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Correspondence Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityCorrespondenceModel(SecurityCorrespondenceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conf4 CBSE Parameters And Data Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conf4 CBSE Parameters And Data Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConf4CBSEParametersAndDataPair(Conf4CBSEParametersAndDataPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conf4 CBSE Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conf4 CBSE Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConf4CBSEElement(Conf4CBSEElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conf4 CBSE Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conf4 CBSE Data Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConf4CBSEDataSet(Conf4CBSEDataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SecuritycorrespondencemodelSwitch
