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
    @ApiOperation(value = "List all published services, optionally filtering by subclass", response = Service.class, responseContainer = "List")
    public List<Service> getPublishedServices(@ApiParam(value = "Filter by subclass") @QueryParam("subclass") @DefaultValue("") String subclass) {
        return new ArrayList<>();
    }

    @GET
    @Path("/{serviceId}")
    @ApiOperation(value = "Fetches the specified service version", response = Service.class)
    public Service getService(@PathParam("serviceId") Long serviceId) {
        return null;
    }

    @GET
    @Path("/{serviceId}/versions")
    @ApiOperation(value = "Gets all versions of the specified version", response = ServiceVersion.class, responseContainer = "List")
    public List<ServiceVersion> getServiceVersions(@PathParam("serviceId") Long serviceId) {
        return new ArrayList<>();
    }

    @GET
    @Path("/{serviceId}/versions/{versionId}")
    @ApiOperation(value = "Gets the specified service version", response = ServiceVersion.class)
    public ServiceVersion getServiceVersion(@PathParam("serviceId") Long serviceId, @PathParam("versionId") Long versionId) {
        return null;
    }

}
