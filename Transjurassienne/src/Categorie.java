package transjurassienne;

public class Categorie {

    private Personne m_personne;
    private int m_anne;
    private int m_classement;
    private String m_nomCat;
    
    public Categorie(int anne, int cla, String nomCat, Personne personne){
        m_anne=anne;
        m_classement=cla;
        m_nomCat=nomCat;
        m_personne=personne;
    }

    public int getAnne() {
        return m_anne;
    }

    public int getClassement() {
        return m_classement;
    }

   public String getNomCategorie(){
       return m_nomCat;
   }
   
   public Personne getPersonne(){
       return m_personne;
   }
}
