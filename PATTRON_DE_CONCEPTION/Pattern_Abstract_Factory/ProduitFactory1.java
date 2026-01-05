package PATTRON_DE_CONCEPTION.Pattern_Abstract_Factory;

public class ProduitFactory1 implements ProduitFactory {

    @Override
    public ProduitA geProduitA() {return new ProduitA1();}

    @Override
    public ProduitB geProduitB() {return new ProduitB1();}
    
}
