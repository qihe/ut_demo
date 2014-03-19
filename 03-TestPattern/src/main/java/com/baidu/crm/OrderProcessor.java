package com.baidu.crm;

public class OrderProcessor {

    PriceService priceService;

    public OrderProcessor(PriceService priceService) {
        this.priceService = priceService;
    }


    public void setPriceService(PriceService priceService) {
        this.priceService = priceService;
    }

    public void process(Order order) {
        float percentage = priceService.getDiscountPercentage(order.getCustomer(), order.getProduct());
        double price = order.getProduct().getPrice() * percentage;
        order.getCustomer().consume(price);
    }
}
