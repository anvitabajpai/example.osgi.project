package zxspectra.add.resource;

import org.amdatu.security.tokenprovider.TokenProvider;
import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;

import zxspectra.add.AddService;

public class Activator extends DependencyActivatorBase {
	@Override
	public synchronized void init(BundleContext context,
			DependencyManager manager) throws Exception {
		manager.add(createComponent()
				.setInterface(Object.class.getName(), null)
				.setImplementation(AddResource.class)
				.add(createServiceDependency().setService(TokenProvider.class)
						.setRequired(true))
				.add(createServiceDependency().setService(AddService.class)
						.setRequired(true))


		);
	}

	@Override
	public synchronized void destroy(BundleContext context,
			DependencyManager manager) throws Exception {
	}
}