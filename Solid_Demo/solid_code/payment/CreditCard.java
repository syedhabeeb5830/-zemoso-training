package com.company.solid_code.payment;

public class CreditCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println("payment using credit card");
    }
}
