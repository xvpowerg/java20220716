/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_15_io11;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch11_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //序列化 物件變檔案(可傳輸的內容)
     String st1 = "Howard";
     File file = new File("C:\\mydir\\name.obj");
     try( FileOutputStream fout = new FileOutputStream(file); 
          ObjectOutputStream objOut = new ObjectOutputStream(fout);){
         objOut.writeObject(st1);
     }catch(FileNotFoundException ex){
         System.out.println(ex);
     }catch(IOException ex){
         System.out.println(ex); 
     }
    
    //反序列化 檔案變物件
        
    
    }
    
}
