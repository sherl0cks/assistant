package io.openinnovationlabs.assistant.application;

import io.openinnovationlabs.assistant.domain.objective.Objective;
import io.openinnovationlabs.assistant.domain.objective.ObjectiveRepository;
import io.openinnovationlabs.assistant.domain.objective.StubbedObjectiveRepository;
import io.openinnovationlabs.assistant.domain.practice.PracticeRepository;
import io.openinnovationlabs.assistant.domain.practice.StubbedPracticeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RepositoryConfiguration {

    @Bean
    public ObjectiveRepository objectiveRepository() {
        return new StubbedObjectiveRepository();
    }

    @Bean
    public PracticeRepository practiceRepository(ObjectiveRepository objectiveRepository) {
        PracticeRepository practiceRepository = new StubbedPracticeRepository();
        practiceRepository.init(objectiveRepository.allObjectives());

        return practiceRepository;
    }
}
