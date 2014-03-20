package com.baidu.crm;

/**
 * User: howard
 * Date: 06/04/12
 * Time: 15:23
 */
public class PersonService {

    Person person;

    public void requireInsurance(Insurances insurances) {
        person.reqIns(insurances);
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
