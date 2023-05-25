/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reines;

/**
 *
 * @author ABDELLAH DIDI
 */
public class main {
//    public static boolean is(int t[][],int n){
//        //test si tout  ligne contient une regne ou pas  
//        for(int i=0;i<n;i++)
//        {     
//            int c=0;
//           for(int j=0;j<n;j++)
//                    if(t[i][j]==1) c++ ;
//             if(c!=1) return false ;       
//        }
//        return true;
//    }
//    
//       public static void  remplir(int t[][],int n,int i,int j){
//        //remplit la matrice par des 2 dans les routes de la regne   
//     
//        
//      t[i][j]=1;
//     for(int k=0;k<n;k++) {
//     if(t[i][k]!=1) t[i][k]=2;
//     if(t[k][j]!=1) t[k][j]=2;
//     }
// for(int x=0;x<n;x++)
//  if(i+x<n && j+x<n) if(t[i+x][j+x]!=1) t[i+x][j+x]=2;
//  for(int x=0,y=0;x<n;x++,y--)
//  if(i+x<n && j+y>=0) if(t[i+x][j+y]!=1) t[i+x][j+y]=2;
//        
//        
//   }
//       public static void afficher(int t[][],int n){
//           int i,j;
//                    for(  i=0;i<n;i++)
//{
//       for(  j=0;j<n;j++)  System.out.print(" " +t[i][j]+" ");
//       System.out.println("\n");
//}
//                    
//           
//       }
//              public static void initialiser(int t[][],int n){
//           int i,j;
//for(i=0;i<n;i++)
//   for( j=0;j<n;j++)
//       t[i][j]=0;               
//           
//       }
//                 public static boolean sipo(int t[][],int n,int i ,int j){
//                     // si possible de poser la regne dans i,j
//                     return  (t[i][j] == 0) ;
//       } 
//                 public static void action(int t[][],int n,int pi,int pj){
//                                 int i=pi,j=pj;
//      while(!is(t , n) && j<n )
//      {
//          System.out.println("i= "+i);
//           System.out.println("j= "+j);
//          if(sipo(t, n, i, j))
//          {
//              System.out.println("insertion dans la ligne : "+i);
//                remplir(t, n, i,j); 
//                i++;
//                j=-1;
//          }
//          j++;
//     if( ! (j<n) ){
//          System.out.println("n<=j");
//          afficher(t, n);
//         find(t, n, i-1);
//          j=0;
//         i--;
////          return;
//      }
//   }
//         if(is(t , n) ){
//                         System.out.println("is(t , n) = "+is(t , n));
//                         return;
//                     }
//                 }
//                 public static void find(int t[][],int n,int i){
//                     System.out.println("entry find");
//                                 afficher(t, n);
//              int j,k,pj;
//         for( pj=0,k=i;pj<n;pj++)  if(t[k][pj] == 1 ) { t[k][pj] = 0;break;}
//
//              for( j=0,k=i+1;j<n;j++)  {
//                  t[k][j] = 0;
//                   t[k-1][j] = 0;
//              }
//               complete(t, n, i-1);
//                   
//                         for( j=pj+1,k=i;j<n;j++) {
//                             if(sipo(t, n, k, j)) {
//                                 complete(t, n, i);
//                                 System.out.println("find");
//                                 afficher(t, n);
//                                 remplir(t, n, i, j);
//                                 return;
//                             }
//                             else 
//                             {
//                                 System.out.println("call find");
//                                 afficher(t, n);
//                                 if(i-1>=0)  find(t, n, i-1);
//                             }
//                         }      
//                 }
//                 public static void complete(int t[][],int n,int i){
//                     //complete la ligne de 0 par des 2
//                     if(i==0) return;
//                      for(int  j=0,k=i+1;j<n;j++)
//     {
//         if(k-1 >=0) if(t[k-1][j]==2) t[k][j] = 2;
//          if(j-1 >= 0 && k-1 >=0 ) if(t[k-1][j-1]==2)t[k][j] = 2;
//           if( k-1 >=0 && j+1<n ) if(t[k-1][j+1]==2) t[k][j] = 2;
//    }
//                 }
//       
       
   public static void main(String[]  arg ){
//   int n=4;
//   int[][] t= new int[n][n];
//       initialiser(t, n);
//       afficher(t, n);
//       
//       System.out.println("######################################");
//
//       action(t, n, 0,0);
//  
//         afficher(t, n);

        NQueens nq = new NQueens(8);
        nq.solve();
        nq.printSolution();
    }

}
