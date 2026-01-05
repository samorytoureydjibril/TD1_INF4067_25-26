package VERSION_NE_RESPECTANT_PAS_LE_PRINCIPE;

public class MainISP {
    public static void main(String[] args) {
        Worker worker = new HummanWorker();
        Worker robbot = new RobotWorker();
        Vehiclule car = new Car();
        Vehiclule sousmarin = new Submarine();

        worker.eat();
        worker.work();
        robbot.work();

        car.Dive();
        car.Drive();
        car.Fly();

        sousmarin.Dive();
        sousmarin.Drive();
        sousmarin.Fly();


    }

}
