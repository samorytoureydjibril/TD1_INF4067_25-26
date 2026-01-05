package PATTRON_DE_STRUCTURATION.Pattern_Decorator;

public class Client {

    public static void main(String[] args) {
        Fenetre fenetre;
        fenetre = new FenetreSimple();
        System.out.println(fenetre.dessine());
        System.out.println(fenetre.decrire());
        System.out.println("----------------------------------");
        fenetre = new DecorateurCurseurHorizontal(fenetre);
        System.out.println(fenetre.dessine());
        System.out.println(fenetre.decrire());
        System.out.println("----------------------------------");
        fenetre = new DecorateurCurseurVertical(fenetre);
        System.out.println(fenetre.dessine());
        System.out.println(fenetre.decrire());
        System.out.println("----------------------------------");


    }

}
