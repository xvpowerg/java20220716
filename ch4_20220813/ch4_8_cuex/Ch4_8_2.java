/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220813.ch4_8_cuex;

/**
 *
 * @author xvpow
 */
public class Ch4_8_2 {

    
    static void testRuntimeEx(boolean b1){
        if (b1){
            throw new MyRuntimeException("my!!!RuntimeException");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
           testRuntimeEx(true);
        }catch(MyRuntimeException ex){
            System.out.println(ex);
        }

       
        
    }
    
}
