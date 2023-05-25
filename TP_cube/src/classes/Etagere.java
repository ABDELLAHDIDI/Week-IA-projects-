/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Etagere {
    int name;
    ArrayList<Cube> list_cube;

    public Etagere(int n) {
        name=n;
        list_cube=new ArrayList<Cube>(); 
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public ArrayList<Cube> getList_cube() {
        return list_cube;
    }

    public void setList_cube(ArrayList<Cube> list_cube) {
        this.list_cube = list_cube;
    }
    
    
    public boolean equal(Etagere e){
        int size=list_cube.size();
        if(size!=e.list_cube.size())return false;
        for(int i=0 ;i<size;i++){
            Cube c=e.list_cube.get(i);
            if(list_cube.get(i).equal(c)==false)return false;
            
        }
        return true;
    }
}
