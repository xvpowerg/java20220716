/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch6_20220827.Ch6_2_Interface;

/**
 *
 * @author xvpow
 */
public interface Test1 {
    static void staticFunc1(){ //介面繼承時 不會被繼承
        System.out.println("staticFunc1");
    }
    default void func1(){ ////介面繼承時 會被繼承
        System.out.println("Func Test1");
    }
}
