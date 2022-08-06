/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3_20220806.ch3_3_oo1;

/**
 *
 * @author xvpow
 */
public class Animal {
    String name;
    int age;
    byte sex;
    float height;
   static String testSex(int sex){
        return sex == 0 ?"女":"男";
    }

    void printInfo(){
      System.out.println(name+":"+age+":"+height+":"+testSex(sex));
    }
}
