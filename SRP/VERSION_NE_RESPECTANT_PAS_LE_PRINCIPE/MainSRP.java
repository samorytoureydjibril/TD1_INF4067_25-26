public class MainSRP {

    //Utilisation de la classe Book
    public static void main(String[] args) {
        Book book = new Book("Les principe SOLID", "Etudiants de M1-GL", "Revision des princepes SOLID");
        book.printToScreen();
        book.saveToDatabase();
        book.emprunter("MOKO MOTHO");
    }

}
