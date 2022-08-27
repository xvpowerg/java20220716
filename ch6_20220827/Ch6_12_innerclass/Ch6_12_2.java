/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220827.Ch6_12_innerclass;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch6_12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 10;
        Consumer<Integer> c = new Consumer<Integer>(){        
            public void accept(Integer v){
                //x = 25;
                    System.out.println("Consumer:"+v);
            }
        };
        c.accept(25);
    }
    
}
