/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_13_io9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.io.IOException;

public class Ch11_13 {
    public static void main(String[] args) {
          File file = new File("c:\\mydir\\mymsg.txt"); 
          try( MyFileRead red = new MyFileRead(file,"big5");){
             int data = -1;
              while( (data = red.read()) != -1){
                 System.out.print((char)data);
             }
          }catch(FileNotFoundException | UnsupportedEncodingException ex){
              System.out.print(ex);
          }catch(IOException ex){
                System.out.print(ex);
          }
              
      
                  
          
    }
    
}
