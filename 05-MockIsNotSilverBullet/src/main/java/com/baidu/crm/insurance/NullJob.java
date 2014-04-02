package com.baidu.crm.insurance;

import com.baidu.crm.Insurances;
import com.baidu.crm.Job;

/**
 * Created by apple on 14-3-21.
 */
public class NullJob extends Job {
    public void requireInsurances(Insurances insurances) {
        insurances.add(new HealthInsurance());
        insurances.add(new UnemploymentInsurance());
        insurances.add(new RetirementInsurance());
        insurances.add(new HouseFund());
    }
}
