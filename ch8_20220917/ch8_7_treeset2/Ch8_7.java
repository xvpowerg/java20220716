/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220917.ch8_7_treeset2;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch8_7 {


    public static void main(String[] args) {
       Student st1 = new Student(71,"Ken");
       Student st2 = new Student(62,"Lucy");
       Student st3 = new Student(85,"Iris");       
       Student st4 = new Student(45,"Vivin");
       TreeSet<Student> set = new TreeSet();
       set.add(st1);
       set.add(st2);
       set.add(st3);
       set.add(st4);
       System.out.println(set);
        
        
        
    }
    
}
