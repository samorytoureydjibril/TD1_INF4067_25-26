package Pattern_Factory_II;

public class ProduitFactory1 extends ProduitFactory_II {

    @Override
    protected ProduitA_II CreateProduitA() {
        return new ProduitA1_II();
    }


}
