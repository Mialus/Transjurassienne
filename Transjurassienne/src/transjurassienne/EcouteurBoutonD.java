/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transjurassienne;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author Wargnier
 */
public class EcouteurBoutonD implements ActionListener {
    	private Fenetre ff;
        String course;
        String [] cours = {"25CTF", "25CTM", "25FTF", "25FTM", "50CTF", "50CTM", "76FTF", "76FTM"};
    	public EcouteurBoutonD(Fenetre f,Data d) {
            		ff=f;
        }
        
         public void actionPerformed(ActionEvent e) {
		course=(String) JOptionPane.showInputDialog
		(ff,"Choix de la course ","Boite d'options",JOptionPane.QUESTION_MESSAGE, null, cours, cours[1]);
		if (course==null){ 
			System.out.println("aucun choix fait");
                }else{
                    List<String> ln = new ArrayList<String>();
                    List<Integer> lc = new ArrayList<Integer>();
                    List<Integer> la = new ArrayList<Integer>();
                    Palmares p = new Palmares(ln,lc, la);
                    PalmaresF pf = new PalmaresF(p);
                }
	}
}