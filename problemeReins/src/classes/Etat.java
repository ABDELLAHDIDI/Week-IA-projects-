/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author lenovo
 */
public class Etat {
    int n;
    int m;
    int[] tab;

    public Etat(int n, int m) {
        this.n = n;
        this.m = m;
        tab=new int[m];
        for(int i=0;i<m;i++){
            tab[i]=1;
        }
        
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int[] getTab() {
        return tab;
    }

    public void setTab(int[] tab) {
        this.tab = tab;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etat other = (Etat) obj;
        if (this.n != other.n) {
            return false;
        }
        if (this.m != other.m) {
            return false;
        }
        for(int i=0;i<tab.length;i++){
            if(tab[i]!=other.tab[i])return false;
        }
            
        return true;
    }
    
    public boolean validate(){
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(tab[i]==tab[j]||tab[i]==tab[j]+(j-i)||tab[i]==tab[j]-(j-i))return false;
            }
        }
        return true;
    }
    
    
    public void afficher(){
        System.out.println("--------------------------------");
        System.out.println("");
        for(int i=0;i<m;i++){
            for(int j=1;j<=n;j++){
                if(j==tab[i])System.out.print("| X |");
                else System.out.print("| O |");
            }
            System.out.println("");
            for(int k=0;k<n;k++){
                System.out.print("-----");
            }System.out.println("");
        }
        System.out.println("");
        System.out.println("--------------------------------");
    }
}
