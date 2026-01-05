package Pattern_Decorator;

public abstract class DecorateurFenetre implements Fenetre {

    protected Fenetre fenetre;

    public DecorateurFenetre(Fenetre fenetre){

        this.fenetre = fenetre;

    }

}
