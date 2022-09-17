/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220917.ch8_8_treeset3;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch8_8 {
//左大右回傳正
 //左小右回傳負
 //左等右回傳0  
   private static class MyProductComp implements Comparator<Product>{
       public int compare(Product p1,Product p2){
           if (p1.getPrice1() > p2.getPrice1()){
               return 1;
           }else if(p1.getPrice1() < p2.getPrice1()){
               return -1;
           }else if(p1.getPrice2() > p2.getPrice2()){
               return 1;           
           }else if(p1.getPrice2() < p2.getPrice2()){
               return -1;           
           }else{
               return p1.getName().compareTo(p2.getName());
           }
       }
   } 
   
    public static void main(String[] args) {
            Product p1 = new Product("A1",25,36);
            Product p2 = new Product("B2",37,15);
            Product p3 = new Product("C3",25,31);
            Product p4 = new Product("D4",37,18);
            Product p5 = new Product("E5",25,36);
            
            MyProductComp comp = new MyProductComp();
            TreeSet<Product>set = new TreeSet(comp);
            set.add(p1);
            set.add(p2);
            set.add(p3);
            set.add(p4);
            set.add(p5);
            
            System.out.println(set);
            
            
    }
    
}
