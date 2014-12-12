package transjurassienne;

public class Course {

    protected float m_km;
    protected String m_nomCourse;
    
    public Course(float km, String nom){
        m_km=km;
        m_nomCourse=nom;
    }
    
    public float getKm(){
        return m_km;
    }
    
    public String getNom(){
        return m_nomCourse;
    }
}
