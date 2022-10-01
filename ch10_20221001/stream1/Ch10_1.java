/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221001.stream1;
import java.util.stream.Stream;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch10_1 {
    
    public static void main(String[] args) {
            Stream<String> stream1 = Stream.of("Ken","Vivin","Lindy","Joy");
            long c1 =   stream1.count();            
            System.out.println(c1);
                   
            //1 Stream物件不可重複使用
            //stream1.distinct();     
            //2 Stream物件不會修改來源
           ArrayList<String> list = new ArrayList(); 
           list.add("Ken");
           list.add("Viivn");
           list.add("Lindy");
           list.add("Joy");
           list.add("Iris");
          list.stream().filter(n->n.length() > 3).
                  forEach(v->System.out.println(v));
          System.out.println(list);
            //3 Stream物件有惰性(lazy)與終端(terminal)
            //filter函數是惰性(lazy)的 
            list.stream().filter(p->{
                    System.out.println("filter:"+p);
                    return true;
           }).
                          filter(v->v.length() >3);
            
//           long count1 =  list.stream().filter(p->{
//                    System.out.println("filter:"+p);
//                    return true;
//           }).count();
    //System.out.println(count1);
           list.stream().peek(v->System.out.println("peek:"+v)).
                   filter(p->p.length() > 3).count();
        
    }
    
}
