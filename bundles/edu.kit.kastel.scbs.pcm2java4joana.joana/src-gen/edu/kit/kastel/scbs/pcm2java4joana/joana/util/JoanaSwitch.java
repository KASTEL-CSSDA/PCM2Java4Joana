/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana.util;

import edu.kit.kastel.scbs.pcm2java4joana.joana.*;

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
 * @see edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage
 * @generated
 */
public class JoanaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JoanaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanaSwitch() {
		if (modelPackage == null) {
			modelPackage = JoanaPackage.eINSTANCE;
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
		case JoanaPackage.ENTRY_POINT: {
			EntryPoint entryPoint = (EntryPoint) theEObject;
			T result = caseEntryPoint(entryPoint);
			if (result == null)
				result = caseFlowSpecificationElement(entryPoint);
			if (result == null)
				result = caseJoanaElement(entryPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaPackage.ANNOTATION: {
			Annotation annotation = (Annotation) theEObject;
			T result = caseAnnotation(annotation);
			if (result == null)
				result = caseFlowSpecificationElement(annotation);
			if (result == null)
				result = caseJoanaElement(annotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT: {
			FlowSpecificationElement flowSpecificationElement = (FlowSpecificationElement) theEObject;
			T result = caseFlowSpecificationElement(flowSpecificationElement);
			if (result == null)
				result = caseJoanaElement(flowSpecificationElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaPackage.SINK: {
			Sink sink = (Sink) theEObject;
			T result = caseSink(sink);
			if (result == null)
				result = caseAnnotation(sink);
			if (result == null)
				result = caseFlowSpecificationElement(sink);
			if (result == null)
				result = caseJoanaElement(sink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaPackage.SOURCE: {
			Source source = (Source) theEObject;
			T result = caseSource(source);
			if (result == null)
				result = caseAnnotation(source);
			if (result == null)
				result = caseFlowSpecificationElement(source);
			if (result == null)
				result = caseJoanaElement(source);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaPackage.SECURITY_LEVEL: {
			SecurityLevel securityLevel = (SecurityLevel) theEObject;
			T result = caseSecurityLevel(securityLevel);
			if (result == null)
				result = caseJoanaElement(securityLevel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaPackage.LATTICE: {
			Lattice lattice = (Lattice) theEObject;
			T result = caseLattice(lattice);
			if (result == null)
				result = caseJoanaElement(lattice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaPackage.FLOW_RELATION: {
			FlowRelation flowRelation = (FlowRelation) theEObject;
			T result = caseFlowRelation(flowRelation);
			if (result == null)
				result = caseJoanaElement(flowRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaPackage.JOANA_ROOT: {
			JOANARoot joanaRoot = (JOANARoot) theEObject;
			T result = caseJOANARoot(joanaRoot);
			if (result == null)
				result = caseJoanaElement(joanaRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaPackage.FLOW_SPECIFICATION: {
			FlowSpecification flowSpecification = (FlowSpecification) theEObject;
			T result = caseFlowSpecification(flowSpecification);
			if (result == null)
				result = caseJoanaElement(flowSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JoanaPackage.JOANA_ELEMENT: {
			JoanaElement joanaElement = (JoanaElement) theEObject;
			T result = caseJoanaElement(joanaElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryPoint(EntryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Specification Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Specification Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowSpecificationElement(FlowSpecificationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSink(Sink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityLevel(SecurityLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lattice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lattice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLattice(Lattice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowRelation(FlowRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JOANA Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JOANA Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJOANARoot(JOANARoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowSpecification(FlowSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoanaElement(JoanaElement object) {
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

} //JoanaSwitch
