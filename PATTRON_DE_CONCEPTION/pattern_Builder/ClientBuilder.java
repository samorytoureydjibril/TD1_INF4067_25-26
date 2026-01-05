package pattern_Builder;

public class ClientBuilder {
   public static void main(String[] args) {
      
    MonteurPizzaPiquante pizzaPiquante = new MonteurPizzaPiquante();
    MonteurPizzaReine pizzaReine = new MonteurPizzaReine();
    Pizzeria pizzeria = new Pizzeria(pizzaReine);
    Pizzeria pizzeria2 = new Pizzeria(pizzaPiquante);

    pizzeria.construirePizza();
    pizzeria2.construirePizza();

    Pizza pizza = pizzeria.getPizza();
    Pizza pizza2 = pizzeria2.getPizza();
    pizza.print();
    pizza2.print();
   }
}
