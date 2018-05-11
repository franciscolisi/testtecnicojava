/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testtecnicojava.servicios;

import com.google.gson.Gson;
import com.testtecnicojava.datos.PersonaDAO;
import com.testtecnicojava.dominio.Persona;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author francisco
 */
@Path("/personas")
public class PersonaServicesResource {

    @Context
    private UriInfo context;

    private PersonaDAO personadao = new PersonaDAO();
    private Gson migson = new Gson();
    
    /**
     * Creates a new instance of PersonaServicesResource
     */
    public PersonaServicesResource() {
    }

    /**
     * Retrieves representation of an instance of com.testtecnicojava2.servicios.PersonaServicesResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * POST method for creating an instance of PersonaServiceResource
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postJson(String content) {
        //TODO
        return Response.created(context.getAbsolutePath()).build();
    }

    /**
     * Sub-resource locator method for {id_persona}
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id_persona}")
    public String getPersonaServiceResource(@PathParam("id_persona") String id_persona) {
        Persona p = new Persona();
        p.setDni(30511830L);
        return migson.toJson(p);
    }
}
