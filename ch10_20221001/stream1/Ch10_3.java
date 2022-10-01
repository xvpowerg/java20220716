/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221001.stream1;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           ArrayList<String> list = new ArrayList();         
           list.add("Vivin");
           list.add("Lindy");
            list.add("Ken");
           list.add("Joy");           
           list.add("Iris");
            list.add("Ken");
           list.add("Iris"); 
           list.add("Joy"); 
              
           
           list.stream().distinct().forEach(v->System.out.println(v));
           System.out.println("=======================");
            list.stream().limit(3).forEach(v->System.out.println(v));
            System.out.println("======================="); 
           list.stream().skip(3).forEach(v->System.out.println(v));
           
            
    }
    
}
