/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220820.ch5_5_abstract1;

/**
 *
 * @author xvpow
 */
public abstract class Animal {
    private String name;
    private int age;
    
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    //提醒開發人員複寫
    //抽象方法 不可私有的
    //抽象方法 不可final(表示不可複寫)
    //抽象類別 不可final(表示不可繼承)
    public abstract void bark();
    
    public String toString(){
        return name+":"+age;
    }
}
