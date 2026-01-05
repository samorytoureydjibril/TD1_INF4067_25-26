package Pattern_Abstract_Factory;

public class ProduitFactory2 implements ProduitFactory {

    @Override
    public ProduitA geProduitA() {return new ProduitA2();}

    @Override
    public ProduitB geProduitB() {return new ProduitB2();}

}
