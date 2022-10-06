package gr.athtech;

import gr.athtech.BankAccount;
import gr.athtech.Customer;
import gr.athtech.DepositTransaction;
import gr.athtech.WithdrawTransaction;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;


public class WithdrawTransactionTest {

    @Test
    public void testDepositAmount() {
        Customer customer1 = new Customer("Nektaria", 135);

        BankAccount account1 = new BankAccount(15, customer1, null, LocalDate.now(), 350.0);
        WithdrawTransaction depositTransaction = new WithdrawTransaction(account1, 100);

        depositTransaction.doTransaction();

        assertEquals(250, account1.getBalance(), 0);
    }

}
