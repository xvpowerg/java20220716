/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220723;

/**
 *
 * @author xvpow
 */
public class Ch2_15 {
    //多載 看參數類型 與數量決定多載
    static float min(float a,float b){
        if (a < b) return a;
        return b;
    }
    static int  min(int a,int b){
        if (a < b){
            return a;
        }
        return  b;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(min(10,5));
       
        int m = min(10,5);
        System.out.println(m);
        float mf = min(2.5f,3.1f);
        System.out.println(mf);
    }
    
}
