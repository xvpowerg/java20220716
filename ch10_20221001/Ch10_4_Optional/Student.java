/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20221001.Ch10_4_Optional;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Student {       
       private String name;
       private int  age;
       
       public Student(String name,int age){
           this.name = name;
           this.age = age;
       }
       
       public Optional<String> getName(){
          Optional<String> op = Optional.
                            ofNullable(name);
           return op;
       }
       
       public int getAge(){
           return age;
       }
       
       public String toString(){
           return this.name +":"+this.age;
       }
}
