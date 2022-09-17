/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220917.ch8_11_hashmap1;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
/**
 *
 * @author xvpow
 */
public class Ch8_11 {
    public static void main(String[] args) {
        //Key Value
       HashMap<String,Integer> map = new HashMap();
       map.put("Ken", 72);
       map.put("Vivin", 82);
       map.put("Lucy", 65);
       map.put("Joy", 92);
       map.put("Lucy", 88);//重複取代
       
       for (String k : map.keySet()){
           System.out.println(k+":"+map.get(k));
       }
       System.out.println(map.get("Iris"));//key不在回傳null
        
       System.out.println("=============================");
       Set<Entry<String,Integer>> entrySet =  map.entrySet();
       for (Entry entry : entrySet){
           System.out.println(entry.getKey()+":"+entry.getValue());
       }
    }
    
}
