/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_12_io8;

import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch11_12 {
    
    public static void main(String[] args) {
      File file = new File("c:\\mydir\\mymsg.txt");  
      try(FileInputStream fin = new FileInputStream(file);
              InputStreamReader r = new  InputStreamReader(fin,"BIG5");){
          int data = -1;
          while((data = r.read()) != -1){
              System.out.print((char)data);
          }
      }catch(FileNotFoundException ex){
          System.out.println(ex);
      }catch(IOException ex){
          System.out.println(ex);
      }
        
    }
    
}
