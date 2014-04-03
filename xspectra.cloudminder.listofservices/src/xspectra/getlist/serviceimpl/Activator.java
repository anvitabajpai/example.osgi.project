package xspectra.getlist.serviceimpl;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.amdatu.mongo.MongoDBService;

import xspectra.getlist.service.CloudMinderTaskService;

public class Activator extends DependencyActivatorBase {
    @Override
    public synchronized void init(BundleContext context, DependencyManager manager) throws Exception {
        manager.add(createComponent()
        	.setInterface(CloudMinderTaskService.class.getName(), null)
            .setImplementation(CloudMinderTaskServiceImpl.class)
            .add(createServiceDependency()
                .setService(LogService.class)
                .setRequired(false))
            );
    }

    @Override
    public synchronized void destroy(BundleContext context, DependencyManager manager) throws Exception {
    }
}