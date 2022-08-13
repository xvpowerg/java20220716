/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220813.ch4_2_override.test3;
import ch4_20220813.ch4_2_override.TestMethod;
public class Ch4_2_test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestMethod tme2 = new  TestMethod();
        tme2.testPublic();
        Test3 t3 = new  Test3();
        t3.runProtected();
        
    }
    
}
