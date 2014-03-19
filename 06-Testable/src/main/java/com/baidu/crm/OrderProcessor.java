package com.baidu.crm;

import java.util.List;

/**
 * User: howard
 * Date: 11-11-30
 * Time: 上午11:21
 */
public class OrderProcessor {

    PriceService priceService;

    public Double process(Order order) {
        Double totalAmount = 0d;
        List<OrderItem> orderItems = order.getItems();
        for (int i = 0; i < orderItems.size(); i++) {
            OrderItem item = orderItems.get(i);
            //static method
            double productPrice = PriceService.getProductPrice(item);
            totalAmount += item.getSum() * productPrice;
        }
        return totalAmount;
    }

}
