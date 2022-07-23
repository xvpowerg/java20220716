/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch2_1 {
    public static void main(String[] args) {
      int[] values = new int[10];
      values[0] = 7;
      values[2]  = 9;
      values[3] = 18;
      values[5] = 21;
      values[8] = 92;
      
      Arrays.stream(values).forEach(System.out::println);
      
      for(int i = 0; i < values.length;i++){
          System.out.print(i+":"+values[i]+" ");
      }
      System.out.println();
      for (int v : values){
          System.out.print(v+" ");
      }
      
    
    }
    
}
