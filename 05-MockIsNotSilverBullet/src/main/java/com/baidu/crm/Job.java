package com.baidu.crm;

import com.baidu.crm.insurance.HealthInsurance;
import com.baidu.crm.insurance.HouseFund;
import com.baidu.crm.insurance.RetirementInsurance;
import com.baidu.crm.insurance.UnemploymentInsurance;

/**
 * User: howard
 * Date: 06/04/12
 * Time: 15:26
 */
public class Job {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void requireInsurances(Insurances insurances) {
        insurances.add(new HealthInsurance());
        insurances.add(new UnemploymentInsurance());
        insurances.add(new HouseFund());
        insurances.add(new RetirementInsurance());
    }

}
