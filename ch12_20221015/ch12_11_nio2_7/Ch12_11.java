/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_11_nio2_7;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch12_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path src = Paths.get("c:","mydir","test.zip");
        Path target = Paths.get("c:","mydir","test_copy.zip");
//       try{
//           Files.copy(src, target,StandardCopyOption.REPLACE_EXISTING);
//       }catch(IOException ex){
//           System.out.println(ex);
//       }
    try{
      FileInputStream fileIn = new FileInputStream(src.toFile());
      Files.copy(fileIn, target, StandardCopyOption.REPLACE_EXISTING);
    }catch(FileNotFoundException ex){
        System.out.println(ex);
    }catch(IOException ex){
        System.out.println(ex);
    }
      

        //Files.copy(in, target, options)
    }
    
}
