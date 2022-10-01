/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221001.stream4;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch10_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Element e1 = new Element("A1",21);
      Element e2 = new Element("B2",20);
      Element e3 = new Element("C3",65);
      Element e4 = new Element("D4",55);
      Element e5 = new Element("E5",86);
      Element e6 = new Element("F6",65);
      Element e7 = new Element("G7",56);
      Element e8 = new Element("H8",83);
     ArrayList<Element> list = new ArrayList();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        
    Map<Integer,List<Element>>   eMap = list.stream().collect(
            Collectors.groupingBy(e->e.getCount()/10 * 10 ));
    System.out.println(eMap);
        
    }
    
}
