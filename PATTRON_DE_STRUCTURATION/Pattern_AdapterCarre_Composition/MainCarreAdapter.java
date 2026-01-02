package PATTRON_DE_STRUCTURATION.Pattern_AdapterCarre_Composition;

public class MainCarreAdapter {
    public static void main(String[] args) {
        GestionCarreRectangle gestion = new GestionCarreRectangle();
        gestion.setMethodeGestion(new Rectangle(78,8));
        gestion.caluclAirePerimetre();
        //CarreAdapter adapter = new CarreAdapter(8);
       CarreAdapter adapter = new CarreAdapter();
       adapter.setCarre(new Carre(5));
       gestion.setMethodeGestion(adapter);
        gestion.caluclAirePerimetre();
        
    }

}
