package io.openinnovationlabs.assistant.rest;

import io.openinnovationlabs.assistant.domain.objective.Objective;
import io.openinnovationlabs.assistant.domain.objective.ObjectiveRepository;
import io.openinnovationlabs.assistant.domain.objective.StubbedObjectiveRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ObjectiveEndpoint implements ObjectiveEndpointSpecification {

    private ObjectiveRepository repository = new StubbedObjectiveRepository();

    @Override
    public List<Objective> getObjectives() {
        return repository.allObjectives();
    }
}
