package Pattern_Singletton;

public class TestSingleton {
   public static void main(String[] args) {

     int som = Singleton.getInstance().somme(2,3);
     System.out.printf("la somme est %d",som);

     Singleton s1 = Singleton.getInstance(5,6);
     s1.affiche();

     Singleton s2 = Singleton.getInstance(7,10);
     s2.affiche();
     
   }
}
