/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch1_20220716;

/**
 *
 * @author xvpow
 */
public class Ch1_12 {
     public static void main(String[] args) {
         System.out.println("字串比較");
         String v1 = "Ken";
         String v2 = "Ken";
         System.out.println("v1:"+v1+" "+"v2:"+v2);
         //==比數值
         System.out.println(v1 == v2);
         
         String v3 = new String("Ken");
        System.out.println("v1:"+v1+" "+"v3:"+v3);
         System.out.println(v1 == v3);
         //內容 只有參考型態才有
        System.out.println(v3.equals(v1));
         
         
     }
}
