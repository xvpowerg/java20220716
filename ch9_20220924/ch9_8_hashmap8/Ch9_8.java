/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220924.ch9_8_hashmap8;

import ch9_20220924.ch9_7_hashmap7.Student;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch9_8 {
      public static void main(String[] args) {
            Student st1 = new Student("Vivin",85);    
            Student st2 = new Student("Iris",72);    
            Student st3 = new Student("Ken",55);    
            Student st4 = new Student("Lindy",90);    
            Student st5 = new Student("joy",75);    
            Student st6 = new Student("Lindy",25);    
            Student st7 = new Student("Sean",53);    
            Student st8 = new Student("Tom",82);    
            HashMap<Integer,ArrayList<Student>> map = new HashMap<>();
            ArrayList<Student> list = new ArrayList();   
            list.add(st1);
            list.add(st2);
            list.add(st3);
            list.add(st4);
            list.add(st5);
            list.add(st6);
            list.add(st7);
            list.add(st8);
            
            for (Student st : list){
                int score = st.getScore();
                int key = score / 10;
                ArrayList<Student> tmpList = new ArrayList();
                tmpList.add(st);
                map.merge(key, tmpList, (v1,v2)->{
                     v1.addAll(v2);
                     return v1;
                });
            }
            System.out.println(map);
      }
}
