/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221001.stream3;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch10_10 {

    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList();         
           list.add("Vivin");
           list.add("Lindy");
           list.add("Ken");
           list.add("Joy");           
           list.add("Iris");
      List<String> strList = list.stream().filter(s->s.length() > 3).
                        collect(Collectors.toList());
        System.out.println(strList);
       ArrayList<String> arrList = list.stream().filter(s->s.length() > 3).
                collect(Collectors.toCollection(ArrayList::new));
       System.out.println(arrList);
       
         TreeSet<String> tSet = list.stream().filter(s->s.length() > 3).
                collect(Collectors.toCollection(TreeSet::new));
       System.out.println(tSet);  
    }
    
}
