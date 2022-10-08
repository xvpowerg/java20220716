/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_5_io1;
import java.io.File;
public class Ch11_5 {

    public static void main(String[] args) {
      File f1 = new File("c:\\mydir");
      System.out.println(f1);
      System.out.println(f1.exists()); 
      
      File f2 = new File("c:\\mydir\\mymsg_copy.txt");
      System.out.println(f2.delete());
      
      
    }
    
}
