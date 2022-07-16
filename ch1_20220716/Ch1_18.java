/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220716;

/**
 *
 * @author xvpow
 */
public class Ch1_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       tag1:  
      for(int i = 1;i<=3;i++){
          tag2:  
          for (int k = 1; k<=3;k++){
              if (i == 2){
                  //break tag1;
                  continue tag1;
              }
              System.out.print(i+"_"+k+" ");
          }
          System.out.println();
      }
    }
    
}
