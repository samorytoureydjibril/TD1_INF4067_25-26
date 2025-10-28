package VERSION_NE_RESPECTANT_PAS_LE_PRINCIPE;

public class RobotWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Les Robbots travaillent sans fatigue");
    
    }

    @Override
    public void eat() {
         System.out.println("L'on ne doit pas faire manger un robbot");
         throw new UnsupportedOperationException("Les robots ne mangent");
    }
    

}
