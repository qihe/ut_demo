package com.baidu.crm;

public class PersonService {

    Person person;

    public void requireInsurance(Insurances insurances) {
        person.reqIns(insurances);
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
