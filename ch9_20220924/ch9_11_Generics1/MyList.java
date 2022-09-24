/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220924.ch9_11_Generics1;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyList<T> {
    private ArrayList <T> list = new ArrayList();
    public void add(T v){        
        list.add(v);
    }
    public T get(int index){
        return list.get(index);
    }
    
    public int size(){
        return list.size();
    }
    
    public void foreach(Consumer<T> con){
        list.forEach(con);
    }
}
