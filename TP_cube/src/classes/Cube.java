/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;


public class Cube {
    int name;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Cube(int n) {
        this.name = n;
    }


    public boolean equal(Cube c){
        if(this.name==c.name)return true;
        return false;
    }
    
    

    
    
    
    
    
}
