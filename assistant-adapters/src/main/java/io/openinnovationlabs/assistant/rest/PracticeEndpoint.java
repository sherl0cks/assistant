/*
 * Copyright 2016-2017 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.openinnovationlabs.assistant.rest;

import io.openinnovationlabs.assistant.domain.pratice.Practice;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

// example of how to set this up to generate swagger documentation
// https://github.com/swagger-api/swagger-samples/blob/master/java/java-jaxrs-cxf/src/main/java/io/swagger/sample/resource/PetResource.java
@Api("/practices")
@Path("/practices")
@Component
public class PracticeEndpoint {

    public PracticeEndpoint() {}

    @GET
    @Produces("application/json")
    public List<Practice> getPractices() {
        Practice p = new Practice();
        p.setName("foo");
        List<Practice> practices = new ArrayList<>();
        practices.add(p);
        return practices;
    }
}
