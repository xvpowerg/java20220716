/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_11_io7;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch11_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("c:\\mydir\\mymsg.txt");
        try( InputStreamReader reader = new FileReader(file);){
            int data = -1;
            while( (data = reader.read())  != -1){
                char v = (char)data;
                System.out.print(v);
            }
        }catch(FileNotFoundException fe){
            System.out.println(fe);
        }catch(IOException ex){
           System.out.println(ex);   
        }
       
    }
    
}
