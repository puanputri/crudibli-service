package com.chaaw.controller;

import com.chaaw.model.Crudibli;
import com.chaaw.service.CrudibliService;
import jakarta.inject.Inject;
import jakarta.persistence.Id;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path(("/v1/crudiblis"))
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CrudibliController {
    @Inject
    CrudibliService crudibliService;

    @GET
    public Response getCrudibli() {
        List<Crudibli> crudiblis = crudibliService.getCrudiblis();
        return Response
                .status(Response.Status.OK)
                .entity(crudiblis)
                .build();
    }

    @POST
    public Response addCrudibli(Crudibli crudibli){
        crudibliService.addCrudibli(crudibli);
        return Response
                .status(Response.Status.CREATED).entity("success")
                .build();
    }

    @PUT
    @Path("/{crudibliId}")
    public Response updateCrudibli(@PathParam("crudibliId") String crudibliId, Crudibli crudibli){
        crudibliService.updateCrudibli(crudibliId, crudibli);
        return Response
                .status(Response.Status.ACCEPTED)
                .entity("SUCCESS BRE")
                .build();
    }

    @DELETE
    @Path("/{crudibliId}")
    public Response deleteCrudibli(@PathParam("crudibliId")String crudibliId){
        crudibliService.deleteCrudibli(crudibliId);
        return Response.status(Response.Status.ACCEPTED).entity("deleted success").build();
    }

}
