/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.joana.provider;

import edu.kit.kastel.scbs.pcm2java4joana.joana.util.JoanaAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JoanaItemProviderAdapterFactory extends JoanaAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoanaItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointItemProvider entryPointItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntryPointAdapter() {
		if (entryPointItemProvider == null) {
			entryPointItemProvider = new EntryPointItemProvider(this);
		}

		return entryPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationItemProvider annotationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationAdapter() {
		if (annotationItemProvider == null) {
			annotationItemProvider = new AnnotationItemProvider(this);
		}

		return annotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowSpecificationElementItemProvider flowSpecificationElementItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowSpecificationElementAdapter() {
		if (flowSpecificationElementItemProvider == null) {
			flowSpecificationElementItemProvider = new FlowSpecificationElementItemProvider(this);
		}

		return flowSpecificationElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.kastel.scbs.pcm2java4joana.joana.Sink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkItemProvider sinkItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.kastel.scbs.pcm2java4joana.joana.Sink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSinkAdapter() {
		if (sinkItemProvider == null) {
			sinkItemProvider = new SinkItemProvider(this);
		}

		return sinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.kastel.scbs.pcm2java4joana.joana.Source} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceItemProvider sourceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.kastel.scbs.pcm2java4joana.joana.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceAdapter() {
		if (sourceItemProvider == null) {
			sourceItemProvider = new SourceItemProvider(this);
		}

		return sourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLevelItemProvider securityLevelItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecurityLevelAdapter() {
		if (securityLevelItemProvider == null) {
			securityLevelItemProvider = new SecurityLevelItemProvider(this);
		}

		return securityLevelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatticeItemProvider latticeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLatticeAdapter() {
		if (latticeItemProvider == null) {
			latticeItemProvider = new LatticeItemProvider(this);
		}

		return latticeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowRelationItemProvider flowRelationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowRelationAdapter() {
		if (flowRelationItemProvider == null) {
			flowRelationItemProvider = new FlowRelationItemProvider(this);
		}

		return flowRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JOANARootItemProvider joanaRootItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJOANARootAdapter() {
		if (joanaRootItemProvider == null) {
			joanaRootItemProvider = new JOANARootItemProvider(this);
		}

		return joanaRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowSpecificationItemProvider flowSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowSpecificationAdapter() {
		if (flowSpecificationItemProvider == null) {
			flowSpecificationItemProvider = new FlowSpecificationItemProvider(this);
		}

		return flowSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoanaElementItemProvider joanaElementItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoanaElementAdapter() {
		if (joanaElementItemProvider == null) {
			joanaElementItemProvider = new JoanaElementItemProvider(this);
		}

		return joanaElementItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (entryPointItemProvider != null)
			entryPointItemProvider.dispose();
		if (annotationItemProvider != null)
			annotationItemProvider.dispose();
		if (flowSpecificationElementItemProvider != null)
			flowSpecificationElementItemProvider.dispose();
		if (sinkItemProvider != null)
			sinkItemProvider.dispose();
		if (sourceItemProvider != null)
			sourceItemProvider.dispose();
		if (securityLevelItemProvider != null)
			securityLevelItemProvider.dispose();
		if (latticeItemProvider != null)
			latticeItemProvider.dispose();
		if (flowRelationItemProvider != null)
			flowRelationItemProvider.dispose();
		if (joanaRootItemProvider != null)
			joanaRootItemProvider.dispose();
		if (flowSpecificationItemProvider != null)
			flowSpecificationItemProvider.dispose();
		if (joanaElementItemProvider != null)
			joanaElementItemProvider.dispose();
	}

}
