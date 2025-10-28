package VERSION_NE_RESPECTANT_PAS_LE_PRINCIPE;

public class MainISP {
    public static void main(String[] args) {
        Worker worker = new HummanWorker();
        Worker robbot = new RobotWorker();

        worker.eat();
        worker.work();
        robbot.work();
    }

}
