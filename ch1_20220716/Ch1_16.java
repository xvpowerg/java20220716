/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220716;

/**
 *
 * @author xvpow
 */
public class Ch1_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            for (int i = 1; i<=5;i++){              
                for (int k = i;k<=5;k++){
                    System.out.print(k);                    
                }
                System.out.println();
            }
            
        System.out.println("========================");
        
        for (int i = 2; i<=9;i++){
         for (int k = 1; k <= 9; k++){
             System.out.printf("%2d*%2d=%2d ",i,k,i*k);
         }   
            System.out.println();
        }
        
    }
    
}
