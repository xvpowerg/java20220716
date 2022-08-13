/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20220813.ch4_3_override.test4;
import ch4_20220813.ch4_3_override.Test1;
/**
 *
 * @author xvpow
 */
public class Test4 extends Test1 {
    @Override
    public void testPublic(){
        System.out.println("Test4 testPublic");
    }
    @Override
    protected void testProtected(){
        System.out.println("Test4 testProtected");
    }
    //@Override // 跨package default不可複寫
    void testDefault(){
         System.out.println("Test4 testDefault");
    }
    //@Override
    private void testPrivate(){
         System.out.println("Test4 testPrivate");
    }
}
