/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220820.ch5_2_initblock;

/**
 *
 * @author xvpow
 */
public class Test2 {
    static String[] array = new String[300] ;
    static{
        
        System.out.println("static Test2 !");
        for(int i = 0;i<array.length;i++){
             array[i]    = "";
        }
    }
    public static boolean isEmpty(int index ){
        return array[index].length() == 0;
    }
}
