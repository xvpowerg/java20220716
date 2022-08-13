/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220813.ch4_1_override.test2;
import ch4_20220813.ch4_1_override.TestModifier;
public class Ch4_1_test2 {
    public static void main(String[] args) {
        // TODO code application logic here
        //跨不同package使用類別需要import 
        TestModifier tm2 = new TestModifier();
        //跨package預設情況 只有public可讀取
        System.out.println(tm2.publicStr);
        TestProtected tp = new TestProtected();
        tp.run();
    }
    
}
