package com.baidu.crm;


public class Person {

    private Job job;

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    void reqIns(Insurances insurances) {
        job.requireInsurances(insurances);
    }

}
