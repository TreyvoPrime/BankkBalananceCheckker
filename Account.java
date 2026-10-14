/**
 * Program's name: Chapter 9 Peer Review Exercise
 * Programmer: Treyvon Pearson
 * Date: 10/14/26
 * Program's Purpose: The program creates a bank acocunt user adn you can withdraw and deposit money into the account. You can also view the monthly interest rate and the time the account was created.
 *
 */

import java.util.Date;
public class Account {
    private int id = 0;
    private double balance = (double)0.0F;
    private double annualInterestRate = (double)0.0F;
    private Date dateCreated;

    Account() {

        this.dateCreated = new Date();
    }
    /**
     * import constructor that constructs a account and to specify the ID and balance
     *
     * @param x the id of the account
     * @param y the balance of the account
     */
    Account(int x, double y) {
        this.id = x;
        this.balance = y;
        this.dateCreated = new Date();
    }
    /**
     * withdraw method to withdraw an amount from the account
     *
     * @return a boolean if a withdra is allowed, new balance, and a print statement if the return was a success
     */
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
    /**
     * deposit method used to make deposits into the account. The balance is increased
     *
     * @return the new balance
     */
    public void deposit(double amount) {
        if (amount > 0 && amount <= balance) {
            System.out.println("Deposit of " + amount + " successful depositing now");
            this.balance += amount;
        } else {
            System.out.print("Deposit must be positive");
        }

    }
    /**
     * getter to retrieve the ID
     *
     * @return the ID
     */
    public int getID() {
        return this.id;
    }
    /**
     * get the balance currently in the user's account
     *
     * @return the balance
     */
    public double getBalance() {
        return this.balance;
    }
    /**
     * a setter to set the annual interest rate
     *
     * @param a double wwhich takes in the annualInterestRate
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    /**
     * calculate the monthlyInterestRate
     *
     */
    public double getMonthlyInterestRate() {
        return annualInterestRate /12;
    }
    /**
     * get the date that was created
     *
     * @return returns the date created
     */
    public Date getDateCreated() {
        return this.dateCreated;
    }
    /**
     * a setter to set the ID
     *
     * @param id for the user.
     */
    public void setID(int id) {
        this.id = id;
    }
    /**
     * a setter to set the balanace
     *
     * @param balance to set the new bank balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     *
     * @return the annual interest rate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
}
