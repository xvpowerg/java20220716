/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20220903.Ch7_4_methodref;

/**
 *
 * @author xvpow
 */
public class Item {
    private int price;
    private String name;
    public Item(){
        
    }
    public Item(String name){
        this.name = name;
    }
    public Item(String name,int price){
        this.name = name;
        this.price = price;
                
    }
    public String toString(){
        return this.price +":"+this.name;
    }
}
