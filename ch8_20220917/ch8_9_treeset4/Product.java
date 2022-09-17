/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220917.ch8_9_treeset4;

/**
 *
 * @author xvpow
 */
public class Product {
    private String name;
    private int price1;
    private int price2;
    
    Product(String name,int price1,int price2){
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPrice1(){
        return this.price1;
    }
     public int getPrice2(){
        return this.price2;
    }
     
     public String toString(){
         return this.getName()+":"+this.getPrice1()+":"+this.getPrice2();
     }
}
