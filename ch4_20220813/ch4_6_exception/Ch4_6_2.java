/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220813.ch4_6_exception;

/**
 *
 * @author xvpow
 */
public class Ch4_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestException tex = new TestException();
       try{
           tex.testUnCatchException(true);  
       }catch(RuntimeException ex){
           System.out.println(ex);
       }
       
    }
    
}
