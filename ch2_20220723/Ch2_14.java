/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;

/**
 *
 * @author xvpow
 */
public class Ch2_14 {

    static void swap(int a,int b){
       int tmp = a;
       a = b;
       b = tmp;
    }
    
    static void swapArray(int[] array1){
       int tmp = array1[0];
       array1[0] =  array1[1];
       array1[1] = tmp;
    }
    
    static void swapString(String s1,String s2){
       String tmp =  s1;
        s1 = s2;
        s2 = tmp; 
    }
    
    
    public static void main(String[] args) {
       int a = 20;
       int b = 30;
       //call by value
       swap(a,b);
       System.out.println(a+":"+b);
       System.out.println("==================");
       
       int[] array1 = {25,35};
       ////call by reference
        swapArray(array1);
       System.out.println(array1[0]+":"+array1[1]);
     
//        swapString(s1,s2);
//        System.out.println(s1+":"+s2);
        
    }
    
}
