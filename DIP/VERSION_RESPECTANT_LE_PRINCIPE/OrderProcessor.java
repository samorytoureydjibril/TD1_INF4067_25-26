package VERSION_RESPECTANT_LE_PRINCIPE;

public class OrderProcessor {
  private Database database;
  public OrderProcessor(Database database){
    this.database = database;
  }
  public void processOrder(String order){
    database.save(order);
  }
}
