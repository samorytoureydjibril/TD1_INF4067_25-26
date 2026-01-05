package PATTRON_DE_STRUCTURATION.Pattern_Decorator;

public class FenetreSimple implements Fenetre {
    

    @Override
    public String dessine() {
        return "Dessine quelque-chose ICI!!!!";
        
    }

    @Override
    public String decrire() {
        return "Decription TEXTUELLE !!!!!";
        
    }

   

}
