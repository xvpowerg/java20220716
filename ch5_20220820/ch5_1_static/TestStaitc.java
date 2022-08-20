/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220820.ch5_1_static;

/**
 *
 * @author xvpow
 */
public class TestStaitc {
    String name= "";
    static String staticValue = "testStatic";
    String instanceValue = "instanceValue";
    
    public String toString(){
        return name+":"+staticValue+":"+instanceValue;
    }
}
