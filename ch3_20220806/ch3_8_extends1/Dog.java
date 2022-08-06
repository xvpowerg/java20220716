/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3_20220806.ch3_8_extends1;

/**
 *
 * @author xvpow
 */
public class Dog extends Animal{
    //建構式不會被繼承
   Dog(){}
   Dog(String name,int age,float weight){
       super(name,age,weight);//呼叫父類別的建構式
   }
   public void printInfo(){
       System.out.print("Dog:");
       super.printInfo();//呼叫父類別的某個方法或屬性
   }
}
