package transjurassienne;

public class Personne {

    private String m_nom;
    private int m_naissance;
    private String m_pays;
    private boolean m_masculin;
    
    public Personne(String nom,int nais, boolean mas){
       m_nom=nom;
       m_naissance=nais;
       m_masculin=mas;
    }
}
