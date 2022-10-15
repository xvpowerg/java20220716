/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_3_IO3;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

/**
 *
 * @author xvpow
 */
public class Ch12_3 {
    static void copyBuffer() throws Exception {
        File src = new File("C:\\mydir\\test.zip");
        File target = new File("C:\\mydir\\test_target.zip");
        try ( FileInputStream fin = new FileInputStream(src);  
               FileOutputStream fOut = new FileOutputStream(target); 
               BufferedInputStream bfin = new BufferedInputStream(fin); 
               BufferedOutputStream bfOut = new BufferedOutputStream(fOut);) {
            int data = -1;
            while ((data = bfin.read()) != -1) {
                bfOut.write(data);
            }
        }
    }

    static void copyMyBuffer() throws Exception{
        File src = new File("C:\\mydir\\test.zip");
        File target = new File("C:\\mydir\\test_target.zip");
        
        try(FileInputStream fIn = new FileInputStream(src);
          FileOutputStream fOut = new FileOutputStream(target);    ){
            byte[] buffer = new byte[1024*8];
            int index = -1;
            while( (index = fIn.read(buffer)) != -1){
               fOut.write(buffer, 0, index);
            }
            
        }
    }
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //copyBuffer();// 6~7秒
        
        copyMyBuffer();

    }

}
