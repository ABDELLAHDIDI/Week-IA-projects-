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
public class main {
       public static int indexN(LinkedList<chemin> arb ,position a){
       int i=0;
       while(i<arb.size()){
           if(arb.get(i).getNoeud().equals(a)) return i;
           i++;
       }
       return -1;
   }
public static void afficher(LinkedList<chemin> arb ){
 int i=arb.size()-1;
    while(arb.get(i).getPere() != null)
    {
         System.out.println("\n"+arb.get(i).getNoeud()+"\n--->\n");
        i=indexN(arb, arb.get(i).getPere());
    }
     System.out.println("\n"+arb.get(i).getNoeud()+"\n");
}

   public static int inla(LinkedList<position> la, position a){
       Iterator<position> it =la.iterator();
       while(it.hasNext())
           if(a.equals(it.next())) return 0;
      return -1; 
   }
     public static int getindex(LinkedList<voisines> arbre , position a){
     int i=0;
     while(i<arbre.size())
     {
         int j=0;
         while(j<arbre.get(i).s.size()){
             
             if( arbre.get(i).s.indexOf(a) != -1)
                if(arbre.get(i).s.indexOf(a)-1<0)
                     return i;
         j++;
         }
         i++;
     }
        return -1;
   }
   
    
    
   public static void main(String[]  arg ){
  
        System.out.print(" 3 3 3  \n 2 2 2 \n 1 1 1 \n - - -\n 1 2 3 \n");
        cube a= new cube('a',1,1);
        cube b=new cube('b',1,2);
        cube c=new cube('c',1,3);
cube e=new cube('e',1,4);
    position pi = new position(4);
pi.add(a);pi.add(b);pi.add(c);pi.add(e);
System.out.println(pi);
    position pf = new position(4);
a.setPosxy(1, 2); b.setPosxy(1, 1);
c.setPosxy(3, 1);e.setPosxy(3,2);
pf.add(b);pf.add(a);pf.add(c);pf.add(e);
System.out.println(pf);
System.out.println(pi);

if(pi.equals(pf)) System.out.println("c'est la fin !!!!!!\n");
else System.out.println("ce n'est pas la fin !!!!!!\n");

LinkedList<voisines> arbre = new LinkedList<>();
voisines v=new voisines();

arbre.addFirst(v);
v.s.addFirst(pi);



int i=0,k=0;
while(!arbre.get(i).s.getFirst().equals(pf)  ){ 
    System.out.println("i= "+i+"\n");
  
    position x;
    while((x=arbre.get(i).getchild(arbre))!=null){
        voisines q=new voisines();
        q.s.add(x);
        arbre.addLast(q );
        if(x.equals(pf)) {k=1;break;}
    }
if(k==1) break;
      i++;
}
// k=0;
////System.out.println("l'arbre est : \n"+arbre.size());
//while(k<arbre.size()){
//  i=0;
//    System.out.println("etape  "+k+" : \n");
//while(i<arbre.get(k).s.size()){
//    System.out.println("\n"+arbre.get(k).s.get(i)+"\n");
//  i++;
//}
//  k++;
//}


LinkedList<position> la =new LinkedList<>();
LinkedList<chemin> arb =new LinkedList<>();
la.addFirst(pi);
arb.addFirst(new chemin(null,pi));
int q=0,m=0;
while (!la.isEmpty()){
     position fin = la.getLast();
          System.out.println("le tour : "+q+ "\n fin = \n"+fin +"\n");
          q++;
           Iterator<position> itl =arbre.get(getindex(arbre, fin)).s.iterator();
       for(;itl.hasNext();){
           position w= itl.next();
           if(w.equals(pf)){
               System.out.println("\nw.equals(pf) = "+w.equals(pf)+"\n");
               System.out.println("\nw= \n"+w+"\n");
                System.out.println("\npf= \n"+pf+"\n");
              arb.addLast(new chemin(fin, w));
              m=1;break;
           }
           if(inla(la,w)!=0 ){
           la.addFirst(w);
    arb.addLast(new chemin(fin, w));
           }
       }
       if(m==1)break;
       la.removeLast();
     }
     System.out.println("les etapes  : \n");
//      System.out.print("\n" + arb.get(arb.size()-1).getNoeud()+"\n");
// for( i=arb.size()-1;i>1;i--)
//          System.out.print("\n" + arb.get(i).getPere()+"\n");
//             System.out.print("\n" + arb.get(i).getNoeud()+"\n");
   
       afficher(arb);
   
   
   
   
   
   
   
   
   
   
   
   
   }

    
    
    
    
    
    
    
    
    
   }


            


   // System.out.println("arbre.getFirst() = \n"+arbre.getFirst()+"\n");
