package com.baidu.crm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class Assertion {

    @Test
    public void resultStateAssertion() {
        List<String> list = new ArrayList();
        list.add("hello");
        assertThat(list.size(), is(equalTo(1)));
    }

    @Test
    public void guardAssertion() {
        List<String> list = new ArrayList();
        assertThat(list.size(), is(equalTo(0)));
        list.add("hello");
        assertThat(list.size(), is(equalTo(1)));
    }

    @Test
    public void deltaAssertion() {
        List<String> list = new ArrayList();
        int beforeSize = list.size();
        list.add("hello");
        assertThat(list.size(), is(equalTo(beforeSize + 1)));
    }

    @Test
    public void userDefineAssertion() {
        List<String> list = new ArrayList();
        list.add("hello");
        a_complicated_assertion(list);
    }

    @Test
    public void interactionAssertion() {
        Customer david = new Customer("david");
        Customer arther = new Customer("arther");

        PaperBoy tom = new PaperBoy("tom");

        tom.addPaperCustomer(david);
        tom.addPaperCustomer(arther);
        tom.deliver(new NewsPaper("NewYorkTIme"));

        List<Customer> delivered = tom.delivered;

        assertThat(delivered, is(hasItem(david)));
        assertThat(delivered, is(hasItem(arther)));
    }

    private void a_complicated_assertion(List<String> list) {
        assertThat(list, is(notNullValue()));
        assertThat(list.size(), is(1));
    }


}
