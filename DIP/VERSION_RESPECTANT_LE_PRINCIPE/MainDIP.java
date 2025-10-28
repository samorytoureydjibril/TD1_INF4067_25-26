package VERSION_RESPECTANT_LE_PRINCIPE;

public class MainDIP {
  public static void main(String[] args) {
    Database database;

    database = new MySQLDatabase();
    OrderProcessor order = new OrderProcessor(database);
    order.processOrder("'Données a sauvegarder'");
  }
}
