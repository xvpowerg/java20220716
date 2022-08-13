/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20220813.ch4_4_override;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
    //複寫時回傳值如果是基本型態必須一樣類型
            public int testInt(){
                return 50;
            }
            public Test2 testTest1(){
                return new Test2();
            }
}
