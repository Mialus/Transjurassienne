/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transjurassienne;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Wargnier
 */
public class EcouteurBoutonA implements ActionListener {
    	private Fenetre ff;
        
    	public EcouteurBoutonA(Fenetre f,Data d) {
            		ff=f;
        }
        
        	public void actionPerformed(ActionEvent e) {
                String retour = JOptionPane.showInputDialog(ff, "veuillez donner le nom du coureur :", "le titre", 1);

	}
}
