/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220827.Ch6_5_functional_if;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyConsumer implements Consumer<String>{
    public void accept(String s){
        System.out.println(s);
    }
}
