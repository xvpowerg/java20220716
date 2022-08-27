/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220827.Ch6_10_innerclass;
import ch6_20220827.Ch6_10_innerclass.TestInnser.MyStaticInnerClass;
public class Ch6_10 {
    public static void main(String[] args) {
       TestInnser tInner = new TestInnser();
       tInner.testInnerClass();
       
       TestInnser.MyInnerClass myInner2 =
               tInner.new MyInnerClass("main Inner class ");
       System.out.println(myInner2);
       MyStaticInnerClass staticClass = new  MyStaticInnerClass("A0001",85);
       System.out.println(staticClass);
       
       
    }
    
}
