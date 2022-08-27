/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220827.Ch6_16_lambda;

/**
 *
 * @author xvpow
 */
public class Ch6_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test4 t1 = (int v1,int v2)->{
                 return v1 +":"+ v2;
        };
        System.out.println(t1.test(25, 73));
     
        Test4 t2 = (v1,v2)-> v1+":"+v2;
        System.out.println(t2.test(52, 63));
    }
    
}
