package PATTRON_DE_STRUCTURATION.Pattern_Adapter;

public class Main {

    public static void main(String[] args) {

        Serveur serveur = new Serveur();
        Document documentHtml = new DocumentHTML();

        serveur.fournirDocument(documentHtml);

        DocumentPDF pdf = new DocumentPDF();
        serveur.fournirDocument(pdf);



    }

}
