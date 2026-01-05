package Pattern_Factory_II;

public class Client_II {
   
 public static void main(String[] args) {
    ProduitFactory1 produitFactory1 = new ProduitFactory1();
    ProduitFactory2 produitFactory2 = new ProduitFactory2();
    ProduitFactory3 produitFactory3 = new ProduitFactory3();

    ProduitA_II produitA_II = null;
    
    System.out.println("Utilisation de la premiere fabrique");
    produitA_II = produitFactory1.getProduitA();
    produitA_II.methodeA();

    System.out.println("Utilisation de la deuxieme fabrique");
    produitA_II = produitFactory2.getProduitA();
    produitA_II.methodeA();

    System.out.println("Utilisation de la troisieme fabrique");
    produitA_II = produitFactory3.getProduitA();
    produitA_II.methodeA();

 }
}
