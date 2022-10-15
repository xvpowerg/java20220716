/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_12_nio2_8;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch12_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path src = Paths.get("c:","mydir","test.zip");
        Path target = Paths.get("c:","mydir","dir","test.zip");
        try{
               Files.move(src, target,
                       StandardCopyOption.REPLACE_EXISTING,
                       StandardCopyOption.ATOMIC_MOVE);
        }catch(IOException ex){
            System.out.println(ex);
        }
     
    }
    
}
