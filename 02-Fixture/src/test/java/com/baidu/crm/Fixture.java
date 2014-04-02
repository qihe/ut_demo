package com.baidu.crm;

import org.apache.commons.lang.math.RandomUtils;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Fixture {

    private Person alice;
    private Person billy;

    @Before
    public void setUp() throws Exception {
        alice = Person.giveBirthTo("alice", "adam");
        billy = Person.giveBirthTo("billy", "burk");
    }

    @Test
    public void aliceShouldAcceptWhenBillyProposed() {

        alice.fallInLoveWith(billy);
        //when
        billy.proposedTo(alice);
        //then
        assertThat(alice.isEngagedWith(billy), is(true));
    }

}
