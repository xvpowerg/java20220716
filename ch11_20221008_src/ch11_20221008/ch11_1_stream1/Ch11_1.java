package ch11_20221008.ch11_1_stream1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Ch11_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Element e1 = new Element("A1",82);
        Element e2 = new Element("A2",87);
        Element e3 = new Element("A3",86);
        Element e4 = new Element("A4",89);
        Element e5 = new Element("A5",88);
        
        Element e6 = new Element("B1",65);
        Element e7 = new Element("B2",66);
        Element e8 = new Element("B3",62);
       
        Element e9 = new Element("C1",45);
        Element e10 = new Element("C2",42);
        Element e11 = new Element("C3",41);
        
        ArrayList<Element> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        
        list.add(e6);
        list.add(e7);
        list.add(e8);
        
        list.add(e9);
        list.add(e10);
        list.add(e11);
      Map<Integer,List<Element>> gMap =   list.stream().
                collect(Collectors.groupingBy(e->e.getCount()/10 * 10));
      System.out.println(gMap);
      
     Map<Integer,Map<Boolean,List<Element>>> gMap2 = 
             list.stream().collect(Collectors.groupingBy(e->e.getCount()/10*10,
              Collectors.groupingBy(e->e.getCount()%2 == 0)));
     System.out.println(gMap2);
     
      Map<Integer,Map<Boolean,Long>> gMa3 = 
             list.stream().collect(Collectors.groupingBy(e->e.getCount()/10*10,
              Collectors.groupingBy(e->e.getCount()%2 == 0,
                      Collectors.counting())));
     System.out.println(gMa3);
    }
    
}
