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
public class EcouteurBoutonA implements ActionListener {
    	private Fenetre ff;
        private Data d;
        
    	public EcouteurBoutonA(Fenetre f,Data di) {
            		ff=f;
                        d=di;
        }
        
        	public void actionPerformed(ActionEvent e) {
                String retour = JOptionPane.showInputDialog(ff, "veuillez donner le nom du coureur :", "le titre", 1);
                // TODO
                List<Categorie> liste = d.getListeClassement(retour);
                if (liste==null){ 
			System.out.println("aucun choix fait");
                }else{
                    PersonneF pf = new PersonneF(d);
                }
	}
}