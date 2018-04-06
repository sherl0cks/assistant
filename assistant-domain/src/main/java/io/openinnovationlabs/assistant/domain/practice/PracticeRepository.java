package io.openinnovationlabs.assistant.domain.practice;

import io.openinnovationlabs.assistant.domain.objective.Objective;

import java.util.List;

public interface PracticeRepository {

    List<Practice> allPractices();

    List<Practice> allPracticesWithObjectiveId(String id);

    void save(Practice practice);

    boolean init(List<Objective> objectives);
}
