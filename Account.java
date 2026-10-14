//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = (double)0.0F;
    private double annualInterestRate = (double)0.0F;
    private Date dateCreated;

    Account() {

        this.dateCreated = new Date();
    }

    Account(int x, double y) {
        this.id = x;
        this.balance = y;
        this.dateCreated = new Date();
    }

    public boolean withdraw(double amount) {
        if (amount >= this.balance && amount <= 0) {
            System.out.println("The withdraw amount must be less or equal to the balance");
            return false;
        } else if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Your withdraw of " + amount + " was successful!");
            return true;
        } else {
            return true;
        }
    }

    public void deposit(double amount) {
        if (amount > (double)0.0F) {
            System.out.println("Deposit of " + amount + " successful depositing now");
            this.balance += amount;
        } else {
            System.out.print("Deposit must be positive");
        }

    }

    public int getID() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate /12;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
}
