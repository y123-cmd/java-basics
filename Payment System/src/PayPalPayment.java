public class PayPalPayment extends Payment implements  Payable {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
            }
            this.email = email;
        }

    public PayPalPayment(String paymentId, String customerName, double amount, String email) {
        super(paymentId, customerName, amount);
        setEmail(email);
    }

    @Override
    public boolean validatePayment() {
        if(email.contains("@")) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean processPayment(double amount) {
        if (validatePayment()) {
            System.out.println("paypal payment of $ " + amount + "processed");
            return true;
        }else{
            System.out.println("paypal payment of $ " + amount + "failed");
            return false;
        }

    }
    @Override
    public double getTransactionFee() {
        return getAmount() * 0.03;
    }
}

