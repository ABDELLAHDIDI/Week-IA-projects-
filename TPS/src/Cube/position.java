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
public class position {
    int place = 3;
    int nbre_cube;
    LinkedList<cube> [] lc;

    public LinkedList<cube>[] getLc() {
        return lc;
    }
    public position(int a) {
        this.lc = new LinkedList[3];
        lc[0] = new LinkedList();
           lc[1] = new LinkedList();
              lc[2] = new LinkedList();
              nbre_cube=a;
    }
    public int add(cube a){
            try {  
            Iterator<cube> it=lc[a.posx-1].listIterator(a.posy);
                     System.out.println("la place est occupe !!\n");
                        return -1;
                 }
                 catch( IndexOutOfBoundsException  e){
                  if(lc[a.posx-1].size()>= a.posy-1 )
        {
            lc[a.posx-1].add(a.posy-1, a);
        return 0;
        }
            }
        return -1;
    }

    @Override
    public String toString() {
        String [] [] a= new String [nbre_cube][3];
        for(int j=0;j<nbre_cube;j++)
        {
            int i=0;
            for(;i<3;i++){
                 try {
                     cube k;
            Iterator<cube> it=lc[i].listIterator(j);
            if(it.hasNext()){ k=it.next(); if( k!= null) a[j][i]=" "+k+" ";}
            else  a[j][i]=" * ";
                     //System.out.println(" a["+j+"]["+i+"]= "+a[j][i]);
                 }
                 catch( IndexOutOfBoundsException  e){
                     a[j][i]=" * ";
               // System.out.println("it is ok \n");
            }
        }
            a[j][i-1]=a[j][i-1]+"\n";
        }
        String msg="";
        for(int i=nbre_cube-1;i>=0;i--){
            for(int j=0;j<3;j++)
                msg=msg+a[i][j];
        }
        return msg; 
    }
    
 
    

    @Override
    public boolean equals(Object obj) {
      
        for(int i=0;i<3;i++){
              int a=0;
        Iterator<cube> ito=((position)obj).getLc()[i].iterator();
                Iterator<cube> itp=lc[i].iterator();
                if(((position)obj).getLc()[i].size() != lc[i].size()) return false;
              while( a < ((position)obj).getLc()[i].size() )
                     {
                         a++;
                     //  System.out.println("lc["+i+"].size()= "+((position)obj).getLc()[i].size()+"\n a = "+a+"\n");
                 if(ito.hasNext() != itp.hasNext()) return false;
                 if(ito.hasNext())  
                     if (!itp.next().equals(ito.next() ))
                         return false;
                     }    
        }
        return true; 
    }
    public void af(position a){
        for(int i=0;i<3;i++){
            Iterator<cube> it=a.getLc()[i].iterator();
            while(it.hasNext() ){
               // System.out.println("af \n");
                cube c=it.next();
               lc[i].add(new cube (c.getNom(),c.getPosx(), c.getPosy()));
            }
        }
    }
    public position A_B(){
        position a =new position(nbre_cube);
        a.af(this);
        if(!a.getLc()[0].isEmpty()) {
            a.getLc()[1].add(a.getLc()[0].getLast());
            a.getLc()[0].removeLast();
        return a;}
        return null;
    }
     public position A_C(){
          position a =new position(nbre_cube);
        a.af(this);
        if(!a.getLc()[0].isEmpty()) {
            a.getLc()[2].add(a.getLc()[0].getLast());
            a.getLc()[0].removeLast();
        return a;}
        return null;
    }
         public position B_A(){
           position a =new position(nbre_cube);
        a.af(this);
        if(!a.getLc()[1].isEmpty()) {
            a.getLc()[0].add(a.getLc()[1].getLast());
            a.getLc()[1].removeLast();
        return a;}
        return null;
    }
             public position B_C(){
          position a =new position(nbre_cube);
        a.af(this);
        if(!a.getLc()[1].isEmpty()) {
            a.getLc()[2].add(a.getLc()[1].getLast());
            a.getLc()[1].removeLast();
        return a;}
        return null;
    }
                      public position C_A(){
           position a =new position(nbre_cube);
        a.af(this);
        if(!a.getLc()[2].isEmpty()) {
            a.getLc()[0].add(a.getLc()[2].getLast());
            a.getLc()[2].removeLast();
        return a;}
        return null;
    }
                        public position C_B(){
          position a =new position(nbre_cube);
        a.af(this);
        if(!a.getLc()[2].isEmpty()) {
            a.getLc()[1].add(a.getLc()[2].getLast());
            a.getLc()[2].removeLast();
        return a;}
        return null;
    }
    
}
