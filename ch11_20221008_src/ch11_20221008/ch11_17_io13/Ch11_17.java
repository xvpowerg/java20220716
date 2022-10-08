/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_17_io13;
import java.io.File;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch11_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> names = new ArrayList<>();
       File file = new File("c:\\mydir\\names.obj");

    names.add("Ken");
    names.add("Lucy");
    names.add("Iris");
    names.add("Vivin");    
    try(FileOutputStream fOut = new FileOutputStream(file);
        ObjectOutputStream objOut = new ObjectOutputStream(fOut);){
        objOut.writeObject(names);
    }catch(FileNotFoundException ex){
        System.out.println(ex);
    }catch(IOException ex){
         System.out.println(ex);
    }
    
 
    try(FileInputStream fin = new FileInputStream(file);
        ObjectInputStream objIn = new ObjectInputStream(fin);){
        ArrayList<String> list = (ArrayList)objIn.readObject();
        list.forEach(v->System.out.println(v));
    }catch(FileNotFoundException | ClassNotFoundException ex){
        System.out.println(ex);
    }catch(IOException ex){
          System.out.println(ex);
    }
    
    }
    
}