//    arbre.addFirstFirst(arbre.getFirst().A_B());
//       System.out.println("arbre.getFirst() = \n"+   arbre.getFirst()+"\n");
//        //  arbre.getFirst().add(arbre.getFirst());
//    
//    System.out.println("arbre.getLast() = \n"+   arbre.getLast()+"\n");







 //  l.add(a);  l.add(b);  l.add(c);
//       Iterator<cube> it = l.iterator();
//        LinkedList<cube> [] posi = new LinkedList[3];
//    posi[0]=new LinkedList();
//      posi[1]=new LinkedList();
//          posi[2]=new LinkedList(); 
//               LinkedList<cube> [] posf = new LinkedList[3];
//    posf[0]=new LinkedList();
//      posf[1]=new LinkedList();
//          posf[2]=new LinkedList();
//        String w=" 1 2 3 \n 4 5 6 \n 7 8 9 \n - - - \n";
//while(it.hasNext()){
//    cube q=it.next();
//    if(q.posx==1) {w=w.replace('1', q.nom); posi[0].add(q);}
//    else if(q.posx==2) {w=w.replace('2', q.nom);posi[1].add(q);}
//   else if(q.posx==3) {w=w.replace('3', q.nom);posi[2].add(q);}
//   else if(q.posx==4) {w=w.replace('4', q.nom);posi[0].add(q);}
//   else if(q.posx==5) {w=w.replace('5', q.nom);posi[1].add(q);}
//  else  if(q.posx==6) {w=w.replace('6', q.nom);posi[2].add(q);}
//  else  if(q.posx==7) {w=w.replace('7', q.nom);posi[0].add(q);}
//     else  if(q.posx==8){w= w.replace('8', q.nom);posi[1].add(q);}
//     else  if(q.posx==9){w= w.replace('9', q.nom);posi[2].add(q);}
//} 
//
//
//       System.out.println("etat inintial : \n"+w);
//       a.setPos(3);b.setPos(6);c.setPos(9);
//       w=" 1 2 3 \n 4 5 6 \n 7 8 9 \n - - - \n";
//       it = l.iterator();
//   while(it.hasNext()){
//    cube q=it.next();
//    if(q.posx==1) {w=w.replace('1', q.nom); posf[0].add(q);}
//    else if(q.posx==2) {w=w.replace('2', q.nom);posf[1].add(q);}
//   else if(q.posx==3) {w=w.replace('3', q.nom);posf[2].add(q);}
//   else if(q.posx==4) {w=w.replace('4', q.nom);posf[0].add(q);}
//   else if(q.posx==5) {w=w.replace('5', q.nom);posf[1].add(q);}
//  else  if(q.posx==6) {w=w.replace('6', q.nom);posf[2].add(q);}
//  else  if(q.posx==7) {w=w.replace('7', q.nom);posf[0].add(q);}
//     else  if(q.posx==8){w= w.replace('8', q.nom);posf[1].add(q);}
//     else  if(q.posx==9){w= w.replace('9', q.nom);posf[2].add(q);}
//}   
//    System.out.println("etat final : \n"+w);
//    
//    LinkedList <LinkedList<cube> [] >la= new LinkedList();
//    la.add(posi);
//    Iterator<LinkedList<cube> [] > itla=la.iterator();
//    LinkedList <LinkedList <LinkedList<cube> [] > > stok =new LinkedList();
//    while( la.isEmpty()){
//       if(isfin(la.getFirst(),posf)){
//          Iterator<LinkedList<LinkedList<cube> [] > > itstok=stok.iterator();
//          while(itstok.hasNext()){
//              Iterator<LinkedList<cube> [] > itstoknext=itstok.next().iterator();
//              
//          }
//           
//       }
//        
//        
//        
//        
//    }
//     