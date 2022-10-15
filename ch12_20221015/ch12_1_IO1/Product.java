/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20221015.ch12_1_IO1;

import java.io.Serializable;

/**
 *
 * @author xvpow
 */
public class Product implements Serializable {
    private int id;
    private String name;
    private transient Location location;
   //  private  Location location;
    public Product(int id,String name){
        this.id = id;
        this.name = name;
        this.location = new Location();
    }

    public String getName(){
        return this.name;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setLocationCity(String city){
        this.location.setCity(city);
    }
    
    public void setLocationAddr(String city){
        this.location.setAddr(city);
    }
    public String toString(){
        return this.getId()+":"+this.getName()+":"+this.location;
    }
}
