package VERSION_NE_RESPECTANT_PAS_LE_PRINCIPE.VERSION_RESPECTANT_LE_PRINCIPE;

public class Main {
   public static void main(String[] args) {
    PaymentProcessor processor = new PaymentProcessor();
    processor.processPayment("mobil_pay", 1500);
    processor.processPayment("credit_card", 6500);
    processor.processPayment("paypal", 4500);
   }
}
