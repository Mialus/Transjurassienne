package transjurassienne;

import java.util.ArrayList;
import java.util.List;

public class Course {

    protected float m_km;
    protected String m_nomCourse;
    protected List<Inscription> m_listeInscription;
    
    public Course(float km, String nom){
        m_km=km;
        m_nomCourse=nom;
        m_listeInscription = new ArrayList<>();
    }
    
    public float getKm(){
        return m_km;
    }
    
    public String getNom(){
        return m_nomCourse;
    }
    
    public List<Inscription> getInscription(){
        return m_listeInscription;
    }
    
    public void addInscription(Inscription i){
        m_listeInscription.add(i);
    }
}
