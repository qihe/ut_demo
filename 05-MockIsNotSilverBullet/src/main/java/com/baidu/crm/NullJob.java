package com.baidu.crm;

import com.baidu.crm.insurance.RetirementInsurance;

/**
 * Created by apple on 14-3-20.
 */
public class NullJob extends Job {

    @Override
    void requireInsurances(Insurances insurances) {
        insurances.add(new RetirementInsurance());
    }

}
