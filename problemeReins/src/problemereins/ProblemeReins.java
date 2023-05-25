/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemereins;

import classes.Etat;
import static classes.func.search;

/**
 *
 * @author lenovo
 */
public class ProblemeReins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Etat E=new Etat(11, 11);
        E.afficher();
        search(E);
        if(E.validate()){
            E.afficher();
            System.out.println("trouvee");
        }
        else System.out.println("n'existe pas");
    }
    
}
