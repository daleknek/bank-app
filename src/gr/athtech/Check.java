package gr.athtech;

public class Check {

    private Customer customer;
    private BankAccount account;
    private String recipient;
    private int checkAmount;

    public Check(Customer customer, BankAccount account, String recipient, int checkAmount) {
        this.customer = customer;
        this.account = account;
        this.recipient = recipient;
        this.checkAmount = checkAmount;
    }

    public void draftCheck () {
        if (account.getBalance() >= 0) {
            WithdrawTransaction withdrawTransaction = new WithdrawTransaction(account, checkAmount);
            withdrawTransaction.doTransaction();
            System.out.println(customer.getCustomerName() + " has drafted a check with the amount of " + checkAmount + " euros to " + recipient + ".");
        } else {
            System.out.println("You can't draft a check.");
        }
    }



}
