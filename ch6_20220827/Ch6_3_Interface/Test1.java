/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch6_20220827.Ch6_3_Interface;

/**
 *
 * @author xvpow
 */
public interface Test1 {
    default void  myFunc(){
        System.out.print("Test1 myFunc");
    }
}
