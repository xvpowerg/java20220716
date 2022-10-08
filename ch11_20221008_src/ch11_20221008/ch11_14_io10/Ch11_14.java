/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20221008.ch11_14_io10;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author xvpow
 */
public class Ch11_14 {
    
     public static void main(String[] args) {
         File f = new File("C:\\mydir\\testwrite.txt");
         
        try(FileWriter fw = new FileWriter(f);){
            fw.write("Hello!!!");
        }catch(IOException ex){
            System.out.println(ex);
        }
         
     }
     
     
}
