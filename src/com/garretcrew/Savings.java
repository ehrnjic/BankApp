package com.garretcrew;

public class Savings extends Account{
    // List properties specific to a Saving account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize settings saving account properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;;
    }

    private void setSafetyDepositBox() {
        this.safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }

    // List any method specific to the saving account

    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Saving" );
        super.showInfo();
        System.out.println(
                "Your saving account features:" +
                "\n Safety deposit box ID: " + safetyDepositBoxID +
                "\n Safety deposit box KEY: " + safetyDepositBoxKey
        );
    }
}
