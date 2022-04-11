package com.company.solid_code.payment;

public class DebitCard implements BankCard{
    public void doTransaction(long amount){
        System.out.println("payment using debit card");
    }
}
