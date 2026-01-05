package Pattern_Composite;

import java.util.ArrayList;
import java.util.List;

public class Repertoire extends Systeme {

    List <Systeme> systeme = new ArrayList<>();

    public Repertoire(String nom, types type) {
        super(nom, type);
        
    }

    @Override
    public void decrire() {
        System.out.println(getTab()+"Repertoire : "+this.nom+" ---> "+this.type);
        
        for (Systeme s : systeme) {
            s.decrire();
        }
    }

   public Systeme ajouter(Systeme system){
      system.niveau = this.niveau+1;
      this.systeme.add(system);
      return system;
   }
    public Systeme supprimer(Systeme system) {
      this.systeme.remove(system);
      return system;
    }
    // vide le repertoire
    public void deleteAll(){
      systeme.clear();
    }
    
    public Systeme obtenir(String nom){
      for(Systeme s : systeme){
        if (s.getNom().equals(nom)) {
           return s;
        }
      }
      return null;
    }

}
