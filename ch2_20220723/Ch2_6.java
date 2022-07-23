/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;

/**
 *
 * @author xvpow
 */
public class Ch2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array3xn = new int[3][];
        array3xn[0] = new int[5];
        array3xn[2] = new int[3];
        
        array3xn[0][3] = 8;
        array3xn[2][1] = 15;
        
        //array3xn[0][5] = 72;//java.lang.ArrayIndexOutOfBoundsException
        array3xn[1][0] = 83;
    }
    
}
