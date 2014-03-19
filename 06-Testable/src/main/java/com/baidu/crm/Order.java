package com.baidu.crm;

import java.util.List;

/**
 * User: howard
 * Date: 11-11-30
 * Time: 上午11:21
 */
public class Order {
    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    List<OrderItem> items;
}



