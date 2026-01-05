package VERSION_RESPECTANT_LE_PRINCIPE;

public class MainISP {
  public static void main(String[] args) {
    Eatable humman = new HummanWorker();
    Workable robbot = new RobotWorker();

    Flyable flycar = new FlyingCar();
    Drivable car = new Car();
    Submersible sousmarin = new Submarine();


    humman.eat();
    humman.work();
    robbot.work();

    flycar.Fly();
    flycar.Drive();
    car.Drive();
    sousmarin.Dive();
  }
}
