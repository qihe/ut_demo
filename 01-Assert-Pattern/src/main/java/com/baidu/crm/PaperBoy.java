package com.baidu.crm;

import java.util.LinkedList;
import java.util.List;

class PaperBoy {

    List<Customer> customersWillReceivePaper = new LinkedList<Customer>();
    String name;
    List<Customer> delivered = new LinkedList<Customer>();

    public PaperBoy(String name) {
        this.name = name;
    }

    public void addPaperCustomer(Customer customer) {
        customersWillReceivePaper.add(customer);
    }

    public void deliver(NewsPaper paper) {
        for (Customer customer : customersWillReceivePaper) {
            customer.onPaperDelivered(delivered, paper);
        }
    }
}