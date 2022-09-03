/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220903.Ch7_3_methodref;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch7_3 {
    
    static void testsFunc(String str,Function<String,Integer>func){
        int value = func.apply(str);
        System.out.println(value);
    }
    public static void main(String[] args) {
       
        testsFunc("qwerty",String::length);
        
        
    }
    
}
