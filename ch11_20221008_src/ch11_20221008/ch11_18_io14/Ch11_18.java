/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_18_io14;
import java.io.File;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch11_18 {

    
    public static void main(String[] args) {
        Item i1 = new Item(5,"A1",500);
        System.out.println(i1);
       File f1 = new File("c:\\mydir\\item.obj");
//        try( FileOutputStream fOut = new  FileOutputStream(f1);
//        ObjectOutputStream objOut = new ObjectOutputStream(fOut);){
//                    objOut.writeObject(i1);
//        }catch(IOException ex){
//            System.out.println(ex);
//        }
       
        try(FileInputStream fin  = new FileInputStream(f1);
            ObjectInputStream objIn =  new ObjectInputStream(fin);){
            Item ite1  =  (Item)objIn.readObject();
            System.out.println(ite1);
        }catch(IOException | ClassNotFoundException ex){
            System.out.println(ex);
        }
      
    }
    
}
