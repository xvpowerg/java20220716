/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220827.Ch6_12_innerclass;

/**
 *
 * @author xvpow
 */
public class Ch6_12 {
    
    static class MyDog extends Dog{
        public void bark(){
            System.out.println("喵喵");
        }
    }
    
    public static void main(String[] args) {
      Dog dog1 = new Dog();
        dog1.bark();
     Dog dog2 = new MyDog();
     dog2.bark();//喵喵
     
     Dog dog3 = new Dog(){
         public void bark(){
             System.out.println("支支!!");
         }     
     };
     
     dog3.bark();
    }
    
}
