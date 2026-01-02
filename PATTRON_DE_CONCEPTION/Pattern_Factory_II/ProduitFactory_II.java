package PATTRON_DE_CONCEPTION.Pattern_Factory_II;

public abstract class ProduitFactory_II {

   protected abstract ProduitA_II CreateProduitA();
   public ProduitA_II getProduitA(){
      return CreateProduitA();  
   }

}
