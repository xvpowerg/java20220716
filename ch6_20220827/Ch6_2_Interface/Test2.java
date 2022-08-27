/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch6_20220827.Ch6_2_Interface;

/**
 *
 * @author xvpow
 */
public interface Test2 {
    static void staticFunc2(){
        System.out.println("staticFunc2");
    }
    default void func2(){
        System.out.println("Func Test2");
    }
}
