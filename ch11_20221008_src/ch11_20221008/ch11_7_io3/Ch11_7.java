/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_7_io3;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch11_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File src = new File("c:\\mydir\\test.zip");
       File target = new File("c:\\mydir\\copy_test.zip");
        InputStream in = null;
        OutputStream out = null;
       try{
             in = new BufferedInputStream(new FileInputStream(src));
             out =new BufferedOutputStream(new FileOutputStream(target)) ;
            int data = -1;
            while( (data = in.read()) != -1){
                out.write(data);
            }
          
       }catch(FileNotFoundException ex){
            System.out.println(ex);
       }catch(IOException ex){
            System.out.println(ex);
       }finally{
           try{
             out.close();
            in.close();  
           }catch(IOException ex){
               
           }
             
       }
     
    }
    
}
