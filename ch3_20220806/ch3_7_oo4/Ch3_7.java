/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220806.ch3_7_oo4;

/**
 *
 * @author xvpow
 */
public class Ch3_7 {

  
    public static void main(String[] args) {
      
        Product p1 = new Product();
        p1.setName("Apple1");
        p1.setPrice(2500);//不可小於100
        
        Product p2 = new Product("Apple2",3000);
        
        Product p3 = new Product();
        
        //p1.printInfo();//Apple1:2500
        p2.printInfo();//Apple2:3000
        p3.printInfo();//空白:100
        
    }
    
}
