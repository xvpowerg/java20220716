/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220806.ch3_9_Sring;

/**
 *
 * @author xvpow
 */
public class Ch3_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String st1 = "ABCDEFG";
       char c1 = st1.charAt(0);
       System.out.println(c1);
       
       for (int i = 0 ; i < st1.length();i++){
           System.out.print(st1.charAt(i)+" ");
       }
       System.out.println();
        System.out.println("================");
       byte[] byteArray = st1.getBytes();
       for (byte b : byteArray){
           System.out.println(b);
       }
       //小寫 > 大寫 > 數字
       String st2 = "Zac";
       String st3 = "abc";
       //是負數左小於右 正數右大於左 0相等
       System.out.println(st2.compareTo(st3));
       
       String st4 = "zac";
       String st5 = "ZAC";
       System.out.println(st4.equals(st5));
       System.out.println(st4.equalsIgnoreCase(st5));//忽略大小寫的比較
      
       String st6 = st4.concat(st5);
       System.out.println(st6);
       int index =  st4.indexOf("ac");
       System.out.println(index);
        index =  st4.indexOf("gb");
        System.out.println(index);
    }
    
}
