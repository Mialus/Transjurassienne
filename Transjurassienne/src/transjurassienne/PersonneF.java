/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transjurassienne;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Erizino
 */
public class PersonneF extends JFrame{
    public PersonneF(Data d) {
        super();
 
        setTitle("JTable avec modèle statique");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        
        JTable tableau = new JTable(new TableauCourseF(d));
        tableau.setDefaultRenderer(Boolean.class, new Drapeau("fra"));
        tableau.getColumnModel().getColumn(1).setCellRenderer(new Rendu());
        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
 
        pack();
        setVisible(true);
    }
    
}
