package io.openinnovationlabs.assistant.rest;

import io.openinnovationlabs.assistant.domain.objective.Objective;
import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Api("/objectives")
@Path("/objectives")
public interface ObjectiveEndpointSpecification {

    @GET
    @Produces("application/json")
    List<Objective> getObjectives();
}
