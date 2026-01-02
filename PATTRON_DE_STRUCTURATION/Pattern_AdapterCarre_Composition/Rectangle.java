package PATTRON_DE_STRUCTURATION.Pattern_AdapterCarre_Composition;

public class Rectangle implements MethodeGestionRectangle {

    private float longueur;
    private float largeur;

    public Rectangle( float longueur, float largeur ){
      this.longueur = longueur;
      this.largeur = largeur;
    }

    public void setLongueur(float longueur){
        this.longueur = longueur;
    }
    public void setLargeur(float largeur){
        this.largeur = largeur;
    }

    @Override
    public float aire() {
        return this.longueur * this.largeur ;
    }

    @Override
    public float perimetre() {
        return (this.longueur+this.largeur)*2;
    }

    @Override
    public void affiche() {
        System.out.println("L'aire du rectangle est de : "+this.aire()+"\n Le perimetre est de : "+this.perimetre());
    }

}
