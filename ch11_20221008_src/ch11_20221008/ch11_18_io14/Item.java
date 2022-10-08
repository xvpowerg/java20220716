/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20221008.ch11_18_io14;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Item extends ItemBase implements Serializable {
    private int id;
    private String name;
    Item(){super(0);}
    Item(int id,String name,int price){
        super(price);
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return this.id+":"+this.name+":"+this.getPrice();
    }
    
}
