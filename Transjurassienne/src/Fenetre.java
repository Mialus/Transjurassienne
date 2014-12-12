package transjurassienne;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
	public Fenetre(){
	setTitle("Transjurassienne");
	setSize(500,100);
	Container c=getContentPane();
	JButton b1=new JButton("Quitter");
	c.add(new JButton("Quitter"));
        new JButton("Test");
        c.add(new JButton("Test"));
	c.setLayout(new GridLayout(2,1));
	}

public static void main(String[] args){
 Fenetre f=new Fenetre();
 f.setVisible(true);
//System.exit(0);
}
}