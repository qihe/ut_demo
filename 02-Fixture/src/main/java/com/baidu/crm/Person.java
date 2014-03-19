package com.baidu.crm;

import org.apache.commons.lang.math.RandomUtils;

class Person {
    Integer id;
    String firstName;
    String lastName;
    Person lover;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void fallInLoveWith(Person person) {
        this.lover = person;
    }

    public boolean isFallInLoveWith(Person person) {
        return lover.is(person);
    }

    public void proposedTo(Person person) {
        this.fallInLoveWith(person);
    }


    public Boolean isEngagedWith(Person person) {
        return this.isFallInLoveWith(person);
    }

    public static Person giveBirthTo(String firstName, String lastName) {
        Person person = new Person();
        person.setId(RandomUtils.nextInt());
        person.setFirstName(firstName);
        person.setLastName(lastName);
        return person;
    }

    public static Person who() {
        Person person = new Person();
        person.setId(RandomUtils.nextInt());
        return person;
    }

    private boolean is(Person person) {
        return this.id == person.getId();
    }

}