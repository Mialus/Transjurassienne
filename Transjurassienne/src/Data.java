package transjurassienne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Data {
    List<Personne> listePersonne = new ArrayList<>();
    List<Inscription> listeInscription = new ArrayList<>();
    List<Categorie> listeClassement = new ArrayList<>();
    List<Course> listeCourse = new ArrayList<>();

    public List<Personne> getListePersonne() {
        return listePersonne;
    }

    public List<Inscription> getListeInscription() {
        return listeInscription;
    }

    public List<Categorie> getListeClassement() {
        return listeClassement;
    }

    public List<Course> getListeCourse() {
        return listeCourse;
    }
    
    public Data(){
        File repertoire = new File("./csv");    
        String [] listefichiers;
        listefichiers=repertoire.list();
        // parcourir tous les .csv
        for(int i=0;i<listefichiers.length;i++){
            System.out.println(listefichiers[i]);
            if(listefichiers[i].endsWith(".csv")==true){
                try{
                    String ligne;
                    int annee=0;
                    BufferedReader lecteurAvecBuffer = new BufferedReader(new FileReader("./csv/" +listefichiers[i]));
                    System.out.println(lecteurAvecBuffer.readLine());
                    while ((ligne = lecteurAvecBuffer.readLine()) != null){
                        boolean masculin;
                        
                        String[] items=ligne.split(";");
                        
                        annee = Integer.parseInt(listefichiers[i].replace(".csv", ""));
                        int dossard = Integer.parseInt(items[0]);
                        int classement_scra = Integer.parseInt(items[1]);
                        String nom = items[2];
                        int naissance = Integer.parseInt(items[3]);
                        String club = items[4];
                        String pays = items[5];
                        
                        // Faire fonctions float de temps
                        float tmp; // items[6];
                        // (dernière lettre F = femme, M = homme)
                        String course = items[7];
                        String nomCat = items[8];
                        String classeCat = items[9];
                        
                        // Construction de personne
                        Personne p;
                        masculin = course.charAt(course.length()-1) == 'F';
                        if(masculin)
                            p = new Personne(items[2], Integer.parseInt(items[3]), true);
                        else
                            p = new Personne(items[2], Integer.parseInt(items[3]), false);
                        if(!listePersonne.contains(p))
                            listePersonne.add(p);
                        
                        // Construction de la Course
                        Course c;
                        if(masculin){
                            c = new CourseHomme(Integer.parseInt(course.substring(0, 2)), course);
                        } else {
                            c = new CourseFemme(Integer.parseInt(course.substring(0, 2)), course);
                        }
                        if(!listeCourse.contains(c))
                            listeCourse.add(c);
                        
                        // Construction de la classe Classement
                        //Classement classement = new Classement(annee, items[8], items[4], tmp, p, Integer.parseInt(items[1]), Integer.parseInt(items[9]));
                        //listeClassement.add(classement);
                        
                        // Construction de la classe Inscription
                        Inscription inscription;
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
