/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220924.ch9_7_hashmap7;
import java.util.ArrayList;
import java.util.HashMap;
public class Ch9_7 {

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
            
//            for (Student st : list){
//               int score =  st.getScore();
//               int key =  score/10;//取十位數
//               ArrayList<Student> stList = new ArrayList<>();
//                if (map.containsKey(key)){
//                    stList = map.get(key);                    
//                }
//                stList.add(st);                
//                map.put(key, stList);
//            }
            
            for (Student st : list){
               int score =  st.getScore();
               int key =  score/10;//取十位數
      
             
             map.computeIfPresent(key, (k,v)->{
                 v.add(st); 
                 return v;});
                   
               map.computeIfAbsent(key, (k)->{                 
                 ArrayList<Student> aList = new ArrayList<>();
                 aList.add(st);
                 return aList;
             });
            }
          
            System.out.println(map);
            
    }
    
}
