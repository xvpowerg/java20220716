/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220924.ch9_10_hashmap10;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    private int location;
    
    public Item( String name,int price, int location){
        this.name = name;
        this.price = price;
        this.location = location;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public int getLoaction(){
        return this.location;
    }
    public String toString(){
        return this.name +":"+this.price+":"+this.location;
    }
    
}
