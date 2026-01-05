package Pattern_Bridge;

public abstract class Forme {

    protected Couleur couleur;
    protected Couleur couleur2;

    public Forme(Couleur couleur){
      this.couleur = couleur;
    }

    public Forme(Couleur couleur, Couleur couleur2){

    }

    abstract public void colorier();

}
