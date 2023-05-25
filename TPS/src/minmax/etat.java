/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minmax;

import java.util.*;

/**
 *
 * @author ABDELLAH DIDI
 */
public class etat {
     static table   l = new table();
     table  t1 = new table();  ;
        int val=0;  int feuil = 2;

    public int getFeuil() {
        return feuil;
    }
        
   LinkedList<etat> list = new LinkedList<etat>(); 
   LinkedList<etat> listv = new LinkedList<>(); 
   int prof=0; 
       LinkedList<etat> f = new LinkedList<>(); 
    etat p = null;
    public etat(){
     } 
     public etat(table a){
         l=a;
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                t1.setT(i, j, l.getT(i, j));
            }
        }
     } 
      public int getProf() {
        return prof;
    }

    public void setProf(int prof) {
        this.prof = prof;
    }
     public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
 

    public etat getP() {
        return p;
    }

    public void setP(etat p) {
        this.p = p;
    }
    public table get_t1(){
        return t1;
    }
    
    public void copy(etat a){
//        val=a.getVal();  
           for(int i=0;i<3;i++)
             for(int j=0;j<3;j++)
             {
                         t1.setT(i,j,a.get_t1().getT(i,j));
             }
           t1.setJoueur(a.get_t1().getJoueur());
    }
     public boolean isin(){
            if(list.indexOf(this)==-1 && listv.indexOf(this)==-1) return false;
            return true;
        }
     public void calcule(){
           Iterator<etat> itf = listv.getFirst().f.iterator(); 
           while(itf.hasNext()){
               etat b= itf.next();
               if(b.isfeuil() != 2){
                   if(b.isfeuil() >-1) b.setVal(10);
                   else b.setVal(-10);
               }
               else {
                    Iterator<etat> itff = b.f.iterator(); 
                      while(itff.hasNext()){
               etat c= itff.next();
               if(c.isfeuil() != 2){
                   if(c.isfeuil() >-1) b.setVal(10);
                   else c.setVal(-10);
               }
               else 
                   c.setVal(c.get_t1().calcule("X")-c.get_t1().calcule("O"));
                      }
               }
           }                 
     }
         public  void  sort(LinkedList<etat> x){
             Collections.sort(x, new Comparator<etat>() {
            
            public int compare(etat o1, etat o2) {
                return o1.compareTo(o2); // Ascending order
            }
        });
         }
                public  int compareTo(etat o2) {
if(val<o2.getVal()) return -1;
if(val == o2.getVal()) return 0;
return 1;
    }
    public int isfeuil(){
        if(t1.isMaxWin()) { feuil=1; return feuil;}
        if(t1.isMinWin()) { feuil=-1; return feuil;}
        if(t1.isfin()){   feuil=0;return feuil;}
     return 2;
    }
     public table  descision(){
        LinkedList<etat> Lfeuil=new LinkedList<>();
             Iterator<etat> itf = listv.getFirst().f.iterator(); 
             while(itf.hasNext()){
                 etat a=itf.next();
                       if(!a.f.isEmpty())    {
                    sort(a.f);
                    a.setVal(a.f.getFirst().getVal());        
                       } 
             }
              sort(listv.getFirst().f);
             l=listv.getFirst().f.getLast().get_t1();   
         return l;
     }
     public void aff_p(etat a){
         if(a == null) return;
         System.out.println(" etat : "+a);
         aff_p(a.getP());
     }
        public void generate_f(etat a){
      
        list.add(a);
      while(!list.isEmpty() && list.getFirst().getProf() <= 2 ){
              
           for(int i =0;i<9;i++){
                  etat b= new etat();
                 b.copy(list.getFirst());
                // System.out.println("avant : "+b.t1.getJoueur());
            if(  b.t1.entrer(i, b.t1.getJoueur()) && !b.isin()) 
            {   
        if(b.t1.getJoueur()=="X")  b.t1.setJoueur("O");
        else if(b.t1.getJoueur() =="O")  b.t1.setJoueur("X");
                b.setP(list.getFirst());list.getFirst().f.add(b);
              list.addLast(b);
            }
          }
            listv.addLast(list.removeFirst());
           try{
                   list.getFirst().profo(list.getFirst());
         }
           catch(NoSuchElementException e){
               
            }
          }
    }

    @Override
    public String toString() {
        t1.afficher();
        return "le joueur  : "+t1.getJoueur()+"   val = "+val+"\n"; 
    }
        
    public int profo(etat a){
        if(a.getP() == null) return 0;
        prof++;
       return  profo(a.getP());
    }

    @Override
    public boolean equals(Object obj) {
        return l.equals(t1); 
    }  
       public static void main(String[]  arg ){
         table a=new table();
             System.out.println("les position sont : ");
             a.afficher();
             System.out.println("jouer !!!!! ");
         a.initialer();
         while( true ) {
       System.out.println("***********************tour de pc **************************");
         etat b = new etat();
         etat c= new etat(a);
         
        b.generate_f(c);
         b.calcule();
        a= b.descision();
         a.afficher();
         if(a.isMaxWin()) break;
         if(a.isfin()) break;
      System.out.println("****************************ton tour************************** ");
         
       Scanner myObj = new Scanner(System.in);
        System.out.println("Entrer la position : ");

    int pos = myObj.nextInt();
 while(!a.entrer(pos, "O")){
    System.out.println("Entrer la position : ");

     pos = myObj.nextInt();
         
        
 }
  a.afficher();
    if(a.isMinWin()) break;
      if(a.isfin()) break;
         }
         if(a.isMaxWin()) System.out.println("le pc a gagné !!!!");
         else if(a.isMinWin()) System.out.println("vous avez  gagné !!!!");
         else System.out.println("egalité !!!");

         
      
         
         
     }
}
