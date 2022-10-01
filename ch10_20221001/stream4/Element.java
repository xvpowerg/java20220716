/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20221001.stream4;

/**
 *
 * @author xvpow
 */
public class Element {
    private String value; 
    private int count;
    public Element(String value,int count){
        this.value = value;
        this.count = count;
    }
    
    public String getValue(){
        return this.value;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public String toString(){
        return value+":"+count;
    }
    
}
