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
public class Location  implements Serializable{
    private String city;
    private String addr;
    
     Location(){
        this("","");
    } 
    Location(String city,String addr){
        this.city = city;
        this.addr = addr;
    } 
    
    public void setCity(String city){
            this.city = city;
    }
    public void setAddr(String addr){
        this.addr = addr;
    }
    public String toString(){
        return this.city +":"+this.addr;
    }
}
