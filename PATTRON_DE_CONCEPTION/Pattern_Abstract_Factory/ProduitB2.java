package Pattern_Abstract_Factory;

public class ProduitB2 implements ProduitB {

    public ProduitB2(){this.methode();}

    @Override
    public void methode() {
        System.out.println("Frabrique produit B2");
    }

}
