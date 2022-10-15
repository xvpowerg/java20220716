/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_6_nio2_3;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch12_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          Path p1 = Paths.get("C:","mydir","dir1","dir1_1");
          Path p2 = Paths.get("C:","mydir");
          Path p3 = p1.relativize(p2);
          System.out.println(p3);
          
          Path p4 = Paths.get("c:","mydir");
          Path p5 = Paths.get("D:","mydir");
          p4.relativize(p5);
        
    }
    
}
