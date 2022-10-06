package gr.athtech;

import gr.athtech.BankAccount;
import gr.athtech.Customer;
import gr.athtech.DepositTransaction;
import gr.athtech.TransferTransaction;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;


public class TransferTransactionTest {

    @Test
    public void testDepositAmount() {
        Customer customer1 = new Customer("Nektaria", 135);

        BankAccount account1 = new BankAccount(15, customer1, null, LocalDate.now(), 100.0);
        BankAccount account2 = new BankAccount(15, customer1, null, LocalDate.now(), 200.0);
        TransferTransaction depositTransaction = new TransferTransaction(account1, account2, 50);

        depositTransaction.doTransaction();

        assertEquals(50, account1.getBalance(), 0);
        assertEquals(250, account2.getBalance(), 0);

    }

}
