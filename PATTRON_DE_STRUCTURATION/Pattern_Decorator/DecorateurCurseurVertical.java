package Pattern_Decorator;

public class DecorateurCurseurVertical extends DecorateurFenetre {

    public DecorateurCurseurVertical(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public String dessine() {
        return fenetre.dessine() + "DEFILLEMENT VERTICAL !!";
       
    }

    @Override
    public String decrire() {
        return fenetre.decrire() + "Avec Defilement vertical!!!";
    }

   

}
