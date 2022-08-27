/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220827.Ch6_14_lambda;

/**
 *
 * @author xvpow
 */
public class Ch6_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test2 t1 = (int x)->{
            System.out.println("x:"+x);
        };
        t1.test(25);
        
        Test2 t2 = (y)->{
            System.out.println("y:"+y);};
        t2.test(18);
        
        Test2 t3 = a->System.out.println("a:"+a);
        t3.test(95);
    }
    
}
