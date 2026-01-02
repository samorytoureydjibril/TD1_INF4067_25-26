package VERSION_NE_RESPECTANT_PAS_LE_PRINCIPE;
 
public class Submarine implements Vehiclule {

    @Override
    public void Drive() {
        System.out.println("Ne se conduit pas sur route");
    }

    @Override
    public void Dive() {
       System.out.println("Plonge sous l'eau");
    }

    @Override
    public void Fly() {
        System.out.println("Ne vole pas");
    }
    
}
