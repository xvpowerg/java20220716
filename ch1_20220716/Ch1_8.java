/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220716;

/**
 *
 * @author xvpow
 */
public class Ch1_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age = 15;
        
        if (age >= 18){
            System.out.println("成年");
        }else{
            System.out.println("未成年");
        }
        
        String msg = age >= 18?"成年":"未成年";
        System.out.println(msg);
    }
    
}
