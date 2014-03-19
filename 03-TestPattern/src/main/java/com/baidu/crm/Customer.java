package com.baidu.crm;

class Customer {

    double balance = 10d;

    public double getBalance() {
        //load from db
        return balance;
    }
    public void setBalance(double balance) {
        //save to db
        this.balance = balance;
    }

    public void consume(double consume) {
        setBalance(getBalance() - consume);
    }
}