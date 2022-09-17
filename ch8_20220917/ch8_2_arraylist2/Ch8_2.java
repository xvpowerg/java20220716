/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220917.ch8_2_arraylist2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item it1 = new Item(10,"A1");
        Item it2 = new Item(20,"B2");
        Item it3 = new Item(65,"C3");
        Item it4 = new Item(5,"D4");
        Item it5 = new Item(15,"F5");
        //System.out.println(it1);
        ArrayList<Item> list = new ArrayList<>();
        list.add(it1);
        list.add(it2);
        list.add(it3);
        list.add(it4);
        list.add(it5);
        System.out.println(list);
        
        Item tmpItem = new Item(5,"D4");  
        System.out.println(tmpItem.equals(it4));
        int fIndex = list.indexOf(tmpItem);
        System.out.println(fIndex);
        
        list.remove(tmpItem);
        System.out.println("===============");
        System.out.println(list);
    }
    
}
