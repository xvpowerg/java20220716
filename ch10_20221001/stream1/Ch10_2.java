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
public class Ch10_2 {

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
           
//           boolean b1 =  list.stream().allMatch(p->p.length() > 2);
//           System.out.println(b1);
//           boolean b2 = list.stream().allMatch(p->p.length() > 3);
//           System.out.println(b2);
          
        //只要有一個條件是true就成立
//         boolean b2 = list.stream().anyMatch(s->s.length() > 4 );
//         System.out.println(b2);
//         boolean b3 = list.stream().anyMatch(s->s.length() < 1 );
//         System.out.println(b3);
        //只要沒有條件是true就成立
//           boolean b3 =  list.stream().noneMatch(s->s.length() > 10);
//           System.out.println(b3);           
//           boolean b4 = list.stream().noneMatch(s->s.length() > 3);
//           System.out.println(b4);
           //短路
//           list.stream().allMatch(p->{ //只要一個條件是false中斷
//               System.out.println(p);
//           return p.length() > 3;
//           });//只要一個條件是false中斷

         list.stream().anyMatch(p->{         
            System.out.println("any:"+p);
            return p.length() > 3;
         });//只要一個條件是true中斷
         
         list.stream().noneMatch(p->{
         System.out.println("noneMatch:"+p);
         return p.length() > 3;
         });//只要一個條件是true中斷
    }
    
}
