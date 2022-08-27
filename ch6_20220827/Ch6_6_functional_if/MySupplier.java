/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220827.Ch6_6_functional_if;
import java.util.function.Supplier;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class MySupplier implements Supplier<List<String>>{
    public List<String> get(){
        ArrayList<String> list = new ArrayList();
        return list;
    }
}
