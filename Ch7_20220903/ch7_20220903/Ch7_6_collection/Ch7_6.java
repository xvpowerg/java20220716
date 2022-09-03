/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220903.Ch7_6_collection;
import java.util.ArrayList;

public class Ch7_6 {
    public static void main(String[] args) {
     ArrayList<String> list = new ArrayList();
        list.add("Ken");
        list.add("Howard");        
        list.add("Lucy");        
        list.add("Iris");        
        for(int i = 0; i < list.size();i++){
            System.out.println(i+":"+list.get(i));        
        }
        System.out.println("===================");
        for (String v : list){
            System.out.println(v);
        }
        System.out.println("===================");
        list.forEach(System.out::println);
    }
    
}

