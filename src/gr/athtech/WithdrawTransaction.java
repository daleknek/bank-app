package gr.athtech;

public class WithdrawTransaction implements Transaction {

   private BankAccount account;
   private double amount;
   private boolean done = false;

    public WithdrawTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }


    @Override
    public String printTransaction() {
        if (done) {
            return account.getCustomer() + " you have withdrawn " + amount + " euros.";
        }
        return "";
    }

    @Override
    public void doTransaction() {
        if (account.getBalance() > 0) {
            account.setBalance(account.getBalance() - amount);
        } else {
            System.out.println("Your balance is zero.");
        }
        done = true;

    }
}
