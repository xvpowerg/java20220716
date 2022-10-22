/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_20221022.ch13_1_nio1;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.io.IOException;

public class C13_1 {
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Path p1 = Paths.get("C:\\mydir\\dir");
       Stream<Path> st =  Files.list(p1);
        st.forEach(System.out::println);
      System.out.println("==========================");
        Stream<Path> st2 = Files.walk(p1);//預設可以看2147483647層
        st2.forEach(System.out::println);
        
         Stream<Path> st3 = Files.walk(p1,0);//不可負數
       System.out.println("=============0=============");
         st3.forEach(System.out::println);
        System.out.println("=============1=============");  
        Stream<Path> st4 = Files.walk(p1,1);//不可負數
        st4.forEach(System.out::println);
        System.out.println("=============2=============");  
          Stream<Path> st5 = Files.walk(p1,2);//不可負數
          st5.forEach(System.out::println);
    }
    
}
