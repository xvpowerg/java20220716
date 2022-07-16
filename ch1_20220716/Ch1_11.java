/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220716;

/**
 *
 * @author xvpow
 */
public class Ch1_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        //常數
        final int JUMP = 1;
        final int WALK = 2;
        final int RUN = 3;
        
        int action =WALK;
       //byte short int char String enum
        switch(action){
            case JUMP:
                System.out.println("Jump");
                break;
            case WALK:
                System.out.println("Walk");
                break;
            case RUN:
                System.out.println("Run");
                break;
            default:
                System.out.println("Error!");
                break;
        }
        
        
    }
    
}
