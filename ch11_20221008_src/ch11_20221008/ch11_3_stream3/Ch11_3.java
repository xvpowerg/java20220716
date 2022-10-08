/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_3_stream3;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch11_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student("Ken",80);
        Student st2 = new Student("Vivin",92);
        Student st3 = new Student("Iris",51);
        Student st4 = new Student("Lucy",75);
        Student st5 = new Student("Joy",41);
        ArrayList<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        //幫我分組 及格一組 不及格一組
        Map<Boolean,List<Student>> stMap = list.stream().
                collect(Collectors.partitioningBy(st->st.getScore() >= 60));
        System.out.println(stMap);
        //幫我產一組學姓名字串 Student: Ken,Vivin,Irirs,Lucy,Joy.
       String stNames =    list.stream().map(st->st.getName()).
                collect(Collectors.joining(",","Student: " ,"."));
       System.out.println(stNames);
        
    }
    
}
