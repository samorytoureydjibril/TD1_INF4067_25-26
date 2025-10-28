package VERSION_NE_RESPECTANT_PAS_LE_PRINCIPE;

public class HummanWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Les Humains travaillent");
    }

    @Override
    public void eat() {
       System.out.println("Les Humains mangent");
    }
    

}
