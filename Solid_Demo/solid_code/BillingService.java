package com.company.solid_code;

import com.company.solid_code.payment.*;

import java.util.Scanner;

public class BillingService {


    //transaction
    public void doPurchase(){
        long  amount   = 0;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        amount = scn.nextLong();
        System.out.println("Enter the payment mode: ");
        System.out.println("1. Debit card payment");
        System.out.println("2. Credit card payment");
        System.out.println("3. UPI payment");
        int opt = scn.nextInt();

        if(opt == 1){
            BankCard bankCard = new DebitCard();
            bankCard.doTransaction(amount);
        }
        else if (opt == 2){
            BankCard bankCard = new CreditCard();
            bankCard.doTransaction(amount);
        }
        else if ( opt == 3){
            System.out.println("1. Google pay");
            System.out.println("2. Paytm pay");
            System.out.println("3. PhonePay pay");
            int opt2 = scn.nextInt();
            if(opt2 == 1) {
                GooglePay gp = new GooglePay();
                gp.payMoney();
            }
            else if(opt2 == 2){
                Paytm pt = new Paytm();
                pt.payMoney();
            }
            else if(opt2  == 3){
                PhonePay ph = new PhonePay();
                ph.payMoney();
            }
        }


//        bankCard.doTransaction(amount);
    }


    //Demo for Dependency Inversion is below



private BankCard bankCard;
    public BillingService(BankCard bankCard){
        this.bankCard = bankCard;
    }

    public void doTransaction(long amount){
        bankCard.doTransaction(amount);
    }


    public static void main(String[] args) {

        BankCard bankCard = new CreditCard();
        BillingService bill = new BillingService(bankCard);
        bill.doTransaction(5000);
    }



}
