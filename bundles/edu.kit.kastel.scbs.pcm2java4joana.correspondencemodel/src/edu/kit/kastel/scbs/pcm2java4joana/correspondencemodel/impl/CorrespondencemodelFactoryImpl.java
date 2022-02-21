/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.impl;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorrespondencemodelFactoryImpl extends EFactoryImpl implements CorrespondencemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CorrespondencemodelFactory init() {
		try {
			CorrespondencemodelFactory theCorrespondencemodelFactory = (CorrespondencemodelFactory)EPackage.Registry.INSTANCE.getEFactory(CorrespondencemodelPackage.eNS_URI);
			if (theCorrespondencemodelFactory != null) {
				return theCorrespondencemodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CorrespondencemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondencemodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorrespondencemodelPackage.COMPONENT2_CLASS: return createComponent2Class();
			case CorrespondencemodelPackage.INTERFACE2_INTERFACE: return createInterface2Interface();
			case CorrespondencemodelPackage.OPERATION2_METHOD: return createOperation2Method();
			case CorrespondencemodelPackage.PARAMETER2_PARAMETER: return createParameter2Parameter();
			case CorrespondencemodelPackage.STRUCTURAL_CORRESPONDENCE_MODEL: return createStructuralCorrespondenceModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component2Class createComponent2Class() {
		Component2ClassImpl component2Class = new Component2ClassImpl();
		return component2Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface2Interface createInterface2Interface() {
		Interface2InterfaceImpl interface2Interface = new Interface2InterfaceImpl();
		return interface2Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation2Method createOperation2Method() {
		Operation2MethodImpl operation2Method = new Operation2MethodImpl();
		return operation2Method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter2Parameter createParameter2Parameter() {
		Parameter2ParameterImpl parameter2Parameter = new Parameter2ParameterImpl();
		return parameter2Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralCorrespondenceModel createStructuralCorrespondenceModel() {
		StructuralCorrespondenceModelImpl structuralCorrespondenceModel = new StructuralCorrespondenceModelImpl();
		return structuralCorrespondenceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondencemodelPackage getCorrespondencemodelPackage() {
		return (CorrespondencemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorrespondencemodelPackage getPackage() {
		return CorrespondencemodelPackage.eINSTANCE;
	}

} //CorrespondencemodelFactoryImpl
