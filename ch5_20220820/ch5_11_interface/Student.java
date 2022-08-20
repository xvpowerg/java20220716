/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220820.ch5_11_interface;

/**
 *
 * @author xvpow
 */
public class Student implements MyIterator{
    private String name;
    private int age;
    private String phone;
    private String[] stInfo = new String[3];
    Student(String name,int age,String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
        stInfo[0] = "name:"+name;
        stInfo[1] = " age:"+age;
        stInfo[2] = " phone:"+phone;
    }
    public String[] getData(){
        return stInfo;
    }
}
