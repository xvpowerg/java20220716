/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220806.ch3_4_oo2;

/**
 *
 * @author xvpow
 */
public class Ch3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student st1 = new  Student();
      st1.name = "Lucy";
      //st1.score = 65;
      st1.setScore(65);
      //st1.age = 16;
      st1.setAge(16);
      st1.printInfo();
     
      Student st2 = new  Student();
      st2.name = "Ken";
      //st2.score = -90000;
      st2.setScore( -90000);
      st2.setAge(-8000);
      //st2.age = -8000;
      st2.printInfo();
    }
    
}
