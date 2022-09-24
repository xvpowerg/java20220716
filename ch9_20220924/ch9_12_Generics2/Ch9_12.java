/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220924.ch9_12_Generics2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch9_12 {

    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList();
      list.add("Ken");
      list.add("Vivin");
      list.add("Lindy");
        ShowList<ArrayList<String>,String> showList = new ShowList(list);
        showList.show(v->System.out.println(v));
        
        
      ArrayList<Integer> list2 = new ArrayList();
      list2.add(10);
      list2.add(20);
      list2.add(85);
      
        ShowList<ArrayList<Integer>,Integer> showList2 = new ShowList(list2);
        showList2.show(v->System.out.println(v));
    }
    
}
