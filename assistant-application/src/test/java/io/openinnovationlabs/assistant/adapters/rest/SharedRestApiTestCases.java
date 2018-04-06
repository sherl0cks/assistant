package io.openinnovationlabs.assistant.adapters.rest;

import org.junit.Ignore;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class SharedRestApiTestCases {

    @Test
    public void shouldReturnAListOfPractices() {
        when().
                get("/practices").
                then().
                statusCode(200).
                body("name",
                        hasItems("Event Storming",
                                "Metrics-Based Process Mapping",
                                "Impact Mapping"
                        )
                );
    }

    @Test
    public void shouldReturnAListOfObjectives() {
        when().
                get("/objectives").
                then().
                statusCode(200).
                body("name",
                        hasItems("Design an Application",
                                "Design an Operational Process",
                                "Define the Objectives for A Project"
                        )
                );
    }
}
