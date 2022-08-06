/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3_20220806.ch3_6_oo3;

/**
 *
 * @author xvpow
 */
public class Employee {
    private String name;
    private int age;
    
    //預設會給一組無參數的建構式
    Employee(){
        //this.name = "未填寫";
        this("未填寫",0);//呼叫目前類別的其他建構式
        System.out.println("Employee()!!");
    }
    Employee(String name,int age){
       System.out.println("Employee(String int)!!");  
        this.name = name;
        this.age = age;        
    }
    //this. 表示當前物件
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    
    public void printInfo(){
        System.out.println(name+":"+age);
    }
}
