/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220917.ch8_4_set1;
import java.util.HashSet;
public class Ch8_4 {
        public static void main(String[] args){            
           //Set 內容不可重複
           //Set 取出時的順不是放入的順序
           HashSet<String> set = new HashSet();
           set.add("G");
           set.add("B");
           set.add("C");
           set.add("X");
           set.add("G");
           set.add("B"); 
           System.out.println(set);
           
           
        }
}
