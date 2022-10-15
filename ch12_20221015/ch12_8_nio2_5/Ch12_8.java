/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_8_nio2_5;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

/**
 *
 * @author xvpow
 */
public class Ch12_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Path p1 = Paths.get("c:","a","b","myFile.txt");
        File file1 =   p1.toFile();
        Path p2 = file1.toPath();
        System.out.println(file1);
         System.out.println(p2);
         boolean b1 = p1.startsWith(Paths.get("c:","a"));
         System.out.println(b1);
        boolean b2 =   p1.endsWith(Paths.get("myFile.txt"));
        System.out.println(b2);
    }
    
}
