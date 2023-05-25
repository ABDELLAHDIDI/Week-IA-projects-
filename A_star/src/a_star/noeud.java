/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a_star;

/**
 *
 * @author ABDELLAH DIDI
 */
public class noeud {
    noeud parent=null ;
    char a;
    int h,g,f;

    public char getA() {
        return a;
    }

    public void setA(char a) {
        this.a = a;
    }

    public int getG() {
        return g;
    }

    public void setG() {

if(parent != null)       g+=parent.getG() ;
       f=g+h;
             
    }
    

    public noeud(char b,int h, int g) {
        this.h = h;
        this.g = g;
        a=b;
       
    }

    public noeud getParent() {
        return parent;
    }

    public void setParent(noeud parent) {
        this.parent = parent;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }
    public void afficher(noeud a){
        if(a.parent == null){
            System.out.print(a+"\n");return;
        }
        System.out.print(a+" <--- ");
        afficher(a.getParent());
}

    @Override
    public String toString() {
        return "("+a+","+f+")";
    }

    @Override
    public boolean equals(Object obj) {
        return   (((noeud)obj).getA()==a); 
    }

    int compareTo(noeud o2) {
if(f<o2.getF()) return -1;
if(f == o2.getF()) return 0;
return 1;
    }
    
    
    
    
    
}
