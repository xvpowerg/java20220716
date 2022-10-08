/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20221008.ch11_1_stream1;

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
