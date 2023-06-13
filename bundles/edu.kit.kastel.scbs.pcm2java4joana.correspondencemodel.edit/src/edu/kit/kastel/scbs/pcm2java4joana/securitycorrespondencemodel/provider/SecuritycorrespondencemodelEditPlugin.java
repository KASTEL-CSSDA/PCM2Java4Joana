/**
 */
package edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.provider;

import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;

import de.uka.ipd.sdq.probfunction.provider.ProbabilityFunctionEditPlugin;

import de.uka.ipd.sdq.stoex.provider.StoexEditPlugin;

import de.uka.ipd.sdq.units.provider.UnitsEditPlugin;

import edu.kit.kastel.scbs.confidentiality.provider.ConfidentialityEditPlugin;

import edu.kit.kastel.scbs.pcm2java4joana.joana.provider.JoanamodelEditPlugin;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.provider.SourcecodemodelEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.palladiosimulator.pcm.core.provider.PalladioComponentModelEditPlugin;

import tools.mdsd.modelingfoundations.identifier.provider.ModelEditPlugin;

/**
 * This is the central singleton for the Securitycorrespondencemodel edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class SecuritycorrespondencemodelEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SecuritycorrespondencemodelEditPlugin INSTANCE = new SecuritycorrespondencemodelEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritycorrespondencemodelEditPlugin() {
		super
		  (new ResourceLocator [] {
		     ConfidentialityEditPlugin.INSTANCE,
		     IdentifierEditPlugin.INSTANCE,
		     JoanamodelEditPlugin.INSTANCE,
		     PalladioComponentModelEditPlugin.INSTANCE,
		     ProbabilityFunctionEditPlugin.INSTANCE,
		     SourcecodemodelEditPlugin.INSTANCE,
		     StoexEditPlugin.INSTANCE,
		     UnitsEditPlugin.INSTANCE,
		     ModelEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
