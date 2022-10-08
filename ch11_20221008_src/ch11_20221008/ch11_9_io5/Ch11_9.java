/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20221008.ch11_9_io5;

/**
 *
 * @author xvpow
 */
public class Ch11_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try(TestAutoClose t1 = new TestAutoClose("T1",false);
            TestAutoClose t2 = new TestAutoClose("T2",false);){
            System.out.println("Body!");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
