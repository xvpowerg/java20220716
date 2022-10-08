/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_6_io2;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;

import java.io.OutputStream;
import java.io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
public class Ch11_6 {

    public static void main(String[] args) {
     File src = new File("C:\\mydir\\mymsg.txt");
     File target = new File("C:\\mydir\\copy_mymsg.txt");
     try{
       InputStream inStr = new FileInputStream(src);
       OutputStream outStr = new FileOutputStream(target);
       int data = -1;
      while( (data = inStr.read()) != -1 ){
            //System.out.println(data);
            outStr.write(data);
      } 
       
     }catch(FileNotFoundException ex){
         System.out.println(ex);
     }catch(IOException ex){
        System.out.println(ex);
     }
     
        
        
    }
    
}
