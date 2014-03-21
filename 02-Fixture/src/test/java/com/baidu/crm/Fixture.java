package com.baidu.crm;

import org.apache.commons.lang.math.RandomUtils;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Fixture {

    @Test
    public void aliceShouldAcceptWhenBillyProposed() {
        //given
        Person alice = new Person();
        alice.setFirstName("alice");
        alice.setLastName("adam");
        alice.setId(1);
        Person billy = new Person();
        billy.setId(2);
        billy.setFirstName("billy");
        billy.setLastName("burk");

        alice.fallInLoveWith(billy);
        //when
        billy.proposedTo(alice);
        //then
        assertThat(alice.isEngagedWith(billy), is(true));
    }

}
