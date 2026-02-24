import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment("1", "Joyce", 60000.0, "4578903457777777");
        CreditCardPayment creditCardPayment1 = new CreditCardPayment("2", "Ritah", 40000.0, "1234567890987654");

        PayPalPayment payPalPayment = new PayPalPayment("3", "John", 45000.0, "john@gmail.com");
        PayPalPayment payPalPayment1 = new PayPalPayment("4", "Noreen", 40000.0, "noreen@gmail.com");

        ArrayList<Payment> payment = new ArrayList<>();
        payment.add(creditCardPayment);
        payment.add(creditCardPayment1);
        payment.add(payPalPayment);
        payment.add(payPalPayment1);
        payment.remove(creditCardPayment);
        payment.add(creditCardPayment);
        System.out.println("=== getting first payments using streams ");
        payment.stream()
                .findFirst()
                .ifPresent(p ->
                        System.out.println("First payment: " + p.getCustomerName()));

        System.out.println("=== Getting First Payment Using For-Each ===");
        for (Payment pay : payment) {
            System.out.println("First payment: " + pay.getCustomerName());
            break;
        }
        System.out.println();

        System.out.println("=== processing payments using streams ");
        payment.stream()
                .filter(p -> p.getCustomerName().equalsIgnoreCase("Joyce"))
                .findFirst()
                .ifPresentOrElse(
                        p -> System.out.println("Joyce's payment: $" + p.getAmount()),
                         () -> System.out.println("Payment not found for Joyce")
                );


        System.out.println("=== Processing All Payments ===");
        for (Payment pay : payment) {
            boolean success = pay.processPayment(pay.getAmount());
            if (success) {
                System.out.println("Payment ID: " + pay.getPaymentId() +
                        " - Customer: " + pay.getCustomerName() +
                        " - Amount: $" + pay.getAmount());
            }

            System.out.println("=== high value payments using streams ===");
            payment.stream()
                    .filter(p -> p.getAmount() > 50000.0)
                    .forEach(p ->
                            System.out.println(p.getCustomerName() + ": $" + p.getAmount())
                    );

            System.out.println("=== High-Value Payments (Using For-Each) ===");
            for (Payment p : payment) {
                if (p.getAmount() > 50000.0) {
                    System.out.println(p.getCustomerName() + ": $" + p.getAmount());
                }
            }
            System.out.println();


            System.out.println();

        HashMap<String, Payment> paymentMap = new HashMap<>();
        paymentMap.put(creditCardPayment.getPaymentId(), creditCardPayment);
        paymentMap.put(creditCardPayment1.getPaymentId(), creditCardPayment1);
        paymentMap.put(payPalPayment.getPaymentId(), payPalPayment);
        paymentMap.put(payPalPayment1.getPaymentId(), payPalPayment1);

        System.out.println("== lookup by customer id==");

        Payment foundPayment = paymentMap.get("2");
        System.out.println("Found payment: " + foundPayment.getAmount());


        HashMap<String, Payment> paymentsByCustomer = new HashMap<>();
        paymentsByCustomer.put(creditCardPayment.getCustomerName().trim(), creditCardPayment);
        paymentsByCustomer.put(creditCardPayment.getCustomerName().trim(), creditCardPayment1);
        paymentsByCustomer.put(payPalPayment.getCustomerName().trim(), payPalPayment);
        paymentsByCustomer.put(payPalPayment.getCustomerName().trim(), payPalPayment1);

        System.out.println("==== lookup customer name by streams ===");
            payment.stream()
                    .filter(p -> p.getCustomerName().equalsIgnoreCase("Joyce"))
                    .findFirst()
                    .ifPresentOrElse(
                            p -> System.out.println("Joyce's payment: $" + p.getAmount()),
                            () -> System.out.println("Payment not found for Joyce")
                    );
            System.out.println("== lookup by customer name==");

        // Lookup by customer name
        Payment joycePayment = paymentsByCustomer.get("Joyce");
        if (joycePayment != null) {
            System.out.println("Joyce's payment: $" + joycePayment.getAmount());
        } else {
            System.out.println("Payment not found for Joyce");
        }


        }
    }
}