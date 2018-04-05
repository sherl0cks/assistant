package io.openinnovationlabs.assistant.domain.objective;

import java.util.*;

public class StubbedObjectiveRepository implements ObjectiveRepository {

    private Map<String, Objective> dataStore;
    private int idCounter = 0;

    public StubbedObjectiveRepository() {
        dataStore = new HashMap<>();
        save(new Objective("Design an Application"));
        save(new Objective("Design an Operational Process"));
        save(new Objective("Define the Objectives for A Project"));
    }

    @Override
    public List<Objective> allObjectives() {
        List<Objective> list = new ArrayList();
        list.addAll(dataStore.values());
        return list;
    }

    @Override
    public void save(Objective objective) {

        if (objective.getId() == null){
            while (true){
                String id = String.valueOf(idCounter++);
                if ( dataStore.containsKey(id) ){
                    // key is taken, so loop once more
                } else {
                    objective.setId(id);
                    dataStore.put(id, objective);
                    break;
                }
            }
        }
        else {
            dataStore.put( objective.getId(), objective);
        }
    }
}
