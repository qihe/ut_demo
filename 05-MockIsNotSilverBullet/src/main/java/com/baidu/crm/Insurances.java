package com.baidu.crm;

import com.baidu.crm.insurance.*;

import java.util.ArrayList;
import java.util.List;

public class Insurances {

    List<Insurance> insurances = new ArrayList<Insurance>();

    public void add(Insurance insurance) {
        insurances.add(insurance);
    }

    public Boolean hasInsurance(Insurance insurance) {
        return insurances.contains(insurance);
    }

    public Boolean hasAllInsurance() {
        return this.hasInsurance(new HealthInsurance())
                && this.hasInsurance(new HouseFund())
                && this.hasInsurance(new RetirementInsurance())
                && this.hasInsurance(new UnemploymentInsurance());
    }
}
