/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20220813.ch4_3_override;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
      @Override
    public void testPublic(){
        System.out.println("Test2 TestPublic");
    }
      @Override
    //protected 與 public複寫
    protected  void testProtected(){
             System.out.println("Test2 testProtected");
    }
      @Override
     //default protected 與 public複寫
    void testDefault(){
        System.out.println("Test2 testDefault");
    }
    //@Override//用來檢查複寫是否正確
    private void testPrivate(){
             System.out.println("Test2 testPrivate");
    }
}
