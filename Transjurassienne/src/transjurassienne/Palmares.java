/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transjurassienne;

import java.util.List;

/**
 *
 * @author Erizino
 */
public class Palmares {
    private List<String> listeNom;
    private List<Integer> listeClassement;
    private List<Integer> listeAnnee;
    
    public Palmares(List<String> ln, List<Integer> lc, List<Integer> la){
        listeNom = ln;
        listeClassement = lc;
        listeAnnee = la;
    }
}
