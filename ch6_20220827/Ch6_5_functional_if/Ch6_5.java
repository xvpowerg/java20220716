/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220827.Ch6_5_functional_if;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch6_5 {

   
    static void foreach(Consumer<String> c,String ... values){
        for (String s : values){
            c.accept(s);
        }
    }
    
    public static void main(String[] args) {
      //Consumer<T>  接收數值
      //Supplier<T>   提供數值
      //Function<T,R>  接收 也提供 可用於轉換 接收的參數類型可跟回傳的類型不同
      //UnaryOperator<T> 接收 也提供 可用於轉換 接收的參數類型可跟回傳的類型相同
      //Predicate<T> 檢測
      MyConsumer myc = new MyConsumer();
      foreach(myc,"Gigi","Lucy","Vivin","Lindy");
      
    }
    
}
