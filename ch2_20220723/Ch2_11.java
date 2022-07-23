/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;

/**
 *
 * @author xvpow
 */
public class Ch2_11 {

   static void test1(){
        System.out.println("Ch2_11!!");
    }
   static void test2(int a,int b){
       int c = a + b;       
       System.out.println("c:"+c); 
       
   }
    
   static int test3(int a,int b){
       int c = a * b;
       return c;// 回傳參數 與 離開函數
   }
    /**
     * @param args the command line arguments
     */
    //靜態只能呼叫靜態
    public static void main(String[] args) {
      test1();
      test2(5,3);  
      int v3 = test3(6,2);
      System.out.println(v3);
      
      
    }
    
}
