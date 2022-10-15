/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_2_IO2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author xvpow
 */
public class Ch12_2 {


    public static void main(String[] args)throws Exception {
      User user = new User("Ken","123456");
      File file = new File("C:\\mydir\\user.obj");
     try(FileOutputStream fOut = new FileOutputStream(file );
         ObjectOutputStream objStr = new  ObjectOutputStream(fOut);   ){
             objStr.writeObject(user);
     } 
      //System.out.println(user);
      
      
    }
    
}
