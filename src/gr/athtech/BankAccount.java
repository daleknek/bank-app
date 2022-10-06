package gr.athtech;

import java.time.LocalDate;

public class BankAccount {

    private int accountNumber;
    private Customer customer;
    private Customer holder;
    private LocalDate dateOpened;
    private double balance;

    /* Constructors*/

    public BankAccount(int accountNumber, Customer customer, Customer holder, LocalDate dateOpened, double balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.holder = holder;
        this.dateOpened = dateOpened;
        this.balance = balance;
    }

    /* *********************************************************************************** */
    /* Getters & Setters */

    /* First account holder */
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /* Second account holder */
    public Customer getHolder() {
        return holder;
    }

    public void setHolder(Customer holder) {
        this.holder = holder;
    }

    /* *********************************************************************************** */

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /* *********************************************************************************** */

    public LocalDate getDateOpened() {
        return dateOpened;
    }


    /* *********************************************************************************** */
    /* Transactions beyond this point */

    /* Account's Balance */
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void validateBalance() {

        System.out.println(getCustomer() + " your current balance is " + getBalance() + " euros.");
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                accountNumber + '}';
    }
}