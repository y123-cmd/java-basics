import java.util.concurrent.Future;

public class Main1 {
    public static void main(String[] args) throws Exception {
        // Create 3 payments
        CreditCardPayment payment1 = new CreditCardPayment("P001", "John", 100, "1234567812345678");
        CreditCardPayment payment2 = new CreditCardPayment("P002", "Jane", 200, "8765432187654321");
        CreditCardPayment payment3 = new CreditCardPayment("P003", "Bob", 300, "1111222233334444");

        // Process all 3 at the same time!
        Future<Boolean> result1 = payment1.processPaymentAsync(100);
        Future<Boolean> result2 = payment2.processPaymentAsync(200);
        Future<Boolean> result3 = payment3.processPaymentAsync(300);

        // Get results
        System.out.println("Payment 1 success: " + result1.get());
        System.out.println("Payment 2 success: " + result2.get());
        System.out.println("Payment 3 success: " + result3.get());

        // Clean up
        CreditCardPayment.shutdownExecutor();
    }
}
