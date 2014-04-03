package zxspectra.add.resource;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.amdatu.security.tokenprovider.InvalidTokenException;
import org.amdatu.security.tokenprovider.TokenProviderException;

import zxspectra.add.AddService;


@Path("add")
public class AddResource {
    
	private AddService addService;
	
	public AddService getAddService() {
		return addService;
	}

	public void setAddService(AddService addService) {
		this.addService = addService;
	}
	
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
	@Path("{a:\\d+}/{b:\\d+}")
    public Object placeOrder1(@PathParam("a") int a, @PathParam("b") int b) throws TokenProviderException, InvalidTokenException {
		
		String result = "Result : ";
		result+=getAddService().add(a, b);
		return result;
    }

	
}