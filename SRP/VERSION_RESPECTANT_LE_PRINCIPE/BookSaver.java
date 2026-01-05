public class BookSaver {
   public void saveToDatabase(BookSRP Book){System.out.println("\nSauvegarde de "+ Book.getTitle() + "dans la base de données...");}

   //On peut ajouter d'autre facon de souvegarder
   public void saveToFile(BookSRP Book, String filename){System.out.println("\nSouvegarde de '" + Book.getTitle()+ " 'dans " + filename);}
}
