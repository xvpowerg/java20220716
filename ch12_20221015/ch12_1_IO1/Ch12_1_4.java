/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_1_IO1;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author xvpow
 */
public class Ch12_1_4 {


        public static void main(String[] args) throws Exception {
            // TODO code application logic here
           File f1 = new File("C:\\mydir\\product.obj");
            try(FileInputStream fin = new FileInputStream(f1);
                ObjectInputStream oiInput = new  ObjectInputStream(fin);  ){
                Product p1 = (Product)oiInput.readObject();
                System.out.println(p1);
        }    
    }
}