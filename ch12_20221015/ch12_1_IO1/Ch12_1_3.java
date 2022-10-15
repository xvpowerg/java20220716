/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_1_IO1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author xvpow
 */
public class Ch12_1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
      Product p1 = new Product(10,"Apple");
      p1.setLocationCity("花蓮");
      p1.setLocationAddr("花蓮市xxxxxx");
//      System.out.println(p1);
        File f1 = new File("C:\\mydir\\product.obj");
      try(FileOutputStream fout = new FileOutputStream(f1);
          ObjectOutputStream objOut = new   ObjectOutputStream(fout) ){
          objOut.writeObject(p1);
      }
      
      
    }
    
}
