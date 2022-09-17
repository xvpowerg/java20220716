/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220917.ch8_1_arraylist1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch8_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();
     list.add(10);
     list.add(15);
     list.add(12);
     list.add(6);
     list.add(8);
     list.add(11);
     list.add(9);
     list.removeIf(v -> v%2 == 0);
     System.out.println(list);
     
     //list.replaceAll(v->v+2);
     list.replaceAll(v->{
         if (v >10) v+=2; 
             return v;});
     System.out.println(list);
     
     
    }
    
}
