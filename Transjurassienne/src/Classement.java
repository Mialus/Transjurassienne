package transjurassienne;

public class Classement {

    private int m_anne;
    private String m_categorie;
    private String m_club;
    private float m_temps;
    private Personne m_pers;
    private int m_claScra;
    private int m_claCat;
    
    public Classement(int anne, String cate,String club, float temps,Personne pers, int sra, int cat  ){
        m_anne=anne;
        m_categorie=cate;
        m_club=club;
        m_temps=temps;
        m_pers=pers;
        m_claScra=sra;
        m_claCat=cat;
    }

    public int getAnne() {
        return m_anne;
    }

    public String getCategorie() {
        return m_categorie;
    }

    public String getClub() {
        return m_club;
    }

    public float getTemps() {
        return m_temps;
    }

    public Personne getPers() {
        return m_pers;
    }

    public int getClaScra() {
        return m_claScra;
    }

    public int getClaCat() {
        return m_claCat;
    }
    
}
