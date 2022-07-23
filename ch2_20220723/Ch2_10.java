/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;

/**
 *
 * @author xvpow
 */
public class Ch2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String v1 = "10";
        System.out.println(v1+6);
        int v2 = Integer.parseInt(v1);//字串轉整數
        System.out.println(v2+6);
        
        //只要不是true一律為false
        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);
        boolean b2 = Boolean.parseBoolean("false");
        System.out.println(b2);
        boolean b3 = Boolean.parseBoolean("TruE");
        System.out.println(b3);
        boolean b4 = Boolean.parseBoolean("AAA");
        System.out.println(b4);
    }
    
}
