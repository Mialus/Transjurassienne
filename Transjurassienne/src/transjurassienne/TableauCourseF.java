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
 * @author Erizino
 */
public class TableauCourseF extends AbstractTableModel {
    private final Course[] courses;
    private final String[] entetes = {"KM", "Nom", "pays"};

        public TableauCourseF(Data d) {
        super();
     /*   java.util.List<Personne> courses = d.getListePersonne();
        donnees = new Object[][]{
            Iterator<Personne> it=courses.iterator();
            while (it.hasNext()){
                
            }
        };*/
         courses = new Course[]{
                new Course(25, "25CT"),
                new Course(25, "25FT"),
                new Course(50, "50CT"),
                new Course(76, "76FT"),
        };

    }

    public int getRowCount() {
        return courses.length;
    }
 
    public int getColumnCount() {
        return entetes.length;
    }
 
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
 
 public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return courses[rowIndex].getKm();
            case 1:
                return courses[rowIndex].getNom();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
 @Override
public Class getColumnClass(int columnIndex){
	switch(columnIndex){
		case 2:
			return Color.class;
		case 3:
			return Boolean.class;
		default:
			return Object.class;
	}
}

}
