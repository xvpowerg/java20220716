/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_13_nio2_9;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

import java.io.IOException;
import java.util.ArrayList;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
/**
 *
 * @author xvpow
 */
public class Ch12_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String>list = new ArrayList<>();
        list.add("Ken");
        list.add("Iris");
        list.add("Joy");
        Path p1 = Paths.get("c:","mydir","mylist.obj");
        try(ObjectOutputStream  objStr = 
                new ObjectOutputStream(Files.newOutputStream(p1)) ){
            objStr.writeObject(list);
        }catch(IOException ex){
            System.out.println(ex);
        }
        try(ObjectInputStream ojbIn = new ObjectInputStream(Files.newInputStream(p1));){
            ArrayList<String> tmpList = (ArrayList)ojbIn.readObject();
            System.out.println(tmpList);
        }catch(IOException | ClassNotFoundException ex){
            System.out.println(ex);
        }
        
        
        
    }
    
}
