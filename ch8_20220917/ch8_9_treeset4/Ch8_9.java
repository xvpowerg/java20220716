/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220917.ch8_9_treeset4;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author xvpow
 */
public class Ch8_9 {
//左大右回傳正
 //左小右回傳負
 //左等右回傳0  
   private static class MyProductComp implements Comparator<Product>{
       private int action =  0;
       MyProductComp(int action){
           this.action = action;
       }
       public int compare(Product p1,Product p2){
           int result = 0;
           if (p1.getPrice1() > p2.getPrice1()){
               result = 1;
           }else if(p1.getPrice1() < p2.getPrice1()){
               result = -1;
           }else if(p1.getPrice2() > p2.getPrice2()){
               result= 1;           
           }else if(p1.getPrice2() < p2.getPrice2()){
               result= -1;           
           }else{
               result = p1.getName().compareTo(p2.getName());
           }
           if (action == 2){
               result *= -1;
           }
           return result ;
       }
   } 
   
    public static void main(String[] args) {
            Product p1 = new Product("A1",25,36);
            Product p2 = new Product("B2",37,15);
            Product p3 = new Product("C3",25,31);
            Product p4 = new Product("D4",37,18);
            Product p5 = new Product("E5",25,36);
            Scanner scan = new Scanner(System.in);
            int action = scan.nextInt(); //如果是1 由小到大  如果是2 由大到小
            
            MyProductComp comp = new MyProductComp(action);
            TreeSet<Product>set = new TreeSet(comp);
            set.add(p1);
            set.add(p2);
            set.add(p3);
            set.add(p4);
            set.add(p5);
            
            System.out.println(set);
    }
    
}
