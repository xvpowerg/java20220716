/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220813.ch4_7_finally;
public class Ch4_7 {
    static void testException(boolean b){
        if (b){
            throw new RuntimeException("測設例外");
        }
    }
    public static void main(String[] args) {       
        try{
            System.out.println("Start!");
            testException(true);
         
        }catch(RuntimeException ex){
            System.out.println(ex);
        }finally{
            //一定會執行到
           System.out.println("End!");    
        }
        
        
       try{
            System.out.println("Start!");
            testException(true);  
       }finally{
           System.out.println("End!");        
       }
       
    } 
}
