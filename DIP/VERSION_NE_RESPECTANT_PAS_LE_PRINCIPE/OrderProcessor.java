package VERSION_NE_RESPECTANT_PAS_LE_PRINCIPE;

public class OrderProcessor {
    private MySQLDatabase database;
    public OrderProcessor(){
        this.database = new MySQLDatabase();
    }
    public void processOrder(String order) {
        database.save(order);
    }

}
