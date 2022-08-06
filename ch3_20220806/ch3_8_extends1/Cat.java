/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3_20220806.ch3_8_extends1;

/**
 *
 * @author xvpow
 */
public class Cat extends Animal {
    Cat(){        
    }
    Cat(String name,int age,float weight){
        super(name,age,weight);
    }
    
    public void printInfo(){
        System.out.print("Cat:");
        super.printInfo();
    }
}
