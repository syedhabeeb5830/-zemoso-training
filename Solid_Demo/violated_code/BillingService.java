package com.company.violated_code;

import com.company.violated_code.payment.DebitCard;

public class BillingService {

    //Violation:
    //violating the single responsibility principle

    //transaction
    public void doPurchase(){
        System.out.println("Transactions are done here");
    }



    //notifications service
    public void sendOTP(String medium) {

    }

    public void sendTransactionReport(String medium) {

    }


//Demo for Dependency Inversion is below


//    private DebitCard debitCard;
//
//    public BillingService(DebitCard debitCard){
//        this.debitCard = debitCard;
//    }
//
//    public void doTransaction(long amount){
//        debitCard.doTransactions(amount);
//    }
//
//
//    public static void main(String[] args) {
//
//        DebitCard debitCard  = new DebitCard();
//        BillingService bill = new BillingService(debitCard);
//        bill.doTransaction(5000);
//    }



}
