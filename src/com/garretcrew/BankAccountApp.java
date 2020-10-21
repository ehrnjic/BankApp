package com.garretcrew;

public class BankAccountApp {

    public static void main(String[] args) {

        Savings savacc1 = new Savings("Naida Hrnjic", "987654321", 600);
        Checking chkacc1 = new Checking("Enis Hrnjic", "123456789", 5000);

        savacc1.showInfo();
        System.out.println("*********************");
        chkacc1.showInfo();
        System.out.println("*********************");
        savacc1.deposit(5000);
        System.out.println("*********************");
        savacc1.withdraw(1345);
        System.out.println("*********************");
        savacc1.transfer("Raiffeisen Saving", 389);

        // Read a CSV file then create new accounts based on that data

    }

}
