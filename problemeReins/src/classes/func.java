/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author lenovo
 */
public class func {
    public static void search(Etat E,int n){
        if(n==E.m)return;
        for(int i=0;i<E.n;i++){
            E.getTab()[n]=i+1;
            search(E,n+1);
            if(E.validate()){
                System.out.println("--");
                return;
            }
        }
    }
    public static void search(Etat E){
        search(E,0);
    }
    
}
