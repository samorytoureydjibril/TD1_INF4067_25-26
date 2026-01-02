package PATTRON_DE_STRUCTURATION.Pattern_Bridge;

public class Cercle extends Forme {

    public Cercle(Couleur couleur) {
        super(couleur);
    }

    @Override
    public void colorier() {
        System.out.println("Cercle colorier avec : ");
        couleur.remplirCouleur();
    } 

}
