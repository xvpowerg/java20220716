/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220917.ch8_7_treeset2;

/**
 *
 * @author xvpow
 */
public class Student implements Comparable<Student> {
    private int score1;
    private String name;
    Student(int score1,String name){
        this.score1 = score1;
        this.name = name;
    }
    
    public String toString(){
        return this.score1 +":"+this.name;
    }
    //當前物件大於傳入物件回傳正數
    //當前物件小於傳入物件回傳負數
    //當前物件等於傳入物件回傳0
    public int compareTo(Student st){
        if (this.score1 >  st.score1){
            return 1;
        }else if(this.score1 < st.score1){
            return -1;
        }
        return 0;
    }
}
