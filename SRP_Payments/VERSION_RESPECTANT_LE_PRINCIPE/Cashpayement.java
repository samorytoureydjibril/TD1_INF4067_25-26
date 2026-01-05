package VERSION_RESPECTANT_LE_PRINCIPE;

public class Cashpayement  implements PaymentMethod {
    public void processPayment(double amount) {
        // Logic to process cash payment
        System.out.println("Processing cash payment of " + amount + " CFA");
    }

}
