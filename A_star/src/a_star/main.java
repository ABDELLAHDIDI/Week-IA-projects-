/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a_star;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author ABDELLAH DIDI
 */
public class main {
    public static int index(noeud a){
        if(a.getA()=='a') return 0;
         if(a.getA()=='b') return 1;
          if(a.getA()=='c') return 2;
           if(a.getA()=='d') return 3;
            if(a.getA()=='e') return 4;
            if(a.getA()=='f') return 5;
             if(a.getA()=='g') return 7;
              if(a.getA()=='h') return 6;
//   if(a.getA()=='A') return 0;
//         if(a.getA()=='B') return 1;
//          if(a.getA()=='C') return 2;
//           if(a.getA()=='D') return 3;
//            if(a.getA()=='E') return 4;
//            if(a.getA()=='F') return 9;
//             if(a.getA()=='G') return 7;
//              if(a.getA()=='H') return 8;
//                if(a.getA()=='I') return 5;
//                  if(a.getA()=='J') return 6;
            
             return -1;   
    }
        public static void  sort(LinkedList<noeud> a){
             Collections.sort(a, new Comparator<noeud>() {
            
            public int compare(noeud o1, noeud o2) {
                return o1.compareTo(o2); // Ascending order
            }
        });
    }
            public static int isin(noeud a,LinkedList<noeud> b){
                int i=0;
            Iterator <noeud> it= b.iterator();
            while(it.hasNext())
            {
                 if(it.next().equals(a))
             return i; 
                 i++;
            }  
            return -1;
    }
                    public static boolean first_noeud(noeud a,LinkedList<noeud> b){
                        int i =0;
                if( ( i = isin(a, b) )!= -1 && a.getF() >= b.get(i).getF() ){
                 return true ;   
                }
                return false;
    }
          
  
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           LinkedList<noeud>[] m = new LinkedList[8];
        m[0]=new LinkedList();
        m[1]=new LinkedList();
        m[2]=new LinkedList();
        m[3]=new LinkedList();
        m[4]=new LinkedList();
        m[5]=new LinkedList(); 
        m[6]=new LinkedList();
        m[7]=new LinkedList();
        //a
        m[0].add(new noeud('b',10,8));
        m[0].add(new noeud('c',1,3));
        //b
        m[1].add(new noeud('d',3,6));
        m[1].add(new noeud('e',5,2));
        //C
        m[2].add(new noeud('b',10,5));
        //d
        m[3].add(new noeud('f',2,8));
        //e
        m[4].add(new noeud('h',13,3));
          m[4].add(new noeud('c',1,4));
        //f
        m[5].add(new noeud('e',5,10));
        m[5].add(new noeud('g',0,12));
        //g
        //h
            m[6].add(new noeud('g',0,1));
        
        
//        LinkedList<noeud>[] m = new LinkedList[10];
//        m[0]=new LinkedList();
//        m[1]=new LinkedList();
//        m[2]=new LinkedList();
//        m[3]=new LinkedList();
//        m[4]=new LinkedList();
//        m[5]=new LinkedList(); 
//        m[6]=new LinkedList();
//        m[7]=new LinkedList();
//        m[8]=new LinkedList();
//        m[9]=new LinkedList();
//        //A
//        m[0].add(new noeud('B',8,6));
//        m[0].add(new noeud('F',6,3));
//          //B
//        m[1].add(new noeud('C',5,3));
//        m[1].add(new noeud('D',7,2));
//                m[1].add(new noeud('A',10,6));
//          //C
//        m[2].add(new noeud('D',7,1));
//        m[2].add(new noeud('E',3,5));
//                m[2].add(new noeud('B',8,3));
//          //D
//        m[3].add(new noeud('E',3,8));
//        m[3].add(new noeud('C',5,1));
//         m[3].add(new noeud('B',8,2));
//          //E
//        m[4].add(new noeud('I',1,5));
//        m[4].add(new noeud('J',0,5));
//        m[4].add(new noeud('D',7,8));
//        m[4].add(new noeud('C',5,5));
//            //I
//        m[5].add(new noeud('G',3,5));
//        m[5].add(new noeud('H',3,2));
//         m[5].add(new noeud('J',0,3));
//                  m[5].add(new noeud('E',3,5));
//               //J
//        m[6].add(new noeud('I',1,3));
//         m[6].add(new noeud('E',3,5));
//        
//                //G
//        m[7].add(new noeud('I',1,3));
//        m[7].add(new noeud('F',6,1));
//        //H
//        m[8].add(new noeud('I',1,2));
//        m[8].add(new noeud('F',6,7));
//        //F
//        m[9].add(new noeud('G',5,1));
//        m[9].add(new noeud('H',3,7));
//                m[9].add(new noeud('A',10,3));
       
        
         noeud etat_initial = new noeud('a',0,0);//noeud('A',10,0);
         noeud  etat_final = new noeud('g',0,0);//noeud('J',0,0);
        LinkedList<noeud> fr = new LinkedList();
          LinkedList<noeud> v = new LinkedList();
          
      
          
         
        Iterator<noeud> itv = v.iterator(); 
        fr.add(etat_initial);
      while(!fr.isEmpty()){
      
if(first_noeud(fr.getFirst(), v)){
    fr.removeFirst();
    sort(fr);
}
    noeud a=fr.getFirst();
          if(a.equals(etat_final)) {
              v.addLast(fr.removeFirst());
              break;
          }
                
                 fr.remove(a);
                 v.addLast(a);
          
                System.out.println("v : "+v);
             
          int i=0;
             Iterator<noeud> itm = m[index(a)].iterator();
                Iterator<noeud> it = fr.iterator();  
             while(itm.hasNext()){
                 noeud b=itm.next();
                 b.setParent(a);
                 b.setG();
                 if( (i=isin(b,v))!=-1  && b.getF() < v.get(i).getF()){
                     if( true){
                     fr.add(b);
                     v.remove(i);
                      sort(fr);
                              }
                 }
                 else if((i=isin(b,fr))!=-1 &&  b.getF() < fr.get(i).getF()){
                     if( true ){
                     fr.remove(i);
                      fr.add(b);
                      sort(fr);
                              }
                 }
                 else{
                  fr.add(b);
                 sort(fr);
                   
                 }
             }
             
         System.out.println("fr : "+fr);
                    
      }
      v.getLast().afficher(v.getLast());
        
        
    }
    
}
