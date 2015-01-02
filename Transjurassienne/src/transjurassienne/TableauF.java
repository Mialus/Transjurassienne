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
public class TableauF extends AbstractTableModel {

    private final Personne[] pers;
 
    private final String[] entetes = {"Dossard", "Classement", "Nom", "pays"};
 
    public TableauF(Data d) {
        super();
     /*   java.util.List<Personne> pers = d.getListePersonne();
        donnees = new Object[][]{
            Iterator<Personne> it=pers.iterator();
            while (it.hasNext()){
                
            }
        };*/
         pers = new Personne[]{
                new Personne("Johnathan",52, true),
                new Personne("Nicolas",25, false),
                new Personne("Damien",30, true),
                new Personne("Corinne",44, false),
                new Personne("Emilie",35, true),
                new Personne("Delphine",27, false),
                new Personne("Eric",33, true)
        };

    }
 
    public TableauF(Palmares d) {
        super();
     /*   java.util.List<Personne> pers = d.getListePersonne();
        donnees = new Object[][]{
            Iterator<Personne> it=pers.iterator();
            while (it.hasNext()){
                
            }
        };*/
         pers = new Personne[]{
                new Personne("Monique",1, true),
                new Personne("Nicolas",2, false),
                new Personne("Damien",3, true),
                new Personne("Corinne",1, false),
                new Personne("Emilie",2, true),
                new Personne("Delphine",3, false),
                new Personne("Eric",1, true)
        };

    }
    
    public int getRowCount() {
        return pers.length;
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
                return pers[rowIndex].getNom();
            case 1:
                return pers[rowIndex].getNaissance();
            case 2:
                return pers[rowIndex].isMasculin();
            case 3:
                return pers[rowIndex].getPays();
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


