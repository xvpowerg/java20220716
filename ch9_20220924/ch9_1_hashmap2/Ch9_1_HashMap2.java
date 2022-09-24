/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220924.ch9_1_hashmap2;
import java.util.HashMap;
import java.util.ArrayList;

public class Ch9_1_HashMap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap();
        map.put("Ken", 100);
        map.put("Lucy", 25);
        map.put("Vivin", 73);
        map.put("Iris", 46);
        
        ArrayList<Person> pList = new ArrayList<>();
        Person p1 = new Person("Ken",20);
        Person p2 = new Person("Vivin",86);
        Person p3 = new Person("Lucy",125);
        Person p4 = new Person("Jack",500);
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        pList.add(p4);
        
        for (Person p : pList){
            //System.out.println(p);
            String key = p.getName();
            int orderCount = 0;
            if (map.containsKey(key)){
               orderCount =  map.get(key);
            }
            orderCount += p.getOrder();
            map.put(key, orderCount);
        }
        System.out.println(map);
        
        
        
    }
    
}
