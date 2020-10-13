package com.garretcrew;

public abstract class Account implements IBaseRate {
    // List common properties for checking and saving accounts
    String name;
    String sSN;
    double balance;

    String accountNumber;
    double rate;

    // Constructor to set base properties and initialize accounts
    public Account() {
    }

    // List common methods

}
