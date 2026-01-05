package Pattern_Composite;

public class Fichier extends Systeme {

    public Fichier(String nom, types type) {
        super(nom, type);
    }

    @Override
    public void decrire() {
        System.out.println(getTab()+"Fichier : "+this.nom+"."+this.type);
    }

   
    // public Systeme supprimer(Systeme system) {
    //     return system = null;
    // }

}
