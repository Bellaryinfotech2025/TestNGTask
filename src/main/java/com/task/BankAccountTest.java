package com.task;

import org.testng.annotations.Test;

class BankAccount {
    private String accountHolderName;
    private double balance;
    private String bankName;

    // Constructor to initialize account details
    public BankAccount(String accountHolderName, double balance, String bankName) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.bankName = bankName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getBankName() {
        return bankName;
    }

    public String accountType() {
        return "Union bank account";
    }
}

class SavingsAccount extends BankAccount {

    // Constructor to initialize savings account details
    public SavingsAccount(String accountHolderName, double balance, String bankName) {
        super(accountHolderName, balance, bankName);
    }

    @Override
    public String accountType() {
        return "Savings account";
    }
}

public class BankAccountTest {

    @Test
    public void testAccountDetails() {
        // Creating a savings account instance
        BankAccount account = new SavingsAccount("Khaja", 5000.0, "Axis Bank");

        // Getting account details
        String accountHolderName = account.getAccountHolderName();
        double balance = account.getBalance();
        String bankName = account.getBankName();
        String accountType = account.accountType();

        // Printing the details in the required format
        System.out.println("Your name is " + accountHolderName + ".");
        System.out.println("Your account is a " + accountType + ".");
        System.out.println("Your balance is " + balance + ".");
        System.out.println("Your bank is " + bankName + ".");
        System.out.println("Thank you!");
    }
}
