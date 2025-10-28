public class BookPrinter {
    // Methode pour afficher le livre a l'ecran
    public void printToScreen( BookSRP Book ){
        System.out.println("===Print to screen====");
        System.out.println("Titre: "+Book.getTitle());
        System.out.println("Author: "+Book.getAuthor());
        System.out.println("Content: "+Book.getContent());
    }

    // On peut ajouter d'autre methode d'affichage sans toucher a BookSRP
    public void printToHTML(BookSRP Book){
        System.out.println("\n===Print to HTML====");
        System.out.println("<h1>" + Book.getTitle() + "<h1>");
        System.out.println("<h2>" + Book.getAuthor() + "<h2>");
        System.out.println("<p>" + Book.getContent() + "<p>");
    }

}
