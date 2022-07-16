/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220716;

/**
 *
 * @author xvpow
 */
public class Ch1_9 {

    public static void main(String[] args) {
          
        //0~35 低
        //36~53 中
        //54~70高
       //大於70非常高
        int pm25 = 70;
        if (pm25 >= 0 && pm25 <= 35)
            System.out.println("低");
        else if(pm25 >= 36 && pm25 <= 53)
            System.out.println("中");
        else if(pm25 >= 54 && pm25 <= 70)
            System.out.println("高");
        else
            System.out.println("非常高");
        
        
    }
    
}
