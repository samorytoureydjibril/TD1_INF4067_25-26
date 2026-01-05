package Pattern_Abstract_Factory;

public class Client_AbstractFactory {

    public static void main(String[] args) {
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();

        ProduitA produitA = null;
        ProduitB produitB = null;
        
        System.out.println("Utilisation de la premiere fabrique");
        produitA =  produitFactory1.geProduitA();
        produitB =  produitFactory1.geProduitB();
        produitA.methode();
        produitB.methode();


        System.out.println("Utilisation de la deuxieme fabrique");
        produitFactory2.geProduitA();
        produitFactory2.geProduitB();
    }

}
