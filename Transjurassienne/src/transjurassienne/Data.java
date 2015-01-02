package transjurassienne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Data {
    int superAnne=0;
    List<Personne> m_listePersonne = new ArrayList<>();
    List<Inscription> m_listeInscription = new ArrayList<>();
    List<Categorie> m_listeCategorie = new ArrayList<>();
    List<Course> m_listeCourse = new ArrayList<>();

    public List<Personne> getListePersonne() {
        return m_listePersonne;
    }

    public List<Inscription> getListeInscription() {
        return m_listeInscription;
    }
    
    public List<Inscription> getListeInscriptionPersonne(Personne p) {
        List<Inscription> inscrs = new ArrayList<>();
        for(Inscription i : m_listeInscription){
            if(i.getPersonne().equals(p))
                inscrs.add(i);
        }
        return inscrs;
    }

    /// Fonctions pour les catégories
    public List<Categorie> getListeClassement() {
        return m_listeCategorie;
    }
    
    public List<Categorie> getListeClassement(int annee) {
        List<Categorie> categs = new ArrayList<>();
        for(Categorie c : m_listeCategorie){
            if(c.getAnne() == annee)
                categs.add(c);
        }
        return categs;
    }
    
    public List<Categorie> getListeClassement(String nom) {
        List<Categorie> categs = new ArrayList<>();
        for(Categorie c : m_listeCategorie){
            if(c.getNomCategorie().equals(nom))
                categs.add(c);
        }
        return categs;
    }
    /// Fin des fonctions des catégories

    /// Fonctions pour les courses
    public List<Course> getListeCourse() {
        return m_listeCourse;
    }
    
    public List<Course> getListeCourse(String nom) {
        List<Course> courses = new ArrayList<>();
        for(Course c : m_listeCourse){
            if(c.getNom().equals(nom))
                courses.add(c);
        }
        return courses;
    }
    
    public List<Course> getCourseHomme(){
        List<Course> courseHomme = new LinkedList<>();
        for(Course c : m_listeCourse){
            if(c instanceof CourseHomme)
                courseHomme.add(c);
        }
        return courseHomme;
    }
    
    public List<Course> getCourseHomme(String nom){
        List<Course> courseHomme = new LinkedList<>();
        for(Course c : m_listeCourse){
            if(c instanceof CourseHomme && c.getNom().equals(nom))
                courseHomme.add(c);
        }
        return courseHomme;
    }
    
    public List<Course> getCourseFemme(){
        List<Course> courseFemme = new LinkedList<>();
        for(Course c : m_listeCourse){
            if(c instanceof CourseFemme)
                courseFemme.add(c);
        }
        return courseFemme;
    }
    
    public List<Course> getCourseFemme(String nom){
        List<Course> courseFemme = new LinkedList<>();
        for(Course c : m_listeCourse){
            if(c instanceof CourseFemme && c.getNom().equals(nom))
                courseFemme.add(c);
        }
        return courseFemme;
    }
    /// Fin des fonctions pour les courses
    
    public Data(){
        File repertoire = new File("./csv");    
        String [] listefichiers;
        listefichiers=repertoire.list();
        // parcourir tous les .csv
        for(int i=0;i<listefichiers.length;i++){
            if(listefichiers[i].endsWith(".csv")==true){
                superAnne++;
                try{
                    String ligne="";
                    int annee=0;
                    BufferedReader lecteurAvecBuffer = new BufferedReader(new FileReader("./csv/" +listefichiers[i]));
                    lecteurAvecBuffer.readLine();
                    try{
                    while ((ligne = lecteurAvecBuffer.readLine()) != null){
                        boolean masculin;
                        String[] items=ligne.split(";");
                        annee = Integer.parseInt(listefichiers[i].replace(".csv", ""));
                        String[] subs;
                        subs = items[6].split("\\s+|:\\s*|\\.\\s*|\\,\\s*");
                        float tmp;
                        if(subs.length>=4)
                            tmp=Float.parseFloat(subs[0]) * 3600 + Float.parseFloat(subs[1]) * 60 
                                + Float.parseFloat(subs[2]) + Float.parseFloat(subs[3]) / 100;
                        else
                            tmp=Float.parseFloat(subs[0]) * 60 + Float.parseFloat(subs[1]) + Float.parseFloat(subs[2]) / 100;
                        String course = items[7];
                        
                        // Construction de personne
                        Personne p;
                        masculin = course.charAt(course.length()-1) == 'F';
                        if(masculin)
                            p = new Personne(items[2], Integer.parseInt(items[3]), true);
                        else
                            p = new Personne(items[2], Integer.parseInt(items[3]), false);
                        if(!m_listePersonne.contains(p))
                            m_listePersonne.add(p);
                        
                        // Construction de la Course
                        Course c;
                        if(masculin){
                            c = new CourseHomme(Integer.parseInt(course.substring(0, 2)), course);
                        } else {
                            c = new CourseFemme(Integer.parseInt(course.substring(0, 2)), course);
                        }
                        if(!m_listeCourse.contains(c))
                            m_listeCourse.add(c);
                        
                        // Construction de la classe Inscription
                        Inscription inscription = new Inscription(Integer.parseInt(items[1]), annee,
                                Integer.parseInt(items[0]), tmp, items[4], p, c);
                        m_listeInscription.add(inscription);
                        m_listePersonne.get(m_listePersonne.indexOf(p)).addInscription(inscription);
                        m_listeCourse.get(m_listeCourse.indexOf(c)).addInscription(inscription);
                        
                        // Construction de la classe Categorie
                        Categorie categorie = new Categorie(annee, Integer.parseInt(items[9]), items[8], p);
                        m_listeCategorie.add(categorie);
                    }
                    } catch (Exception e) {
                        System.out.println("Erreur parsing : " + e.getMessage()+" "+e.getLocalizedMessage());
                        System.out.println(ligne);
                    }
                    lecteurAvecBuffer.close();
                }catch(Exception e){
                    System.out.println("Erreur fichier : "+e.getMessage()+" "+e.getLocalizedMessage());
                }
            }
        }
    }
}
