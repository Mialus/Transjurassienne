package transjurassienne;

import java.util.List;

public class Inscription {

    private  int m_annee;
    private int m_dossard;
    private int m_classementG;
    private float m_temps;
    private String m_club;
    private Personne m_personne;
    private Course m_course;
    
    public Inscription(int clas, int anne, int dos, float temps, String club, Personne personne, Course course){
        m_club=club;
        m_classementG=clas;
        m_temps=temps;
        m_annee=anne;
        m_dossard=dos;
        m_personne=personne;
        m_course=course;
    }

    public int getAnnee() {
        return m_annee;
    }

    public int getDossard() {
        return m_dossard;
    }

    public int getClassementG() {
        return m_classementG;
    }

    public float getTemps() {
        return m_temps;
    }

    public String getClub() {
        return m_club;
    }
    
    public Personne getPersonne(){
        return m_personne;
    }
    
    public Course getCourse(){
        return m_course;
    }
}
