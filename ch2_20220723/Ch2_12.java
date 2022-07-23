/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;

/**
 *
 * @author xvpow
 */
public class Ch2_12 {

    static int max(int a,int b){
//        if (a > b)
//            return a;        
//        return b;
        return a > b?a:b;
    }
    
    static int min(int[] array){
        int min = array[0];
        for (int v : array){
            if (min > v) min = v;
        }
        return min;
    }
    public static void main(String[] args) {
        //寫一個函數 max
        //可傳入 兩個整數 幫我找出最大值
        System.out.println(max(2,8));
        //寫一個函數 min
        //可傳入一個整數陣列 幫我找出最小值
        int[] values = {8,5,3,7,2};
        System.out.println(min(values));
    }
    
}
