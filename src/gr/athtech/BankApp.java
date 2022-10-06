package gr.athtech;

import java.time.LocalDate;

public class BankApp {

    public static void main(String[] args) {

        BankSystem bankSystem = new BankSystem();

        /*Sets the date*/
        LocalDate date = LocalDate.now();

        /*Sets Customers*/
        Customer customer1 = new Customer("Nektaria", 135);
        Customer customer2 = new Customer("Kostas", 200);
        Customer customer3 = new Customer("Anna", 125);
        Customer customer4 = new Customer("Sakis", 600);

        bankSystem.allCustomers.add(customer1);
        bankSystem.allCustomers.add(customer2);
        bankSystem.allCustomers.add(customer3);
        bankSystem.allCustomers.add(customer4);

        /* Sets new Accounts for the customers */
        BankAccount account1 = new BankAccount(15, customer1, customer2, date, 0.0);
        BankAccount account2 = new BankAccount(16, customer2, customer1, date, 0.0);
        BankAccount account3 = new BankAccount(17, customer3, customer4, date, 0.0);
        BankAccount account4 = new BankAccount(18, customer4, customer3, date, 0.0);

        bankSystem.allBankAccounts.add(account1);
        bankSystem.allBankAccounts.add(account2);
        bankSystem.allBankAccounts.add(account3);
        bankSystem.allBankAccounts.add(account4);

//        System.out.println("All Customers Report");
//        bankSystem.getAllCustomersReport();
//
//        System.out.println("\nAll Accounts Report");
//        bankSystem.getAllAccountsReport();

//       String deposit =  account1.deposit(1000.00);
//       System.out.println(deposit);
//       Check check = new Check(customer1, account1, "George", 100);
//       check.draftCheck();

//       account1.validateBalance();

       DepositTransaction depositTransaction = new DepositTransaction(account1,1000);
       bankSystem.allTransactions.add(depositTransaction);
       depositTransaction.doTransaction();
       bankSystem.getAllTransactionsReport();


    }
}
