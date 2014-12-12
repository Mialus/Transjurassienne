package transjurassienne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Data {
    List<Personne> listePersonne = new ArrayList<Personne>();
    
    public Data(){
        File repertoire = new File("./csv");    
        String [] listefichiers;
        int annee=0;
        listefichiers=repertoire.list();
        // parcourir tous les .csv
        for(int i=0;i<listefichiers.length;i++){
            System.out.println(listefichiers[i]);
            if(listefichiers[i].endsWith(".csv")==true){
                try{
                    String ligne;
                    BufferedReader lecteurAvecBuffer = new BufferedReader(new FileReader("./csv/" +listefichiers[i]));
                    while ((ligne = lecteurAvecBuffer.readLine()) != null){
                        ligne = lecteurAvecBuffer.readLine();
                        ligne = lecteurAvecBuffer.readLine();
                    
                        String[] items=ligne.split(";");
                        
                        // Items : 0 = dossard, 1 = classement, 2 = nom, 3 = naissance, 4 = Club,
                        // 5 = Nation, 6 = tmps, 7 = course, 8 = nom_cat, 9 = class_cat
                        annee = Integer.parseInt(listefichiers[i].replace(".csv", ""));
                        
                        // tout afficher
                        for (int j=0;j<items.length;j++)
                            System.out.print(items[j]+" ");
                        System.out.println();
                    }
                    lecteurAvecBuffer.close();
                }catch(Exception e){
                    System.out.println("Erreur fichier : "+e.getMessage()+" "+e.getLocalizedMessage());
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Data data = new Data();
    }
}
