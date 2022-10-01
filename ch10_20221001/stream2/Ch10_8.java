/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221001.stream2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch10_8 {

    public static void main(String[] args) {
       ArrayList<Item> list = new ArrayList();
       Item i1 = new Item("A1",100);
       Item i2 = new Item("B2",55);
       Item i3 = new Item("C6",88);
       
        i1.appendLocation("台北");
        i1.appendLocation("高雄");

        System.out.println("==========================");
              
        i2.appendLocation("屏東");
        i2.appendLocation("高雄");
        i2.appendLocation("新竹");
        
        i3.appendLocation("嘉義");
        i3.appendLocation("桃園");
        i3.appendLocation("彰化");
        i3.appendLocation("台北");
        list.add(i1);
        list.add(i2);
        list.add(i3);
       
//        list.stream().map(it->it.locationStream()).
//                forEach(stm->stm.forEach(p->System.out.println(p)));
//flatMap 會展開Stream
         list.stream().flatMap(it->it.locationStream()).distinct().
                 forEach(c->System.out.println(c));
               
       
    }
    
}
