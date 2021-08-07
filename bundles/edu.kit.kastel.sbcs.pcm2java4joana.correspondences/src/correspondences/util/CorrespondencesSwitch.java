/**
 */
package correspondences.util;

import correspondences.*;

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
 * @see correspondences.CorrespondencesPackage
 * @generated
 */
public class CorrespondencesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorrespondencesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondencesSwitch() {
		if (modelPackage == null) {
			modelPackage = CorrespondencesPackage.eINSTANCE;
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
			case CorrespondencesPackage.CORRESPONDENCE_ELEMENT: {
				CorrespondenceElement correspondenceElement = (CorrespondenceElement)theEObject;
				T result = caseCorrespondenceElement(correspondenceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorrespondencesPackage.PCM_COMPONENT: {
				PCMComponent pcmComponent = (PCMComponent)theEObject;
				T result = casePCMComponent(pcmComponent);
				if (result == null) result = caseCorrespondenceElement(pcmComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorrespondencesPackage.SOURCE_CODE_CLASS: {
				SourceCodeClass sourceCodeClass = (SourceCodeClass)theEObject;
				T result = caseSourceCodeClass(sourceCodeClass);
				if (result == null) result = caseCorrespondenceElement(sourceCodeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorrespondencesPackage.SOURCE_CODE_METHOD: {
				SourceCodeMethod sourceCodeMethod = (SourceCodeMethod)theEObject;
				T result = caseSourceCodeMethod(sourceCodeMethod);
				if (result == null) result = caseCorrespondenceElement(sourceCodeMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorrespondencesPackage.PCM_PROVIDED_INTERFACE: {
				PCMProvidedInterface pcmProvidedInterface = (PCMProvidedInterface)theEObject;
				T result = casePCMProvidedInterface(pcmProvidedInterface);
				if (result == null) result = caseCorrespondenceElement(pcmProvidedInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorrespondencesPackage.PCM_METHOD: {
				PCMMethod pcmMethod = (PCMMethod)theEObject;
				T result = casePCMMethod(pcmMethod);
				if (result == null) result = caseCorrespondenceElement(pcmMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorrespondencesPackage.SOURCE_CODE_PARAMTER: {
				SourceCodeParamter sourceCodeParamter = (SourceCodeParamter)theEObject;
				T result = caseSourceCodeParamter(sourceCodeParamter);
				if (result == null) result = caseCorrespondenceElement(sourceCodeParamter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorrespondencesPackage.PCM_PARAMETER: {
				PCMParameter pcmParameter = (PCMParameter)theEObject;
				T result = casePCMParameter(pcmParameter);
				if (result == null) result = caseCorrespondenceElement(pcmParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorrespondencesPackage.COMPONENT_CORRESPONDENCE: {
				ComponentCorrespondence componentCorrespondence = (ComponentCorrespondence)theEObject;
				T result = caseComponentCorrespondence(componentCorrespondence);
				if (result == null) result = caseCorrespondenceElement(componentCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorrespondencesPackage.METHOD_CORRESPONDENCE: {
				MethodCorrespondence methodCorrespondence = (MethodCorrespondence)theEObject;
				T result = caseMethodCorrespondence(methodCorrespondence);
				if (result == null) result = caseCorrespondenceElement(methodCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorrespondencesPackage.PARAMETER_CORRESPONDENCE: {
				ParameterCorrespondence parameterCorrespondence = (ParameterCorrespondence)theEObject;
				T result = caseParameterCorrespondence(parameterCorrespondence);
				if (result == null) result = caseCorrespondenceElement(parameterCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correspondence Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correspondence Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrespondenceElement(CorrespondenceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMComponent(PCMComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Code Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Code Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceCodeClass(SourceCodeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Code Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Code Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceCodeMethod(SourceCodeMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Provided Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Provided Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMProvidedInterface(PCMProvidedInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMMethod(PCMMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Code Paramter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Code Paramter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceCodeParamter(SourceCodeParamter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMParameter(PCMParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentCorrespondence(ComponentCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodCorrespondence(MethodCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterCorrespondence(ParameterCorrespondence object) {
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

} //CorrespondencesSwitch
