package transjurassienne;
import java.awt.event.*;
import javax.swing.*;

public class EcouteurBoutonChoix implements ActionListener {
	String annee []=new String[4];
        String [] cours = {"25CTF", "25CTM", "25FTF", "25FTM", "50CTF", "50CTM", "76FTF", "76FTM"};
        String anne;
        String course;
        private ClassementF cl;
	private Fenetre ff;
        private Fenetre ff2;
	public EcouteurBoutonChoix(Fenetre f,Data d) {
		ff=f;
        for(int i=0;i<d.superAnne;i++){
             if (i >= (annee.length))
                {
                    String[] tmp = new String[annee.length];
                    System.arraycopy(annee,0,tmp,0,annee.length);
                    annee = new String[tmp.length+2];
                    System.arraycopy(tmp,0,annee,0,tmp.length);
                }
           annee[i]=Integer.toString(2011+i);
       }
	}
        
        public void actionPerformed2() {
		course=(String) JOptionPane.showInputDialog
		(ff,"Choix de la course ","Boite d'options",JOptionPane.QUESTION_MESSAGE, null, cours, cours[1]);
		if (course==null){ 
			System.out.println("aucun choix fait");
                }else{
                           actionPerformed3();
                }
	}
        
	public void actionPerformed(ActionEvent e) {
		anne=(String) JOptionPane.showInputDialog
		(ff,"Choix de l'année","Boite d'options",JOptionPane.QUESTION_MESSAGE, null, annee, annee[1]);
		if (anne==null){ 
			System.out.println("aucun choix fait");
                }else{
			actionPerformed2();
                }
	}

        public void actionPerformed3() {
            Data d =new Data();
                cl= new ClassementF(d);
                cl.repaint();
        }
}