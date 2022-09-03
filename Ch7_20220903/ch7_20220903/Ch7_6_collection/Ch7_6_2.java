/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220903.Ch7_6_collection;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch7_6_2 {

    public static void main(String[] args) {
           ArrayList<Integer> list= new ArrayList(); 
           list.add(10);
           list.add(5);
           list.add(9);
           list.add(6);
           list.add(5);
           System.out.println(list);
           list.add(2, 20);
           System.out.println(list);
           ArrayList<Integer> insert= new ArrayList();
           insert.add(28);
           insert.add(26);
           insert.add(27);
           list.addAll(4, insert);
           System.out.println(list);
    }
    
}
