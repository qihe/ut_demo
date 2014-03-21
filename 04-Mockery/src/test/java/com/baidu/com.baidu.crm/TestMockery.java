package com.baidu.crm;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMock.class)
public class TestMockery {

    Mockery context;

    @Before public void before_each(){
        context = new JUnit4Mockery();
    }

    @Test
    public void testOneSubscriberReceivesAMessage() {
        final Subscriber subscriber = context.mock(Subscriber.class);

        Publisher publisher = new Publisher();
        publisher.add(subscriber);

        final String message = "message";

        context.checking(
                new Expectations() {{allowing(subscriber).receive(message);
        }});

        publisher.publish(message);
    }

}
