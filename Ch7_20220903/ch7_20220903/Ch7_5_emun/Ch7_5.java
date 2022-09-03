/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220903.Ch7_5_emun;

/**
 *
 * @author xvpow
 */
public class Ch7_5 {
    //預設靜態的
    enum Fruit{
        APPLE,BANANA,CHERRY                   
    }
    
    public static void main(String[] args) {
       System.out.println(Fruit.APPLE);
       System.out.println(Fruit.CHERRY);
       
       System.out.println(Fruit.class);
       System.out.println(Fruit.APPLE.getClass());
       System.out.println(Fruit.APPLE.ordinal());
       System.out.println(Fruit.CHERRY.ordinal());
       
       Fruit f1 =   Fruit.valueOf("BANANA");
       System.out.println(f1);
       Fruit.valueOf("KIWI");
    }
    
}
