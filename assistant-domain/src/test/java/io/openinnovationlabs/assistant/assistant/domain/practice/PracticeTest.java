package io.openinnovationlabs.assistant.assistant.domain.practice;

import io.openinnovationlabs.assistant.assistant.domain.pratice.Practice;
import org.junit.Assert;
import org.junit.Test;

public class PracticeTest {

    @Test
    public void shouldTestCreateAPracitce(){

        // given
        Practice p = new Practice();
        p.setName("foo");

        // when
        String name = p.getName();

        // then
        Assert.assertEquals("foo", name);
    }
}
