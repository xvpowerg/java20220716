/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220813.ch4_6_exception;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Ch4_6_3 {

    public static void main(String[] args) {
     TestException tex = new TestException();
     try{
         tex.testExceptionMp(3);
     }catch(FileNotFoundException ex){
         System.out.println(ex);
     }catch(IOException ex){//越下越父
         System.out.println(ex);
     }catch(SQLException ex){
         System.out.println(ex);
     }
     
     
    }
    
}
