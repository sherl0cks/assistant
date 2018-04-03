package io.openinnovationlabs.assistant.domain.practice;

import io.openinnovationlabs.assistant.domain.pratice.Practice;
import org.junit.Assert;
import org.junit.Test;

public class PracticeTest {

    @Test
    public void shouldTestCreateAPractice(){

        // given
        Practice p = new Practice();
        p.setName("foo");

        // when
        String name = p.getName();

        // then
        Assert.assertEquals("foo", name);
    }
}
