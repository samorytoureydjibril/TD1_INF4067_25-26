package Pattern_Composite;

public abstract class Systeme {

    protected String nom;
    protected types type;
    protected int niveau;

    public Systeme(String nom, types type){

        this.nom = nom;
        this.type = type;

    }

    public String getNom(){return nom;}
    public types getType(){return type;}

     // ajout Tabulations en fonction du niveau
    public String getTab(){
        String tab = "";
        for (int i = 0; i < niveau; i++) {
            tab = tab + "\t";
        }
        return tab;
    }
    public abstract void decrire();
    

}
