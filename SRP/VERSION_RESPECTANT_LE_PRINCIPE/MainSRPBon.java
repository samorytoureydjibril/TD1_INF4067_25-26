public class MainSRPBon {
   
    public static void main(String[] args) {
        BookSRP Book = new BookSRP("Les principes SOLID", "Etudiant M1-GL", "Revision des principes SOLID");
        BookPrinter Bookp = new BookPrinter();
        BookBussinessLogic BookBL = new BookBussinessLogic();
        
        Bookp.printToScreen(Book);
        Bookp.printToHTML(Book);
        BookBL.emprunter(Book, "MOTHO");
        BookBL.autreService(Book);
    }
}
