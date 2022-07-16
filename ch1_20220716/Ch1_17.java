/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220716;

/**
 *
 * @author xvpow
 */
public class Ch1_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        for (int i = 1; i<=5;i++){
            if (i == 3){
                break;//離開迴圈
            }
            System.out.println(i);
        }
        
        System.out.println("=====================================");
        for (int i = 1; i<=5;i++){
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
        
        
        
    }
    
}
