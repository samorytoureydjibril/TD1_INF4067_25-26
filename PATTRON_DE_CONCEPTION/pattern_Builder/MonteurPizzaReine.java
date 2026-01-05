package pattern_Builder;

public class MonteurPizzaReine extends MonteurPizza {
  
    @Override
    public void monterPate() {
        pizza.setPate("Croisée");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("Douce");
    }

    @Override
    public void monterGarniture() {
      pizza.setGarniture("Frommage + Jambon");
    }


}
