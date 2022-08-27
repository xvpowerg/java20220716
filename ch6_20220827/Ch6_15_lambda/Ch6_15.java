/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220827.Ch6_15_lambda;

/**
 *
 * @author xvpow
 */
public class Ch6_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test3 t1 = (int a,String b)->{System.out.println(a+":"+b);};
        t1.test(25, "Str");
        
        Test3 t2 = (a,b)->System.out.println(a+":"+b);
        t2.test(19, "no");
    }
    
}
