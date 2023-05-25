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
public class Noeud {
    Noeud parent;
    Etat etat;
    int cost;

    public Noeud(Noeud parent, Etat etat, int cost) {
        this.parent = parent;
        this.etat = etat;
        this.cost = cost;
    }

    public Noeud getParent() {
        return parent;
    }

    public Etat getEtat() {
        return etat;
    }

    public int getCost() {
        return cost;
    }

    public void setParent(Noeud parent) {
        this.parent = parent;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    public ArrayList<Noeud> get_childs_Noeud(){
        ArrayList<Noeud> noeud_list=new ArrayList<Noeud>();
        ArrayList<Etat> etat_list=etat.calcul_enfant();
        int size=etat_list.size();
        for(int i=0;i<size;i++){
            Etat etat=etat_list.get(i);
            noeud_list.add(new Noeud(this, etat, cost+1));
        }
        
        return noeud_list;
    }
    
    public boolean not_in(ArrayList<Noeud> L1,ArrayList<Noeud> L2){
        int size=L1.size();
        for(int i=0;i<size;i++){
            if(etat.equal(L1.get(i).etat))return false;
        }
        size=L2.size();
        for(int i=0;i<size;i++){
            if(etat.equal(L2.get(i).etat))return false;
        }
        return true;
    }
    
    public void afficher_chemin(){
        if(parent==null){
            etat.afficher();
            System.out.println("");
            System.out.println("-------------->");
            System.out.println("");
            return;
        }
        parent.afficher_chemin();
        etat.afficher();
        System.out.println("");
        System.out.println("-------------->");
        System.out.println("");
        
        
    }
    
}
