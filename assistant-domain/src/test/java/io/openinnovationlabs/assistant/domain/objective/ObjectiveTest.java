package io.openinnovationlabs.assistant.domain.objective;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ObjectiveTest {

    // code samples if you need https://github.com/VaughnVernon/IDDD_Samples
    @Test
    public void shouldReturnListOfConstraintsWhenObjectiveSelected(){

        // given a list of objectives
        ArrayList<Objective> objectives = new ArrayList<Objective>();

        // when a user selects the "Design an Application" Objective
        // i.e. creates a command to select the objective
        SelectObjectiveCommand selectObjectiveCommand = new SelectObjectiveCommand();
        // TODO trigger command

        // then publish an event that the objective was successfully selected
        // and return a list of contraints (relevant tot hat objective)
        ObjectiveSelectedEvent objectiveSelectedEvent = /* TODO get event */;
//        Assert.assertNotNull(objectiveSelectedEvent.getObjectiveId());
        // TODO back data from mock repository
        Objective selectedObjective = ObjectiveRepository.getObjectiveById(objectiveSelectedEvent.getObjectiveId());
        Assert.assertEquals("Design an Application", selectedObjective.getName());
    }
}
