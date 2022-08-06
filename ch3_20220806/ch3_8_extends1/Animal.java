/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3_20220806.ch3_8_extends1;
public class Animal {
    private String name;
    private int age;
    private float weight;
   Animal(){} 
   Animal(String name,int age,float weight){
       this.name = name;
       this.age = age;
       this.weight = weight;
   }
   public void setName(String name){
       this.name = name;
   }
   public String getName(){
       return this.name;
   }
   public void setAge(int age){
       this.age = age;
   }
   public int getAge(){
       return age;
   }   
   public void setWeight(float weight){
       this.weight = weight;              
   }
   public float getWeight(){
       return this.weight;
   }
   public void printInfo(){
       System.out.println(this.getName()+":"+this.getAge()+":"+this.getWeight());
   }
}
