/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_2_IO2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author xvpow
 */
public class Ch12_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
          File file = new File("C:\\mydir\\user.obj");
          try(FileInputStream fin = new FileInputStream(file);
                  ObjectInputStream obj = new ObjectInputStream(fin)){
               User user = (User) obj.readObject();
               System.out.println(user);
          }
        
    }
    
}
