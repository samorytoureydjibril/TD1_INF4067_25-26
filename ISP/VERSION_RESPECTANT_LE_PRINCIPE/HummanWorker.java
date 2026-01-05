package VERSION_RESPECTANT_LE_PRINCIPE;

public class HummanWorker implements Eatable {

    @Override
    public void work() {
        System.out.println("Les Humains travaillent"); 
    }

    @Override
    public void eat() {
        System.out.println("Les Humains mangent");
    }

} 

