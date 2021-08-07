/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana.provider;

import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowSpecificationElementItemProvider extends JoanaElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSpecificationElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTagPropertyDescriptor(object);
			addAnnotatedClassPropertyDescriptor(object);
			addAnnotatedMethodPropertyDescriptor(object);
			addAnnotatedClassNamePropertyDescriptor(object);
			addAnnotatedMethodNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FlowSpecificationElement_tag_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_FlowSpecificationElement_tag_feature",
						"_UI_FlowSpecificationElement_type"),
				JoanaPackage.Literals.FLOW_SPECIFICATION_ELEMENT__TAG, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Annotated Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotatedClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FlowSpecificationElement_annotatedClass_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_FlowSpecificationElement_annotatedClass_feature",
						"_UI_FlowSpecificationElement_type"),
				JoanaPackage.Literals.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Annotated Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotatedMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FlowSpecificationElement_annotatedMethod_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_FlowSpecificationElement_annotatedMethod_feature",
						"_UI_FlowSpecificationElement_type"),
				JoanaPackage.Literals.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Annotated Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotatedClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FlowSpecificationElement_annotatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FlowSpecificationElement_annotatedClassName_feature", "_UI_FlowSpecificationElement_type"),
				JoanaPackage.Literals.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Annotated Method Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotatedMethodNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FlowSpecificationElement_annotatedMethodName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_FlowSpecificationElement_annotatedMethodName_feature",
								"_UI_FlowSpecificationElement_type"),
						JoanaPackage.Literals.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns FlowSpecificationElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FlowSpecificationElement"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FlowSpecificationElement) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_FlowSpecificationElement_type")
				: getString("_UI_FlowSpecificationElement_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FlowSpecificationElement.class)) {
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__TAG:
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_CLASS_NAME:
		case JoanaPackage.FLOW_SPECIFICATION_ELEMENT__ANNOTATED_METHOD_NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
