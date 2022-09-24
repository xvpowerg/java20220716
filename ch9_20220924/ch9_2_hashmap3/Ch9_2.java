/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220924.ch9_2_hashmap3;

import java.util.HashMap;
public class Ch9_2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap();
        map.put("Ken", 100);
        map.put("Lucy", 25);
        map.put("Vivin", 73);
        map.put("Iris", 46);
        //v1 舊數值
        //v2  新數值
        //merge key 存在更新
        map.merge("Ken", 25, (v1,v2)->{        
            int result = v1 + v2;
            System.out.println(v1+":"+v2);            
            return result;
        });
        
        //merge key 不存在新增
        map.merge("Jack", 500, (v1,v2)->{
            int result = v1 + v2;
            System.out.println(v1+":"+v2);
            return result;
        });
        System.out.println(map);
        
    }
    
}
