public abstract class Payment implements Payable {
    private String paymentId;
    private String customerName;
    private double amount;

    Payment(String paymentId, String customerName, double amount) {
        setPaymentId(paymentId);
        setCustomerName(customerName);
        this.amount = amount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.isEmpty()) {
            throw new IllegalArgumentException("Customer Name cannot be empty");
        }
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.amount = amount;
    }

    public abstract boolean validatePayment();

public void displayInfo(){
    System.out.println("Payment ID: " + paymentId + "Customer Name: " + customerName + "Amount: " + amount);

}


}
