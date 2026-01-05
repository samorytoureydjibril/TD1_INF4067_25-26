package PATTRON_DE_STRUCTURATION.Pattern_Adapter;

public class DocumentPDF implements Document {

    private ComposantPDF docPDF = new ComposantPDF();
    String contenu;
    

    @Override
    public void setContenu() {
        System.out.println(".................ADAPTATAEUR.............");
       docPDF.pdfPrepareAffichage();
       docPDF.pdfFixeContenu(contenu);
       docPDF.pdfTermineAffichage();
    }

    @Override
    public void dessine() {

         docPDF.pdfRafraichir();

    }

    @Override
    public void imprime() {
       docPDF.pdfEnvoiImprimante();
    }

}
