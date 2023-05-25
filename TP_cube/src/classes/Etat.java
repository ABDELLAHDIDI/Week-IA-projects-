/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Etat {
    ArrayList<Etagere> list_etagere;

    public Etat(int nbr_etag) {
        list_etagere=new ArrayList<Etagere>();
        for(int i=0;i<nbr_etag;i++){
            Etagere e=new Etagere(i);
            list_etagere.add(e);
        }
    }

    public ArrayList<Etagere> getList_etagere() {
        return list_etagere;
    }
    
    
    
    public boolean equal(Etat e){
        int size=list_etagere.size();
        if(size!=e.list_etagere.size())return false;
        for(int i=0 ;i<size;i++){
            Etagere eg=e.list_etagere.get(i);
            if(list_etagere.get(i).equal(eg)==false)return false;
            
        }
        return true;
    }
    
    public Etat getcopy(){
        int nbr_etag=list_etagere.size();
        Etat copy=new Etat(nbr_etag);
        for(int i=0;i<nbr_etag;i++){
            Etagere e=list_etagere.get(i);
            int etag_size=e.list_cube.size();
            for(int j=0;j<etag_size;j++){
                Cube c=e.list_cube.get(j);
                copy.list_etagere.get(i).list_cube.add(c);
            }
        }
        return copy;
    }
    public ArrayList<Etat> calcul_enfant(){
        ArrayList<Etat> list = new ArrayList<Etat>();
        int size=list_etagere.size();
        for(int i=0 ; i<size;i++){
            for(int j=0;j<size;j++){
                if(i!=j){
                    Etagere e=list_etagere.get(i);
                    int etag_size=e.list_cube.size();
                    if(etag_size>0){
                        Etat enfant=getcopy();
                        Etagere ed=enfant.list_etagere.get(i);
                        Etagere ea=enfant.list_etagere.get(j);
                        int last=ed.list_cube.size()-1;
                        Cube c=ed.list_cube.get(last);
                        ea.list_cube.add(c);
                        ed.list_cube.remove(last);
                        list.add(enfant);
                    }
                }
            }
        }
        return list;
    }
    
    
    public void afficher(){
        int max=0;
        int largeur=list_etagere.size();
        for(int i=0;i<list_etagere.size();i++){
            int longueur=list_etagere.get(i).list_cube.size();
            if(max<longueur)max=longueur;
        }
        for(int i=0;i<max;i++){
            
            for(int j=0;j<largeur;j++){
                if(max-1-i<list_etagere.get(j).list_cube.size()){
                    char ch=(char) ('a'+list_etagere.get(j).list_cube.get(max-1-i).name);
                    System.out.print(" "+ch+"   ");
                }
                else System.out.print("     ");
            }
            System.out.println("");
        }
        if(max==0){
            for(int j=0;j<largeur;j++){
                System.out.print("vide ");
            }
            System.out.println("");
        }
        for(int j=0;j<largeur;j++){
            System.out.print("---  ");
        }
        System.out.println("");
        for(int j=0;j<largeur;j++){
            char ch=(char) ('A'+j);
            System.out.print(" "+ch+"   ");
        }
        System.out.println("");
        
    }
    
    
}
