/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221001.stream2;

import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch10_9 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(50);
        list.add(80);
        list.add(70);        
        list.add(91);        
        list.add(82);        
        
    Optional<Integer> op1  =  list.stream().reduce((v1,v2)->{
            System.out.println(v1+":"+v2);
        return v1+v2;
        });
    System.out.println(op1.get());
    System.out.println("====================================");
    int v = list.stream().reduce(2, (v1,v2)->{
        System.out.println(v1+":"+v2);
        return v1+v2;
        });
    System.out.println(v);
    
  int vx =  list.stream().parallel().reduce(5, (v1,v2)->{
                    System.out.println("acc:"+v1+":"+v2);
            return v1+v2;
            }, 
            (v1,v2)->{
                 System.out.println("mag:"+v1+":"+v2);
           return v1+v2;
            });
  
    System.out.println(vx);
    }
    
}

