package Pattern_Decorator;

public class DecorateurCurseurHorizontal extends DecorateurFenetre {

    public DecorateurCurseurHorizontal(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public String dessine() {
       return fenetre.dessine() + " Avec Defilement HORIZONTAL ------> !!!";
    }

    @Override
    public String decrire() {
        return fenetre.decrire() + "Avec Defilement HORIZONTAL -------> !!!";
    }

    

    

}
