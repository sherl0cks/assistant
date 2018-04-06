package io.openinnovationlabs.assistant.domain.practice;

import io.openinnovationlabs.assistant.domain.objective.StubbedObjectiveRepository;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PracticeTest {

    @Test
    public void shouldReturnAllPractices() {

        // given
        PracticeRepository repository = new StubbedPracticeRepository();
        repository.save(new Practice("foo", "bar", "baz", "1"));

        // when
        List<Practice> practices = repository.allPractices();

        // then
        assertEquals(practices.size(), 1);

    }

    @Test
    public void shouldReturnAllPracticesWithObjectiveId() {

        // given
        PracticeRepository repository = new StubbedPracticeRepository();
        repository.save(new Practice("Impact Mapping", "bar", "baz", "1"));
        repository.save(new Practice("Event Storming", "bar", "baz", "2"));
        repository.save(new Practice("Metrics Based Process Mapping", "bar", "baz", "3"));

        // when
        List<Practice> practices = repository.allPracticesWithObjectiveId("2");

        // then
        assertEquals(practices.size(), 1);
        assertEquals(practices.get(0).getName(), "Event Storming");

    }

    @Test
    public void shouldInitializePracticeRepository(){

        // given
        PracticeRepository repository = new StubbedPracticeRepository();
        assertEquals(0, repository.allPractices().size());


        // when
        repository.init( new StubbedObjectiveRepository().allObjectives());

        // then
        List<Practice> practices = repository.allPractices();

        assertEquals(3, practices.size());

        for ( Practice p : practices ) {
            assertNotNull( p.getObjectiveId() );
        }


    }
}
