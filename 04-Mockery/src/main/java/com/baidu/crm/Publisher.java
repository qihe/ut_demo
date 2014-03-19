package com.baidu.crm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Publisher {

    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void add(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void publish(String message) {
        for (Iterator<Subscriber> iterator = subscribers.iterator(); iterator.hasNext(); ) {
            Subscriber subscriber = iterator.next();
            subscriber.receive(message);
        }

    }
}
