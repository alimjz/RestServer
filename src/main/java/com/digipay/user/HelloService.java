package com.digipay.user;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
public class HelloService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response greetClient(){
        String output = "Hi " + "";
        return Response.status(200).entity(output).build();
    }
}
