/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;

/**
 *
 * @author xvpow
 */
public class Ch2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array2 = {8,71,63,54,88,76};
       System.out.println(array2[2]);
       array2[2] = 92;       
       for(int v : array2){
           System.out.print(v+" ");
       }
         System.out.println();
      array2[6]    = 75;
    }
    
}
