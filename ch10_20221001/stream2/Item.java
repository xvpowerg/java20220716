/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20221001.stream2;

import java.util.ArrayList;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    private ArrayList<String> locations;
    public Item(String name,int price){
        this.name = name;
        this.price = price;
        locations = new ArrayList<>();
    }
    
    public void appendLocation(String loca){
        locations.add(loca);
    }
    
    public  Stream<String> locationStream(){
        return locations.stream();
    }
    
    public ArrayList<String>  getLocations(){
        return this.locations;
    }
    
    public String toString(){
        return this.name +":"+this.price;
    }
}
