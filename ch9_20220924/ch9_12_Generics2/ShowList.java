/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220924.ch9_12_Generics2;
import java.util.List;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class ShowList<T extends List<E>,E> {
    private T list;
    ShowList( T list){
         this.list = list;
    }
        
      public void show(Consumer<E> c){
          list.forEach(c);
      }  
}
