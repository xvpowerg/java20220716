/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_16_io12;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class Ch11_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File f1 = new File("c:\\mydir\\name.obj");
      try(FileInputStream fin = new FileInputStream(f1);
       ObjectInputStream objIn = new ObjectInputStream(fin);){
         String st1 = (String)objIn.readObject();
         System.out.println(st1);
      } catch(IOException | ClassNotFoundException ex){
          System.out.println(ex);
      }
    }
    
}
