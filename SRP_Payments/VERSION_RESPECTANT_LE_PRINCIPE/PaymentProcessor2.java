package VERSION_RESPECTANT_LE_PRINCIPE;

public class PaymentProcessor2 {
     private PaymentMethod paymentMethod;

        public PaymentProcessor2(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
        }
        public void processPayment(double amount){
            paymentMethod.processPayment(amount);
        }
}
