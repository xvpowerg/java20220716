/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221001.stream2;

import java.util.ArrayList;
import java.util.stream.Stream;
public class Ch10_6 {

    public static void main(String[] args) {
           ArrayList<String> list = new ArrayList();         
           list.add("Vivin");
           list.add("Lindy");
           list.add("Ken");
           list.add("Joy");           
           list.add("Iris");
           
           Stream<Integer> st1 = list.stream().map(s->s.length());
           st1.forEach(v->System.out.println(v));
           
             ArrayList<String> list2 = new ArrayList();         
             list2.add("Item1:100");
             list2.add("Item2:55");
             list2.add("Item3:72");
             list2.add("Item4:93");
             list2.add("Item5:61");
             
           list2.stream().map(s->{
              String[] info =  s.split(":");
               Item tmp = new Item(info[0],
                       Integer.parseInt(info[1]));
               return tmp;
           }).forEach(item->{           
                System.out.println(item);
           });
    }
    
}
