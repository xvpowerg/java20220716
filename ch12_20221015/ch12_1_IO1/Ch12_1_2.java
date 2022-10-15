/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_1_IO1;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch12_1_2 {

    public static void main(String[] args) {
        //反序列化
        File f1 = new File("C:\\mydir\\product.obj");
        try(FileInputStream fin = new FileInputStream(f1);
            ObjectInputStream objIn = new ObjectInputStream(fin)    ){
            Product p =  (Product)objIn.readObject();
            System.out.println(p);
        }catch(IOException | ClassNotFoundException ex){
            System.out.println(ex);
        }
        
    }
    
}
