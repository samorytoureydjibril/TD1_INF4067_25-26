package PATTRON_DE_STRUCTURATION.Pattern_Composite;

public class Main {

    public static void main(String[] args) {
        Repertoire rep = new Repertoire("MMP", types.dossier);
        Repertoire rep1 = new Repertoire("MMP1", types.dossier);
        Repertoire rep2 = new Repertoire("MMP2", types.dossier);
        Repertoire rep3 = new Repertoire("MMP3", types.dossier);
        Repertoire rep4 = new Repertoire("MMP4", types.dossier);


        Fichier fich = new Fichier("mmp", types.pdf);
        Fichier fich1 = new Fichier("mmp1", types.txt);
        Fichier fich2 = new Fichier("mmp2", types.pdf);

        rep.ajouter(rep1);
        rep.ajouter(rep2);
        rep.ajouter(fich);
        rep1.ajouter(fich1);
        rep2.ajouter(fich2);
        rep2.ajouter(rep3);
        rep3.ajouter(rep4);
        //rep.supprimer(fich);
        

        rep.decrire();
        
    }

}
