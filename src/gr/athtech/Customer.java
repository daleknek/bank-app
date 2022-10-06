package gr.athtech;

public class Customer {

   private String customerName;
   private int customerTaxNumber;

    public Customer(String customerName, int customerTaxNumber) {
        this.customerName = customerName;
        this.customerTaxNumber = customerTaxNumber;
    }

    /*Getters and Setters for Customer Name */
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerTaxNumber() {
        return customerTaxNumber;
    }


    @Override
    public String toString() {
        return customerName ;
    }
}
