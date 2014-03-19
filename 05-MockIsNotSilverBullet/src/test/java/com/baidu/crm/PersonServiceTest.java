package com.baidu.crm;

import com.baidu.crm.insurance.*;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: howard
 * Date: 06/04/12
 * Time: 15:44
 */
@RunWith(JMock.class)
public class PersonServiceTest {
    Mockery context;
    PersonService service = new PersonService();
    Insurances insurances;
    private Person aGuy;

    @Before
    public void before_each() {
        context = new Mockery() {{
            setImposteriser(ClassImposteriser.INSTANCE);
        }};
        insurances = new Insurances();
        aGuy = context.mock(Person.class);
    }

    @Test
    public void person_without_job_has_retirement_insurance() {
        context.checking(new Expectations() {{
            allowing(aGuy).getJob();
            will(returnValue(null));
        }});
        service.setPerson(aGuy);
        service.requireInsurance(insurances);
        assertThat(insurances.hasAllInsurance(), is(false));
        assertThat(insurances.hasInsurance(new RetirementInsurance()), is(true));
    }

    @Test
    public void person_with_job_has_insurances() {
        context.checking(new Expectations() {{
            allowing(aGuy).getJob();
            will(returnValue(new Job()));
        }});
        service.setPerson(aGuy);
        service.requireInsurance(insurances);
        assertThat(insurances.hasAllInsurance(), is(true));

    }
}
