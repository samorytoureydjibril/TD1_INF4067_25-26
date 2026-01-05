package VERSION_RESPECTANT_LE_PRINCIPE;

public class MongoDBDatabase implements Database {

    @Override
    public void save(String data) {
        System.out.println("Savibg to MongoDb "+ data);
    }

}
