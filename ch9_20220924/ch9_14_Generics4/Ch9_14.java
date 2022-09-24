/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220924.ch9_14_Generics4;
import static ch9_20220924.ch9_14_Generics4.Test1.getException;
/**
 *
 * @author xvpow
 */
public class Ch9_14 {
    public static void main(String[] args) {
        //自動判別類型
        int v = Test1.test(10);
        String s = Test1.test("Ken");
        System.out.println(v);
        System.out.println(s);
        int len = Test1.testFunc("ABCDE", 
                (s2)->s2.length());
        System.out.println(len);
   RuntimeException re = 
           getException(()->new RuntimeException("MyException"));
      throw  re;
      
    }
}

