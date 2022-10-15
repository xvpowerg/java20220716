/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221015.ch12_7_nio2_4;

import java.nio.file.Paths;
import java.nio.file.Path;
/**
 *
 * @author xvpow
 */
public class Ch12_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path p1 =   Paths.get("/home",".", "mydir","test");
        System.out.println(p1);
        Path p2 = p1.normalize();
        System.out.println(p1);
        System.out.println(p2);
        
        Path p3 = Paths.get("/home","music","..","images","photo.jpg");
        System.out.println(p3);
        Path p4 = p3.normalize();
        System.out.println(p4);
    }
    
}
