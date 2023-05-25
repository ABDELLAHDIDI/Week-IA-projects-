/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_cube;

import java.util.ArrayList;
import classes.*;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class TP_cube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ArrayList<String> a=new ArrayList<String>();
//        a.add("aaa");
//        a.add("bbb");
//        a.add("ccc");
//        a.remove(a.size()-1);
//        Cube b=new Cube(2);
//        char ch='a'+2;
//        System.out.println(ch);
//        Etat e=new Etat(5);
//        Etagere et1=e.getList_etagere().get(0);
//        Etagere et2=e.getList_etagere().get(1);
//        Etagere et3=e.getList_etagere().get(2);
//        Etagere et4=e.getList_etagere().get(3);
//        Etagere et5=e.getList_etagere().get(4);
//        et1.getList_cube().add(new Cube(0));
//        et1.getList_cube().add(new Cube(1));
//        et1.getList_cube().add(new Cube(2));
//        
//        et3.getList_cube().add(new Cube(0));
//        et3.getList_cube().add(new Cube(1));
//        et3.getList_cube().add(new Cube(2));
//        e.afficher();
        System.out.println(":  probleme des cubes :");
        int count1=0;
        int count2=0;
        //preparation des cubes
        int nbr_cube=0;
        ArrayList<Cube> Cube_list=new ArrayList<Cube>();
        Scanner sc = new Scanner(System.in);
        while(nbr_cube<3 || nbr_cube>26){
            System.out.print("saisir le nombre des cubes pour ce probleme (entre 3 et 26 ): ");
            nbr_cube=sc.nextInt();
        }
        
        for(int i=0;i<nbr_cube;i++){
            Cube_list.add(new Cube(i));
        }
        
        //preparation des etageres
        int nbr_etagere=0;
        while(nbr_etagere<3 || nbr_etagere>26){
            System.out.print("saisir le nombre des etageres pour ce probleme (entre 3 et 26 ): ");
            nbr_etagere=sc.nextInt();
        }
        
        //Etat initial et final
        Etat etat_initial=new Etat(nbr_etagere);
        Etat etat_final=new Etat(nbr_etagere);
        
        
        //Remplisage de l'etat initial
        function.remplissage(etat_initial, "initial", Cube_list);
        System.out.println("\n\n");
        //Remplisage de l'etat final
        function.remplissage(etat_final, "final", Cube_list);
        
        Noeud racine=new Noeud(null, etat_initial, 0);
        ArrayList<Noeud> fr=new ArrayList<Noeud>();
        fr.add(racine);
        ArrayList<Noeud> visited=new ArrayList<Noeud>();
        while(fr.size()>0){
            System.out.println(count1++);
            Noeud last_noeud =fr.remove(0);
            visited.add(last_noeud);
            if(last_noeud.getEtat().equal(etat_final))break;
            var enfants=last_noeud.get_childs_Noeud();
            int size=enfants.size();
            for(int i=0;i<size;i++){
                System.out.println(count2++);
                Noeud n=enfants.get(i);
                if(n.not_in(visited, fr))fr.add(n);
            }
            
        }
        
        Noeud noeud_final=visited.get(visited.size()-1);
        
        System.out.println(":  AFFICHAGE DU CHEMIN  :\n");
        noeud_final.afficher_chemin();
        
    }
    
}
