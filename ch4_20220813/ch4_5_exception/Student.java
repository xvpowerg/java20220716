/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20220813.ch4_5_exception;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void showNameLen(){
        if (this.name == null){
           // System.out.println("錯誤的name");
           throw new RuntimeException();
        }else{
            System.out.println(this.name.length());
        }
        
    }
}
