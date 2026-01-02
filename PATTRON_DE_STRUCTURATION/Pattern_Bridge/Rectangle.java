package PATTRON_DE_STRUCTURATION.Pattern_Bridge;

public class Rectangle extends Forme {

    public Rectangle(Couleur couleur) {
        super(couleur);
    }

    @Override
    public void colorier() {
        System.out.print("Rectangle colorier avec : ");
        couleur.remplirCouleur();
    } 

}
