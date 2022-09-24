/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220924.ch9_9_hashmap9;
import java.util.TreeMap;
/**
 *
 * @author xvpow
 */
public class Ch9_9 {

   
    public static void main(String[] args) {
        //會排序key
        TreeMap<Integer,String> map = new TreeMap();
        map.put(25, "Ken");
        map.put(50, "Vivin");
        map.put(85, "Lindy");
        map.put(41, "Iris");
        map.put(74, "Tom");
        System.out.println(map);
    }
    
}

