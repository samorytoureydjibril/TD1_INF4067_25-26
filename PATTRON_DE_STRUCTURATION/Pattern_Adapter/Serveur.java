package Pattern_Adapter;

public class Serveur {

    public void fournirDocument(Document doc){
      
      doc.setContenu();
      doc.dessine();
      doc.imprime();

    }

}
