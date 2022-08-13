/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20220813.ch4_11_equals;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int id;
    Student(String name,int id){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return name+":"+id;
    }
    
    public boolean equals(Object obj){
        if (obj == null || ! (obj instanceof Student)){
            return false;
        }
        Student st1 = (Student)obj;
        
     return st1.id == this.id && 
             st1.name.equals(this.name);   
    }
}
