package io.openinnovationlabs.assistant.adapters.rest;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;

@Path("/")
@Component
public class SwaggerUiRedirectEndpoint {

    @GET
    public Response redirect() throws URISyntaxException {
        return Response.seeOther(new URI("/api-docs?url=/swagger.json")).build();
    }
}
