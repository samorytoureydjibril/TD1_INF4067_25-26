package Pattern_Abstract_Factory;

public class ProduitA1 implements ProduitA {
   
    public ProduitA1(){this.methode();}

    @Override
    public void methode() {
        System.out.println("Frabrique produit A1");
    }
    
}
