/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_5_nio2_2;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch12_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Path p1  = Paths.get("c:","mydir");
      System.out.println(p1.isAbsolute());
      System.out.println(p1.toAbsolutePath());
      
      Path p2 = Paths.get("value","mydir");
      System.out.println(p2.isAbsolute());
      System.out.println(p2.toAbsolutePath());
      
      Path p3 = Paths.get("c:","mydir","dir1");
      Path p4 = Paths.get("myFile.txt");
      Path newPath = p3.resolve(p4);
      System.out.println(newPath);
      
      Path p5 = Paths.get("c:","mydir2");
      Path p6 = Paths.get("c:","mydir3");
      Path p7 = p5.resolve(p6);
      System.out.println(p7);//p6取代p5
      
      Path p8 = Paths.get("C:","A","B","C");
      Path p9 = Paths.get("myImage.jpg");
      Path p10 =  p8.resolveSibling(p9);
      System.out.println(p10);
      
      
    }
    
}
