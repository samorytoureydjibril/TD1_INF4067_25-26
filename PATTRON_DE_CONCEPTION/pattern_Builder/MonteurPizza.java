package PATTRON_DE_CONCEPTION.pattern_Builder;

public abstract class MonteurPizza {

    protected Pizza pizza;
    public Pizza createNouvellePizza(){
        return pizza = new Pizza();
    }
    
    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();

    public Pizza getPizza(){
        return pizza;
    }

}
