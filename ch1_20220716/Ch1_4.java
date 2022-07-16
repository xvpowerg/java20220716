/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220716;

/**
 *
 * @author xvpow
 */
public class Ch1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int i = 5;
      int x = 3;
       
      int res = x + i++;
      // 3 + 5
      System.out.println(res);
      System.out.println(i);
      
      int y = 1;
      int c = 5;
      int res2 = y + ++c + --c;
           //    1 + 6  + 5
      System.out.println(res2);
      System.out.println(c);
      System.out.println("==================");
      var v1 = 2;
      var v2 = 5;
      int res3 = 3 + v1++ + ++v2+ v1-- + v2++;
      //         3  + 2   + 6 + 3 + 6
      //v1 = 2
      //v2 = 7
      System.out.println(res3);
       System.out.println(v1);
        System.out.println(v2);
        
        
    }
    
}
