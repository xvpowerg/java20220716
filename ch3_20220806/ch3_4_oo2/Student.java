/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3_20220806.ch3_4_oo2;

/**
 *
 * @author xvpow
 */
public class Student {
    //name 字串
    //age 整數    
    //score 整數
    String name;
    private int age;//5~200 如果不正確出現錯誤的年齡
    private int score;
    
    void printInfo(){
        //希望在printInfo使用 getScore()
        System.out.println(name+":"+getAge()+":"+getScore());
    }
     public void setAge(int inAge){
         if (inAge < 5 || inAge > 200){
             System.out.println("錯誤的年齡");
             return;
         }
        age = inAge;
     }
     public int getAge(){
         return age;
     }
    public void setScore(int inScore){
        if(inScore < 0 || inScore > 100){
            System.out.println("錯誤的成績");
            return;
        }
        
        score = inScore;
    }
    public int getScore(){
        return score ;
    }
    
}
