package org.radhatechi.spring.api;

import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import org.radhatechi.spring.dto.CustomerDetails;
import org.radhatechi.spring.dto.CustomerInfo;

import java.util.List;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/customer")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public interface CustomerDetailsAPI {

    @GET
    @Path("/all")
    List<CustomerInfo> getAllCustomer();

    @GET
    @Path("details/{customerId}")
    CustomerInfo getCustomer(@PathParam("customerId") Long customerId);

    @POST
    @Path("details/add")
    String addCustomer(@Valid final CustomerDetails customerDetails);

}
