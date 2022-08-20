/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220820.ch5_2_initblock;

/**
 *
 * @author xvpow
 */
public class Test3 {
    static int value  = 10;

    {
            System.out.println("Instance 1");
    }
    
    static{
        System.out.println("Static 1");
    }
    Test3(){
        System.out.println("Test3()!");
    }
    
     static{
        System.out.println("Static 2");
    }
     
    {
            System.out.println("Instance 2");
    }
}
