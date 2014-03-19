package com.baidu.crm;

import java.util.List;

class Customer {


    String name;

    public Customer(String name) {
        this.name = name;
    }

    public void onPaperDelivered(List<Customer> delivered, NewsPaper paper) {
        delivered.add(this);
    }
}