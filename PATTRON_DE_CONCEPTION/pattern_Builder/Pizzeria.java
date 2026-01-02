package PATTRON_DE_CONCEPTION.pattern_Builder;

public class Pizzeria {

    MonteurPizza monteur;
  //  Pizza pizza;

    public Pizzeria(MonteurPizza monteur){
        this.monteur = monteur;
    }



    public void construirePizza(){

        monteur.createNouvellePizza();

        monteur.monterPate();
        monteur.monterSauce();
        monteur.monterGarniture();
    }

    public Pizza getPizza(){
        return monteur.getPizza();
    }

}
