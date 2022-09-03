/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tw.com.m1.beans2;

/**
 *
 * @author xvpow
 */
public class Car {
    private int door;
    private String company;
    public Car(){        
    }
    
    public Car(int door,String company){
        this.door = door;
        this.company = company;
    }
    public String getCompany(){
        return this.company;
    }
    public int getDoor(){
        return this.door;
    }
    
    public String toString(){
        return this.getCompany()+":"+this.getDoor();
    }
}
