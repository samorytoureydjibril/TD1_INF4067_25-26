package VERSION_RESPECTANT_LE_PRINCIPE;

public class MySQLDatabase implements Database {

    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL : " +data);
    }
}
