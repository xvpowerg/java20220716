/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220917.ch8_6_treeset1;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch8_6 {
    public static void main(String[] args){
        TreeSet<Integer> tSet = new TreeSet();
        tSet.add(8);
        tSet.add(2);
        tSet.add(7);
        tSet.add(5);
        tSet.add(3);
        System.out.println(tSet);
        
       System.out.println(tSet.first());
       System.out.println(tSet.last());
          //System.out.println();
        int v1 = tSet.floor(5);//? <= 5
        int v2 = tSet.lower(5);//? < 5
        System.out.println(v1+":"+v2);
                  
        v1 = tSet.ceiling(5);//? >= 5
        v2 = tSet.higher(5);//? > 5
        System.out.println(v1+":"+v2);

    }
}
