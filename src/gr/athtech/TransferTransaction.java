package gr.athtech;

public class TransferTransaction implements Transaction {

    private BankAccount fromAccount;
    private BankAccount toAccount;
    private double amount;
    private boolean done = false;

    public TransferTransaction(BankAccount fromAccount, BankAccount toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public String printTransaction() {
        if (done) {
            return fromAccount.getAccountNumber() + " transferred " + this.amount + " euros. to account " + toAccount.getAccountNumber();
        }
        return "";
    }

    @Override
    public void doTransaction() {
        if (fromAccount.getBalance() >= this.amount) {
            fromAccount.setBalance(fromAccount.getBalance() - this.amount);
            toAccount.setBalance(toAccount.getBalance() + this.amount);
        } else {
            System.out.println("Your balance is zero.");
        }
        done = true;
    }
}
