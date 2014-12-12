package transjurassienne;

import java.util.List;

public class Inscription {

    private  int m_annee;
    private int m_dossard;
    private int m_classementG;
    private float m_temps;
    private String m_club;
    
    public Inscription(int clas, int anne, int dos, float temps, String club){
        
        m_club=club;
        m_classementG=clas;
        m_temps=temps;
        m_annee=anne;
        m_dossard=dos;
        
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
    
}
