import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main { 
    
    public static void main(String[] args) {

        File repertoire = new File("E:/Dev/GitHub/Transjurassienne/Transjurassienne/csv");    
        String [] listefichiers;
        listefichiers=repertoire.list();
        // parcourir tous les .csv
        for(int i=0;i<listefichiers.length;i++){
            System.out.println(listefichiers[i]);
            if(listefichiers[i].endsWith(".csv")==true){
                try{
                    String ligne;
                    BufferedReader lecteurAvecBuffer = new BufferedReader(new FileReader("E:/Dev/GitHub/Transjurassienne/Transjurassienne/csv/" +listefichiers[i]));
                    while ((ligne = lecteurAvecBuffer.readLine()) != null){
                        ligne = lecteurAvecBuffer.readLine();
                        ligne = lecteurAvecBuffer.readLine();
                    
                        String[] items=ligne.split(";");
                        
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
}

// Parcour l'ensemble des csv
/*
File repertoire = new File(NOM_REPERTOIRE);    
String [] listefichiers;
listefichiers=repertoire.list();
for(int i=0;i<listefichiers.length;i++){
    System.out.println(listefichiers[i]);
    if(listefichiers[i].endsWith(".csv")==true){
      // ici votre traitement 

  }
//*/

// Affiche tout un csv
/*
try
      {  
        String ligne;
        BufferedReader lecteurAvecBuffer = new BufferedReader(new FileReader("c:/transju/2014.csv"));
        while ((ligne = lecteurAvecBuffer.readLine()) != null)     
            {String[] items=ligne.split(";");
             for (int i=0;i<items.length;i++) System.out.print(items[i]+" ");
            System.out.println();}
        lecteurAvecBuffer.close();
      }
    catch(Exception e)
      {
          System.out.println("Erreur fichier : "+e.getMessage()+" "+e.getLocalizedMessage());
      }
//*/
