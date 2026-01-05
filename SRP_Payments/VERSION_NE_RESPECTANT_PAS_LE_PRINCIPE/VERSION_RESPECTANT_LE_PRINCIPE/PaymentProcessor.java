package VERSION_NE_RESPECTANT_PAS_LE_PRINCIPE.VERSION_RESPECTANT_LE_PRINCIPE;

public class PaymentProcessor {
    public void processPayment(String paymentType, double amount){
        if(paymentType.equals("mobil_pay")){
            System.out.println("Processing mobile payment : " + amount + "CFA");
            //Logiquespecifique au payment mobiles
        }else if(paymentType.equals("credit_card")){
          System.out.println("Processing credit card : " + amount + "CFA");  
           //Logique specifique aux cartes bancaire
        }else if (paymentType.equals("paypal")) {
          System.out.println("Processing paypal payment : " + amount + "CFA");
          // Logique specifique a Paypal
        }else if (paymentType.equals("crypto")) {
           System.out.println("Processing crypto payment : " + amount + "CFA"); 
          // Logique specifique aux crypto monnnaie
        }
    }

}
