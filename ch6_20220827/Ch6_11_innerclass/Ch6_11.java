/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220827.Ch6_11_innerclass;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch6_11 {
static class MyFunction implements Function<Integer,String>{
    public String apply(Integer v){
            char c = (char)(65 + v % 26 );
        return c+"";
    }
}
   static void intToString(Function<Integer,String> func,int ... values){
       for (int v : values){
           System.out.println(func.apply(v));
       }
   }
    public static void main(String[] args) {
        // TODO code application logic here
        MyFunction myFunc = new MyFunction();
        intToString(myFunc,5,2,6,9,18,77,32,61);
    }
    
}
