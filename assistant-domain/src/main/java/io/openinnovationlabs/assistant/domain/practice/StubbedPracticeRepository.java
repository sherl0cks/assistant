package io.openinnovationlabs.assistant.domain.practice;

import io.openinnovationlabs.assistant.domain.objective.Objective;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StubbedPracticeRepository implements PracticeRepository {


    private Map<String, Practice> dataStore;
    private int idCounter = 0;

    public StubbedPracticeRepository() {
        dataStore = new HashMap<>();
    }

    @Override
    public List<Practice> allPractices() {
        List<Practice> list = new ArrayList();
        list.addAll(dataStore.values());
        return list;
    }

    @Override
    public List<Practice> allPracticesWithObjectiveId(String id) {
        List<Practice> practices = new ArrayList<>();
        for (Practice p : dataStore.values()) {
            if (p.getObjectiveId().equals(id)) {
                practices.add(p);
            }
        }
        return practices;
    }

    @Override
    public void save(Practice practice) {
        if (practice.getId() == null) {
            while (true) {
                String id = String.valueOf(idCounter++);
                if (dataStore.containsKey(id)) {
                    // key is taken, so loop once more
                } else {
                    practice.setId(id);
                    dataStore.put(id, practice);
                    break;
                }
            }
        } else {
            dataStore.put(practice.getId(), practice);
        }
    }

    @Override
    public boolean init(List<Objective> objectives) {
        for (Objective o : objectives) {
            switch (o.getName()) {
                case "Design an Application":
                    save(new Practice("Event Storming",
                            "https://rht-labs.github.io/practice-library/practices/event-storming/",
                            "Event Storming is a rapid, interactive approach to business process discovery and design that yields high quality models that are immediately transferable to software implimentation. Give it a shot!",
                            o.getId()));
                    break;
                case "Design an Operational Process":
                    save(new Practice("Metrics-Based Process Mapping",
                            "https://rht-labs.github.io/practice-library/practices/vsm-and-mbpm/",
                            "Metrics-Based Process Mapping is a lean process improvement technique derived from the Toyota Production System and Lean Manufacturing concept. It's great for designing CI/CD pipelines or infrastructure provisioning. Try it out!",
                            o.getId()));
                    break;
                case "Define the Objectives for A Project":
                    save(new Practice("Impact Mapping",
                            "https://rht-labs.github.io/practice-library/practices/impact-mapping/",
                            "Impact Mapping is an engaging, graphical, strategic planning technique that introduces a very simple human centered design process. Give it a whirl!",
                            o.getId()));
                    break;
            }
        }
        return true;
    }
}
