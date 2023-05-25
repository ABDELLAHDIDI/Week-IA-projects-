/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cube_2;


/**
 *
 * @author ABDELLAH DIDI
 */
public class cube {
    char nom;
    int posx;
    int posy;

    public cube(char nom, int posx,int posy) {
        this.nom = nom;
        this.posx = posx;
             this.posy = posy;
    }

    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int pos) {
        this.posx = pos;
    }
      public int getPosy() {
        return posy;
    }

    public void setPosy(int pos) {
        this.posy = pos;
    }
       public void setPosxy(int posx,int posy) {
        this.posx = posx;
        this.posy = posy;
    }
    
public int existe(cube a){
    if(a.posx == posx && a.posy==posy) return -1;
    return 0;
}
    @Override
    public String toString() {
        return nom+""; 
    }

    @Override
    public boolean equals(Object obj) {
//        System.out.println("cube obj :  "
//                + "\n ((cube)obj).getPosx() : "+((cube)obj).getPosx()+
//                "\n((cube)obj).getPosy(): "+((cube)obj).getPosy()
//                +"\n((cube)obj).getNom(): "+((cube)obj).getNom()
//                +"\n cube : \n"
//                + "\n posx : "+posx+
//                "\n posy: "+posy
//                +"\n nom : "+nom+"\n"
//        );
        return (
                ( ((cube)obj).getPosx() == posx) 
                && (( ((cube)obj).getPosy() == posy))
                && ( ((cube)obj).getNom()== nom )
                
                ); 
    }
    
}
