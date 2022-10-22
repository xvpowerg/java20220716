/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_20221022.ch13_2_nio2;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Ch13_2 {

    public static void main(String[] args)throws Exception {
        
        Path path1 = Paths.get("C:\\mydir","mymsg.txt");        
        Stream<String> st1 = Files.lines(path1,Charset.forName("BIG5"));
        st1.forEach(System.out::println);
        //每行字串長度找出來
        //每行字串長度相加
        
        Stream<String> st2 = Files.lines(path1,Charset.forName("BIG5"));
        int sun = st2.mapToInt(st->st.length()).sum();
        System.out.println(sun);
        System.out.println("=========================");
         Stream<String> st3 = Files.lines(path1,Charset.forName("BIG5"));
         String msg =   st3.collect(Collectors.joining("\n"));
         System.out.println(msg);
    }
    
}
