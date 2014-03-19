package com.baidu.crm;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class SelfShunt implements PriceService{

    @Test
    public void testOrderProcessorWithMockObject() {
        OrderProcessor processor = new OrderProcessor(this);
        processor.process(new Order(new Customer(), new Product()));
        assertThat(10d, is(equalTo(new Customer().getBalance())));
    }

    @Override
    public float getDiscountPercentage(Customer c, Product p) {
        return 1f;
    }
}
