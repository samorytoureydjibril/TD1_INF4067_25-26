package VERSION_NE_RESPECTANT_PAS_LE_PRINCIPE;

public class OrderProcessor {
    private MSQLDatabase database;
    public OrderProcessor(){
        this.database = new MSQLDatabase();
    }
    public void processOrder(String order) {
        database.save(order);
    }

}
