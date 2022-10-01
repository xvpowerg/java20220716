/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221001.stream2;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch10_7 {
    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList();         
           list.add("Vivin");
           list.add("Lindy");
           list.add("Ken");
           list.add("Joy");           
           list.add("Iris");
           int sum = list.stream().mapToInt(s->s.length()).sum();
           System.out.println(sum);
           
    }
    
}
