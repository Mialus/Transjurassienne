/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transjurassienne;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
/**
 *
 * @author Wargnier
 */
public class Drapeau extends DefaultTableCellRenderer{

          private Icon manImage;
 
    public Drapeau(String nom) {
        super();
 
        manImage = new ImageIcon("../../img/"+nom+".gif");
         setIcon(manImage);

    }
}



