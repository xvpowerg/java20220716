/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220924.ch9_14_Generics4;
import java.util.function.Function;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Test1 {
    public static <T> T test( T v){
        return v;
    }
    
   public static <T,R> R testFunc(T v,Function<T,R> func){
       return func.apply(v);
   } 
   
   //回傳一種Exception
   public static <E extends Exception> E getException(Supplier<E> supp ){
       return supp.get();
   }
}
