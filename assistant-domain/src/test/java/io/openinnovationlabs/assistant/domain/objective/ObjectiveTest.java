package io.openinnovationlabs.assistant.domain.objective;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ObjectiveTest {


    @Test
    public void shouldSuccessfullyCreateStubbedRepository() {

        // given
        ObjectiveRepository repository = new StubbedObjectiveRepository();

        // when
        List<Objective> objectives = repository.allObjectives();

        // then
        assertEquals(3, objectives.size());
    }
}
