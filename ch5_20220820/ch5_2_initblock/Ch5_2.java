/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220820.ch5_2_initblock;

/**
 *
 * @author xvpow
 */
public class Ch5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test1();
        System.out.println(t1.isEmpty(2));
        
        Test1 t2 = new Test1("A001");
        System.out.println(t2.getId());
          System.out.println(t2.isEmpty(2));
    }
    
}
