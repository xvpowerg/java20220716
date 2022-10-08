/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_2_stream2;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
public class Ch11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList();
       list.add("Ken");
       list.add("Viivn");
       list.add("Lindy");
       list.add("Joy");
       list.add("Iris");
     Map<Boolean,List<String>>  pMap =
             list.stream().collect(Collectors.partitioningBy(s->s.length() > 3));
     System.out.println(pMap);
     
    String names = list.stream().collect(Collectors.joining(",", "Names:", "."));
     System.out.println(names);
    }
    
}
