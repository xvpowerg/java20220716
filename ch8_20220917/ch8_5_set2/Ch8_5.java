/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220917.ch8_5_set2;
import java.util.HashSet;
public class Ch8_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Element e1 = new Element(1,"A1");
      Element e2 = new Element(2,"B2");
      Element e3 = new Element(3,"C3");
      Element e4 = new Element(2,"B2");
      System.out.println(e4.equals(e2));
      HashSet<Element> set = new HashSet();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
    System.out.println(set);
    }
    
}

