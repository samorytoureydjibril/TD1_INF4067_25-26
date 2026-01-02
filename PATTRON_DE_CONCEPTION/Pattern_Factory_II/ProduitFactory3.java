package PATTRON_DE_CONCEPTION.Pattern_Factory_II;

public class ProduitFactory3 extends ProduitFactory_II {
 
    
    protected ProduitA_II CreateProduitA() {
        return new ProduitA3_II();
    }


}
