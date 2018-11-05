package com.oopStudy;

import java.lang.String.*;

public class Account {

    int accNumber;
    float Amount;
    String Name;

    void getAccountdetails(int accNumber, float Amount, String Name) {
        this.Amount = Amount;
        this.accNumber = accNumber;
        this.Name = Name;
    }

    void deposit(int newammount) {

        Amount = Amount + newammount;

    }

    void withdraw(float withdrawal) {

        Amount = Amount - withdrawal;

    }

    void checkBalance() {
        System.out.println("Balance Amount is :" + Amount);
    }

    void displayAccount() {
        System.out.println(Name + " " + accNumber + " " + Amount);
        //System.out.println(accNumber);
        //System.out.println(Amount);


    }


}
