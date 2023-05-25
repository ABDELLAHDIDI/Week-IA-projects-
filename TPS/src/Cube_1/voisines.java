/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cube_1;


import java.util.*;


/**
 *
 * @author ABDELLAH DIDI
 */
public class voisines {
    
    LinkedList<position>  visited;
      LinkedList<position> fr;

    public voisines() {
        this.visited = new LinkedList();
            this.fr = new LinkedList();
    }

//    public LinkedList<position> getvisited() {
//        return visited;
//    }
     public int exist(position a){
              Iterator<position> it = visited.iterator();
             Iterator<position> itfr = fr.iterator();
//              System.out.println("exist\n");
        while(it.hasNext() || itfr.hasNext())
        {
            if(itfr.hasNext()) if(itfr.next().equals(a)) return 0;
             if(it.hasNext() )if(it.next().equals(a)) return 0;
        }
       return -1; 
    }
//     public  int existv(LinkedList<voisines> arbre,position x){
//              Iterator<voisines> it=arbre.iterator();
//        while(it.hasNext())
//                     if( it.next().exist( x) == 0) return 0;
//        return -1;
//    }
    public position getchild (){
position x ;
if(((x=fr.getFirst().A_B())!= null) && ( exist(x) == -1) )  {
    x.setPere(fr.getFirst());
              fr.addLast(x);
              return x;
           }
else if(((x=fr.getFirst().A_C()) != null) && (((exist(x))) == -1)) {
//            System.out.println("\nok!!!!!!!!!!!!!\n");
x.setPere(fr.getFirst());
              fr.addLast(x);
              return x;
    }
 else if(((x=fr.getFirst().B_A()) != null) && (((exist(x))) == -1)) {
//       System.out.println("\nok!!!!!!!!!!!!!\n");
x.setPere(fr.getFirst());
              fr.addLast(x);
              return x;
    }
else if(((x=fr.getFirst().B_C()) != null )&& (((exist(x))) == -1)) {
//    System.out.println("\nok!!!!!!!!!!!!!\n"); 
x.setPere(fr.getFirst());
              fr.addLast(x);
              return x;
    }
else if(((x=fr.getFirst().C_A()) != null) && (((exist(x))) == -1) ) {
//System.out.println("\nok!!!!!!!!!!!!!\n");
x.setPere(fr.getFirst());
              fr.addLast(x);
              return x;
    }
else if(((x=fr.getFirst().C_B()) != null) && (((exist(x))) == -1)) {
//System.out.println("\nok!!!!!!!!!!!!!\n");  
x.setPere(fr.getFirst());
              fr.addLast(x);
              return x;  
    }
visited.addLast(fr.getFirst());
fr.removeFirst();
return null;
    }
    
    
    
    

        
    
    
    
}
