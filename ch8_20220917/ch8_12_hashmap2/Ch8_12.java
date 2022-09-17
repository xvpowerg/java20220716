/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220917.ch8_12_hashmap2;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch8_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap();
       map.put("Ken", 72);
       map.put("Vivin", 82);
       map.put("Lucy", 65);
       map.put("Joy", 92);
       System.out.println(map.containsKey("Vivin"));  
        System.out.println(map.containsKey("Iris"));  
        System.out.println("==================");
        map.forEach((k,v)->System.out.println(k+":"+v));
        System.out.println("==================");
        int s1 = map.getOrDefault("Vivin", -1);
        System.out.println(s1);
        s1 = map.getOrDefault("Iris", -1);
        System.out.println(s1);
        System.out.println("==================");
        
        if (!map.containsKey("Lucy")){
            map.put("Lucy", 86);
        }
        
        System.out.println(map);
        
        map.putIfAbsent("Lucy", 88);
        System.out.println(map);
        map.putIfAbsent("Iris", 88);
        System.out.println(map);
    }
    
}
