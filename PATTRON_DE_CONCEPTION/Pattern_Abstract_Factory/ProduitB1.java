package PATTRON_DE_CONCEPTION.Pattern_Abstract_Factory;

public class ProduitB1 implements ProduitB {

     
    public ProduitB1(){this.methode();}

    @Override
    public void methode() {
        System.out.println("Frabrique produit B1");
    }

}
