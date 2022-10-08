/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20221008.ch11_3_stream3;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int score;
    Student(String name,int score){
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
        return name+":"+score;
    }
}
