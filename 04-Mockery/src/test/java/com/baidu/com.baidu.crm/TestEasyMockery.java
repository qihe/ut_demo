package com.baidu.crm;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.*;

/**
 * User: howard
 * Date: 11-11-3
 * Time: 上午11:09
 */
public class TestEasyMockery {

    private Subscriber mockSubscriber;

    @Before public void before_each(){
        mockSubscriber = EasyMock.createMock(Subscriber.class);
    }
    @Test
    public void testOneSubscriberReceivesAMessage() {
        Publisher publisher = new Publisher();
        publisher.add(mockSubscriber);

        final String message = "message";
        expect(mockSubscriber.receive(message));

        replay(mockSubscriber);

        publisher.publish(message);
    }

    @After
    public void tearDown() {
        verify(mockSubscriber);
    }
}
