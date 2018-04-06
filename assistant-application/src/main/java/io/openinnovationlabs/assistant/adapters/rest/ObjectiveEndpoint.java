package io.openinnovationlabs.assistant.adapters.rest;

import io.openinnovationlabs.assistant.domain.objective.Objective;
import io.openinnovationlabs.assistant.domain.objective.ObjectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ObjectiveEndpoint implements ObjectiveApiSpecification {

    @Autowired
    private ObjectiveRepository repository;

    @Override
    public List<Objective> getObjectives() {
        return repository.allObjectives();
    }
}
