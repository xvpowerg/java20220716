/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220903.Ch7_4_methodref;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiFunction;
/**
 *
 * @author xvpow
 */
public class Ch7_4 {
    static void testS1(Supplier<Item> s){
       Item i1 =  s.get();
       System.out.println(i1);
    }
    static void testFunc2(String name,Function<String,Item> func){
        Item it2 =  func.apply(name);
        System.out.println(it2);
    }
    static void testFunc3(String name,int price,BiFunction<String,Integer,Item> func){
         Item it3 =  func.apply(name, price);
         System.out.println(it3);
    }
    
    public static void main(String[] args) {
        Item it1 = new Item();
        Item it2 = new Item("A1");
        Item it3 = new Item("B2",50);
        System.out.println(it1+":"+it2+":"+it3);
        
        testS1(Item::new);
        testFunc2("A1",Item::new);
        testFunc3("B2",50,Item::new);
    }
    
}
