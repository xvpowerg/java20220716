/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220820.ch5_3_shade;

/**
 *
 * @author xvpow
 */
public class Ch5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //遮蔽
        //靜態的都是遮蔽
        //屬性也是遮蔽
        
        //遮蔽看類別
        //複寫看物件
        
        
        Test1 t1 = new Test2();
        t1.testRun1();
        Test2 t2 = new Test2();
        t2.testRun1();
        
    }
    
}
