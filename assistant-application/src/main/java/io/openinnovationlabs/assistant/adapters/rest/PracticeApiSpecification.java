package io.openinnovationlabs.assistant.adapters.rest;

import io.openinnovationlabs.assistant.domain.practice.Practice;
import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

// https://github.com/swagger-api/swagger-samples/blob/master/java/java-jaxrs-cxf/src/main/java/io/swagger/sample/resource/PetResource.java

@Api("/practices")
@Path("/practices")
public interface PracticeApiSpecification {

    @GET
    @Produces("application/json")
    List<Practice> getPractices(
            @QueryParam("objectiveId") String objectiveId
    );

}
