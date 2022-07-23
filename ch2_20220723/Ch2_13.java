/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;

/**
 *
 * @author xvpow
 */
public class Ch2_13 {
//n 個參數 0參數時回傳0
    static int sum(int... values){
        int sum = 0;
        for (int v : values){
            sum += v;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(sum(2,5));
        System.out.println(sum(2,5,3,6,1,8));
        System.out.println(sum());
    }
    
}
