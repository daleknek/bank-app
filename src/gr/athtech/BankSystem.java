package gr.athtech;

import java.util.ArrayList;
import java.util.List;

public class BankSystem {

    List<BankAccount> allBankAccounts = new ArrayList<>();
    List<Customer> allCustomers = new ArrayList<>();
    List<Transaction> allTransactions = new ArrayList<>();

    private List<BankAccount> getAllAccountsForCustomer(Customer customer) {
        List<BankAccount> customerAccounts = new ArrayList<>();
        for (BankAccount account : allBankAccounts) {
            if (account.getHolder().equals(customer) || account.getCustomer().equals(customer)) {
                customerAccounts.add(account);
            }
        }
        return customerAccounts;
    }

    public void getAllCustomersReport() {
        for (Customer customer : allCustomers) {
            List<BankAccount> customerAccounts = getAllAccountsForCustomer(customer);
            System.out.println("Customer " + customer.getCustomerName() +
                    " with tax registry number " + customer.getCustomerTaxNumber() +
                    " has the accounts: " + customerAccounts);

        }
    }

    public void getAllAccountsReport() {
        for (BankAccount account : allBankAccounts) {
            System.out.println("Account " + account.getAccountNumber() + "," +
                    " Customer: " + account.getCustomer() + "," +
                    " Account Holder: " + account.getHolder() + "," +
                    " Account Opened: " + account.getDateOpened() + "," +
                    " Balance: " + account.getBalance());
        }
    }

    public void getAllTransactionsReport(){
        for (Transaction transaction : allTransactions) {
            System.out.println(transaction.printTransaction());
        }
    }
}
