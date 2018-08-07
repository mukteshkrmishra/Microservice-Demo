package com.example.service;
import com.example.model.CreateRequest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/")
public class HelloService {

    @POST
    @Path("/helloService")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response helloREST(InputStream incomingData) {
        StringBuilder helloBuilder = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
            String line = null;
            while ((line = in.readLine()) != null) {
                helloBuilder.append(line);
            }
        } catch (Exception e) {
            System.out.println("Error Parsing: - ");
        }
        System.out.println("Data Received: " + helloBuilder.toString());

        // return HTTP response 200 in case of success
        return Response.status(200).entity(helloBuilder.toString()).build();
    }

    @GET
    @Path("/verify")
    @Produces(MediaType.TEXT_PLAIN)
    public Response verifyRESTService(InputStream incomingData) {
        String result = "HelloRESTService Successfully started..";

        // return HTTP response 200 in case of success
        return Response.status(200).entity(result).build();
    }

}