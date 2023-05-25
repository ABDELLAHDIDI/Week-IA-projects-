/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Algo_couleur;

import java.util.*;

/**
 *
 * @author ABDELLAH DIDI
 */
public class Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer>[] l;
        LinkedList<Integer> la = new LinkedList<>();
        Iterator<Integer> it = la.iterator();
        char[] col = new char[9];
        for(int i=0;i<9;i++) col[i]='B';
          Integer[] arb = new Integer[9];
      
        l = new LinkedList[9];
        l[0]=new LinkedList();
        l[0].add(1);
         l[1]=new LinkedList();
         l[1].add(2);
         l[1].add(3);
         l[1].add(5);
          l[2]=new LinkedList();
          l[2].add(8);
           l[3]=new LinkedList();
           l[3].add(5);
           l[3].add(6);
            l[4]=new LinkedList();
            l[4].add(8);
            l[4].add(7);
             l[5]=new LinkedList();
             l[5].add(1);
             l[5].add(3);
              l[6]=new LinkedList();
              l[6].add(3);
               l[7]=new LinkedList();
               l[7].add(4);
      l[8]=new LinkedList();
        l[8].add(2);
        l[8].add(4);
        la.add(0);
        int q=0;
 while (!la.isEmpty()  ){
     Integer fin = la.removeLast();
          System.out.println("le tour : "+q+ " fin = "+fin +"\n");
          q++;
     if(col[fin]!='N'){
        //col[fin]='G';
           Iterator<Integer> itl = l[fin].iterator();
       for(;itl.hasNext() ;){
           Integer k= itl.next();
           System.out.println("k= "+k+"\n");
           if(col[k]=='B'){
           la.addFirst(k);
           col[k]='G';
           arb[k]=fin;
           }
       }
       System.out.println("wax wsalti ??\n");
       col[fin]='N';
       
       
       if(la.size()!=0) {  System.out.println("lowlani xkon : "+la.getFirst()+"\n");
         System.out.println("xko l5rani : "+la.getLast()+"\n");}
         
           System.out.println("l'arbre  : \n");
 for(int i=0;i<9;i++)
     System.out.print("+" + arb[i]+"+"); 
     }
//     else if(col[fin]=='G'){
//       col[fin]='N';
//       la.removeLast();
//     }
     }
        System.out.println("l'arbre  : \n");
 for(int i=0;i<9;i++)
     System.out.print("" + arb[i]);
        System.out.println("\n");
 
    }
   
}
