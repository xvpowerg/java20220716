/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220827.Ch6_6_functional_if;
import java.util.function.Supplier;
import java.util.List;
import java.util.ArrayList;
public class Ch6_6 {
    static List<String> filterList(int len,Supplier<List<String>> su,String ... names){
        List<String> list = su.get();
        for (String n : names){
            if (n.length() >= len)
                list.add(n);
        }
        return list;
    }
    public static void main(String[] args) {
      List<String> myNameList = filterList(4,new MySupplier(),"Ken","Iris","Joy","Howard","Lucy");
      System.out.println(myNameList);
      
      List<String> myNameList2 = filterList(4,()->new ArrayList<String>(),"Ken","Iris","Joy","Howard","Lucy");
      System.out.println(myNameList2);
      
    }
    
}
