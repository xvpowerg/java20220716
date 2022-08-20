/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220820.ch5_2_initblock;

/**
 *
 * @author xvpow
 */
public class Ch5_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //System.out.println(Test3.value);
        //Static 區塊呼叫一次
        //instance 區塊每建立一次呼叫一次
        //順序
        //先靜態區塊 後非靜態區塊 建構式
        Test3 t1 = new Test3();   
        Test3 t2 = new Test3();
    }
    
}
