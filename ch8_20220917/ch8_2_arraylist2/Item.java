/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220917.ch8_2_arraylist2;

/**
 *
 * @author xvpow
 */
public class Item {
    private int price;
    private String name;
    
    public Item(int price,String name){
        this.price = price;
        this.name = name;
    }
    
    public String toString(){
        return name+":"+price;
    }
    
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Item) ){
            return false;
        }
        Item tmp = (Item)obj;
        return this.price == tmp.price && 
                this.name.equals(tmp.name);
    }
    
}
