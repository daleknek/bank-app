package gr.athtech;

public class DepositTransaction implements Transaction{

    private BankAccount account;
    private double amount;
    private boolean done = false;

    public DepositTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public String printTransaction() {
        if (done) {
            return account.getCustomer() + " you have deposited " + amount + " euros.";
        }
        return "";
    }

    @Override
    public void doTransaction() {
        if (account.getBalance() >= 0)
        account.setBalance(account.getBalance() + amount);
        done = true;
    }
}
