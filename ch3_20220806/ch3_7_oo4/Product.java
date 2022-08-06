/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3_20220806.ch3_7_oo4;

/**
 *
 * @author xvpow
 */
public class Product {
    private String name;
    private int price;
    Product(){ 
          this("空白",100);
    }
    Product(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
    
    public void printInfo(){
        System.out.println(
                this.getName()+":"+this.getPrice());
    }
}
