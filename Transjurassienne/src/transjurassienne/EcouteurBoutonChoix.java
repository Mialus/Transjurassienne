package transjurassienne;
import java.awt.event.*;
import javax.swing.*;

public class EcouteurBoutonChoix implements ActionListener {
        private  JTextField phrase;
	String [] annee = {"2012", "2013", "2014"};
        String [] cours = {"25CTF", "25CTM", "25FTF", "25FTM", "50CTF", "50CTM", "76FTF", "76FTM"};
        String txt;
        String course;
	private Fenetre ff;
        private Fenetre ff2;
	public EcouteurBoutonChoix(Fenetre f) {
		ff=f;
	}
        
        public void actionPerformed2(ActionEvent e) {
		course=(String) JOptionPane.showInputDialog
		(ff,"Choix de la course ","Boite d'options",JOptionPane.QUESTION_MESSAGE, null, cours, cours[1]);
		if (course==null) 
			System.out.println("aucun choix fait");
		else
			actionPerformed3(e);
	}
        
	public void actionPerformed(ActionEvent e) {
		txt=(String) JOptionPane.showInputDialog
		(ff,"Choix de l'année","Boite d'options",JOptionPane.QUESTION_MESSAGE, null, annee, annee[1]);
		if (txt==null) 
			System.out.println("aucun choix fait");
		else
			actionPerformed2(e);
	}
        
        	public void actionPerformed3(ActionEvent e) {
		phrase.setText("J'aime");
	}
}