public class BookBussinessLogic {
  public void emprunter(BookSRP Book,String lecteur){
        System.out.println("Emprunt du livre '"+ Book.getTitle() + "' par '"+ lecteur + "'");
    }
  //On peut ajouter d'autre logique metier
  public void autreService(BookSRP Book){
    System.out.println("Autre service logique '"+ Book.getTitle() + "'");
  }
}
