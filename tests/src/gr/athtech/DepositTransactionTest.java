package gr.athtech;

import gr.athtech.BankAccount;
import gr.athtech.Customer;
import gr.athtech.DepositTransaction;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class DepositTransactionTest {

    @Test
    public void testDepositAmount() {
        Customer customer1 = new Customer("Nektaria", 135);

        BankAccount account1 = new BankAccount(15, customer1, null, LocalDate.now(), 0.0);
        DepositTransaction depositTransaction = new DepositTransaction(account1, 50);

        depositTransaction.doTransaction();

        assertEquals(50, account1.getBalance(), 0);
    }

}
