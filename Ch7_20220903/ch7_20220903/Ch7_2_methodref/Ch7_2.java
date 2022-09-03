/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220903.Ch7_2_methodref;

/**
 *
 * @author xvpow
 */
public class Ch7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.runTestList();
        
        t1.testList(t1::getList);
    }
    
}
