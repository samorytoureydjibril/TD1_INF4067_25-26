package VERSION_RESPECTANT_LE_PRINCIPE;

public class Main {
  public static void main(String[] args) {
      PaymentMethod paymentMethod = new CreditCardPayment();
      PaymentMethod caschPayement = new Cashpayement();
      
      PaymentProcessor2 casch = new PaymentProcessor2(caschPayement);
      PaymentProcessor2 paymentProcessor = new PaymentProcessor2(paymentMethod);
      paymentProcessor.processPayment(10000.0);
      casch.processPayment(455680);

      //paymentMethod.processPayment(10000);
  }  
}
