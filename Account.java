//Abid Asif
// Java program to implement Account class with specified features
// October 15/2025

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    // No-arg constructor that creates a default account
    public Account() {
        this.dateCreated = new Date();
    }

    // Constructor that creates an account with specified id and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    // Accessor method for id
    public int getId() {
        return id;
    }

    // Mutator method for id
    public void setId(int id) {
        this.id = id;
    }

    // Accessor method for balance
    public double getBalance() {
        return balance;
    }

    // Mutator method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Accessor method for annualInterestRate
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Mutator method for annualInterestRate
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    // Accessor method for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // Method that returns the monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Method that returns the monthly interest amount
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    // Method that withdraws a specified amount from the account
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Method that deposits a specified amount to the account
    public void deposit(double amount) {
        balance += amount;
    }
}

// Test class
class Test {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " + account.getMonthlyInterest());
        System.out.println("This account was created at " + account.getDateCreated());
    }
}
