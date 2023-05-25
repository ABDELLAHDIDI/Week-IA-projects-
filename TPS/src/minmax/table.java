/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minmax;

/**
 *
 * @author ABDELLAH DIDI
 */
public class table {
    String t[][];
String joueur="X";

    public String getJoueur() {
        return joueur;
    }

    public void setJoueur(String joueur) {
        this.joueur = joueur;
    }
    public void setT(int i,int j,String a) {
        t[i][j]=a;
    }

    public String getT(int i,int j) {
        return t[i][j];
    }
    public table() {
        int k=0;
        t=new String [3][3];
         for(int i=0;i<3;i++)
             for(int j=0;j<3;j++,k++)
                            t[i][j]=k+"";
    }
        public table(String tab[][]) {
        int k=0;
        t=new String [3][3];
         for(int i=0;i<3;i++)
             for(int j=0;j<3;j++)
                            t[i][j]=tab[i][j];
    }
    public void initialer(){
         for(int i=0;i<3;i++)
             for(int j=0;j<3;j++)
                            t[i][j]=" ";
    }
    public void afficher(){
        for(int i=0;i<3;i++)
        {
             for(int j=0;j<3;j++)
                             System.out.print(t[i][j]+"|");
             System.out.println("\n");
             for(int j=0;j<3;j++)
                             System.out.print("_ ");
               System.out.println("\n");
             
        }
    }
    public boolean  isfin(){
          for(int i=0;i<3;i++)
             for(int j=0;j<3;j++)
                           if(t[i][j] != "O" && t[i][j] != "X" ) return false;
          return true;
    }
    public boolean isMaxWin(){
        int c=0;
         for(int i=0;i<3;i++){
                  c=0;
             for(int j=0;j<3;j++)
                   if(t[i][j] == "X" )  c++;
             if(c==3) return true;
             }
          for(int i=0;i<3;i++){
                   c=0;
             for(int j=0;j<3;j++)
                           if(t[j][i] == "X" )   c++;
             if(c==3) return true;}
        int i=1,j=1;
        if(t[i][j] == "X" ){
             if(t[i-1][j-1] == "X" && t[i+1][j+1] == "X" ) return true;
                  if(t[i-1][j+1] == "X" && t[i+1][j-1] == "X" ) return true;
        }
         
      return false;    
    }
     public boolean isMinWin(){
        int c=0;
         for(int i=0;i<3;i++){
                  c=0;
             for(int j=0;j<3;j++)
                   if(t[i][j] == "O" )  c++;
             if(c==3) return true;
             }
          for(int i=0;i<3;i++){
                   c=0;
             for(int j=0;j<3;j++)
                           if(t[j][i] == "O" )   c++;
             if(c==3) return true;}
        int i=1,j=1;
        if(t[i][j] == "O" ){
             if(t[i-1][j-1] == "O" && t[i+1][j+1] == "O" ) return true;
                  if(t[i-1][j+1] == "O" && t[i+1][j-1] == "O" ) return true;
        }
         
      return false;    
    }
    public boolean entrer(int x,String y){
        int i,j;
     switch (x) {
         case 0:
             i=0;
             j=0;
             break;
         case 1:
             i=0;
             j=1;
             break;
         case 2:
             i=0;
             j=2;
             break;
         case 3:
             i=1;
             j=0;
             break;
         case 4:
             i=1;
             j=1;
             break;
         case 5:
             i=1;
             j=2;
             break;
         case 6:
             i=2;
             j=0;
             break;
         case 7:
             i=2;
             j=1;
             break;
         case 8:
             i=2;
             j=2;
             break;
         default:
             return false;
     }
        if(t[i][j] != "O" && t[i][j] != "X"  )
        {t[i][j]=y;
          return true;}
        return false;
    }
  
    public int calcule (String x){
            int c,som=0;
         for(int i=0;i<3;i++){
             c=0;
             for(int j=0;j<3;j++)
                   if(t[i][j] == " " || t[i][j] == x)  c++;
             if(c==3) som++;
             }
          for(int i=0;i<3;i++){
              c=0;
             for(int j=0;j<3;j++)
                           if(t[j][i] == " " || t[j][i] == x )   c++;
             if(c==3) som++;
          }
        int i=1,j=1;
        if(t[i][j] == x || t[i][j] == " " ){
             if((t[i-1][j-1] == x  || t[i-1][j-1] == " " )
                     &&
                    ( t[i+1][j+1] == x ||  t[i+1][j+1] == " ") )  som++;
             
                  if((t[i-1][j+1] == x || t[i-1][j+1] == " ")
                          &&
                          t[i+1][j-1] == " " || t[i+1][j-1] == x )  som++;
        }
         
        return som; 
    }

    @Override
    public boolean equals(Object obj) {
for(int i =0;i<3;i++)
    for(int j=0;j<3;j++)
        if(getT(i,j) != ((table)obj).getT(i,j)) return false;
return true;
    }
}
