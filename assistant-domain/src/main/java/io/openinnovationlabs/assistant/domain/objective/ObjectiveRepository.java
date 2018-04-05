package io.openinnovationlabs.assistant.domain.objective;

import java.util.List;

public interface ObjectiveRepository {

    List<Objective> allObjectives();

    void save(Objective objective);
}
