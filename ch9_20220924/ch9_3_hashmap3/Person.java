/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220924.ch9_3_hashmap3;
/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int order;
    public Person( String name,int order){
        this.name = name;
        this.order = order;
    }
    public String getName(){
        return this.name;
    }
    
    public int getOrder(){
        return this.order;
    }
    public String toString(){
        return this.name+":"+this.order;
    }
}
