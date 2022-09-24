/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220924.ch9_4_hashmap4;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap();
        map.put("Ken", 100);
        map.put("Lucy", 25);
        map.put("Vivin", 73);
        map.put("Iris", 46);
        //假設key存在 compute 的變化 會執行方法函數
        map.compute("Ken", (key,value)->{
            System.out.println(key+":"+value);
            return value + 5;
        });
         //假設key存在 computeIfAbsent 的變化 不會執行方法函數
         //不會反映
        map.computeIfAbsent("Lucy", (v)->{
            System.out.println("computeIfAbsent:"+v);
            return 100;
        });
        //假設key存在 computeIfPresent 的變化 會執行方法函數
        map.computeIfPresent("Vivin", (v1,v2)->{
            System.out.println("computeIfPresent:"+v1+":"+v2);
            return v2 + 10;
        });
        System.out.println(map);
        System.out.println("======================");
        
       //假設key不存在 compute 的變化 會執行方法函數 value是null
        map.compute("Lindy", (key,value)->{
            System.out.println(key+":"+value);
            //return value+5;
            return 5;
        });
         //假設key不存在 computeIfAbsent 的變化 會執行
         //不會反映
        map.computeIfAbsent("Ben", (v)->{
            System.out.println("computeIfAbsent:"+v);
            return 170;
        });
        //假設key不存在 computeIfPresent 的變化 不會執行
        map.computeIfPresent("Gigi", (v1,v2)->{
            System.out.println("computeIfPresent:"+v1+":"+v2);
            return v2 + 10;
        });
           System.out.println(map);
    }
    
}
