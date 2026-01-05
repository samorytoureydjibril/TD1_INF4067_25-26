package VERSION_RESPECTANT_LE_PRINCIPE;

public class CreditCardPayment implements PaymentMethod {
    public void processPayment(double amount) {
        // Logic to process credit card payment
        System.out.println("Processing credit card payment of " + amount + " CFA");
    }
}
