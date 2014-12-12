package transjurassienne;

import java.util.List;

public class Inscription {

    // liste de personne par courses
    private List<List<Personne>> m_listePersonne;
    private int m_annee;
    private int m_dossard;
    private Classement m_classement;
    
    public Inscription(List<List<Personne>> liste, int anne, int dos){
        m_listePersonne=liste;
        m_annee=anne;
        m_dossard=dos;
        
    }

    public List<List<Personne>> getM_listePersonne() {
        return m_listePersonne;
    }

    public int getAnnee() {
        return m_annee;
    }

    public int getDossard() {
        return m_dossard;
    }
    
    public Classement getClassement() {
        return m_classement;
    }
}
