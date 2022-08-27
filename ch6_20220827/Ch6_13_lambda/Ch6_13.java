/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220827.Ch6_13_lambda;

/**
 *
 * @author xvpow
 */
public class Ch6_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Test1 t1 = ()->{
            System.out.println("Test1 .....");
        };
        t1.run();
        
        Test1 t2  = ()->System.out.println("Test2.....");
        t2.run();
        
    }
    
}
