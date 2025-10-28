package VERSION_RESPECTANT_LE_PRINCIPE;

public class MainISP {
  public static void main(String[] args) {
    Eatable humman = new HummanWorker();
    Workable robbot = new RobotWorker();

    humman.eat();
    humman.work();
    robbot.work();
  }
}
