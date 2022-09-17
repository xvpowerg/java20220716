/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220917.ch8_1_arraylist1;
import java.util.ArrayList;
public class Ch8_1 {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(10);
      list.add(2);
      list.add(8);
      list.add(6);        
      list.add(7);
        
      System.out.println(list);
      System.out.println("=====================");
      Integer intObj= 8;
        //list.remove(8);   
      list.remove(intObj);      
      System.out.println("=====================");
      System.out.println(list);
      
      ArrayList<Integer> delList = new ArrayList<>();
      delList.add(2);
      delList.add(6);
      list.removeAll(delList);
      System.out.println(list);
      
      
    }
    
}

