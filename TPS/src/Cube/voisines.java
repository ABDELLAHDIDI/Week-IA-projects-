/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cube;

import java.util.*;


/**
 *
 * @author ABDELLAH DIDI
 */
public class voisines {
    
    LinkedList<position>  s;

    public voisines() {
        this.s = new LinkedList();
    }

    public LinkedList<position> getS() {
        return s;
    }
     public int exist(position a){
        Iterator<position> it = s.iterator();
        while(it.hasNext())
        {
//            System.out.println("exist\n");
             if(it.next().equals(a)) return 0;
        }
       return -1; 
    }
     public  int existv(LinkedList<voisines> arbre,position x){
              Iterator<voisines> it=arbre.iterator();
        while(it.hasNext())
                     if( it.next().exist( x) == 0) return 0;
        return -1;
    }
    public position getchild (LinkedList<voisines> arbre){
position x ;
if(((x=s.getFirst().A_B())!= null) && ( existv(arbre,x) == -1) )  {
//System.out.println("\nok!!!!!!!!!!!!!\n");
              s.addLast(x);
              return x;
           }
else if(((x=s.getFirst().A_C()) != null) && (((existv(arbre,x))) == -1)) {
//            System.out.println("\nok!!!!!!!!!!!!!\n");
              s.addLast(x);
              return x;
    }
 else if(((x=s.getFirst().B_A()) != null) && (((existv(arbre,x))) == -1)) {
//       System.out.println("\nok!!!!!!!!!!!!!\n");   
              s.addLast(x);
              return x;
    }
else if(((x=s.getFirst().B_C()) != null )&& (((existv(arbre,x))) == -1)) {
//    System.out.println("\nok!!!!!!!!!!!!!\n");      
              s.addLast(x);
              return x;
    }
else if(((x=s.getFirst().C_A()) != null) && (((existv(arbre,x))) == -1) ) {
//System.out.println("\nok!!!!!!!!!!!!!\n");
              s.addLast(x);
              return x;
    }
else if(((x=s.getFirst().C_B()) != null) && (((existv(arbre,x))) == -1)) {
//System.out.println("\nok!!!!!!!!!!!!!\n");    
              s.addLast(x);
              return x;  
    }
return null;
    }
    
    
    
    

        
    
    
    
}
