/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220924.ch9_11_Generics1;

/**
 *
 * @author xvpow
 */
public class Ch9_11 {

    public static void main(String[] args) {
     MyList list = new MyList();
     list.add("Ken");
     list.add("Vivin");
     list.add("Lindy");
     list.add("Joy");
     list.add("Tom");
     list.foreach(v->System.out.println(v));
     
     MyList<Integer> list2 = new MyList<>();
     list2.add(10);
     list2.add(25);
     list2.add(12);
     list2.add(18);
     list2.foreach(v->System.out.println(v));
     
    }
    
}
