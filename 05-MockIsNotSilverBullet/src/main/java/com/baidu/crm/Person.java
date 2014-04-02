package com.baidu.crm;

import com.baidu.crm.insurance.HealthInsurance;
import com.baidu.crm.insurance.HouseFund;
import com.baidu.crm.insurance.RetirementInsurance;
import com.baidu.crm.insurance.UnemploymentInsurance;

public class Person {

    private Job job;

    public Job getJob() {
       return job;
    }


    void reqIns(Insurances insurances) {
        if (getJob() == null) {
            insurances.add(new RetirementInsurance());
        } else {
            insurances.add(new HealthInsurance());
            insurances.add(new UnemploymentInsurance());
            insurances.add(new HouseFund());
            insurances.add(new RetirementInsurance());
        }
    }
}
