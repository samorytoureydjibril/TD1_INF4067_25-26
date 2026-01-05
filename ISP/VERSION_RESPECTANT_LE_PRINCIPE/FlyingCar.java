package VERSION_RESPECTANT_LE_PRINCIPE;

public class FlyingCar implements Flyable {

    @Override
    public void Drive() {
        System.out.println("Conduite de la voiture la voiture volante......");
    }

    @Override
    public void Fly() {
        System.out.println("Decollage de la voiture volante......");
    }
    
}
