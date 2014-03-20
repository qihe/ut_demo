package com.baidu.crm;

import java.util.List;


public class Order {
    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    List<OrderItem> items;
}



