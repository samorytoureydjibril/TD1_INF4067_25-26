package PATTRON_DE_CONCEPTION.Pattern_Factory_II;

public class ProduitFactory2 extends ProduitFactory_II {

    @Override
    protected ProduitA_II CreateProduitA() {
        return new ProduitA2_II();
    }

}
