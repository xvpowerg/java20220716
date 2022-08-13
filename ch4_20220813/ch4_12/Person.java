/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20220813.ch4_12;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;                
    }
    public String toString(){
        return name+":"+age;
    }
    
    public boolean equals(Object b1){
        if (b1 == null || !(b1 instanceof Person) ){
            return false;
        }
        Person p = (Person)b1;
        return this.age == p.age &&
                this.name.equals(p.name);
    }
}
