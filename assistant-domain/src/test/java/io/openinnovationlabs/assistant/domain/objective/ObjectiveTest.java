package io.openinnovationlabs.assistant.domain.objective;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ObjectiveTest {


    @Test
    public void shouldSuccesfullyCreateStubbedRepository() {

        // given
        ObjectiveRepository repository = new StubbedObjectiveRepository();

        // when
        List<Objective> objectives = repository.allObjectives();

        // then
        Assert.assertEquals(3, objectives.size());
    }
}
