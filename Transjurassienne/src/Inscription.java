package transjurassienne;

import java.util.List;

public class Inscription {

    // liste de personne par courses
    private List<List<Personne>> m_listePersonne;
    private int m_annee;
    private int m_dossard;
    
    public Inscription(List<List<Personne>> liste, int anne, int dos){
        m_listePersonne=liste;
        m_annee=anne;
        m_dossard=dos;
        
    }
}
