package com.baidu.crm;

import com.baidu.crm.insurance.HealthInsurance;
import com.baidu.crm.insurance.HouseFund;
import com.baidu.crm.insurance.UnemploymentInsurance;

public class Job {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    void requireInsurances(Insurances insurances) {
//        insurances.add(new HealthInsurance());
//        insurances.add(new UnemploymentInsurance());
//        insurances.add(new HouseFund());
//    }
}
