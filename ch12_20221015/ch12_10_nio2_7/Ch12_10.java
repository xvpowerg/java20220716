/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_10_nio2_7;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch12_10 {
    public static void main(String[] args) {
       Path src = Paths.get("c:","mydir","mymsg.txt");
       Path target = Paths.get("c:","mydir","mymsg_copy.txt");
       try{
           Files.copy(src, target,StandardCopyOption.REPLACE_EXISTING);
       }catch(IOException ex){
           System.out.println(ex);
       }
       
        
        
    }
    
}
