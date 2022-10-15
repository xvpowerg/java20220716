/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_9_nio2_6;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch12_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path p1 = Paths.get("c:","mydir");
        boolean isExists = Files.exists(p1);
        System.out.println(isExists);
        Path p2 = Paths.get("c:","mydirx");
        boolean isExists2 = Files.exists(p2);
        System.out.println(isExists2);
        Path p3 = Paths.get("c:","mydir","delete.txt");
//        try{
//            if (Files.exists(p3)) Files.delete(p3);   
//                       
//        }catch(IOException ex){
//            System.out.println(ex);
//        }
            try{
              boolean b1 =  Files.deleteIfExists(p3);
              System.out.println(b1);
            }catch(IOException ex){
                 System.out.println(ex);
            }
        

        
        
        
    }
    
}
