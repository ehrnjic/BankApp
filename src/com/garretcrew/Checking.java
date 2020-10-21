package com.garretcrew;

public class Checking extends Account{
    // List properties specific to a Checking account
    int debitCardNumber;
    int debitCardPIN;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    private void setDebitCard() {
        debitCardNumber = (int)(Math.random() * Math.pow(10,12));
        debitCardPIN = (int) (Math.random() * Math.pow(10,4));
    }

    // List any method specific to the checking account
    public void showInfo() {
        super.showInfo();
        System.out.println("Your checking account features:" +
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card PIN: " + debitCardPIN);
    }
}
