/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220820.ch5_1_static;

/**
 *
 * @author xvpow
 */
public class Ch5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestStaitc ts1  = new TestStaitc();
       TestStaitc ts2  = new TestStaitc();
       ts1.name = "ts1";
       ts2.name = "ts2";
       ts1.instanceValue = "IV1";
       ts2.instanceValue = "IV2";
       
       ts1.staticValue  = "SV1";
       ts2.staticValue  = "SV2";
       
       System.out.println(ts1);
       System.out.println(ts2);
    }
    
}
