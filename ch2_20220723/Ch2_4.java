/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;

/**
 *
 * @author xvpow
 */
public class Ch2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] array2x3 = new int[2][3];
       array2x3[0][0] = 18;
       array2x3[1][1] = 25;
       array2x3[0][2] = 36;
       
       for (int r = 0; r < 2;r++){
           for (int c = 0; c < 3; c++){
               System.out.print(array2x3[r][c]+" ");
           }
           System.out.println();
       }
       
       int count = 0;
       //for each
       
       for (int[] v1 : array2x3){
           for (int  v : v1){
               System.out.print(v+" ");
           }
          System.out.println();
       }
    }
    
}
