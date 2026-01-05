package PATTRON_DE_STRUCTURATION.Pattern_AdapterCarre_Composition;

public class GestionCarreRectangle {

    MethodeGestionRectangle methodeGestion;

    public void caluclAirePerimetre(){

          methodeGestion.aire();
          methodeGestion.perimetre();
          methodeGestion.affiche();
    }

    public void setMethodeGestion(MethodeGestionRectangle methodeGestion){
        this.methodeGestion = methodeGestion;
    }

}
