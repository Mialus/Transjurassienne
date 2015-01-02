package transjurassienne;

import java.util.ArrayList;
import java.util.List;

public class Personne {

    private String m_nom;
    private int m_naissance;
    private String m_pays;
    private boolean m_masculin;
    private List<Inscription> m_listeInscription;
    
    public Personne(String nom,int nais, boolean mas){
       m_nom=nom;
       m_naissance=nais;
       m_masculin=mas;
       m_listeInscription = new ArrayList<>();
    }

    public String getNom() {
        return m_nom;
    }

    public int getNaissance() {
        return m_naissance;
    }

    public String getPays() {
        return m_pays;
    }

    public boolean isMasculin() {
        return m_masculin;
    }

    public List<Inscription> getInscriptions(){
        return m_listeInscription;
    }
    
    public void addInscription(Inscription i){
        m_listeInscription.add(i);
    }
}
