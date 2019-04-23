package io.dockstore.webservice.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.dockstore.webservice.core.Service;
import io.dockstore.webservice.core.ServiceVersion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.hibernate.SessionFactory;

@Path("/services")
@Api("/services")
@Produces(MediaType.APPLICATION_JSON)
public class ServicesResource {

    public ServicesResource(SessionFactory sessionFactory) {

    }

    @GET
    @ApiOperation("List all published services")
    public List<Service> getPublishedServices() {
        return new ArrayList<>();
    }

    @GET
    @Path("{serviceId}")
    public Service getService(
            @ApiParam(value = "Filter by subclass") @QueryParam("subclass") @DefaultValue("") String subclass) {
        return null;
    }

    @GET
    @Path("{serviceId}/versions")
    public List<ServiceVersion> getServiceVersions(@PathParam("serviceId") Long serviceId) {
        return new ArrayList<>();
    }

    @GET
    @Path("{serviceId}/versions/{versionId}")
    public ServiceVersion getServiceVersion(@PathParam("serviceId") Long serviceId, @PathParam("versionId") Long versionId) {
        return null;
    }

    @GET
    @Path("{serviceId}/versions/{versionId}/")
    @Produces("application/zip")
    public Response downloadVersion(@PathParam("serviceId") Long serviceId, @PathParam("versionId") Long versionId) {
        return Response.ok().build();
    }
}
