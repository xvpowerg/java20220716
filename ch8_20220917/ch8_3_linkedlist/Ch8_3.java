/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220917.ch8_3_linkedlist;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class Ch8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        LinkedList<String> list = new LinkedList();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Joy");
        list.add("Iris");
        list.forEach(v->System.out.println(v));
        
        System.out.println("peek:"+list.peek());
        System.out.println(list);
        System.out.println("poll:"+list.poll());
        System.out.println(list);
        
        
    }
    
}
