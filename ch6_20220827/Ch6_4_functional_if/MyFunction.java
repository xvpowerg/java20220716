/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch6_20220827.Ch6_4_functional_if;

/**
 *
 * @author xvpow
 */
//把介面當方法
@FunctionalInterface
public interface MyFunction {
    public void action();
    default  void test1(){
        
    }
    static void test2(){
        
    }
}
