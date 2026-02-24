import java.util.concurrent.*;

public  class CreditCardPayment extends Payment implements Payable{
    private String cardNumber;


    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        if(cardNumber.length()!=16){
            throw new IllegalArgumentException("Invalid card number");
        }
        this.cardNumber = cardNumber;
    }
    public CreditCardPayment(String paymentId, String customerName, double amount, String cardNumber) {
        super(paymentId,customerName,amount);
        setCardNumber(cardNumber);
    }

    @Override
    public boolean validatePayment() {
        return cardNumber.length() == 16;
    }

    @Override
    public boolean processPayment(double amount){
        if(validatePayment()){
            System.out.println("Credit card payment of $ " + amount + " processed");
            return true;
        }else {
            System.out.println("Credit card payment of $ " + amount + " failed");
            return false;
        }

    }

    private static ExecutorService executor = Executors.newFixedThreadPool(3);
    public Future<Boolean> processPaymentAsync(double amount){
        return executor.submit(() -> processPayment(amount));
    }
    @Override
    public double getTransactionFee(){
        return getAmount() * 0.025;
    }
    public static void shutdownExecutor() {
        executor.shutdown();
}
}
