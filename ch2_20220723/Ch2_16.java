/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;

/**
 *
 * @author xvpow
 */
public class Ch2_16 {

    
    static void testLoop(int x){
       System.out.println("S:"+x);  
        if (x <= 3){
            System.out.println(x);
            testLoop(x+1);
        }
      System.out.println("E:"+x);    
    }
    
    public static void main(String[] args) {
       testLoop(1);
        
        
    }
    
}
