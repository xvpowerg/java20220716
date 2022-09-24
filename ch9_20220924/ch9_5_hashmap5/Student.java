/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220924.ch9_5_hashmap5;
public class Student {
    private String name;
    private int score;
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }
    
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
    
    public String toString(){
        return this.getName()+":"+this.getScore();
    }
    
}
