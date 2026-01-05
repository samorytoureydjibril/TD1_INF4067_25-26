package PATTRON_DE_STRUCTURATION.Pattern_Bridge;

public class Client {

    public static void main(String[] args) {
       Forme f1 = new Rectangle(new Bleu());
       f1.colorier();
    }

}
