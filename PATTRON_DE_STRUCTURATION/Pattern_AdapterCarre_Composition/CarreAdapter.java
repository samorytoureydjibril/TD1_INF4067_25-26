package PATTRON_DE_STRUCTURATION.Pattern_AdapterCarre_Composition;

public class CarreAdapter implements MethodeGestionRectangle  {

   private Carre carre;
    
    // public CarreAdapter(float cote) {
    //     super(cote);
    // }

    @Override
    public float aire() {
        return this.carre.getCote() * this.carre.getCote();
        //return this.getCote() * this.getCote();
    }

    @Override
    public float perimetre() {
        return this.carre.getCote() * 4;
       //return this.getCote() * 4;
    }

    @Override
    public void affiche() {
       System.out.println("*******************UTILISATION DE L' ADAPTER********************");
       System.out.println("L'aire du carre est de : "+this.aire()+"\n Le perimetre esr de : "+this.perimetre());
    }

    public void setCarre(Carre carre){
        this.carre = carre;
    }

}
