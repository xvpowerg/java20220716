/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220924.ch9_5_hashmap5;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch9_5 {
        public static void main(String[] args){
            Student st1 = new Student("Vivin",85);    
            Student st2 = new Student("Iris",72);    
            Student st3 = new Student("Ken",55);    
            Student st4 = new Student("Lindy",12);    
            Student st5 = new Student("joy",60);    
            Student st6 = new Student("Lindy",25);    
            Student st7 = new Student("Sean",53);    
            HashMap<Boolean,ArrayList<Student>> map = new  HashMap();
            map.put(Boolean.TRUE, new ArrayList<Student>());
            map.put(Boolean.FALSE, new ArrayList<Student>());
            
            ArrayList<Student> list = new ArrayList();   
            list.add(st1);
            list.add(st2);
            list.add(st3);
            list.add(st4);
            list.add(st5);
            list.add(st6);
            list.add(st7);

            for (Student st : list){
                if (st.getScore() >= 60){
                    map.get(Boolean.TRUE).add(st);
                }else{
                    map.get(Boolean.FALSE).add(st);
                }                
            }
            
            System.out.println(map);
            
        }
}

