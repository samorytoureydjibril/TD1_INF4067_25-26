package Pattern_Adapter;

public class ComposantPDF { 
    
   public void pdfFixeContenu(String contenu){

     System.out.println("=============Contenue du PDF=============/n "+ contenu);
       
   }

   public void pdfPrepareAffichage(){

     System.out.println("============Affichage du PDF================");

   }

   public void pdfRafraichir(){

    System.out.println("====================Rafraichir le PDF================");

   }

   public void pdfTermineAffichage(){

    System.out.println("====================Le Document PDF est pret================");

   }

   public void pdfEnvoiImprimante(){

    System.out.println("======================Document PDF envoye l'imprimante CANON PIXMA 2000");

   }

}
