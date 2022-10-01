/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221001.stream4;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch10_11 {

    public static void main(String[] args) {
      Element e1 = new Element("A1",21);
      Element e2 = new Element("B2",30);
      Element e3 = new Element("C3",65);
      Element e4 = new Element("D4",55);
      Element e5 = new Element("E5",86);
      Element e6 = new Element("F6",65);
     ArrayList<Element> list = new ArrayList();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        //重複key會錯誤
//   Map<Integer,String> eMap = list.stream().collect(Collectors.toMap((e)->e.getCount(),
//                                               e->e.getValue()));
//  Map<Integer,String> eMap2 =  list.stream().
//           collect(Collectors.toMap(e->e.getCount(), e->e.getValue(), (v1,v2)->{
//                  System.out.println(v1+":"+v2);
//               return v1+" " + v2;
//           }));
//  System.out.println(eMap2);

  TreeMap<Integer,String> eMap3 =  list.stream().
           collect(Collectors.toMap(e->e.getCount(), e->e.getValue(), (v1,v2)->{
                  System.out.println(v1+":"+v2);
               return v1+" " + v2;
           },TreeMap::new));
  System.out.println(eMap3);

    }
    
}
