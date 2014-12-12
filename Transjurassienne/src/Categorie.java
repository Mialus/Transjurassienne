package transjurassienne;

public class Categorie {

    private int m_anne;
    private int m_classement;
    
    public Categorie(int anne,int cat  ){
        m_anne=anne;
        m_classement=cat;
    }

    public int getAnne() {
        return m_anne;
    }

    public int getClassement() {
        return m_classement;
    }

   
}
