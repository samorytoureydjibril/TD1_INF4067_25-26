package VERSION_RESPECTANT_LE_PRINCIPE;

public class MainDIP {
  public static void main(String[] args) {
    Database database;
    Database database1;

    database = new MySQLDatabase();
    database1 = new MongoDBDatabase();
    OrderProcessor order1 = new OrderProcessor(database1);
    OrderProcessor order = new OrderProcessor(database);
    order.processOrder("'Données a sauvegarder MySQL'");
    order1.processOrder("'Données a sauvegarder MongoDB'");
  }
}
