/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tw.com.m1.beans;

/**
 *
 * @author xvpow
 */
public class Teacher {
    private String id;
    private int type;
    public Teacher(){
        
    }
    public Teacher(String id,int type){
        this.id  = id;
        this.type = type;
    }
    
    public String getId(){
        return this.id;
    }
    public int getType(){
        return this.type;
    }
    
    public String toString(){
       return this.getId()+":"+this.getType();
    }
}
