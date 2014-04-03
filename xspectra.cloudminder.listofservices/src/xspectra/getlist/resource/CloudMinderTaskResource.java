package xspectra.getlist.resource;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.amdatu.security.tokenprovider.InvalidTokenException;
import org.amdatu.security.tokenprovider.TokenProviderException;

import xspectra.getlist.service.CloudMinderTaskService;

@Path("tasklist")
public class CloudMinderTaskResource {

	private CloudMinderTaskService cloudMinderService;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object placeOrder1(@Context HttpServletRequest request) throws TokenProviderException, InvalidTokenException {
		String result = getCloudMinderService().getTaskList();
		return result;
    }
	
	public CloudMinderTaskService getCloudMinderService() {
		return cloudMinderService;
	}
	public void setCloudMinderService(CloudMinderTaskService cloudMinderService) {
		this.cloudMinderService = cloudMinderService;
	}
}
