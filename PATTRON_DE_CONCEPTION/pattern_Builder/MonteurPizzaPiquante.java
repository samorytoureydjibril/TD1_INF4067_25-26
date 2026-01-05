package PATTRON_DE_CONCEPTION.pattern_Builder;

public class MonteurPizzaPiquante extends MonteurPizza {

    @Override
    public void monterPate() {
        pizza.setPate("Feuillette");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("Piquante");
    }

    @Override
    public void monterGarniture() {
      pizza.setGarniture("Peperoni + Salami");
    }

}
