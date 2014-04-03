package webshop.orders.rest;

import java.util.List;
import java.util.SortedMap;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.amdatu.security.tokenprovider.InvalidTokenException;
import org.amdatu.security.tokenprovider.TokenProvider;
import org.amdatu.security.tokenprovider.TokenProviderException;


@Path("test")
public class OrdersResource {
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
    public Object placeOrder(@Context HttpServletRequest request) throws TokenProviderException, InvalidTokenException {
		return "{\"Test\":\"Great\"}";
    }

	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object placeOrder1(@Context HttpServletRequest request) throws TokenProviderException, InvalidTokenException {
		return "{\"Test\":\"Great\"}";
    }
}
