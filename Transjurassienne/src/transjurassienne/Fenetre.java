package transjurassienne;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fenetre extends JFrame{
    
        String txt2;
	private JButton a;
        private  JButton b;
        private   JButton d;
         Container c;
	private JPanel z2,z3;
    
    public Fenetre() {
	// mettre un titre à la fenetre
	setTitle ("Transjurassienne");
	// donner les dimensions de la fenetre
	setSize(300,150);
        
        Data data=new Data();

	// creer un conteneur c : couche sur laquel les objets graphiques vont etre incorpores
        c=this.getContentPane();
        a=new JButton("Rechercher un coureur");
        b=new JButton("Classement par année");
        d=new JButton("Palmares");
        
	c.add(b,"Center");
        c.add(a,"North");
        c.add(d,"South");
        
        EcouteurBoutonChoix ebc =new EcouteurBoutonChoix(this,data);
        b.addActionListener(ebc);
        
        EcouteurBoutonA ggg =new EcouteurBoutonA(this,data);
        a.addActionListener(ggg);
        
        EcouteurBoutonD ddd =new EcouteurBoutonD(this,data);
        d.addActionListener(ddd);
        
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}