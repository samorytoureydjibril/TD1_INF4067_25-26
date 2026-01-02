package VERSION_NE_RESPECTANT_PAS_LE_PRINCIPE;

public class Car  implements Vehiclule {

    @Override
    public void Drive() {
        System.out.println("Conduite de la voiture......");
    }

    @Override
    public void Dive() {
       System.out.println("Une voiteure ne flotte pas......");
    }

    @Override
    public void Fly() {
        System.out.println("La voiture volante n'existe pas......");
    }
    
}
