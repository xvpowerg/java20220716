/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220924.ch9_10_hashmap10;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
/**
 *
 * @author xvpow
 */
public class Ch9_10 {
    
    public static void main(String[] args) {
        Comparator<Item> cmp =  Comparator.comparing(v->v.getPrice());
        cmp = cmp.thenComparing(v->v.getName()).thenComparing(v->v.getLoaction());
        TreeMap<Item,Integer> itemMap = new TreeMap(cmp);
        ArrayList<Integer> countList = new ArrayList();
        countList.add(8);
        countList.add(10);
        countList.add(5);
        countList.add(6);
        countList.add(23);
        countList.add(15);
        countList.add(4);
        
        ArrayList<Item> list = new ArrayList();
        Item i1 = new Item("A",100,1);
        Item i2 = new Item("B",100,1);
        Item i3 = new Item("C",95,2);
        Item i4 = new Item("D",88,3);
        Item i5 = new Item("E",75,2);
        Item i6 = new Item("F",88,2);
        Item i7 = new Item("F",88,3);
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        list.add(i6);
        list.add(i7);
        
        for(int i = 0;i < list.size();i++){
            Item item = list.get(i);
            int count = countList.get(i);
            itemMap.put(item, count);            
        }
        
        System.out.println(itemMap);
    }
}

