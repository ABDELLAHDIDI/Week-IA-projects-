/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class function {
    public static void afficher_list(ArrayList<String> list){
        int size=list.size();
        for(int i=0;i<size;i++){
            System.out.print(i+1+")"+list.get(i)+"  ");
        }
        System.out.println("");
    }
    
    public static int get_nbr_selected(ArrayList<String> list){
        int size=list.size();
        int c=0;
        for(int i=0;i<size;i++){
            if(list.get(i)=="(selected)")c++;
        }
        return c ;
    }
    
    public static ArrayList<String> get_string_list(int nbr){
        ArrayList<String> string_list=new ArrayList<String>();
        for(int i=0;i<nbr;i++){
            char ch=(char) ('a'+i);
            char[] s={ch};
            string_list.add(new String(s));
        }
        return string_list;
    }
    public static void remplissage(Etat E,String in_fi,ArrayList<Cube> Cube_list){
        System.out.println(": Remplisage de l'etat "+in_fi+" :");
        int nbr_etagere=E.list_etagere.size();
        int nbr_cube=Cube_list.size();
        ArrayList<String> string_list=get_string_list(nbr_cube);
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<nbr_etagere;i++){
            System.out.println("etat courant : \n");
            E.afficher();
            if(function.get_nbr_selected(string_list)==string_list.size())break;
            char ch=(char) ('A'+i);
            Etagere etg=E.getList_etagere().get(i);
            System.out.println("Etagere "+ch+" :");
            System.out.println("choisir parmi la liste suivant le cube poser dans l'etagere (-1 pour passer à l'etagere suivant) : ");
            function.afficher_list(string_list);
            System.out.print("choix : ");
            int choix=sc.nextInt();
            
            while((choix!=-1) && (choix<1 || choix>nbr_cube || string_list.get(choix-1)=="(selected)")){
                System.out.print("choisi un numero valide : ");
                choix=sc.nextInt();
            }
            if(choix==-1){
                if(i==nbr_etagere-1)i--;
                continue;
            }
            etg.getList_cube().add(Cube_list.get(choix-1));
            string_list.set(choix-1, "(selected)");
            i--;
            
        }
        System.out.println("l'etat "+in_fi+" est la suivante : \n");
        E.afficher();
    }
    
    
}
